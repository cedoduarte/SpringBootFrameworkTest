import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmpleadoCrudComponent } from './empleado-crud/empleado-crud.component';
import { MaterialModule } from './material/material.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { InsertEmpleadoComponent } from './empleado-crud/insert-empleado/insert-empleado.component';
import { DeleteEmpleadoComponent } from './empleado-crud/delete-empleado/delete-empleado.component';
import { UpdateEmpleadoComponent } from './empleado-crud/update-empleado/update-empleado.component';
import { ReadEmpleadoComponent } from './empleado-crud/read-empleado/read-empleado.component';

@NgModule({
  declarations: [
    AppComponent,
    EmpleadoCrudComponent,
    InsertEmpleadoComponent,
    DeleteEmpleadoComponent,
    UpdateEmpleadoComponent,
    ReadEmpleadoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    MaterialModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
