package com.example.myapp.controller;

import com.example.myapp.dto.DepartmentDto;
import com.example.myapp.dto.ProjectFormDto;
import com.example.myapp.form.ProjectForm;
import com.example.myapp.service.ProjectService;
import com.example.myapp.code.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;

/**
 * プロジェクト登録関連のコントローラークラス
 */
@Controller
@RequestMapping("/project")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    /**
     * プロジェクト登録画面の初期表示
     *
     * @param model Modelオブジェクト
     * @return プロジェクト登録画面のビュー名
     */
    @GetMapping("/regist")
    public String showRegistForm(Model model) {
        // プロジェクト登録フォームが未設定の場合は新規作成
        if (!model.containsAttribute("projectForm")) {
            model.addAttribute("projectForm", new ProjectForm());
        }
        
        // 初期表示データ
        model.addAttribute("projectDto", projectService.getInitialDisplayData());
        
        // プロジェクト種別の選択肢をCodeUtilから取得
        Map<String, String> projectTypes = CodeUtil.getProjectTypeCodeMap();
        model.addAttribute("projectTypes", projectTypes);
        
        // プロジェクト区分の選択肢をCodeUtilから取得
        Map<String, String> projectClasses = CodeUtil.getProjectClassCodeMap();
        model.addAttribute("projectClasses", projectClasses);
        
        return "project_regist_index";
    }
}