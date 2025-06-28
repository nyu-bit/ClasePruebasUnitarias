package com.example.ms_units_test_demo.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.ms_units_test_demo.service.DemoService;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

class DemoControllerTest {

    @Mock
    private DemoService demoService;

    @InjectMocks
    private DemoController demoController;

    public DemoControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaludo() {
        when(demoService.obtenerSaludo()).thenReturn("Hola Test!");
        String respuesta = demoController.saludo();
        assertEquals("Hola Test!", respuesta);
    }
}