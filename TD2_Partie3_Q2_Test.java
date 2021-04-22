package calcul;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.Test;

public class TD2_Partie3_Q2_Test {

	@Test
	public void un_dividende_negatif_leve_une_exception() {
		assertThrows(InvalidParameterException.class,
				() -> Operations.diviser(-6, 3));
	}
	
	
	@Test
	public void un_diviseur_negatif_leve_une_exception_meme_avec_un_diviseur_a_0() {
		assertThrows(InvalidParameterException.class,
				() -> Operations.diviser(0, -4));
	}
	
	@Test
	public void un_diviseur_de_0_leve_une_exception_meme_si_le_dividende_vaut_0() {
		assertThrows(ArithmeticException.class,
				() -> Operations.diviser(0, 0));
	}	

	@Test
	public void un_dividende_de_0_donne_0() {
		assertEquals(0, Operations.diviser(0, 5), 0.0001);
	}	
	
	@Test
	public void un_diviseur_negatif_leve_une_exception() {
		assertThrows(InvalidParameterException.class,
				() -> Operations.diviser(10, -4));
	}

	@Test
	public void un_diviseur_de_0_leve_une_exception() {
		assertThrows(ArithmeticException.class,
				() -> Operations.diviser(10, 0));
	}

	@Test
	public void une_division_de_deux_entiers_positifs_calcule_la_division() {
		assertEquals(2.5, Operations.diviser(5, 2), 0.0001);
	}	
}
