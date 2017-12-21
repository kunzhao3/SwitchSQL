package com.gome.dao.sqltest;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface MySqlMapper {
	@Select("select * from tm_app_caseback_info")
	 List<Map<String,Object>> getList();
}
