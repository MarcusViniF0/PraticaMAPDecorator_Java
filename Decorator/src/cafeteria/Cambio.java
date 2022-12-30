package cafeteria;

public class Cambio extends Acessorios{
	public Cambio(Acessorios outroAcessorio) {
		super(outroAcessorio);
	}
	@Override
	protected double calculavalor(Veiculo veiculo) {
		
		return 1500+calcula(veiculo);
	}
public Cambio() {
		
	}
}
