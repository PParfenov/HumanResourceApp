package io.zipcoder.threedaystodeliver.humanresourceapp;

import java.util.Date;

public class Person {

    // name and contact stuff
    private HrContactInfo contactInfo = new HrContactInfo();

    //current
    private String id;
    private EmploymentStatus employmentStatus;
    private Compensation compensation;
    private Date hiredDate;


    //former
    private Date terminationDate;
    private String reasonForTermination;
    private String exitInterview;
    private Compensation postEmploymentComp;

    //prospect
    private String resume;
    private Date interviewDate;
    private double score;


    @Override
    public String toString(){
        return null;
    }

    public void setContactInfo(HrContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Compensation getCompensation() {
        return compensation;
    }

    public void setCompensation(Compensation compensation) {
        this.compensation = compensation;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public Date getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    public String getReasonForTermination() {
        return reasonForTermination;
    }

    public void setReasonForTermination(String reasonForTermination) {
        this.reasonForTermination = reasonForTermination;
    }

    public String getExitInterview() {
        return exitInterview;
    }

    public void setExitInterview(String exitInterview) {
        this.exitInterview = exitInterview;
    }

    public Compensation getPostEmploymentComp() {
        return postEmploymentComp;
    }

    public void setPostEmploymentComp(Compensation postEmploymentComp) {
        this.postEmploymentComp = postEmploymentComp;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    public HrContactInfo getContactInfo() {
        return contactInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Enum getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(EmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
    }
}
