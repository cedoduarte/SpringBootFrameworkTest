package com.practicaswrest.CQRS.Empleado.Queries.GetList;

public class GetEmpleadoListQuery {
    private String keyword;
    private boolean getAll;
    
    public GetEmpleadoListQuery(String keyword, boolean getAll)
    {
        this.keyword = keyword;
        this.getAll = getAll;
    }
    
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    
    public void setGetAll(boolean getAll) {
        this.getAll = getAll;
    }
    
    public String getKeyword() {
        return keyword;
    }
    
    public boolean getGetAll() {
        return getAll;
    }
}
