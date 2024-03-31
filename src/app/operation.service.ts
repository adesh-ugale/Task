import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class OperationService {

  constructor(private httpClient:HttpClient)
  { 

  }

  setData(image:Image)
  {
    return this.httpClient.post("http://localhost:8080/setData",image);
  }

  getData(emailid:String)
  {
    return this.httpClient.get<Image>("http://localhost:8080/getData/"+emailid);
  }
}

export class Image
{
  imagepath:string;
  firstname:string;
  lastname:string;
  emailid:string;
  mobno:number;
  age:number;
  state:string;
  country:string;
  tag:string;

  constructor(imagepath:string,firstname:string,lastname:string,emailid:string,mobno:number,age:number,state:string,country:string,tag:string)
  {
    this.imagepath=imagepath;
    this.firstname=firstname;
    this.lastname=lastname;
    this.emailid=emailid;
    this.mobno=mobno;
    this.age=age;
    this.state=state;
    this.country=country;
    this.tag=tag;

  }
}