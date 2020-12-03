
/**
 * Write a description of class Loan here.
 *
 * @author (2019315066 사사키 야스오, 2019315065 우노 히데노리, 2019315064 사토 리츠시, 2017210105 김민수)
 * @version (a version number or a date)
 */
public class Loan
{
    private Book book;
    private Borrower borrower;

    public Loan(Book book, Borrower borrower)
    {
        this.book= book;
        this.borrower = borrower;
    }

    public void detach()
    {
        this.book.detachBorrower();
        this.borrower.detachBook();
    }
}
