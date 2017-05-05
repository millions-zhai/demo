package com.project.controller;

import com.project.dao.DemoDao;
import com.project.model.Demo;
import com.project.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pc on 2017/5/5.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoDao demoDao;

    @ResponseBody
    @RequestMapping("/login")
    public JsonResponse login(){

        Demo demo = demoDao.getDemo();

        return JsonResponse.ok(demo);
    }
}
