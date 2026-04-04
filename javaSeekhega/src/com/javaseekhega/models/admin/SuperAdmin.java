package com.javaseekhega.models.admin;

public class SuperAdmin extends Admin {
    private String accessLevel;
    
    public SuperAdmin(String adminId, String department, String accessLevel) {
        super(adminId, department);
        this.accessLevel = accessLevel;
    }
    
    public String getAccessLevel() {
        return accessLevel;
    }
    
    public void displaySuperAdminInfo() {
        displayAdminInfo();
        System.out.println("Access Level: " + accessLevel);
    }
}
