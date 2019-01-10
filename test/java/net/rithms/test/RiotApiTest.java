
package net.rithms.test;

import java.util.logging.Level;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiAsync;
import net.rithms.test.async.AllAsyncTests;
import net.rithms.test.sync.AllSyncTests;

/**
 * Runs all synchronous and asynchronous tests. You might need an api key with extended limits to run all the tests at once.
 * 
 * <p>
 * For these tests to work, you need to insert your api key below in the variable {@code apiKey}.
 * </p>
 */
@RunWith(Suite.class)
@SuiteClasses({ UtilTest.class, AllSyncTests.class, AllAsyncTests.class })
public class RiotApiTest {
	private static final String apiKey = "YOUR-API-KEY-HERE";
	private static final String tournamentApiKey = "YOUR-TOURNAMENT-API-KEY-HERE";

	/**
	 * This method provides an {@link RiotApi} object with the {@code apiKey} specified in this class to other tests.
	 * 
	 * @return {@code RiotApi} object
	 * @see RiotApi
	 */
	public static RiotApi getRiotApi() {
		ApiConfig config = new ApiConfig().setDebugLevel(Level.FINEST).setKey(apiKey).setTournamentKey(tournamentApiKey);
		return new RiotApi(config);
	}


	public static RiotApiAsync getRiotApiAsync() {
		return getRiotApi().getAsyncApi();
	}
}
