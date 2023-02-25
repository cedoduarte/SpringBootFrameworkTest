package com.practicaswrest.CQRS.Empleado.Commands.Update;

import com.practicaswrest.entities.Empleado;
import com.practicaswrest.entities.repositories.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdateEmpleadoHandler {
    private final IEmpleadoRepository empleadoRepository;
    
    @Autowired
    public UpdateEmpleadoHandler(IEmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }
    
    public void send(UpdateEmpleadoCommand request) {
        empleadoRepository.save(map(request));
    }
    
    private Empleado map(UpdateEmpleadoCommand command) {
        Empleado empleado = new Empleado();
        empleado.setId(command.getId());
        empleado.setNombre(command.getNombre());
        empleado.setApellido(command.getApellido());
        empleado.setCedula(command.getCedula());
        empleado.setEdad(command.getEdad());
        empleado.setTelefono(command.getTelefono());
        empleado.setBirthdate(command.getBirthdate());
        return empleado;
    }
}