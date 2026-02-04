package com.example.demo.controladores;


import com.example.demo.modelos.Nota;
import com.example.demo.servicios.ServicioNota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//Los endpoint son los nombres que se le dan a los servicios que ofrece el API
@RequestMapping("/apisura8/v1/notas")
public class ControladorNota {

    //Inyectemos la dependencia
    @Autowired
    ServicioNota servicio;

    //Llamamos a cada servicio
    @PostMapping
    public ResponseEntity<?> controladorGuardar(@RequestBody Nota datos){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.servicio.guardar(datos));
        }catch(Exception error){
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
        }catch(Exception error){
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
        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //Una petición tiene dos partes una cabecera y un cuerpo o body,
    // en la cabecera van los endpoints y en el cuerpo los datos

    //tipos de respuesta
    // xx todo esta bien
    // xxx errores de red
    // xxxx error cliente - frontend
    // xxxxx backedn- ataque cibernetico

    //Las operaciones
    // guardar-Post, buscar-Get. Nomrarlos segun el metodo Http
}
