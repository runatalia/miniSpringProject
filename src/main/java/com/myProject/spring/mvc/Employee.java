/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myProject.spring.mvc;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Bean;


public class Employee {
    private String name;
    private String surname;
    private int Salary;
    private String department;
    private Map<String,String> departments;
    private String carBrand;
    private Map<String,String> carBrands;
    private String[] languages;
    private Map<String,String> languageList;
 {departments = new HashMap();
    carBrands = new HashMap();
    languageList = new HashMap();
    departments.put("IT", "Information Tehnology");
    departments.put("HR", "Human Resurces");
    departments.put("Sales", "Sales");
    carBrands.put("BMW","BMW");
    carBrands.put("Audio","Audio");
    carBrands.put("MB","MB");
    languageList.put("English", "EN");
    languageList.put("Deutch", "DE");
    languageList.put("French", "FR");
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
    public Employee(){
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
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
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
        return "Employee{" + "name=" + name + ", surname=" + surname + ", Salary=" + Salary + ", department=" + department + '}';
    }
    
    
}
