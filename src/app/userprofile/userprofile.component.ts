import { Component, OnInit } from '@angular/core';
import { OperationService,Image} from '../operation.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-userprofile',
  standalone: true,
  imports: [],
  templateUrl: './userprofile.component.html',
  styleUrl: './userprofile.component.css'
})
export class UserprofileComponent implements OnInit {

  emailid:any;
  image:Image=new Image('','','','',0,0,'','','');

  constructor(private operationService:OperationService,private router:Router)
  {
    
  }
  ngOnInit(): void {
    
    this.emailid=sessionStorage.getItem('emailid');
    this.operationService.getData(this.emailid).subscribe(answer=>this.image=answer);
  }

  toAgree()
  {
    this.router.navigateByUrl('/homepage');
  }

}
