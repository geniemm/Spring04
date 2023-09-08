package com.care.root.member.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;

@Controller
public class MemberController {
	@Autowired MemberService ms;
	
	@GetMapping("/list")
	public String list( Model model ) {
		ArrayList<MemberDTO> list =	ms.getList();
		model.addAttribute("list", list);
		return "list";
	}
	@GetMapping("insert_view")
	public void view() {}
	
	@PostMapping("insert")
	public String insert(MemberDTO dto) {
		ms.insertMember(dto);
		return "redirect:list";
	}
}














