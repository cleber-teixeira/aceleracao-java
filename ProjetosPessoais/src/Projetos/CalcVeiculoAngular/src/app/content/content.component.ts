import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-content',
  templateUrl: './content.component.html',
  styleUrls: ['./content.component.scss']
})
export class ContentComponent implements OnInit {

  // @Input() respDoc: string = '';
  // @Input() resp!: { resp1: string, resp2: string, resp3: string };
  @Input() resp: any;

  constructor() { }

  ngOnInit(): void {
  }

}
