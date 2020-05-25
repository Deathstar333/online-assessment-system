package com.wipro.onlineassessmentsystem.service;

import com.wipro.onlineassessmentsystem.model.TestResult;
import com.wipro.onlineassessmentsystem.repository.TestResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TestResultService {

    @Autowired
    private TestResultRepository testResultRepository;

    private final List<String> springTestAnswers;
    private final List<String> hibernateTestAnswers;

    public TestResultService() {
        this.springTestAnswers = new ArrayList<>(Arrays.asList(
                "J2EE App Development Framework",
                "Inversion of Control",
                "Aspect Oriented Programming",
                "Application Context",
                "Dispatcher Servlet"));
        this.hibernateTestAnswers = new ArrayList<>(Arrays.asList(
                "Object Relational Mapping",
                "uni-directional & bi-directional",
                "configuration file",
                "Hibernate Query Language",
                "isolation levels"));
    }

    public List<TestResult> getAllTestResults() {
        List<TestResult> tests = new ArrayList<>();
        testResultRepository.findAll().forEach(tests::add);
        return tests;
    }

    public void saveTestResult(TestResult testResult) {
        testResultRepository.save(testResult);
    }

    public int getScore(List<String> formAnswers, String testName) {
        int score = 0;
        if(testName.equalsIgnoreCase("spring")) {
            int len = springTestAnswers.size();
            for(int i=0; i<len; i++) {
                if(springTestAnswers.get(i).equalsIgnoreCase(formAnswers.get(i)))
                    score += 10;
            }
            return score;
        }
        int len = hibernateTestAnswers.size();
        for(int i=0; i<len; i++) {
            if(hibernateTestAnswers.get(i).equalsIgnoreCase(formAnswers.get(i)))
                score += 10;
        }
        return score;
    }
}
