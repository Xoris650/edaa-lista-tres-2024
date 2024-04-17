package ListaTDA.Atv3.Classes;

public class Matriz {
    private int row;
    private int column;
    private int[][] matriz;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void createMatriz(int row, int column){
        this.row = row;
        this.column = column;
        matriz = new int[row][column];
    }
    public void addValue(int row, int column, int value){
        matriz[row][column] = value;
    }

    public int getValue(int row, int column){
        return matriz[row][column];
    }

    public void printMatriz(){
        for(int i = 0; i < column; i++){
            for(int j = 0; j < row; j++){
                if(j == row - 1){
                    System.out.print(matriz[i][j] + " ");
                    System.out.println();
                }else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }
}
