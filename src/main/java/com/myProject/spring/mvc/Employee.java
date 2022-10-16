/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myProject.spring.mvc;

import com.myProject.spring.mvc.validation.CheckEmail;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;
import org.springframework.context.annotation.Bean;

public class Employee {

    @Size(min = 2, message = "name must be min 2 symbals")
    private String name;
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value = 500, message = "must be greater than 499")
    @Max(value = 500000, message = "must be less than 499999")
    private long salary;
    private String department;
    @CheckEmail
    private String email;  
    @Pattern(regexp =  "(\\s*\\+7|8)\\d{10}\\s*", message = "your phone may start with +7 or 8, please check your phone")
    private String phoneNumber;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageList;

    {
        departments = new HashMap();
        carBrands = new HashMap();
        languageList = new HashMap();
        departments.put("IT", "Information Tehnology");
        departments.put("HR", "Human Resurces");
        departments.put("Sales", "Sales");
        carBrands.put("BMW", "BMW");
        carBrands.put("Audio", "Audio");
        carBrands.put("MB", "MB");
        languageList.put("English", "EN");
        languageList.put("Deutch", "DE");
        languageList.put("French", "FR");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] language) {
        this.languages = language;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public Employee() {
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

    public long getSalary() {
        return salary;
    }

    public void setSalary(long Salary) {
        this.salary = Salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + ", Salary=" + salary + ", department=" + department + '}';
    }

}
