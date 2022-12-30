package cafeteria;

public class Teste {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo(35000);

		Acessorios comar=new Ar();	
		Acessorios comdirecao=new Direcao();	
		Acessorios aredirecao=new Ar(new Direcao());
		Acessorios completo=new Ar(new Direcao(new Cambio()));
		
		double valor1 = comar.calculavalor(veiculo);
		double valor2 = comdirecao.calculavalor(veiculo);
		double valor3 = aredirecao.calculavalor(veiculo);
		double valor4 = completo.calculavalor(veiculo);
		
		
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
		System.out.println(valor4);
	}
	
}
