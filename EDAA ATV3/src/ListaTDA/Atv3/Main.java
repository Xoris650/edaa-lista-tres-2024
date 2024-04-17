package ListaTDA.Atv3;

import ListaTDA.Atv3.Classes.Matriz;

public class Main {
    public static void main(String[] args) {
        Matriz m = new Matriz();
        int row = 5;
        int col = 5;
        m.createMatriz(row,col);
        for(int i = 0; i < m.getMatriz().length; i++){
            for(int j = 0; j < m.getMatriz()[i].length; j++){
                m.addValue(i, j, i+j);
            }
        }
        m.printMatriz();
    }
}
