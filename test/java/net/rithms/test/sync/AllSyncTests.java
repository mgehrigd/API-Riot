
package net.rithms.test.sync;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import net.rithms.riot.api.RiotApi;
import net.rithms.test.RiotApiTest;

/**
 * Runs all synchronous tests. You might need an api key with extended limits to run all the tests at once.
 * 
 * <p>
 * For these tests to work, you need to insert your api key in {@link RiotApiTest}.
 * </p>
 *
 * @see RiotApi
        */
@RunWith(Suite.class)
@SuiteClasses({ SummonerTest.class, ReforgedRuneTest.class, ReforgedRunePathTest.class })
public class AllSyncTests {
}
