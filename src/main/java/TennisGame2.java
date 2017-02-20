
public class TennisGame2 implements TennisGame
{    
	 public int player1Points = 0;
	    public int player2Points = 0;
	    
	    public String P1res = "";
	    public String P2res = "";

	    public String convertScoreToLiteral(){
	        String literalScore = "";
	        literalScore = isTiedNotDeuce(literalScore);
	        literalScore = isDeuce(literalScore);	        
	        literalScore = player2orPlayer1isWinning(literalScore);
	        literalScore = player2orPlayer1WiningNotDeuce(literalScore);         
	        literalScore = advantagePlayer2orPlayer1(literalScore);	        
	        literalScore = winForPlayer1orPlayer2(literalScore);
	        return literalScore;
	    }

		private String winForPlayer1orPlayer2(String literalScore) {
			
			if (player2Points>=4 && player1Points>=0 && (player2Points-player1Points)>=2)
	        {
	            literalScore="Win for player2";
	        }
			if (player1Points>=4 && player2Points>=0 && (player1Points-player2Points)>=2)
	        {
	            literalScore = "Win for player1";
	        }
			
			return literalScore;
			
			
		}
		private String advantagePlayer2orPlayer1(String literalScore) {
			if (player2Points > player1Points && player1Points >= 3)
	        {
	            literalScore = "Advantage player2";
	        }
			if (player1Points > player2Points && player2Points >= 3)
	        {
	            literalScore = "Advantage player1";
	        }
			return literalScore;
		}

		private String player2orPlayer1WiningNotDeuce(String literalScore) {
			if (player2Points>player1Points && player2Points < 4)
	        {
	            if (player2Points==2)
	                P2res="Thirty";
	            if (player2Points==3)
	                P2res="Forty";
	            if (player1Points==1)
	                P1res="Fifteen";
	            if (player1Points==2)
	                P1res="Thirty";
	            literalScore = P1res + "-" + P2res;
	        }
			if (player1Points>player2Points && player1Points < 4)
	        {
	            if (player1Points==2)
	                P1res="Thirty";
	            if (player1Points==3)
	                P1res="Forty";
	            if (player2Points==1)
	                P2res="Fifteen";
	            if (player2Points==2)
	                P2res="Thirty";
	            literalScore = P1res + "-" + P2res;
	        }
			return literalScore;
		}
		private String player2orPlayer1isWinning(String literalScore) {
			if (player2Points > 0 && player1Points==0)
	        {
	            if (player2Points==1)
	                P2res = "Fifteen";
	            if (player2Points==2)
	                P2res = "Thirty";
	            if (player2Points==3)
	                P2res = "Forty";
	            
	            P1res = "Love";
	            literalScore = P1res + "-" + P2res;
	        }
			if (player1Points > 0 && player2Points==0)
	        {
	            if (player1Points==1)
	                P1res = "Fifteen";
	            if (player1Points==2)
	                P1res = "Thirty";
	            if (player1Points==3)
	                P1res = "Forty";
	            
	            P2res = "Love";
	            literalScore = P1res + "-" + P2res;
	        }
			return literalScore;
		}

		private String isDeuce(String literalScore) {
			if (player1PointsEqualsPlayer2pints() && player1Points>=3)
	            literalScore = "Deuce";
			return literalScore;
		}

		private String isTiedNotDeuce(String literalScore) {
			if (player1PointsEqualsPlayer2pints() && player1Points < 4)
	        {
	            if (player1Points==0)
	                literalScore = "Love";
	            if (player1Points==1)
	                literalScore = "Fifteen";
	            if (player1Points==2)
	                literalScore = "Thirty";
	            literalScore += "-All";
	        }
			return literalScore;
		}

		private boolean player1PointsEqualsPlayer2pints() {
			return player1Points == player2Points;
		}
	    
	    public void SetP1Score(int number){
	        
	        for (int i = 0; i < number; i++)
	        {
	            P1Score();
	        }
	            
	    }
	    
	    public void SetP2Score(int number){
	        
	        for (int i = 0; i < number; i++)
	        {
	            P2Score();
	        }
	            
	    }
	    
	    public void P1Score(){
	        player1Points++;
	    }
	    
	    public void P2Score(){
	        player2Points++;
	    }

	    public void wonPoint(String player) {
	        if (player == "player1")
	            P1Score();
	        else
	            P2Score();
	    }
}