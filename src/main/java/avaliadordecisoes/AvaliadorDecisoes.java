package avaliadordecisoes;

public class AvaliadorDecisoes {

	public String avaliar(double empolgacao, double satisfacao, double esforco, double consequencias) {
		double resultado = (empolgacao * satisfacao) / (esforco + consequencias);
		
		if (resultado < 5)
			return "Deu ruim";
		
		if (resultado >= 5 && resultado <= 7)
			return "Ok";
		
		return "Valeu muito a pena";
	}
}
