package com.kang.springboot.controller;

import com.kang.springboot.model.State;
import com.kang.springboot.severvice.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StateController {
    @Autowired
    private StateService stateservice;

    @RequestMapping("/sta")
    public @ResponseBody
    Object ssssa(Integer id){
        State state=stateservice.queryStateById(id);
        return state;
    }
}
