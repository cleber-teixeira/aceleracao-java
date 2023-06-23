import { Component, OnInit, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.scss']
})
export class FormsComponent implements OnInit {

  @Output() resp = new EventEmitter<any>();

  kmPorLitro: any;
  litroPorKm: any;
  valorPorKm: any;

  constructor() { }

  ngOnInit(): void {

  }

  calculos() {

    // criar as variaveis para poder pegar o valor
    let nomeVeiculo: string = (document.querySelector('.nomeVeiculo') as HTMLInputElement).value
    let kilometroLitro = (document.querySelector('.kmPorLitro') as HTMLInputElement).value
    let kmDestino: any = (document.querySelector('.kmDestino') as HTMLInputElement).value
    let valorCombustivel: any = (document.querySelector('.valorCombustivel') as HTMLInputElement).value

    // faça a expressão de calculos
    let quantLitro: any = parseFloat(kmDestino) / parseFloat(kilometroLitro)
    let valorKm: any = parseFloat(quantLitro) * parseFloat(valorCombustivel)

    // Respostas
    const obj = {
      resp1: "• Roda " + kilometroLitro + " Km por litro.",
      resp2: "• Consome " + quantLitro + " litros para rodar " + kmDestino + " Km.",
      resp3: "• Gasta R$ " + valorKm + " para rodar " + kmDestino + " Km.",
      veiculo: nomeVeiculo
    };

    this.resp.emit(obj);

    // let resp1 = (document.querySelector('.litro') as HTMLElement)
    // let resp2 = (document.querySelector('.litroKm')as HTMLElement)
    // let resp3 = (document.querySelector('.valorKm')as HTMLElement)

    // resp1.innerHTML= kilometroLitro
    // resp2.innerHTML = quantLitro
    // resp3.innerHTML = valorKm

  }

}
