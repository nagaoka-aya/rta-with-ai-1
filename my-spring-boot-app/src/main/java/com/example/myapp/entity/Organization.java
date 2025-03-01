package com.example.myapp.entity;

public class Organization {
    private Long organizationId;
    private String organizationName;
    private Integer upperOrganization;

    // Getters and Setters
    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
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
