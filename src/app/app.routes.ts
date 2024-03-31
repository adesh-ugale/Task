import { Routes } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { UserregistrationComponent } from './userregistration/userregistration.component';
import { UserprofileComponent } from './userprofile/userprofile.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ClientsComponent } from './clients/clients.component';
import { ContactusComponent } from './contactus/contactus.component';
import { EmployeesComponent } from './employees/employees.component';
import { JobsComponent } from './jobs/jobs.component';

export const routes: Routes = [

    {path:'homepage', component:HomepageComponent},

    {path:'userregistration', component:UserregistrationComponent},

    {path:'userprofile', component:UserprofileComponent},

    {path:'', redirectTo:'/homepage', pathMatch:'full'},

    {path:'aboutus', component:AboutusComponent},

    {path:'clients', component:ClientsComponent},

    {path:'contactus', component:ContactusComponent},

    {path:'employees', component:EmployeesComponent},

    {path:'jobs', component:JobsComponent}
];
