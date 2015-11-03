package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	
	public static final String[] SCORES={"love","fifteen","thirty","forty"};
	private int serverScore;
	private int receiverScore;
	
	
	public TennisGame(){
		this.serverScore=0;
		this.receiverScore=0;
	}

	public String getScore()
	{
		if(this.serverScore!=this.receiverScore)
			return SCORES[this.serverScore]+"-"+SCORES[this.receiverScore];
		return SCORES[this.serverScore]+"-all";
	}

	public void serverScores()
	{
		this.serverScore++;	
	}

	public void receiverScores()
	{
		this.receiverScore++;
	}

}
