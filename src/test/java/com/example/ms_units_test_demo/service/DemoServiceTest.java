package com.example.ms_units_test_demo.service;

import org.junit.jupiter.api.Test;

import com.example.ms_units_test_demo.model.DemoRequest;

import static org.junit.jupiter.api.Assertions.*;

class DemoServiceTest {

    @Test
    void testProcesarPeticion() {
        DemoService service = new DemoService();
        DemoRequest request = new DemoRequest();
        request.setNombre("Juan");

        String resultado = service.procesarPeticion(request);

        assertEquals("Procesado: Juan", resultado);
    }
}