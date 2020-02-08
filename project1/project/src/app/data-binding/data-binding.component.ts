import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {
  message='good afternoon';
  imgURL = 'https://cdn.pixabay.com/photo/2019/03/19/14/51/fantasy-4065900__340.jpg';

  constructor() { }

  ngOnInit() {
  }
girl(){
  this.imgURL = 'https://cdn.pixabay.com/photo/2019/03/19/14/51/fantasy-4065900__340.jpg';
}
boy(){
  this.imgURL = 'https://cdn.pixabay.com/photo/2019/03/19/14/51/fantasy-4065900__340.jpg';
}
}
