package com.bfxy.bfxy002springbootmybatisdruid.mapper;

import com.bfxy.bfxy002springbootmybatisdruid.database.BaseMapper;
import com.bfxy.bfxy002springbootmybatisdruid.entity.MstDict;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MstDictMapper extends BaseMapper<MstDict> {

    List<MstDict> findByStatus(String status, PageBounds pageBounds);




}
