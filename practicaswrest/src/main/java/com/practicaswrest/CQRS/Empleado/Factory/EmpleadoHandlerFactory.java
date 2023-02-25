package com.practicaswrest.CQRS.Empleado.Factory;

import com.practicaswrest.CQRS.Empleado.Commands.Create.CreateEmpleadoHandler;
import com.practicaswrest.CQRS.Empleado.Commands.Delete.DeleteEmpleadoHandler;
import com.practicaswrest.CQRS.Empleado.Commands.Update.UpdateEmpleadoHandler;
import com.practicaswrest.CQRS.Empleado.Queries.GetById.GetEmpleadoByIdHandler;
import com.practicaswrest.CQRS.Empleado.Queries.GetList.GetEmpleadoListHandler;
import com.practicaswrest.entities.repositories.IEmpleadoRepository;
import com.practicaswrest.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmpleadoHandlerFactory implements IEmpleadoHandlerFactory {
    private final Mapper mapper;
    private final IEmpleadoRepository empleadoRepository;
        
    @Autowired
    public EmpleadoHandlerFactory(Mapper mapper,
                                  IEmpleadoRepository empleadoRepository)
    {
        this.mapper = mapper;
        this.empleadoRepository = empleadoRepository;
    }
        
    @Bean
    @Override
    public CreateEmpleadoHandler createCreateEmpleadoHandler() {
        return new CreateEmpleadoHandler(empleadoRepository);
    }

    @Bean
    @Override
    public DeleteEmpleadoHandler createDeleteEmpleadoHandler() {
        return new DeleteEmpleadoHandler(empleadoRepository);
    }
    
    @Bean
    @Override
    public UpdateEmpleadoHandler createUpdateEmpleadoHandler() {
        return new UpdateEmpleadoHandler(empleadoRepository);
    }
    
    @Bean
    @Override
    public GetEmpleadoByIdHandler createGetEmpleadoByIdHandler() {
        return new GetEmpleadoByIdHandler(empleadoRepository, mapper);
    }
    @Bean
    @Override
    public GetEmpleadoListHandler createGetEmpleadoListHandler() {
        return new GetEmpleadoListHandler(empleadoRepository, mapper);
    }
}