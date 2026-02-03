package com.example.demo.controladores;

import com.example.APISURAG8PROFESORES.modelos.Profesor;
import com.example.APISURAG8PROFESORES.servicios.ServicioProfesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apisura8/v1/profesores")
public class ControladorProfesor {

    //Inyectemos la dependencia
    @Autowired
    ServicioProfesor servicio;

    //llamamos a cada servicio
    @PostMapping
    public ResponseEntity<?> controladorGuardar(@RequestBody Profesor datos){
        try{
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.servicio.guardar(datos));
        }catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> controladorBuscarTodos(){
        try{
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.servicio.buscarTodos());
        }catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> controladorBuscarPorId(@PathVariable Integer id ){
        try{
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.servicio.buscarPorId(id));
        }catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }


}
