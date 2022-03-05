package com.bfxy.bfxy002springbootmybatisdruid.service;

import com.bfxy.bfxy002springbootmybatisdruid.entity.MstDict;
import com.bfxy.bfxy002springbootmybatisdruid.mapper.MstDictMapper;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MstDictService {

    @Autowired
    private MstDictMapper dictMapper;

    public List<MstDict> select() {
        List<MstDict> list=new ArrayList<MstDict>();
        list= dictMapper.selectAll();
        return list;
    }

    public int insert(MstDict mstDict) {
        return dictMapper.insert(mstDict);
    }

    public List<MstDict> findByStatus(String status,int page,int limit){
        PageBounds pageBounds=new PageBounds(page,limit);
        return dictMapper.findByStatus(status,pageBounds);
    }
}
