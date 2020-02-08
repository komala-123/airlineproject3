import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent {
todaysDate = new Date();
 CR = 'komala';
 students= [
   {name: 'komala',
   age:21
 },{
   name:'vimala',
   age:32
 },{
   name:'saru',
   age:12
 },{
name:'pooja',
age:12
 }
]
deleteStudent(student){
  let index = this.students.indexOf(student);
  this.students.splice(index, 1);
}}
