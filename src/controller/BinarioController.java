package controller;

public class BinarioController {
	public BinarioController() {
		super();
	}
	
	public void conversorBinario(int num){
		if (num == 0) {return;}
		//Quando o número passa pela última divisão, sendo um inteiro, ele se tornará zero, e a função não terá mais para onde ir.
		else {
			conversorBinario(num/2);
			System.out.print(num%2);
			//Printar o número após a chamada, para ser impresso na ordem inversa
		}
	}
	
	public String conversorBinString(int num) {
		return "0";
		//Ainda não sei como fazer este usando String, tentarei depois.
	}
	
}
