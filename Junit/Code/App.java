package Code;

import Tests.TesteInversor;
import Tests.TesteTriangulo;

public class App {
	public static void main (String [] Args) {
		/*TesteInversor teste = new TesteInversor();		
		System.out.println(teste.testaInversaoNumeroNegativo());
		System.out.println(teste.testaInversaoNumeroNegativoGrande());
		System.out.println(teste.testaInversaoNumeroPositivo());
		System.out.println(teste.testaInversaoNumeroPositivoGrande());*/
		
		TesteTriangulo teste = new TesteTriangulo();

		teste.testaEquilatero();
		teste.testaEscaleno();
		teste.testaIsosceles();
	}

}
