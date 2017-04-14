package avaliadordecisoes;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AvaliadorDecisoesTest {

	private AvaliadorDecisoes avaliador;

	@BeforeClass
	public static void setUpClass() {
		log("Before class");
	}
	
	@Before
	public void setUp() {
		log("Before");
		//Arrange
		avaliador = new AvaliadorDecisoes();
	}
	
	@After
	public void tearDown() {
		log("After");
	}

	@AfterClass
	public static void tearDownClass() {
		log("After class");
	}
	
	@Test
	public void arrependimentoMedio() {
		log("arrependimentoMedio");
		assertThat(avaliador.avaliar(10, 5, 8, 7)).isEqualTo("Deu ruim");
	}
	
	@Test
	public void arrependimentoNoLimiteMaximo() {
		log("arrependimentoNoLimiteMaximo");
		assertThat(avaliador.avaliar(10, 4.9, 4, 6)).isEqualTo("Deu ruim");
	}
	
	@Test
	public void felicidadeMedia() {
		log("alegriaMedia");
		/*
		//Arrange
		avaliador = new AvaliadorDecisoes();

		//Action
		String resultado = avaliador.avaliar(10, 5, 2, 7);
		
		//Assert
		assertThat(resultado).isEqualTo("Ok");
		*/
		assertThat(avaliador.avaliar(10, 5, 2, 7)).isEqualTo("Ok");
	}

	@Test
	public void felicidadeMediaNoInicioDoLimite() {
		log("felicidadeMediaNoInicioDoLimite");
		assertThat(avaliador.avaliar(10, 5, 4, 6)).isEqualTo("Ok");
	}
	
	@Test
	public void felicidadeMediaLogoAposInicioDoLimite() {
		log("felicidadeMediaLogoAposInicioDoLimite");
		assertThat(avaliador.avaliar(10, 5.1, 4, 6)).isEqualTo("Ok");
	}
	
	@Test
	public void felicidadeMediaLogoAntesFimDoLimite() {
		log("felicidadeMediaLogoAntesFimDoLimite");
		assertThat(avaliador.avaliar(10, 6.9, 4, 6)).isEqualTo("Ok");
	}
	
	@Test
	public void felicidadeMediaNoFimDoLimite() {
		log("felicidadeMediaNoFimDoLimite");
		assertThat(avaliador.avaliar(10, 7, 4, 6)).isEqualTo("Ok");
	}
	
	@Test
	public void muitaFelicidadeLogoAposInicioDoLimite() {
		log("muitaFelicidadeLogoAposInicioDoLimite");
		assertThat(avaliador.avaliar(10, 7.1, 2, 7)).isEqualTo("Valeu muito a pena");
	}
	
	@Test
	public void muitaFelicidadeMedia() {
		log("muitaFelicidadeMedia");
		assertThat(avaliador.avaliar(10, 8, 2, 7)).isEqualTo("Valeu muito a pena");
	}
	
	private static void log(String string) {
		System.out.println(string);
	}
	
}
