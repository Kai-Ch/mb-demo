package com.mb.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DemoMapper {
    @Select("SELECT SALA FROM emp WHERE id=#{id}")
    String getDemo(int id);
}
