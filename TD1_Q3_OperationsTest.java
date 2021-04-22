package calcul;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TD1_Q3_OperationsTest {

	Operations operations = new Operations(); 
	
	@Test
	void soustraction_de_3_et_3_devrait_faire_0() {	    
        assertEquals(0, operations.soustraire(new int[]{3, 3}));		
	}

	@Test
	void soustraction_de_3_3_et_3_devrait_faire_moins_3() {	    
        assertEquals(-3, operations.soustraire(new int[]{3,3,3}));		
	}

	@Test
	void soustraction_de_1_2_et_3_devrait_faire_moins_4() {	    
        assertEquals(-4, operations.soustraire(new int[]{1,2,3}));		
	}

	@Test
	void soustraction_de_2_1_et_3_devrait_faire_moins_2() {	    
        assertEquals(2, operations.soustraire(new int[]{2,1,3}));		
	}

	@Test
	void soustraction_de_3_2_et_1_devrait_faire_0() {	    
        assertEquals(0, operations.soustraire(new int[]{3,2,1}));		
	}
	
	@Test
	void soustraction_de_0_devrait_faire_0() {	    
        assertEquals(0, operations.soustraire(new int[]{0}));		
	}

	@Test
	void soustraction_de_moins_5_et_5_devrait_faire_moins_10() {	    
        assertEquals(-10, operations.soustraire(new int[]{-5,5}));		
	}

	@Test
	void soustraction_de_moins_2_0_et_2_devrait_faire_moins_4() {	    
        assertEquals(-4, operations.soustraire(new int[]{-2,0,2}));		
	}
	

}
