package com.springboot.count.usercount.controller;

import com.springboot.count.usercount.po.UserCount;
import com.springboot.count.usercount.service.UserCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author chen1
 * @annotation:控制类
 * @create 2018-08-03 10:46
 **/
@Controller
@RequestMapping("/userCount")
public class UserCountController {

    @Autowired
    private UserCountService userCountService;

    @RequestMapping("/toList")
    public String toList(Model model) {
        List<UserCount> userCounts = userCountService.findAll();
        model.addAttribute("userCounts", userCounts);
        return "/userCountList";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(UserCount userCount) {
        String back = "false";
        boolean saveFlag = userCountService.save(userCount);
        if (saveFlag) {
            back = "success";
        }
        return back;
    }

}

