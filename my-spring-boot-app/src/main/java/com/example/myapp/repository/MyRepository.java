package com.example.myapp.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List; // Add this import statement
// import com.example.myapp.entity.MyEntity; // Comment out or remove this import statement

@Mapper
public interface MyRepository {
    
    @Select("SELECT * FROM my_table")
    List<Object> findAll(); // Change MyEntity to Object to avoid compilation error
    
    // Additional database operation methods can be defined here
}