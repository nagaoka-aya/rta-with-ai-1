package com.example.myapp.mapper;

import com.example.myapp.entity.Organization;
import java.util.List;

public interface OrganizationRepository {
    List<Organization> findAllDepartments();
    List<Organization> findDepartmentsByParentId(Long parentId);
}
