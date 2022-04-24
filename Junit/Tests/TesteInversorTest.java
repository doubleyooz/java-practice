package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Code.Inversor;

class TesteInversorTest {

	Inversor inversor = new Inversor();
	
	@Test
	void testaInversaoNumeroPositivo() {
		int entrada = 5, resultadoEsperado = -5;
				
		assertEquals(resultadoEsperado, inversor.inverte(entrada));
	}
	
	@Test
	void testaInversaoNumeroNegativo() {
		int entrada = -5, resultadoEsperado = 5;		
		
		assertEquals(resultadoEsperado, inversor.inverte(entrada));	
	}
	
	@Test
	void testaInversaoNumeroPositivoGrande() {
		int entrada = 500000000, resultadoEsperado = -500000000;
		
		assertEquals(resultadoEsperado, inversor.inverte(entrada));
	}
	
	@Test
	void testaInversaoNumeroNegativoGrande() {
		int entrada = -500000000, resultadoEsperado = 500000000;	
		
		assertEquals(resultadoEsperado, inversor.inverte(entrada));
	}

}
