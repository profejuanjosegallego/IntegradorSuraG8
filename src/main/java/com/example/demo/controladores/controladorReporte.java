package com.example.demo.controladores;

import com.example.APISuraG8ReportesEstadisticos.Servicios.ServicioReporte;
import com.example.APISuraG8ReportesEstadisticos.modelos.Reporte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apisura8/v1/reportes")
public class controladorReporte {

    //EntPoint son los nombres que se le dan a los servicios que ofrece el API
    //Inyectemos la dependencia
    @Autowired
    ServicioReporte servicio;

    //Llamamos a cada servicio
    @PostMapping
    public ResponseEntity<?> controladorGuardar(@RequestBody Reporte datos){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.servicio.guardar(datos));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    @GetMapping
    public ResponseEntity<?> controladorBuscarTodos(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.servicio.buscarTodos());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> controladorBuscarPorId(@PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.servicio.buscarPorId(id));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }


}
