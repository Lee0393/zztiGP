package com.automan.applogs.visualize.service;

import com.automan.applogs.visualize.domain.StatBean;

import java.util.List;

/**
 * Service
 */
public interface StatService extends BaseService<StatBean> {
	public StatBean findNewUsers();

	public Long todayNewUsers(String appid) ;

	public List<StatBean> findDayNewUsersInWeek(String appid);

}
