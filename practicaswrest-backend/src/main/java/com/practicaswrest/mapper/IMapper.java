package com.practicaswrest.mapper;

import com.practicaswrest.entities.Empleado;
import com.practicaswrest.viewmodels.EmpleadoViewModel;
import java.util.List;

public interface IMapper {
    Empleado map(EmpleadoViewModel model);
    EmpleadoViewModel map(Empleado empleado);
    List<EmpleadoViewModel> map(List<Empleado> empleadoList);
}