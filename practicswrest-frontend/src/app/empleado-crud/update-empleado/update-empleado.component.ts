import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-update-empleado',
  templateUrl: './update-empleado.component.html',
  styleUrls: ['./update-empleado.component.css']
})
export class UpdateEmpleadoComponent implements OnInit {
  public empleadoForm!: FormGroup;
  constructor() { 

  }

  ngOnInit(): void {
    this.empleadoForm = new FormGroup({
      nombre: new FormControl(null, [Validators.required]),
      apellido: new FormControl(null, [Validators.required]),
      cedula: new FormControl(null, [Validators.required]),
      edad: new FormControl(null, [Validators.required]),
      telefono: new FormControl(null, [Validators.required]),
      birthdate: new FormControl(null, [Validators.required])
    });
  }

  public onSubmit(): void {

  }
}
