package com.automan.applogs.visualize.dao;

import com.automan.applogs.visualize.domain.StatBean;

/**
 * BaseDao接口
 */
public interface BaseDao<T> {
	public StatBean findNewUsers();
}
