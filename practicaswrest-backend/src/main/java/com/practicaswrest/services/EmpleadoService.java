package com.practicaswrest.services;

import com.practicaswrest.CQRS.Empleado.Commands.Create.CreateEmpleadoCommand;
import com.practicaswrest.CQRS.Empleado.Commands.Create.CreateEmpleadoHandler;
import com.practicaswrest.CQRS.Empleado.Commands.Delete.DeleteEmpleadoCommand;
import com.practicaswrest.CQRS.Empleado.Commands.Delete.DeleteEmpleadoHandler;
import com.practicaswrest.CQRS.Empleado.Commands.Update.UpdateEmpleadoCommand;
import com.practicaswrest.CQRS.Empleado.Commands.Update.UpdateEmpleadoHandler;
import com.practicaswrest.CQRS.Empleado.Factory.EmpleadoHandlerFactory;
import com.practicaswrest.CQRS.Empleado.Queries.GetById.GetEmpleadoByIdHandler;
import com.practicaswrest.CQRS.Empleado.Queries.GetById.GetEmpleadoByIdQuery;
import com.practicaswrest.CQRS.Empleado.Queries.GetList.GetEmpleadoListHandler;
import com.practicaswrest.CQRS.Empleado.Queries.GetList.GetEmpleadoListQuery;
import com.practicaswrest.viewmodels.EmpleadoViewModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService implements IEmpleadoService {
    private final EmpleadoHandlerFactory factory;    
    private final GetEmpleadoByIdHandler getById;
    private final CreateEmpleadoHandler create;
    private final UpdateEmpleadoHandler update;
    private final GetEmpleadoListHandler getList;
    private final DeleteEmpleadoHandler delete;
    
    @Autowired
    public EmpleadoService(EmpleadoHandlerFactory factory) {
        this.factory = factory;
        getById = this.factory.createGetEmpleadoByIdHandler();
        create = this.factory.createCreateEmpleadoHandler();
        update = this.factory.createUpdateEmpleadoHandler();
        getList = this.factory.createGetEmpleadoListHandler();
        delete = this.factory.createDeleteEmpleadoHandler();
    }
    
    /// Gets an Empleado by his "id"
    @Override
    public EmpleadoViewModel getById(Integer id) {
        return getById.send(new GetEmpleadoByIdQuery(id));
    }
    
    /// Inserts a new record of Empleado
    @Override
    public boolean insert(CreateEmpleadoCommand request) {
        create.send(request);
        return true;
    }
    
    /// Updates an existing record of Empleado
    @Override
    public boolean update(UpdateEmpleadoCommand request) {
        update.send(request);
        return true;
    }
    
    /// Gets a list of all records
    @Override
    public List<EmpleadoViewModel> getList(GetEmpleadoListQuery request) {
        return getList.send(request);
    }
    
    /// Deletes a record from database
    @Override
    public boolean delete(Integer id) {
        delete.send(new DeleteEmpleadoCommand(id));
        return true;
    }
}
