package cafeteria;

public abstract class Acessorios {
	
	protected Acessorios outroAcessorio;
	
	public Acessorios(Acessorios OutroAcessorio){
		outroAcessorio=OutroAcessorio;
	}
		
	public Acessorios() {
	}
	protected abstract double calculavalor(Veiculo veiculo);
	protected double calcula(Veiculo veiculo) {
		if(outroAcessorio ==null)
			return 0;
		else
			return outroAcessorio.calculavalor(veiculo);
	}
	}
	

