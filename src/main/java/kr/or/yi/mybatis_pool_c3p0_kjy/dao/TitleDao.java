package kr.or.yi.mybatis_pool_c3p0_kjy.dao;

import java.util.List;

import kr.or.yi.mybatis_pool_c3p0_kjy.dto.Title;

public interface TitleDao {
	List<Title> selectTitleByAll();
	Title selectTitlebyCode(Title title);
	int insertTitle(Title title);
	int deleteTitle(Title title);
	int updateTitle(Title title);
}
