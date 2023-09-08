package com.care.root.member.dao;

import java.util.ArrayList;

import com.care.root.member.dto.MemberDTO;

public interface MemberDAO {
	public int insertMember(MemberDTO dto);
	public ArrayList<MemberDTO> getList();
}





