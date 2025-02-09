package com.example.myapp.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyRepository {
    
    @Select("SELECT * FROM my_table")
    List<MyEntity> findAll();
    
    // Additional database operation methods can be defined here
}