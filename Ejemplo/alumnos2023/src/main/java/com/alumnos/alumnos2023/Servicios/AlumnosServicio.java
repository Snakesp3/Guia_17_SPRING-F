package com.alumnos.alumnos2023.Servicios;

import com.alumnos.alumnos2023.Entidades.Alumnos;
import com.alumnos.alumnos2023.Entidades.Escuelas;
import com.alumnos.alumnos2023.Entidades.Materias;

import com.alumnos.alumnos2023.Repositorios.AlumnosRepositorio;
import com.alumnos.alumnos2023.Repositorios.EscuelasRepositorio;
import com.alumnos.alumnos2023.Repositorios.MateriasRepositorio;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnosServicio {
    
    //Indicamos al servidor de aplicaciones que esta variable va a ser inicializada por el
    @Autowired //(Esto se conoce como inyeccion de dependencia)
    private AlumnosRepositorio alumnosrepositorio;
    
    @Autowired
    private EscuelasRepositorio escuelasrepositorio;
    
    @Autowired
    private MateriasRepositorio materiasrepositorio;
    
    
    public void crearAlumnos(Integer idAlumnos,String nombre,Integer dni,String idEscuelas,String idMaterias) {
        
        Escuelas escuelas = escuelasrepositorio.findById(idEscuelas).get();
        Materias materias = materiasrepositorio.findById(idMaterias).get();


        //Primero que nada creamos un objeto
        Alumnos alumnos = new Alumnos();
        
        // Luego de tener todos los atributos completo podemos guardar todo lo que cargue y lo persista luego a la base
        //de datos
        
        //Video Servicio 1 min 7.50
        
        alumnos.setIdAlumnos(idAlumnos);
        alumnos.setNombre(nombre);
        alumnos.setDni(dni);
        alumnos.setAlta(new Date());
        
        alumnos.setEscuelas(escuelas);
        alumnos.setMaterias(materias);
        alumnosrepositorio.save(alumnos);
        
        
       
    }
    
}
