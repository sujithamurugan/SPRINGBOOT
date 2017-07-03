package com.suji.Revaturecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.suji.RevatureApplication.Role;
import com.suji.RevatureService.RoleService;

@Controller
@RequestMapping(value="Role")
public class RoleController {
	@Autowired
	public RoleService roleService;
	@RequestMapping(value = "/rolelist", method = RequestMethod.GET)
	public String listRole(ModelMap modelMap) {
    System.out.println("BookController called");
    List<Role> role = roleService.findAll();
	modelMap.addAttribute("role", role);
	return "";

	}
}
