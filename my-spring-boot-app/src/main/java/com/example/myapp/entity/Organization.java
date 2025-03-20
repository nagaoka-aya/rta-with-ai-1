package com.example.myapp.entity;

public class Organization {
    private Integer organizationId;
    private String organizationName;
    private Integer upperOrganization;

    // Getters and Setters
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Integer getUpperOrganization() {
        return upperOrganization;
    }

    public void setUpperOrganization(Integer upperOrganization) {
        this.upperOrganization = upperOrganization;
    }
}
