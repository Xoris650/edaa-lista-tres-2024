package ListaTDA.Atv3;

import ListaTDA.Atv3.Classes.Matriz;

public class Main {
    public static void main(String[] args) {
        Matriz m = new Matriz();
        int row = 5;
        int col = 3;
        m.createMatriz(row,col);
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                m.addValue(i,j,i+j);
            }
        }
        m.printMatriz();
    }
}
