package com.bfxy.bfxy002springbootmybatisdruid.controller;

import java.util.List;
import com.bfxy.bfxy002springbootmybatisdruid.entity.MstDict;
import com.bfxy.bfxy002springbootmybatisdruid.service.MstDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MstdictController {

	@Autowired
	private MstDictService dictService;

	@RequestMapping("select")
	public String select() {
		List<MstDict> list= dictService.select();
		return list.toString();
	}

	@RequestMapping("insert")
	public String insert() {
		MstDict mstDict=new MstDict();
		int i=0;
		for (int j=11;j<=20;j++){
			mstDict.setName("王"+j);
			mstDict.setCode("1000"+j);
			mstDict.setStatus("1");
			i+=dictService.insert(mstDict);
		}
		if (i>0){
			return "添加成功";
		}else {
			return "添加失败";
		}

	}

	@RequestMapping("findByStatus")
	public String findByStatus(){
		int page=1;
		int limit=1;
		List<MstDict> list= dictService.findByStatus("1",page,limit);
		return list.toString();
	}
}
