package com.example.myapp.repository;

import org.apache.ibatis.annotations.Mapper;
import com.example.myapp.entity.Organization;
import java.util.List;

@Mapper
public interface OrganizationRepository {
    List<Organization> findAllDepartments();
    List<Organization> findDepartmentsByParentId(Long parentId);
}
