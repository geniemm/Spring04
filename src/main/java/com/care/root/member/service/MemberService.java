package com.care.root.member.service;

import java.util.ArrayList;

import com.care.root.member.dto.MemberDTO;

public interface MemberService {
	public int insertMember(MemberDTO dto);
	public ArrayList<MemberDTO> getList();
}





