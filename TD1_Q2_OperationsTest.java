package calcul;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TD1_Q2_OperationsTest {

	Operations operations = new Operations(); 
	
	@Test
	void somme_de_5_et_5_devrait_faire_10() {	    
        assertEquals(10, operations.additionner(new int[]{5, 5}));		
	}

	@Test
	void somme_de_5__5_et_5_devrait_faire_15() {	    
        assertEquals(15, operations.additionner(new int[]{5,5,5}));		
	}

	@Test
	void somme_de_1_2_et_3_devrait_faire_6() {	    
        assertEquals(6, operations.additionner(new int[]{1,2,3}));		
	}

	@Test
	void somme_de_2_1_et_3_devrait_faire_6() {	    
        assertEquals(6, operations.additionner(new int[]{2,1,3}));		
	}

	@Test
	void somme_de_3_2_et_1_devrait_faire_6() {	    
        assertEquals(6, operations.additionner(new int[]{3,2,1}));		
	}
	
	@Test
	void somme_de_0_devrait_faire_0() {	    
        assertEquals(0, operations.additionner(new int[]{0}));		
	}

	@Test
	void somme_de_moins_4_et_4_devrait_faire_0() {	    
        assertEquals(0, operations.additionner(new int[]{-4,4}));		
	}

	@Test
	void somme_de_moins_2_0_et_2_devrait_faire_0() {	    
        assertEquals(0, operations.additionner(new int[]{-2,0,2}));		
	}
	

}
