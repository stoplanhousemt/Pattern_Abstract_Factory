package br.com.algaworks.abs_factory.imposto;

public class CalculoImpostoMT implements CalculoImposto {

	@Override
	public double calcularImposto(double valor) {
		return valor * 0.21;
	}

}
