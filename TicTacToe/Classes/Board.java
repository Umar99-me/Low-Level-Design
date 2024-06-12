package Classes;

public class Board {

    private int size;
    private PlayingPiece[][] board ;

    public Board(int size){
        this.size = size;
        this.board = new PlayingPiece[this.size][this.size];
    }

    public void displayBoard(){
        for(int i = 0 ;i<size;i++){
            for(int j =0 ;j< size;j++){
                if(null == board[i][j])
                    System.out.print("__ | ");
                else
                    System.out.print(board[i][j].getShape()+" | ");
            }
            System.out.println("");
        }
    }
    public void initializeBoard(){
        for(int i = 0; i < size;i++){
            for(int j = 0; j < size;j++){
                board[i][j] =  null;
            }
        }
    }

    public void addPiece(int x, int y,PlayingPiece piece){
        if(null==board[x][y]){
            board[x][y] = piece;
            // return true;
        }
        // return false;     
    }

    public int checkForGame(){
        int result = 2;

        //row wise
        for(int i = 0; i<size;i++){
            int count = 1;
            if(board[i][0] == null)
                {
                    result = 0;
                    continue;
                }
            String value = board[i][0].getShape();
            for(int j = 1 ; j<size;j++){
                if(board[i][j] == null)
                    result = 0;
                else if(board[i][j].getShape() ==  value)
                    count++;
            }
            if(count == size)
                return 1;
        }

        //column - wise
        for(int i = 0; i<size;i++){
            int count = 1;
            if(board[0][i] == null)
                {
                    result = 0;
                    continue;
                }
            String value = board[0][i].getShape();
            for(int j = 1 ; j<size;j++){
                if(board[j][i] == null)
                    result = 0;
                else if(board[j][i].getShape() ==  value)
                    count++;
            }
            if(count == size)
                return 1;
        }

        //Left Diagonal
        int i = 0,j = 0;
        if(null == board[i][j])
            result = 0;
        else{
            i+=1;j+=1;
            String value = board[0][0].getShape();
            int count = 1;
            while(i<size && j<size){
                if(board[i][j] == null)
                    break;
                else{
                    if(value == board[i][j].getShape())
                        count++;
                }
                i++;
                j++;
            }
            if(count == size)
                return 1;
        }

         i = 0;j = size-1;
        if(null == board[i][j])
            result = 0;
        else{
            i = i+1;j=j-1;
            String value = board[0][0].getShape();
            int count = 1;
            while(i<size && j<size){
                if(board[i][j] == null)
                    break;
                else{
                    if(value == board[i][j].getShape())
                        count++;
                }
                i++;
                j--;
            }
            if(count == size)
                return 1;
        }
        return result;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PlayingPiece[][] getBoard() {
        return board;
    }

    public void setBoard(PlayingPiece[][] board) {
        this.board = board;
    }

    

}
