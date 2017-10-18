package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {

	private static AthleticGame athleticGame;
	
    /*
     * Utilizzare @BeforeClass per istanziare un campo privato statico di tipo AthleticGame su cui effettuare i test.
     */
	@BeforeClass
	public static void initialize() {
		athleticGame = new AthleticGame("");
	}
	
    /*
     * Utilizzare @After per richiamare il metodo reset().
     */
	@After
	public void callResetMethod() {
		athleticGame.reset();
	}
	
    /*
     * Utilizzare @Before per richiamare il metodo start().
     */
	@Before
	public void callStartMethod() {
		athleticGame.start();
	}
	
    /*
     * Aggiungere due metodi di test per la funzione getWinner (scegliere i test in modo significativo, ma a piacere).
     */
	@Test
	public void getWinnerWorks1() {
		athleticGame.addArrival("Jack", Instant.now());
		athleticGame.addArrival("Jon", Instant.now().plusMillis(5));
		Assert.assertEquals("Jack", athleticGame.getWinner());
	}

	@Test
	public void getWinnerWorks2() {
		Assert.assertEquals(null, athleticGame.getWinner());
	}
	
}
