package com.example.myapp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HealthcheckMapper {
    @Select("SELECT status FROM healthcheck WHERE id = 1")
    String getHealthcheckStatus();
}
