package Avaliacao.test;

import org.junit.Assert;
import org.junit.Test;

//import com.sun.java.swing.action.NextAction;

import Avaliacao.NextNumber;

public class NextNumberTeste {
	 
	@Test
	public void numMaior() {
		
		//Integer b;
		
		String b = (String) NextNumber.numMaior(1234);
		Assert.assertNotEquals(4321, b);
		
		}
}
