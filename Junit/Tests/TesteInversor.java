package Tests;
import Code.Inversor;

public class TesteInversor {
Inversor inversor = new Inversor();
	
	public String testaInversaoNumeroPositivo() {
		int entrada = 5, resultadoEsperado = -5;
		
		if (inversor.inverte(entrada) == resultadoEsperado) 
			return "SUCESSO";		
		else 
			return "FALHA";
	}
	
	public String testaInversaoNumeroNegativo() {
		int entrada = -5, resultadoEsperado = 5;
				
		if (inversor.inverte(entrada) == resultadoEsperado) 
			return "SUCESSO";		
		else 
			return "FALHA";
	}
	
	public String testaInversaoNumeroPositivoGrande() {
		int entrada = 500000000, resultadoEsperado = -500000000;
				
		if (inversor.inverte(entrada) == resultadoEsperado) 
			return "SUCESSO";		
		else 
			return "FALHA";
	}
	
	public String testaInversaoNumeroNegativoGrande() {
		int entrada = -500000000, resultadoEsperado = 500000000;
			
		if (inversor.inverte(entrada) == resultadoEsperado) 
			return "SUCESSO";		
		else 
			return "FALHA";
	}	
}
