package com.pepsico.pipeline.pipelinedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class Pipelinecontroller {

    @GetMapping(value="/message")
    public String getMessage()
    {
        return "Good Morning";
    }

}
