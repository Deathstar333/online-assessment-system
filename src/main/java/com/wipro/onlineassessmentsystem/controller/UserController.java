package com.wipro.onlineassessmentsystem.controller;

import com.wipro.onlineassessmentsystem.model.User;
import com.wipro.onlineassessmentsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login/do", method = RequestMethod.POST)
    public String returnLogin(HttpServletRequest request, HttpServletResponse response) {
        String formEmail = request.getParameter("email");
        String formPass = request.getParameter("password");
        User user = userService.findByEmail(formEmail);
        if(user == null) {
            return "invalidUser";
        }
        else if(!user.getPassword().equals(formPass)) {
            System.out.println(user.getPassword());
            System.out.println(formPass);
            return "invalidPass";
        }
        else if(user.getUserType().equals("candidate")){
            return "candidateLogin";
        }
        else {
            return "adminLogin";
        }
    }

    @RequestMapping(value = "/users/all", method = RequestMethod.GET)
    public String returnAllUsers(ModelMap modelMap) {
        List<User> users = userService.getAllUsers();
        modelMap.addAttribute("userList", users);
        return "allUsers";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String returnRegistrationPage() {
        return "register";
    }

    @RequestMapping(value = "/registration/do", method = RequestMethod.POST)
    public String returnRegistrationSuccess(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String userType = "candidate";
        User user = new User(email, password, firstName, lastName, userType);
        userService.addUser(user);

        modelMap.addAttribute("firstname", firstName);
        modelMap.addAttribute("lastname", lastName);
        return "registerSuccess";
    }
}
