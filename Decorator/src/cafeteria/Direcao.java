package cafeteria;

public class Direcao extends Acessorios{
	public Direcao(Acessorios outroAcessorio) {
		super(outroAcessorio);
	}
	public Direcao() {
		
	}
	@Override
	protected double calculavalor(Veiculo veiculo) {
		return 700+calcula(veiculo);
	}

}
