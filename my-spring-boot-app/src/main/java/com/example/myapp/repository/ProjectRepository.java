package com.example.myapp.repository;

import org.apache.ibatis.annotations.Mapper;
import com.example.myapp.entity.Project;

@Mapper
public interface ProjectRepository {
    void save(Project project);
}
