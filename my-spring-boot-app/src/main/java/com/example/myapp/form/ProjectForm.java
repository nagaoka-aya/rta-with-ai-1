package com.example.myapp.form;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * プロジェクト登録フォームクラス
 */
public class ProjectForm {

    @NotBlank(message = "{required.projectForm.departmentId}")
    private String departmentId; // 事業部ID

    @NotBlank(message = "{required.projectForm.subDepartmentId}")
    private String subDepartmentId; // 部門ID

    @NotBlank(message = "{required.projectForm.projectName}")
    @Size(max = 100, message = "{maxlength.projectForm.projectName}")
    private String projectName; // プロジェクト名

    @NotBlank(message = "{required.projectForm.projectType}")
    private String projectType; // プロジェクト種別

    private String projectClass; // プロジェクト区分

    @NotNull(message = "{required.projectForm.sales}")
    @Pattern(regexp = "^[0-9]+$", message = "{pattern.projectForm.sales}")
    private String sales; // 売上高（千円）

    @NotBlank(message = "{required.projectForm.clientId}")
    private String clientId; // 顧客ID

    private String clientName; // 顧客名（画面表示用）

    @NotBlank(message = "{required.projectForm.projectManager}")
    @Size(max = 50, message = "{maxlength.projectForm.projectManager}")
    private String projectManager; // プロジェクトマネージャー

    @NotBlank(message = "{required.projectForm.projectLeader}")
    @Size(max = 50, message = "{maxlength.projectForm.projectLeader}")
    private String projectLeader; // プロジェクトリーダー

    @NotNull(message = "{required.projectForm.projectStartDate}")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate projectStartDate; // プロジェクト開始日付

    @NotNull(message = "{required.projectForm.projectEndDate}")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate projectEndDate; // プロジェクト終了日付

    @Size(max = 500, message = "{maxlength.projectForm.note}")
    private String note; // 備考

    // Getters and Setters
    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getSubDepartmentId() {
        return subDepartmentId;
    }

    public void setSubDepartmentId(String subDepartmentId) {
        this.subDepartmentId = subDepartmentId;
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

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
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

    public LocalDate getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(LocalDate projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public LocalDate getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(LocalDate projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}