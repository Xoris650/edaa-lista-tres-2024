package Word_Busca.atv1;

import Word_Busca.atv1.classes.Livro;

public class Search {
    public static int searchByTitle(Livro[] books, String title){
        int n = books.length;
        int left = 0;
        int right = n - 1;
        
        //Processo de busca
        while(left <= right){
            int mid = (left + right) / 2;
            int comparation = books[mid].getTitle().compareTo(title);
            if(comparation == 0){
                return mid;
            }else if( comparation > 0){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
    public static int searchByAuthor(Livro[] books, String author){
        int n = books.length;
        int left = 0;
        int right = n - 1;

        //Processo de busca
        while(left <= right){
            int mid = (left + right) / 2;
            int comparation = books[mid].getTitle().compareTo(author);
            if(comparation == 0){
                return mid;
            }else if( comparation > 0){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
