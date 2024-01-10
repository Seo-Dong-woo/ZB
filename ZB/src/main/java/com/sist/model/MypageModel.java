package com.sist.model;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sist.controller.RequestMapping;
import com.sist.dao.*;
import com.sist.vo.*;
import java.util.*;

public class MypageModel {
	@RequestMapping("mypage/mypage_nav.do")
	public String mypage_mypage_nav(HttpServletRequest request , HttpServletResponse response)
	{
		request.setAttribute("main_jsp", "../mypage/mypage_nav.jsp");
		return "../main/main.jsp";
	}
	@RequestMapping("mypage/mypage_update.do")
	public String mypage_mypage_updat1e(HttpServletRequest request , HttpServletResponse response)
	{
		
		
		request.setAttribute("main_jsp", "../mypage/mypage_update.jsp");
		return "../main/main.jsp";
	}
	
	// 수정 
	   @RequestMapping("mypage/mypage_update.do")
	   public String mypage_mypage_update(HttpServletRequest request,
			   HttpServletResponse response)
	   {
		   HttpSession session=request.getSession();
		   String id=(String)session.getAttribute("id");
		   MemberDAO dao=MemberDAO.newInstance();
		   MemberVO vo=dao.memberUpdateData(id);
		   request.setAttribute("vo", vo);
		   request.setAttribute("main_jsp", "../mypage/mypage_update.jsp");
			/* CommonsModel.commonsFooterData(request); */
		   return "../main/main.jsp";
	   }
	   // 실제 수정 
	   @RequestMapping("mypage/mypage_update_ok.do")
		public String memberUpdateOk(HttpServletRequest request,
				HttpServletResponse response)
		{
			try
			{
				request.setCharacterEncoding("UTF-8");
			}catch(Exception ex) {}
			String id=request.getParameter("id");
			String pwd=request.getParameter("pwd");
			String name=request.getParameter("name");
			String sex=request.getParameter("sex");
			String birthday=request.getParameter("birthday");
			String email=request.getParameter("email");
			String phone1=request.getParameter("phone1");
			String phone2=request.getParameter("phone2");
			String post=request.getParameter("post");
			String addr1=request.getParameter("addr1");
			String addr2=request.getParameter("addr2");
			
			MemberVO vo=new MemberVO();
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setName(name);
			vo.setSex(sex);
			vo.setBirthday(birthday);
			vo.setEmail(email);
			vo.setPhone(phone1+"-"+phone2);
			vo.setPost(post);
			vo.setAddr1(addr1);
			vo.setAddr2(addr2);
			
			// DAO연결 
			MemberDAO dao=MemberDAO.newInstance();
			MemberVO mvo=dao.memberUpdate(vo);
			if(mvo.getMsg().equals("yes"))
			{
				HttpSession session=request.getSession();
				session.setAttribute("name", mvo.getName());
			}
			request.setAttribute("mvo", mvo);
			return "../mypage/mypage_update_ok.jsp";
		}
	   
	   @RequestMapping("mypage/mypage_delete.do")
	   public String mypageDelete(HttpServletRequest request,
			   HttpServletResponse response)
	   {
		   request.setAttribute("main_jsp", "../mypage/mypage_delete.jsp");
		   return "../main/main.jsp";
	   }
	   
	   @RequestMapping("mypage/mypage_delete_ok.do")
		public void mypageDeleteOk(HttpServletRequest request,
				HttpServletResponse response)
		{
			
			String pwd=request.getParameter("pwd");
			HttpSession session=request.getSession();
			String id=(String)session.getAttribute("id");
			//DAO
			MemberDAO dao=MemberDAO.newInstance();
			String result=dao.memberDeleteOk(id, pwd);
			System.out.println(id+"|"+pwd);
			if(result.equals("yes"))
			{
				session.invalidate();
			}
			try
			{
				PrintWriter out=response.getWriter();
				out.println(result);
			}catch(Exception ex) {}
		}
	   
	   @RequestMapping("mypage/mypage_cart.do")
		public String mypage_cart(HttpServletRequest request, HttpServletResponse response)
		{
			HttpSession session=request.getSession();
			String id=(String)session.getAttribute("id");
			Map map=new HashMap();
			map.put("id", id);
			List<CartVO> list=GoodsDAO.mypageGoodsCartData(map);
			request.setAttribute("list", list);

			request.setAttribute("main_jsp", "../mypage/mypage_cart.jsp");
			return "../main/main.jsp";
		}
	   
	   @RequestMapping("mypage/mypage_buy.do")
		public String mypage_buy(HttpServletRequest request, HttpServletResponse response)
		{
			HttpSession session=request.getSession();
			String id=(String)session.getAttribute("id");
			Map map=new HashMap();
			map.put("id", id);
			List<CartVO> list=GoodsDAO.mypageGoodsBuyData(map);
			request.setAttribute("list", list);

			request.setAttribute("main_jsp", "../mypage/mypage_buy.jsp");
			return "../main/main.jsp";
		}
	   
}
