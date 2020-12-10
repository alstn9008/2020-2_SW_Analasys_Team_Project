import java.util.ArrayList;
import java.util.Calendar;
/**
 * LibraryApplication에서의 borrower object가 갖는 phild와 method를 모아 놓은 class.
 *
 * @author (2019315066 사사키 야스오, 2019315065 우노 히데노리, 2019315064 사토 리츠시, 2017210105 김민수)
 * @version (2020.12.03)
 */
public class Borrower
{
    private String name;
    private ArrayList<Book> borrowerBooks;
    private Loans loans;
    public Borrower(String name){
        this.name = name;
        ArrayList<Book> borrowerBooks;
    }

    public void attachBook(Book book){
        borrowerBooks.add(book);
    }

    public void detachBook(int catalogueNumber){
        for(int i = 0; i < borrowerBooks.size(); i++){
            Book temp = borrowerBooks.get(i); 
            if(temp.getCatalogueNumber() == catalogueNumber){
                borrowerBooks.remove(borrowerBooks.indexOf(temp));
            }
        }
    }

    public boolean checkBorrower(){
        try{
            boolean result = loans.checkLoan();
            return result;
            //return loans.checkLoan();
        }catch(NullPointerException e){
            System.out.println("nullです");
        }
        return true;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Book> getBook(){
        return borrowerBooks;
    }
}
