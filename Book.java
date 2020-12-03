import java.util.ArrayList;
/**
 * Write a description of class Book here.
 *
  * @author (2019315066 사사키 야스오, 2019315065 우노 히데노리, 2019315064 사토 리츠시, 2017210105 김민수)
 * @version (a version number or a date)
 */
public class Book
{
    private String title;
    private String author;
    private int catalogueNumber;
    private Borrower borrower;
    
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.catalogueNumber = this.hashCode();
    }
    
    public void attachBorrower(Borrower borrower)
    {
        this.borrower = borrower;
    }
    
    public void detachBorrower()
    {
        this.borrower = null;
    }
    
    public Borrower getBorrower()
    {
        return this.borrower;
    }
    
    public boolean is_a_loan_abaliable()
    {
        if(this.borrower == null){
            return true;// able to loan
        }
        else{
            return false;// unable to loan
        }
    }
    
    public int getCatalogueNumber(){
        return this.catalogueNumber;
    }
}
