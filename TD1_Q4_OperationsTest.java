package calcul;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TD1_Q4_OperationsTest {

	Operations operations = new Operations(); 
	
	@ParameterizedTest(name="Multiplier les nombres {0} devrait donner {1}")
	@MethodSource("data")
	void multipication_simple(int[] input, int oracle) {	    
        assertEquals(oracle, operations.multiplier(input));		
	}

	static Stream<Arguments> data() {
		return Stream.of(
				Arguments.of(new int[] {3, 3}, 9),
				Arguments.of(new int[] {3, 3, 3}, 27),
				Arguments.of(new int[] {1, 2, 3}, 6),
				Arguments.of(new int[] {2, 1, 3}, 6),
				Arguments.of(new int[] {3, 2, 1}, 6),
				Arguments.of(new int[] {0}, 0),
				Arguments.of(new int[] {-5, 5}, -25),
				Arguments.of(new int[] {-2, 0, 2}, 0)
				);
	}

}
