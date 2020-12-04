import java.util.ArrayList;
/**
 * LibraryApplication에서의 book object가 갖는 phild와 method를 모아 놓은 class.
 *
  * @author (2019315066 사사키 야스오, 2019315065 우노 히데노리, 2019315064 사토 리츠시, 2017210105 김민수)
 * @version (2020.12.3)
 */
public class Book
{
    private String title;
    private String author;
    private int catalogueNumber;
    private Borrower borrower;
    
    /**
     * Constructor for objects of class Book
     */
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.catalogueNumber = this.hashCode();// object 생성시에 자동으로 할당되는 hashcode를
                                               //catalogueNumber로 사용한다.
    }
    
    /**
     * borrower object를 Book object에 연결한다.
     *
     * @param  book object에 borrower object를 연결한다.
     */
    public void attachBorrower(Borrower borrower)
    {
        this.borrower = borrower;
    }
    
    /**
     * 이 book object에 있는 borrower object와의 연결을 끈는다.
     *
     */
    public void detachBorrower()
    {
        this.borrower = null;
    }
    
    /**
     * 이 book object와 연결되어 있는 borrower object를 return.
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Borrower getBorrower()
    {
        return this.borrower;
    }
    
    /**
     * 이 book object의 대출가능 여부를 확인한다.
     *
     * @return    이 book이 대출 가능하면 true, 대출 중이면 false를 return.
     */
    public boolean isALoanAbaliable()
    {
        if(this.borrower == null){
            return true;// able to loan
        }
        else{
            return false;// unable to loan
        }
    }
    
    /**
     * 이 book object의 catalogueNumber를 return.
     *
     * @return   이 book object의 catalogueNumber
     */
    public int getCatalogueNumber(){
        return this.catalogueNumber;
    }
}
