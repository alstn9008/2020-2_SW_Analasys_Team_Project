import java.util.ArrayList;
/**
 * LibraryApplication에서의 library object가 갖는 phild와 method를 모아 놓은 class.
 *
 * @author (2019315066 사사키 야스오, 2019315065 우노 히데노리, 2019315064 사토 리츠시, 2017210105 김민수)
 * @version (2020.12.03)
 */
public class Library
{
    private String name;
    private ArrayList<Book> property;
    private ArrayList<Borrower> user;
    private ArrayList<Loan> loan;
    
    /**
     * Constructor for objects of class Library
     */
    public Library(String name){
        this.name = name;
        property = new ArrayList<Book>();
        user = new ArrayList<Borrower>();
        loan = new ArrayList<Loan>();
    }
    
    /**
     * book을 library에 등록한다.
     *
     * @param  등록할 borrower의 유일한 이름.
     */
    public void registerOneBorrower(String name){
        for(int i = 0; i < user.size(); i++){
            Borrower temp = user.get(i);
            if(name.equals(temp)){
                break;
            }
        }
        Borrower newBorrower = new Borrower(name);
        user.add(newBorrower);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void registerOneBook(String title, String author, int catalogueNumber){
        for(int i = 0; i < property.size(); i++){
            Book temp = property.get(i);
            int cNumber = temp.getCatalogueNumber();
            if(catalogueNumber == cNumber){
                break;
            }
        }
        Book newBook = new Book(title, author);
        property.add(newBook);
    }
    
    /**
     * 대출가능한 book을 catalogue number 오름차순으로 표시한다.
     *
     */
    public static void displayForLoan(){
        
    }
    
    /**
     * 대출 중인 book을 catalogue number 오름차순으로 표시한다.
     *
     */
    public static void displayOnLoan(){
        
    }
    
    /**
     * book을 한 권 대출한다.
     *
     * @param  대출하려는 book의 catalogue number, book을 대출할 borrower 이름.
     */
    public static void lendOneBook(int catalogueNumber, String name){
        
    }
    
    /**
     * book을 한 권 반납한다.
     *
     * @param  반납하려는 book의 catalogue number, book을 반납할 borrower 이름.
     */
    public static void returnOneBook(int catalogueNumber, String name){
        
    }
}
