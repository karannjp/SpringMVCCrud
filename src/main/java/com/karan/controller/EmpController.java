package com.karan.controller;

import com.karan.Bean.Emp;
import com.karan.Dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmpController {
@Autowired
EmpDao dao;
    @RequestMapping("/empform")
    public String showForm(Model model){
        model.addAttribute("command",new Emp());
        return "empform";
    }
@RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("emp") Emp emp){
dao.save(emp);
    return  "view";
    }
    @RequestMapping("/viewemp")
    public String viewpage(Model model){
        List<Emp> list=dao.getEmployees();
        model.addAttribute("list",list);
return  "view";
    }
    @RequestMapping(value="/editemp/{eid}")
    public String edit(@PathVariable int eid,Model model){
Emp emp=dao.getEmpById(eid);
model.addAttribute("command",emp);
return  "empeditform";
    }

    @RequestMapping(value = "/editsave",method = RequestMethod.POST)
    public String editsave(@ModelAttribute("emp")Emp emp ){

        dao.save(emp);
        return  "view";
    }

    @RequestMapping(value="/deleteemp/{eid}",method = RequestMethod.GET)
    public String delete(@PathVariable int eid){
        dao.delete(eid);
        return "view";
    }



}
