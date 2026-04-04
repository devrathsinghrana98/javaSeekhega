package com.javaseekhega.models.admin;

public class Admin {
    private String adminId;
    private String department;
    
    public Admin(String adminId, String department) {
        this.adminId = adminId;
        this.department = department;
    }
    
    public String getAdminId() {
        return adminId;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void displayAdminInfo() {
        System.out.println("Admin ID: " + adminId + ", Department: " + department);
    }
}
