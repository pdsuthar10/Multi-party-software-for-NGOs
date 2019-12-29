/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author deepgamit
 */
public class Volunteer extends Employee {
    
    private String address = null;
    private String city= null;
    private String pincode=null;
    private String englishProficency=null;
    private ArrayList<String> languages = new ArrayList();
    private ArrayList<String> skills = new ArrayList();
    private String education=null;
    private String schoolName=null;
    private String degree=null;
    private ArrayList<String> expertise = new ArrayList();
    private String addSkills=null;
    private Map<String, String> educationList = new HashMap<String, String>();

    public String getAddSkills() {
        return addSkills;
    }

    public void setAddSkills(String addSkills) {
        this.addSkills = addSkills;
    }
   
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getEnglishProficency() {
        return englishProficency;
    }

    public void setEnglishProficency(String englishProficency) {
        this.englishProficency = englishProficency;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public ArrayList<String> getExpertise() {
        return expertise;
    }

    public void setExpertise(ArrayList<String> expertise) {
        this.expertise = expertise;
    }

    public Map<String, String> getEducationList() {
        return educationList;
    }

    public void setEducationList(Map<String, String> educationList) {
        this.educationList = educationList;
    }
    
    
    
    
}
