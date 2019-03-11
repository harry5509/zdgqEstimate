package com.zdgq.estimate.controller;

import com.zdgq.estimate.entity.Admins;
import com.zdgq.estimate.service.AdminsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * admins控制层
 */
@Controller("adminsController")
@RequestMapping("/admins")
public class AdminsController {


    @Autowired
    private AdminsService adminsService;

    /**
     * 跳转添加
     * @return
     */
    @RequestMapping("/to_add")
    public String toAdd(){
        return "to_add";
    }

    /**
     * ajax异步添加方法
     * @param admins
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> add(@RequestBody Admins admins){
        boolean flag = adminsService.addAdmin(admins);
        admins = adminsService.findById(admins.getId());
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("flag",flag);
        modelMap.put("admins",admins);
        return modelMap;
    }


    /**
     * RESTful风格url查询全部或者单个
     * @param flag
     * @param map
     * @return
     */
    @RequestMapping("/find/{flag}")
    public String find(@PathVariable String flag, Map<String,Object> map){

        if(flag.equals("All")){
            List<Admins> adminslist = adminsService.findAll();
            map.put("adminsList",adminslist);
        }else{
            Admins admins = adminsService.findById(flag);
            map.put("admins",admins);
        }

        return "find";
    }

}
