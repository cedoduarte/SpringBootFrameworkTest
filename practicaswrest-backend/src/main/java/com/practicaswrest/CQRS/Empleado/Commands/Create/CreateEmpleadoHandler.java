package com.practicaswrest.CQRS.Empleado.Commands.Create;

import com.practicaswrest.entities.Empleado;
import com.practicaswrest.entities.repositories.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateEmpleadoHandler {
    private final IEmpleadoRepository empleadoRepository;
    
    @Autowired    
    public CreateEmpleadoHandler(IEmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;        
    }
    
    public void send(CreateEmpleadoCommand request) {
        empleadoRepository.save(map(request));      
    }
    
    private Empleado map(CreateEmpleadoCommand command) {
        Empleado empleado = new Empleado();
        empleado.setNombre(command.getNombre());
        empleado.setApellido(command.getApellido());
        empleado.setCedula(command.getCedula());
        empleado.setEdad(command.getEdad());
        empleado.setTelefono(command.getTelefono());
        empleado.setBirthdate(command.getBirthdate());
        return empleado;
    }
}
