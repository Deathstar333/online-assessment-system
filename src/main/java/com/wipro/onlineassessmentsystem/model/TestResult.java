package com.wipro.onlineassessmentsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestResult {

    @Id
    @Column(name = "TEST_DATE")
    String testDate;

    @Column(name = "ASSESSMENT")
    String assessment;

    @Column(name = "TEST_MARKS")
    int testMarks;

    @Column(name = "EMAIL_ID")
    String emailId;

    @Column(name = "TOTAL_MARKS")
    int totalMarks;

    @Column(name = "RESULT")
    String result;

    public TestResult() {}

    public TestResult(String testDate, String assessment, int testMarks, String emailId, int totalMarks, String result) {
        this.testDate = testDate;
        this.assessment = assessment;
        this.testMarks = testMarks;
        this.emailId = emailId;
        this.totalMarks = totalMarks;
        this.result = result;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public int getTestMarks() {
        return testMarks;
    }

    public void setTestMarks(int testMarks) {
        this.testMarks = testMarks;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
