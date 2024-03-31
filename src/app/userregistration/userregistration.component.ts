import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { OperationService,Image} from '../operation.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-userregistration',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './userregistration.component.html',
  styleUrl: './userregistration.component.css'
})
export class UserregistrationComponent {

  state:string="";
  country:string="";
  tag:string="";
  image:Image=new Image('','','','',0,0,'','','');
  message: any;
  constructor(private operationService:OperationService,private router:Router)
  {

  }

  saveState()
  {
    this.image.state=this.state;
  }

  saveCountry()
  {
    this.image.country=this.country;
  }

  saveTag()
  {
    this.image.tag=this.tag;
  }


  Cancel()
  {
    this.router.navigateByUrl('/homepage');
  }

  Submit()
  {
    this.operationService.setData(this.image).subscribe(answer=>{
      if(answer)
      {
        sessionStorage.setItem("emailid",this.image.emailid);
        this.router.navigateByUrl('/userprofile');
      }
      else
      {
        this.message="Same error occur on backend side";
          this.router.navigateByUrl('/userregitration');
      }
    });
  }
}
