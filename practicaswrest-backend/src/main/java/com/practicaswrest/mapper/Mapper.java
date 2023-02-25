package com.practicaswrest.mapper;

import com.practicaswrest.entities.Empleado;
import com.practicaswrest.viewmodels.EmpleadoViewModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Mapper implements IMapper {    
    @Override
    public Empleado map(EmpleadoViewModel model) {
        Empleado empleado = new Empleado();
        empleado.setId(model.getId());
        empleado.setNombre(model.getNombre());
        empleado.setApellido(model.getApellido());
        empleado.setCedula(model.getCedula());
        empleado.setEdad(model.getEdad());
        empleado.setTelefono(model.getTelefono());
        empleado.setBirthdate(model.getBirthdate());
        return empleado;
    }
    
    @Override
    public EmpleadoViewModel map(Empleado empleado) {
        EmpleadoViewModel model = new EmpleadoViewModel();
        model.setId(empleado.getId());
        model.setNombre(empleado.getNombre());
        model.setApellido(empleado.getApellido());
        model.setCedula(empleado.getCedula());
        model.setEdad(empleado.getEdad());
        model.setTelefono(empleado.getTelefono());
        model.setBirthdate(empleado.getBirthdate());
        return model;
    }
    
    @Override
    public List<EmpleadoViewModel> map(List<Empleado> empleadoList) {
        List<EmpleadoViewModel> resultList = new ArrayList<>();
        for (Empleado empleado : empleadoList) {
            resultList.add(map(empleado));
        }
        return resultList;
    }
}
