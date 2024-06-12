package Classes;

import java.util.*;

public class Game {

    Board gameBoard;
    Deque<Player> players = new ArrayDeque<Player>();

    public void play(){
        Scanner sc = new Scanner(System.in);
        System.out.println("!!!!!!LET/'S PLAY!!!!!");
        System.out.println("What is size of board you want to play");

        int size = sc.nextInt();
        gameBoard = new Board(size);

        players.add(new Player("Player1", new Xpiece()));
        players.add(new Player("Player2", new Opiece()));
        

        int x =  size,y = size;
        Boolean end = false;
        while(!end)
        {
            System.out.println("Here is the board");
            gameBoard.displayBoard();
            Player playingPlayer = players.remove();
            players.add(playingPlayer);
            while(x>=size || y>=size){
                System.out.println("Hey "+playingPlayer.getName()+" it\'s your turn enter your position");
                x = sc.nextInt();
                y = sc.nextInt();
                if(x>=size || y>=size)
                    System.out.println("Incorrect position --- RETRY");
                }
            gameBoard.addPiece(x, y,playingPlayer.getPlayingPiece());
            if(gameBoard.checkForGame() == 1)
            {
                System.out.println("Well Played "+playingPlayer.getName()+" You WON!!!");
                end = true;
                System.out.println("Here is the final board");
                gameBoard.displayBoard();
            }
            else if(gameBoard.checkForGame() == 2)
            {
                System.out.println("It\'s a tie");
                end = true;
                System.out.println("Here is the final board");
                gameBoard.displayBoard();
            }
            else{
                gameBoard.addPiece(x, y,playingPlayer.getPlayingPiece());
                x = size;
                y = size;
            }
            
        }
    }
}
