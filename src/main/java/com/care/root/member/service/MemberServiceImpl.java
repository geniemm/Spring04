package com.care.root.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.member.dao.MemberDAO;
import com.care.root.member.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired MemberDAO dao;
	public int insertMember(MemberDTO dto) {
		return dao.insertMember( dto ); 
	}
	
	public ArrayList<MemberDTO> getList(){
		ArrayList<MemberDTO> list = dao.getList();
		return list;
	}
}








