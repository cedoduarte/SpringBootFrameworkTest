package com.practicaswrest.CQRS.Empleado.Queries.GetList;

import com.practicaswrest.entities.Empleado;
import com.practicaswrest.entities.repositories.IEmpleadoRepository;
import com.practicaswrest.mapper.Mapper;
import com.practicaswrest.viewmodels.EmpleadoViewModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class GetEmpleadoListHandler {
    private final IEmpleadoRepository empleadoRepository;
    private final Mapper mapper;
    
    @Autowired    
    public GetEmpleadoListHandler(IEmpleadoRepository empleadoRepository,
                                  Mapper mapper)
    {
        this.empleadoRepository = empleadoRepository;
        this.mapper = mapper;
    }
    
    public List<EmpleadoViewModel> send(GetEmpleadoListQuery request) {
        List<EmpleadoViewModel> modelList = new ArrayList<>();
        List<Empleado> empleadoList = empleadoRepository.findAll();
        for (Empleado empleado : empleadoList) {
            if (empleado.getNombre().toLowerCase().contains(request.getKeyword().toLowerCase())
                || empleado.getApellido().toLowerCase().contains(request.getKeyword().toLowerCase())
                || empleado.getCedula().toLowerCase().contains(request.getKeyword().toLowerCase())
                || empleado.getTelefono().toLowerCase().contains(request.getKeyword().toLowerCase())
                || empleado.getBirthdate().toString().toLowerCase().contains(request.getKeyword().toLowerCase()))
            {
                modelList.add(mapper.map(empleado));
            }
        }
        return modelList;
    }
}
