package com.alumnos.alumnos2023.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//Sera el encargado de dirigirnos a la pagina
@RequestMapping("/")
public class PortalControlador {

    //Mapeara el acceso a la url
    @GetMapping("/")
    public String index() {
        
        //Luego devolvemos la vista que queremos ver
        return "index.html";
    }
    
    @GetMapping("/registrar")
    public String registro() {
        return "form_Not.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam int idAlumnos, String nombre, Integer dni) {

      alumnos       
              return "index.html";
    
    
}
