
package net.rithms.test.sync;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;
import net.rithms.test.RiotApiTest;

/**
 * Tests synchronous calls to the summoner endpoint
 */
public class SummonerTest {

	private static RiotApi api = null;

	@BeforeClass
	public static void prepareApi() {
		api = RiotApiTest.getRiotApi();
	}

	@Test
	public void testGetSummoner() throws RiotApiException {
		// TODO This test is currently expected to fail, due to summonerIds being encrypted differently for each app.
		Summoner summoner = api.getSummoner(Platform.NA, "81439110");
		assertNotNull(summoner);
		assertEquals("Tryndamere", summoner.getName());
	}

	@Test
	public void testGetSummonerByAccount() throws RiotApiException {
		// TODO This test is currently expected to fail, due to summonerIds being encrypted differently for each app.
		Summoner summoner = api.getSummonerByAccount(Platform.NA, "235464896");
		assertNotNull(summoner);
		assertEquals("Tryndamere", summoner.getName());
	}

	@Test
	public void testGetSummonerByName() throws RiotApiException {
		// TODO This test is currently expected to fail, due to summonerIds being encrypted differently for each app.
		Summoner summoner = api.getSummonerByName(Platform.NA, "tryndamere");
		assertNotNull(summoner);
		assertEquals("81439110", summoner.getId());
	}
}
