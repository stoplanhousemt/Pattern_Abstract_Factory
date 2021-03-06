package br.com.algaworks.abs_factory;

import br.com.algaworks.abs_factory.enums.EnumBancos;
import br.com.algaworks.abs_factory.imposto.CalculoImposto;
import br.com.algaworks.abs_factory.imposto.CalculoImpostoSP;

public class GeradorNotaFiscalSPFactory extends GeradorNotaFiscalFactory{

	public GeradorNotaFiscalSPFactory(EnumBancos banco) {
		super(banco);
	}
	
	@Override
	public CalculoImposto getCalculoImposto() {
		return CalculoImpostoSP.getInstance();
	}

}
