package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public class TennisGameForTest
{
	private TennisGame tennisGameTest;
	private String scoreResult;
	
	public TennisGameForTest(TennisGame tennisGameTest, String scoreResult)
	{
		this.tennisGameTest=tennisGameTest;
		this.scoreResult=scoreResult;
	}

	public TennisGame getTennisGameTest()
	{
		return this.tennisGameTest;
	}

	public String getScoreResult()
	{
		return this.scoreResult;
	}
	
	
}
