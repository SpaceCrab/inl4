package Model;

public class Highscore
{
    private Player[] scoreboard;
    private int playersInScoreboard;

    public Highscore(int size)
    {
        scoreboard = new Player[size];
        playersInScoreboard = 0;
    }

    public boolean addPlayer(Player player)
    {
       if (playersInScoreboard < scoreboard.length)
       {
           scoreboard[playersInScoreboard] = player;
           playersInScoreboard++;
           sortScoreboard();
           return true;
       }
        return false;
    }

    public void sortScoreboard()
    {
        Player temp;
        int n = playersInScoreboard;
        for (int i = 0; i < n && i < scoreboard.length; i++) {
            for (int j = 1; j < (n-i); j++)
            {
                if (scoreboard[j - 1].getScore() > scoreboard[j].getScore())
                {
                    temp = scoreboard[j - 1];
                    scoreboard[j - 1] = scoreboard[j];
                    scoreboard[j] = temp;
                }
            }
        }
    }

    /**
     *
     * @return returns the scoreboard in a string format where the first ten players are placed
     * after each player there is a newline symbol
     */
    @Override
    public String toString()
    {
        String out = "";
        for (int i = 0; i < playersInScoreboard && i < 10; i++)
        {
            out += scoreboard[i].toString() + " \n";
        }
        return out;
    }
}
