package com.practicaswrest.CQRS.Empleado.Commands.Delete;

public class DeleteEmpleadoCommand {
    private Integer id;
    
    public DeleteEmpleadoCommand() {
        id = -1;
    }
    
    public DeleteEmpleadoCommand(Integer id) {
        this.id = id;
    }
       
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return id;
    }    
}
