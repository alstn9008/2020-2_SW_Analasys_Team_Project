import java.util.Calendar;
/**
 * LibraryApplication에서의 loan object가 갖는 phild와 method를 모아 놓은 class.
 *
 * @author (2019315066 사사키 야스오, 2019315065 우노 히데노리, 2019315064 사토 리츠시, 2017210105 김민수)
 * @version (a version number or a date)
 */
public class Loan
{
    private Book book;
    private Borrower borrower;
    private Calendar checkoutDate;
    private Calendar returnDate;

    public Loan(Book book, Borrower borrower)
    {
        this.book= book;
        this.borrower = borrower;
        this.checkoutDate = Calendar.getInstance();
        this.returnDate = Calendar.getInstance();
        returnDate.add(checkoutDate.DATE, 290);
    }

    public void detach(int catalogueNumber)
    {
        this.book.detachBorrower();
        this.borrower.detachBook(catalogueNumber);
    }
    
    // public void getDateTest(){
        // System.out.print("대출날짜 : ");
        // System.out.print(checkoutDate.get(Calendar.YEAR) + "년");
        // System.out.print(checkoutDate.get(Calendar.MONTH) + "월");
        // System.out.println(checkoutDate.get(Calendar.DATE) + "일");
        // System.out.print("반납날짜");
        // System.out.print(returnDate.get(Calendar.YEAR) + "년");
        // System.out.print(returnDate.get(Calendar.MONTH) + "월");
        // System.out.println(returnDate.get(Calendar.DATE) + "일");
        
    // }
}
