package com.example.myapp.service;

import com.example.myapp.entity.Organization;
import com.example.myapp.dto.ProjectDto;
import com.example.myapp.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * プロジェクト関連のビジネスロジックを提供するサービスクラス
 */
@Service
@Transactional
public class ProjectService {
    
    @Autowired
    private OrganizationRepository organizationRepository;
    
    /**
     * プロジェクト登録画面の初期表示データを取得します。
     *
     * @return 初期表示データを含むProjectDto
     */
    public ProjectDto getInitialDisplayData() {
        // 初期表示用のDTOを作成
        ProjectDto projectDto = new ProjectDto();
        
        // 最上位組織（事業部）のリストを取得
        List<Organization> divisions = organizationRepository.findAllDepartments();
        projectDto.setDivisions(divisions);
        
        // その他の初期データがあれば設定
        // プロジェクト種別、プロジェクト区分などの初期データを取得する場合はここで設定
        
        return projectDto;
    }
    
    /**
     * 事業部IDに基づいて部門リストを取得します。
     *
     * @param divisionId 事業部ID
     * @return 部門DTOのリスト
     */
    public List<Organization> getDepartmentListByDivisionId(Long divisionId) {
        // 指定された事業部IDをもとに、配下の部門リストを取得
        return organizationRepository.findDepartmentsByParentId(divisionId);
    }
    
    // その他のプロジェクト関連サービスメソッド
    // ...existing code...
}
