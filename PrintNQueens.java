// WAP to arrange the n number of Queens in nxn taking the n number from the user and print the board.

// example:-1
// n=4
// ___________board arangement____________
// X Q X X 
// X X X Q 
// Q X X X
// X X Q X
// ___________board arangement____________
// X X Q X
// Q X X X
// X X X Q
// X Q X X

public class PrintNQueens {
    public static boolean isSafe(char board[][], int row, int col){
        //for vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //for diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //for diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row){
        if(row == board.length){
            printBoard(board);
            return;
        }
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j) == true) {
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'X';
            }
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("___________board arangement____________");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n = 4; 
        char board[][] = new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
    }
}