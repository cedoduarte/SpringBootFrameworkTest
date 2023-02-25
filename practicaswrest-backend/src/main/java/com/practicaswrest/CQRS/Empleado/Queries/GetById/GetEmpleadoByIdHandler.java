package com.practicaswrest.CQRS.Empleado.Queries.GetById;

import com.practicaswrest.entities.repositories.IEmpleadoRepository;
import com.practicaswrest.mapper.Mapper;
import com.practicaswrest.viewmodels.EmpleadoViewModel;
import org.springframework.beans.factory.annotation.Autowired;

public class GetEmpleadoByIdHandler {
    private final IEmpleadoRepository empleadoRepository;
    private final Mapper mapper;
    
    @Autowired
    public GetEmpleadoByIdHandler(IEmpleadoRepository empleadoRepository,
                                  Mapper mapper) 
    {
        this.empleadoRepository = empleadoRepository;
        this.mapper = mapper;
    }
    
    public EmpleadoViewModel send(GetEmpleadoByIdQuery request) {
        return mapper.map(empleadoRepository.findById(request.getId()).get());
    }
}