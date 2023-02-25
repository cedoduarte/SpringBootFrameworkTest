package com.practicaswrest.CQRS.Empleado.Commands.Delete;

import com.practicaswrest.entities.repositories.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DeleteEmpleadoHandler {
    private final IEmpleadoRepository empleadoRepository;
    
    @Autowired
    public DeleteEmpleadoHandler(IEmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }
    
    public void send(DeleteEmpleadoCommand request) {
        empleadoRepository.deleteById(request.getId());
    }
}
