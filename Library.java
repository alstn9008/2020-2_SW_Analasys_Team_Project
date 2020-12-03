import java.util.ArrayList;
/**
 * Write a description of class Library here.
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
    public Library(String name){
        this.name = name;
        property = new ArrayList<Book>();
        user = new ArrayList<Borrower>();
        loan = new ArrayList<Loan>();
    }
    
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
    
    public static void displayForLoan(){
        
    }
    
    public static void displayOnLoan(){
        
    }
    
    public static void lendOneBook(int catalogueNumber, String name){
        
    }
    
    public static void returnOneBook(int catalogueNumber, String name){
        
    }
}
