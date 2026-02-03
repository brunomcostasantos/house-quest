package com.warple.house_quest.controller;

import com.warple.house_quest.dto.StatusResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StatusController {

    @GetMapping("/status-check")
    public StatusResponse statusCheck() {
        return new StatusResponse("Service is up and running");
    }

}
