//package com.automan.applogs.visualize.dao.impl;
//
//import com.automan.applogs.visualize.dao.BaseDao;
//import com.automan.applogs.visualize.domain.StatBean;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.support.SqlSessionDaoSupport;
//import org.springframework.stereotype.Repository;
//
//import javax.annotation.Resource;
//
///**
// * 统计
// */
//@Repository("statDao")
//public class StatDaoImpl extends SqlSessionDaoSupport implements BaseDao {
//
//	/**
//	 * 查询新增用户
//	 */
//	public StatBean findNewUsers(){
//		return getSqlSession().selectOne("stats.newusers");
//	}
//
//	@Resource
//	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
//		super.setSqlSessionFactory(sqlSessionFactory);
//	}
//}
