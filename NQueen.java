public class NQueen {
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
           if(board[i][j]=='Q'){
            return false;
           }
        }
        //diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
        }
    }

        return true;
    
}
    public static void nQueen(char board[][],int row){
        //base
          if(row==board.length){
           // printBoard(board);
           count++;
            return;
          }
        //column loop
        for(int j = 0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q'; 
                nQueen(board, row+1);//function call
                board[row][j] = 'x';//Backtracking
    
            }
          
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("----Chess board-----");
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
        }
       System.out.println();
     }
    }
    static int count=0;
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        //initialize
        for(int i= 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = 'x';
            }
        }
        nQueen(board,0);
        System.out.println("total ways of n quuen = "+ count);
    }
}
