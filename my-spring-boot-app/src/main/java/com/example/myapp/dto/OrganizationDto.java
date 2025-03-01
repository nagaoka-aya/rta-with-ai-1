package com.example.myapp.dto;

/**
 * 組織情報を表すデータ転送オブジェクト
 */
public class OrganizationDto {
    
    /** 組織ID */
    private String organizationId;
    
    /** 組織名 */
    private String organizationName;
    
    /** 上位組織ID */
    private String parentOrganizationId;
    
    /** 階層レベル */
    private Integer organizationLevel;
    
    // Getters and Setters
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
    
    public Integer getOrganizationLevel() {
        return organizationLevel;
    }
    
    public void setOrganizationLevel(Integer organizationLevel) {
        this.organizationLevel = organizationLevel;
    }
}
