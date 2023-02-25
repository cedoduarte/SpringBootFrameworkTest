package com.practicaswrest.CQRS.Empleado.Factory;

import com.practicaswrest.CQRS.Empleado.Commands.Create.CreateEmpleadoHandler;
import com.practicaswrest.CQRS.Empleado.Commands.Delete.DeleteEmpleadoHandler;
import com.practicaswrest.CQRS.Empleado.Commands.Update.UpdateEmpleadoHandler;
import com.practicaswrest.CQRS.Empleado.Queries.GetById.GetEmpleadoByIdHandler;
import com.practicaswrest.CQRS.Empleado.Queries.GetList.GetEmpleadoListHandler;

public interface IEmpleadoHandlerFactory {
    CreateEmpleadoHandler createCreateEmpleadoHandler();
    DeleteEmpleadoHandler createDeleteEmpleadoHandler();
    UpdateEmpleadoHandler createUpdateEmpleadoHandler();
    GetEmpleadoByIdHandler createGetEmpleadoByIdHandler();
    GetEmpleadoListHandler createGetEmpleadoListHandler();
}
