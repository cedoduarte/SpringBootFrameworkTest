import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-empleado-crud',
  templateUrl: './empleado-crud.component.html',
  styleUrls: ['./empleado-crud.component.css']
})
export class EmpleadoCrudComponent implements OnInit {
  constructor(private router: Router) {
  }

  ngOnInit(): void {
  }

  public insertRecord(): void {
    this.router.navigate(["insertempleado"]);
  }
  
  public updateRecord(): void {
    this.router.navigate(["updateempleado"]);
  }
  
  public deleteRecord(): void {
    this.router.navigate(["deleteempleado"]);
  }
  
  public readRecord(): void {
    this.router.navigate(["readempleado"]);
  }
}
