import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DeleteEmpleadoComponent } from './empleado-crud/delete-empleado/delete-empleado.component';
import { EmpleadoCrudComponent } from './empleado-crud/empleado-crud.component';
import { InsertEmpleadoComponent } from './empleado-crud/insert-empleado/insert-empleado.component';
import { ReadEmpleadoComponent } from './empleado-crud/read-empleado/read-empleado.component';
import { UpdateEmpleadoComponent } from './empleado-crud/update-empleado/update-empleado.component';

const routes: Routes = [
  {
    path: "",
    component: EmpleadoCrudComponent,
    pathMatch: "full"
  },
  {
    path: "insertempleado",
    component: InsertEmpleadoComponent,
    pathMatch: "full"
  },
  {
    path: "deleteempleado",
    component: DeleteEmpleadoComponent,
    pathMatch: "full"
  },
  {
    path: "updateempleado",
    component: UpdateEmpleadoComponent,
    pathMatch: "full"
  },
  {
    path: "readempleado",
    component: ReadEmpleadoComponent,
    pathMatch: "full"
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}