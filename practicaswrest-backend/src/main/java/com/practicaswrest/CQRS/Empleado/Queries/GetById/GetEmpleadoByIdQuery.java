package com.practicaswrest.CQRS.Empleado.Queries.GetById;

public class GetEmpleadoByIdQuery {
    private Integer id;
    
    public GetEmpleadoByIdQuery() {
        id = -1;
    }
    
    public GetEmpleadoByIdQuery(int id) {
        this.id = id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return id;
    }    
}
