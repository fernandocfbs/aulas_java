
public class Ola {

	public static void main(String []args){
		
		Impressora lx300 = new Impressora();
		lx300.marca = "epson";
		lx300.preco = 2.502;
		lx300.modelo = "SE";
		lx300.numeroSerie = "SX";
		lx300.imprimir();
		
		Impressora hp = new Impressora();
		hp.marca = "hp";
		hp.preco = 1.500;
		hp.modelo = "SE 456";
		hp.numeroSerie = "12.SX";
		hp.imprimir();
		
	}
}
