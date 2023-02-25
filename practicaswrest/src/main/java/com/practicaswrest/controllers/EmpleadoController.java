package com.practicaswrest.controllers;

import com.practicaswrest.CQRS.Empleado.Commands.Create.CreateEmpleadoCommand;
import com.practicaswrest.CQRS.Empleado.Commands.Update.UpdateEmpleadoCommand;
import com.practicaswrest.CQRS.Empleado.Queries.GetList.GetEmpleadoListQuery;
import com.practicaswrest.services.IEmpleadoService;
import com.practicaswrest.viewmodels.EmpleadoViewModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/empleado")
public class EmpleadoController {
    private final IEmpleadoService empleadoService;
    
    @Autowired    
    public EmpleadoController(IEmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }
    
    @GetMapping("getAll")
    public List<EmpleadoViewModel> getEmpleadoList(@RequestParam String keyword,
                                                   @RequestParam boolean getAll)
    {
        return empleadoService.getList(new GetEmpleadoListQuery(keyword, getAll));
    }
    
    @GetMapping("getById")
    public EmpleadoViewModel getById(@RequestParam int id) {
        return empleadoService.getById(id);
    }
    
    @PostMapping("create")
    public boolean insertEmpleado(@RequestBody CreateEmpleadoCommand request) {
        return empleadoService.insert(request);
    }
    
    @PutMapping("update")
    public boolean updateEmpleado(@RequestBody UpdateEmpleadoCommand request) {
        return empleadoService.update(request);
    }
    
    @DeleteMapping("delete")
    public boolean deleteEmpleado(@RequestParam int id) {
        return empleadoService.delete(id);
    }
}