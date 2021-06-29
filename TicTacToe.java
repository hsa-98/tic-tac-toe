public class TicTacToe {
    char[]table =  new char[10];
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.CreateEmptyTable();
    }
    public void CreateEmptyTable(){
        for(int i = 0;i<table.length;i++){
            table[i]=0;
        }
    }
    
}
