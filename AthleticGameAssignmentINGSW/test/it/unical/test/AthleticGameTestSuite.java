package it.unical.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*
 * raggruppare le due classi di test in una TestSuite (vedi slides)
 *  ed eseguire la suite per verificarne il corretto funzionamento
 */

@RunWith(Suite.class)
@SuiteClasses({AthleticGameWinnersTest.class, AthleticGameBasicTest.class})
public class AthleticGameTestSuite {

}
