package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.TestandoBuildAutomatico;

public class Teste01 {

	@Test
	public void test() {
		TestandoBuildAutomatico tb = new TestandoBuildAutomatico();
		assertEquals(tb.obterString("teste"), "Igual");
	}

}
