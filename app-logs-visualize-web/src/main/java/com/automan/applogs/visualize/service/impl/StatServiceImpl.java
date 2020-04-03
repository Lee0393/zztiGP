package com.automan.applogs.visualize.service.impl;

import com.automan.applogs.visualize.dao.BaseDao;
import com.automan.applogs.visualize.domain.StatBean;
import com.automan.applogs.visualize.service.StatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 统计服务
 */
@Service("statService")
public class StatServiceImpl extends BaseServiceImpl<StatBean> implements StatService {


	@Resource(name="statDao")
	public void setDao(BaseDao<StatBean> dao) {

		super.setDao(dao);
	}

	/**
	 * 查询新增用户
	 */
	public StatBean findNewUsers() {

		return getDao().findNewUsers();
	}

	public Long todayNewUsers(String appid){
		return null;
	}
}
