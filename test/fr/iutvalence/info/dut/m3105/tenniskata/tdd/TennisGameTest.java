package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	
	@Test
	public void whenOnePlayerScoresTheScoreIsCorrect()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.serverScores();
		tennisGame.receiverScores();
		tennisGame.receiverScores();
		testScore(new TennisGameForTest(tennisGame, "fifteen-thirty"));
		
		TennisGame tennisGame2 = new TennisGame();
		tennisGame2.serverScores();
		tennisGame2.receiverScores();
		testScore(new TennisGameForTest(tennisGame2, "fifteen-all"));
	}
	
	public void testScore(TennisGameForTest tennisGameForTest)
	{
		assertEquals(tennisGameForTest.getTennisGameTest().getScore(),tennisGameForTest.getScoreResult());
	}

}
