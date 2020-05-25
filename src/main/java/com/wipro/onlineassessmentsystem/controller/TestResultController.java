package com.wipro.onlineassessmentsystem.controller;

import com.wipro.onlineassessmentsystem.component.LoggedInUser;
import com.wipro.onlineassessmentsystem.model.TestResult;
import com.wipro.onlineassessmentsystem.service.TestResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TestResultController {

    @Autowired
    private TestResultService testResultService;

    @Autowired
    private LoggedInUser loggedInUser;

    @RequestMapping(value = "/tests/all", method = RequestMethod.GET)
    public String returnAllTestResults(ModelMap modelMap) {
        List<TestResult> tests = testResultService.getAllTestResults();
        modelMap.addAttribute("testList", tests);
        return "allTests";
    }

    @RequestMapping(value = "/springAssessment", method = RequestMethod.GET)
    public String returnSpringAssessment() {
        return "springAssessment";
    }

    @RequestMapping(value = "/hibernateAssessment", method = RequestMethod.GET)
    public String returnHibernateAssessment() {
        return "hibernateAssessment";
    }

    @RequestMapping(value = "/evaluate/spring/test", method = RequestMethod.POST)
    public String returnSpringTestResult(HttpServletRequest request, HttpServletResponse response) {
        List<String> formAnswers = new ArrayList<>();
        for(int i=1; i<=5; i++) {
            formAnswers.add(request.getParameter("Question" + i));
        }
        int score = testResultService.getScore(formAnswers, "spring");

        TestResult testResult = new TestResult();
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        testResult.setTestDate(dtf.format(currentDateTime));
        testResult.setAssessment("Spring-L1");
        testResult.setEmailId(loggedInUser.getEmail());
        testResult.setTestMarks(score);
        testResult.setTotalMarks(50);

        if(score >= 30) {
            testResult.setResult("Passed");
            testResultService.saveTestResult(testResult);
            return "testPassed";
        }
        testResult.setResult("Failed");
        testResultService.saveTestResult(testResult);
        return "testFailed";
    }

    @RequestMapping(value = "/evaluate/hibernate/test", method = RequestMethod.POST)
    public String returnHibernateTestResult(HttpServletRequest request, HttpServletResponse response) {
        List<String> formAnswers = new ArrayList<>();
        for(int i=1; i<=5; i++) {
            formAnswers.add(request.getParameter("Question" + i));
        }
        int score = testResultService.getScore(formAnswers, "hibernate");

        TestResult testResult = new TestResult();
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        testResult.setTestDate(dtf.format(currentDateTime));
        testResult.setAssessment("Hibernate-L1");
        testResult.setEmailId(loggedInUser.getEmail());
        testResult.setTestMarks(score);
        testResult.setTotalMarks(50);

        if(score >= 30) {
            testResult.setResult("Passed");
            testResultService.saveTestResult(testResult);
            return "testPassed";
        }
        testResult.setResult("Failed");
        testResultService.saveTestResult(testResult);
        return "testFailed";
    }
}
