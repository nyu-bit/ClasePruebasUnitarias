package com.example.ms_units_test_demo.service;

import org.springframework.stereotype.Service;

import com.example.ms_units_test_demo.model.DemoRequest;

@Service
public class DemoService {

    public String obtenerSaludo() {
        return "Hola desde el servicio!";
    }

    public String procesarPeticion(DemoRequest request) {
        return "Procesado: " + request.getNombre();
    }
}