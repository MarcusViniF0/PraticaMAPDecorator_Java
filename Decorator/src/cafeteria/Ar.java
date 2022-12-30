package cafeteria;

public class Ar extends Acessorios{
	
	public Ar(Acessorios outroAcessorio) {
		super(outroAcessorio);
	}
	public Ar() {
		
	}
	@Override
	protected double calculavalor(Veiculo veiculo) {
		System.out.println("Ar-condicionado");
		return 2000 + calcula(veiculo);
	}
	
}
