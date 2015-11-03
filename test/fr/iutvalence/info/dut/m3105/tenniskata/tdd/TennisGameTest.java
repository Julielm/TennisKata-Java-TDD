package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void atTheBeginningOfTheGameTheScoreShouldBeDescribedAsLoveAll()
	{
		testScore(new TennisGameForTest(new TennisGame(), "love-all"));
	}
	
	@Test
	public void whenTheServerScoresTheScoreShouldBeFifteenLove()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.serverScores();
		testScore(new TennisGameForTest(tennisGame, "fifteen-love"));
	}
	
	@Test
	public void whenTheReceiverScoresTheScoreShouldBeLoveFifteen()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.receiverScores();
		testScore(new TennisGameForTest(tennisGame, "love-fifteen"));
	}
	
	@Test
	public void whenBothPlayersScoresTheScoreShouldBeFifteenAll()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.serverScores();
		tennisGame.receiverScores();
		testScore(new TennisGameForTest(tennisGame, "fifteen-all"));
	}
	
	
	public void testScore(TennisGameForTest tennisGameForTest)
	{
		assertEquals(tennisGameForTest.getTennisGameTest().getScore(),tennisGameForTest.getScoreResult());
	}

}
