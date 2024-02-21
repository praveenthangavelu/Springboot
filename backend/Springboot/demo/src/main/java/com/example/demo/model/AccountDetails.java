package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AccountDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int accountNumber;
    private String CustomerName;
    private String CarNumber;
    private String Model;
    private int phoneNumber;
    private String DateofEntry;
    private String dateOfIssue;
    
    public AccountDetails() {
    }
    public AccountDetails(int id, int accountNumber, String CustomerName, String CarNumber, String  Model,
            int phoneNumber, String DateofEntry, String dateOfIssue) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.CustomerName = CustomerName;
        this.CarNumber = CarNumber;
        this. Model =  Model;
        this.phoneNumber = phoneNumber;
        this.DateofEntry = DateofEntry;
        this.dateOfIssue = dateOfIssue;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getCustomerName() {
        return CustomerName;
    }
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }
    public String getCarNumber(){
        return CarNumber;
    }
    public void setCarNumber(String CarNumber) {
        this.CarNumber = CarNumber;
    }
    public String getModel() {
        return  Model;
    }
    public void setModel(String  Model) {
        this. Model =  Model;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getDateofEntry() {
        return DateofEntry;
    }
    public void setDateofEntry(String DateofEntry) {
        this.DateofEntry = DateofEntry;
    }
    public String getDateOfIssue() {
        return dateOfIssue;
    }
    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    


}