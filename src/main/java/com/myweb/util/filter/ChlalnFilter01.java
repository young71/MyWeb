package com.myweb.util.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//1. Filter인터페이스로 상속받고
//2. Web.xml or 어노테이션 중 하나를  선택해서 필터를 등록
///@WebFilter("/*") //모든요청
public class ChlalnFilter01 implements Filter{

	@Override //필터가 종료할때 
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("1번 필터 실행됨");
		
		//다음으로 연결
		chain.doFilter(request, response);
		
	}

	@Override //필터가 시작될때
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
