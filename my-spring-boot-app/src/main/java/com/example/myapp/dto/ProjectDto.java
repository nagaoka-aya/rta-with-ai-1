package com.example.myapp.dto;

import com.example.myapp.entity.Organization;
import java.util.Date;
import java.util.List;

/**
 * プロジェクト情報を表すデータ転送オブジェクト
 */
public class ProjectDto {
    
    /** プロジェクトID */
    private String projectId;
    
    /** プロジェクト名 */
    private String projectName;
    
    /** プロジェクト種別 */
    private String projectType;
    
    /** プロジェクト区分 */
    private String projectClass;
    
    /** プロジェクト開始日付 */
    private Date projectStartDate;
    
    /** プロジェクト終了日付 */
    private Date projectEndDate;
    
    /** 組織ID */
    private String organizationId;
    
    /** 顧客ID */
    private String clientId;
    
    /** プロジェクトマネージャー */
    private String projectManager;
    
    /** プロジェクトリーダー */
    private String projectLeader;
    
    /** 備考 */
    private String note;
    
    /** 売上高 */
    private Integer sales;
    
    /** バージョン番号 */
    private Integer versionNo;
    
    /** 事業部リスト (画面表示用) */
    private List<Organization> divisions;
    
    /** 部門リスト (画面表示用) */
    private List<Organization> departments;
    
    // Getters and Setters
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectClass() {
        return projectClass;
    }

    public void setProjectClass(String projectClass) {
        this.projectClass = projectClass;
    }

    public Date getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public Date getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(Date projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }

    public List<Organization> getDivisions() {
        return divisions;
    }

    public void setDivisions(List<Organization> divisions) {
        this.divisions = divisions;
    }

    public List<Organization> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Organization> departments) {
        this.departments = departments;
    }
}
