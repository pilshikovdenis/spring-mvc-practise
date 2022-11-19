package com.pilshikov.spring_mvc;



import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, max = 30, message = "this field must have between 2 and 30 characters")
    private String name;

    @NotBlank(message = "surname is requred field")
    private String surname;

    @Min(value = 200, message = "salary can not be less than 200")
    @Max(value = 10000, message = "salary can not be more than 10000")
    private int salary;

    private String department;
    private Map<String, String> aviableDepartments;
    private String preferredOS;
    private Map<String, String> aviableOS;
    private String[] languages;
    private Map<String,String> languageList;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;

    public Employee() {
        aviableDepartments = new HashMap<>();
        aviableDepartments.put("IT", "Information Technology");
        aviableDepartments.put("HR", "Human Resources");
        aviableDepartments.put("Sales", "Sales");

        aviableOS = new HashMap<>();
        aviableOS.put("Linux", "Linux");
        aviableOS.put("Mac OS", "Mac OS");
        aviableOS.put("Windows 7","Windows 7");
        aviableOS.put("Windows 11","Windows 11");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Deutch", "DE");
        languageList.put("Franch", "FR");

    }

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getAviableDepartments() {
        return aviableDepartments;
    }

    public void setAviableDepartments(Map<String, String> aviableDepartments) {
        this.aviableDepartments = aviableDepartments;
    }

    public String getPreferredOS() {
        return preferredOS;
    }

    public void setPreferredOS(String preferredOS) {
        this.preferredOS = preferredOS;
    }

    public Map<String, String> getAviableOS() {
        return aviableOS;
    }

    public void setAviableOS(Map<String, String> aviableOS) {
        this.aviableOS = aviableOS;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
