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
    
    /**
     * Constructor for objects of class Borrower
     */
    public Borrower(String name){
        this.name = name;
        ArrayList<Book> borrowerBooks;
    }
    
    /**
     * borrower object에 book object를 연결한다.
     *
     * @param  연결할 book object
     */
    public void attachBook(Book book){
        borrowerBooks.add(book);
    }
    
    /**
     * borrower object에 있는 book object와의 연결을 끈는다.
     *
     * @param  이 borrower object에 연결되어 있는 book object의 catalogue number
     */
    public void detachBook(int catalogueNumber){
        for(int i = 0; i < borrowerBooks.size(); i++){
            Book temp = borrowerBooks.get(i); 
            if(temp.getCatalogueNumber() == catalogueNumber){
                borrowerBooks.remove(borrowerBooks.indexOf(temp));
            }
        }
    }
    
    /**
     * 이 borrower가 반납일이 지난 book을 대출해 있는지 여부를 확인한다.
     *
     */
    public void checkLoan(){
        
    }
    
    /**
     * 이 borrower가 대출 중인 book을 확인한다.
     *
     * @return    이 borrower가 대출한 book object가 들어 있는 ArrayList를 return.
     */
    public ArrayList<Book> getBook(){
        return borrowerBooks;
    }
}
