package com.example.ms_units_test_demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ms_units_test_demo.model.DemoRequest;
import com.example.ms_units_test_demo.service.DemoService;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping
    public String saludo() {
        return demoService.obtenerSaludo();
    }

    @PostMapping
    public String procesar(@RequestBody DemoRequest request) {
        return demoService.procesarPeticion(request);
    }
}