package calcul;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TD1_Q1_OperationsTest {

	// Le nom du test décrit son intention.
	@Test
	void somme_de_1_et_2_devrait_faire_3() {
		 // Initialisation
		Operations operations = new Operations();     
        
        // Appel avec donnée de test
        int[] donneeDeTest = new int[]{1,2};
        int resultat = operations.additionner(donneeDeTest);   

        // Vérification par rapport à un oracle
        int oracle = 3;
        assertEquals("Le somme de 1 et 2 devrait donner 3", oracle, resultat);		
	}
	

}
