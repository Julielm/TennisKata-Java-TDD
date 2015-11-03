package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	private String score;
	private int serverScore;
	private int receiverScore;
	
	
	public TennisGame(){
		this.score="love-all";
		this.serverScore=0;
		this.receiverScore=0;
	}

	public String getScore()
	{
		return this.score;
	}

	public void serverScores()
	{
		this.serverScore++;	
		this.computeScore();
	}

	public void receiverScores()
	{
		this.receiverScore++;
		this.computeScore();
		
	}
	
	public void computeScore()
	{
		if (this.serverScore==1 && this.receiverScore==1){
			this.score="fifteen-all";
			return;
		}
		if(this.serverScore==1)
		{
			this.score="fifteen-love";
		}
		else 
			this.score="love-fifteen";
		
			
	}

}
