package com.practicaswrest.services;

import com.practicaswrest.CQRS.Empleado.Commands.Create.CreateEmpleadoCommand;
import com.practicaswrest.CQRS.Empleado.Commands.Update.UpdateEmpleadoCommand;
import com.practicaswrest.CQRS.Empleado.Queries.GetList.GetEmpleadoListQuery;
import com.practicaswrest.viewmodels.EmpleadoViewModel;
import java.util.List;

public interface IEmpleadoService {
    EmpleadoViewModel getById(Integer id);
    boolean insert(CreateEmpleadoCommand request);
    boolean update(UpdateEmpleadoCommand request);
    List<EmpleadoViewModel> getList(GetEmpleadoListQuery request);
    boolean delete(Integer id);
}
