import java.util.ArrayList;
import java.util.Iterator;
/**
 * LibraryApplication에서의 loan object가 갖는 phild와 method를 모아 놓은 class.
 *
 * @author (2019315066 사사키 야스오, 2019315065 우노 히데노리, 2019315064 사토 리츠시, 2017210105 김민수)
 * @version (2020.12.03)
 */
public class Library
{
    private String name;
    private StorageBooks SBs;
    private Users users;
    private Loans loans;
    public Library(String name){
        this.name = name;
        SBs = new StorageBooks();
        users = new Users();
        loans = new Loans();
    }

    public void printBorrower()
    {
        ArrayList temp = users.getBorrower();
        Iterator iter = temp.iterator();
        while(iter.hasNext())
        {
            Borrower user = (Borrower)iter.next();
            System.out.println("name : " + user.getName());
        }
    }

    public void printBook(){
        ArrayList temp = SBs.getStorageBooks();
        Iterator iter = temp.iterator();
        while(iter.hasNext()){
            Book book = (Book)iter.next();
            System.out.println("Title : " + book.getTitle() + ", Author : " + book.getAuthor() + 
                ", CatalogueNumber : " + book.getCatalogueNumber());
        }
    }

    public void registerOneBorrower(String name)
    {
        Borrower user = users.findBorrower(name);
        if(user == null){
            Borrower newBorrower = new Borrower(name);
            users.addBorrower(newBorrower);
            System.out.println("It has been processed normally");
        }
        else{
            System.out.println("같은 이름을 가진 사용자가 등록되어 있습니다. 다른 이름으로 등록해 주십시오.");
        }
    }

    public void registerOneBook(String title, String author){
        Book book = new Book(title, author);
        SBs.addBook(book);
        System.out.println("It has been processed normally");
    }

    public void displayBooksAvailableForLoan(){
        ArrayList SBsArray = SBs.getStorageBooks();
        Iterator<Book> iter = SBsArray.iterator();
        while(iter.hasNext()){
            Book book = iter.next();
            if(book.isALoanAvailable()){
                System.out.println("Title : " + book.getTitle() + ", Author : " + book.getAuthor() + 
                ", CatalogueNumber : " + book.getCatalogueNumber());
            }
        }
    }

    public void displayBooksUnavailableForLoan(){
        ArrayList SBsArray = SBs.getStorageBooks();
        Iterator<Book> iter = SBsArray.iterator();
        while(iter.hasNext()){
            Book book = iter.next();
            if(!(book.isALoanAvailable())){
                System.out.println("Title : " + book.getTitle() + ", Author : " + book.getAuthor() + 
                ", CatalogueNumber : " + book.getCatalogueNumber());
            }
        }
    }

    public void lendOneBook(int catalogueNumber, String name){
        Book book = SBs.findBook(catalogueNumber);
        Borrower borrower = users.findBorrower(name);
        if(book.equals(null)){
            System.out.println("could not find book");
        }else{
            if(!(book.isALoanAvailable())){
                System.out.println("Not available for lending");
            }else{
                if(borrower == null){
                    System.out.println("could not find borrower");
                }else{
                    if(!(borrower.checkBorrower())){
                        System.out.println("You can not loan");
                    }else{
                        Loan loan = new Loan(book, borrower);
                        loans.addLoan(loan);
                        System.out.println("The loan has been completed");
                    }
                }
            }
        }
    }

    public void returnOneBook(int catalogueNumber){
        Book book = SBs.findBook(catalogueNumber);
        if(book != null){
            Loan loan = book.getLoan();

        }
        else{

        }
    }
}
