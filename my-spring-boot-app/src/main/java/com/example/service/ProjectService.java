package com.example.service;

import com.example.dto.OrganizationDto;
import com.example.dto.ProjectDto;
import com.example.mapper.OrganizationMapper;
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
    private OrganizationMapper organizationMapper;
    
    /**
     * プロジェクト登録画面の初期表示データを取得します。
     *
     * @return 初期表示データを含むProjectDto
     */
    public ProjectDto getInitialDisplayData() {
        // 初期表示用のDTOを作成
        ProjectDto projectDto = new ProjectDto();
        
        // 最上位組織（事業部）のリストを取得
        List<OrganizationDto> divisions = organizationMapper.findTopLevelOrganizations();
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
    public List<OrganizationDto> getDepartmentListByDivisionId(String divisionId) {
        // 指定された事業部IDをもとに、配下の部門リストを取得
        return organizationMapper.findOrganizationsByParentId(divisionId);
    }
    
    // その他のプロジェクト関連サービスメソッド
    // ...existing code...
}
