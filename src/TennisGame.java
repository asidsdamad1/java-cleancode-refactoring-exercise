

public class TennisGame {
    // condition to end game
    public static final int HIGHEST_SCORE = 4;

    public static String differScore(int SCORE_OF_PLAYER1, int SCORE_OF_PLAYER2) {
        // score game
        int tempScore = 0;
        String setScore = "";
        for (int scoreOfRoundPlay = 1; scoreOfRoundPlay < 3; scoreOfRoundPlay++) {
            if (scoreOfRoundPlay == 1) tempScore = SCORE_OF_PLAYER1;
            else {
                setScore += "-";
                tempScore = SCORE_OF_PLAYER2;
            }
            switch (tempScore) {
                case 0:
                    setScore += "Love";
                    break;
                case 1:
                    setScore += "Fifteen";
                    break;
                case 2:
                    setScore += "Thirty";
                    break;
                case 3:
                    setScore += "Forty";
                    break;
            }
        }
        return setScore;
    }

    public static int minusTwoPlayer(int SCORE_OF_PLAYER1, int SCORE_OF_PLAYER2) {
        return SCORE_OF_PLAYER1 - SCORE_OF_PLAYER2;
    }

    public static String tieGame(int SCORE_OF_PLAYER) {
        String setScore = "";
        switch (SCORE_OF_PLAYER) {
            case 0:
                setScore = "Love-All";
                break;
            case 1:
                setScore = "Fifteen-All";
                break;
            case 2:
                setScore = "Thirty-All";
                break;
            case 3:
                setScore = "Forty-All";
                break;
            default:
                setScore = "Deuce";
                break;

        }
        return setScore;
    }

    public static String winnerOfGame(int SCORE_OF_PLAYER1, int SCORE_OF_PLAYER2) {
        String result = "";
        int scoreOfGame = minusTwoPlayer(SCORE_OF_PLAYER1, SCORE_OF_PLAYER2);
        if (scoreOfGame == 1) result = "Advantage player1";
        else if (scoreOfGame == -1) result = "Advantage player2";
        else if (scoreOfGame >= 2) result = "Win for player1";
        else result = "Win for player2";
        return result;
    }

    public static String getScore(String player1Name, String player2Name, int SCORE_OF_PLAYER1, int SCORE_OF_PLAYER2) {
        boolean equalScore = (SCORE_OF_PLAYER1 == SCORE_OF_PLAYER2);
        boolean compareToHighestScore = (SCORE_OF_PLAYER1 >= HIGHEST_SCORE || SCORE_OF_PLAYER2 >= HIGHEST_SCORE); //End Game
        String resultOfGame = "";
        if (equalScore) {
            resultOfGame = tieGame(SCORE_OF_PLAYER1);
        }
        else {
            if (compareToHighestScore) {
                resultOfGame = winnerOfGame(SCORE_OF_PLAYER1, SCORE_OF_PLAYER2);
            } else {
                resultOfGame = differScore(SCORE_OF_PLAYER1, SCORE_OF_PLAYER2);
            }
        }

        return resultOfGame;
    }
}
