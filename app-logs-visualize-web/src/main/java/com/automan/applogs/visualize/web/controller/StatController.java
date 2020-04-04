package com.automan.applogs.visualize.web.controller;

import com.automan.applogs.visualize.domain.StatBean;
import com.automan.applogs.visualize.service.StatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 统计分析类
 */
@Controller
@RequestMapping("/stat")
public class StatController {



	@Resource(name="statService")
	private StatService ss ;

	/**
	 * appid = "sdk34734"
	 * 本周每天新增用户数
	 */

	@RequestMapping("/newusers")
	public String findNewUsers(){
		StatBean bean = ss.findNewUsers();
		System.out.println(bean.getCount());
		return "index" ;
	}

	@RequestMapping("/index")
	public String toStatPage(){

		return "index" ;
	}

	@RequestMapping("/week")
	public String findDayNewUsersInWeek(){
		ss.findDayNewUsersInWeek("sdk34734");
		return "index";
	}


}
