package com.example.myapp.dto;

/**
 * 部門情報を保持するDTOクラス
 */
public class DepartmentDto {
    private String organizationId;
    private String organizationName;
    private String parentOrganizationId;

    public DepartmentDto() {
    }

    public DepartmentDto(String organizationId, String organizationName, String parentOrganizationId) {
        this.organizationId = organizationId;
        this.organizationName = organizationName;
        this.parentOrganizationId = parentOrganizationId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getParentOrganizationId() {
        return parentOrganizationId;
    }

    public void setParentOrganizationId(String parentOrganizationId) {
        this.parentOrganizationId = parentOrganizationId;
    }
}