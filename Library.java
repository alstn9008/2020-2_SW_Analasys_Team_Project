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
    private ArrayList<Book> property;
    private Users users;
    private ArrayList<Loan> loan;
    public Library(String name){
        this.name = name;
        //property = new ArrayList<Book>();
        users = new Users();
        //loan = new ArrayList<Loan>();
    }
    
    public void printBorrower()//이용자가 등록되었는지를 확인을 위해
    {
        ArrayList temp = users.getBorrower();
        Iterator iter = temp.iterator();
        int count = 0;
        while(iter.hasNext())
        {
            Borrower user = (Borrower)iter.next();
            System.out.println("이용자" + count + " : " + user.getName());
            count++;
        }
    }

    public void registerOneBorrower(String name)
    {
        Borrower user = users.findBorrower(name);// この名前の人いる？　いれば利用者を居なければnull　RETURN
        if(user == null)
        {
            Borrower newBorrower = new Borrower(name);
            users.addBorrower(newBorrower);
        }
        else
        {
            System.out.println("같은 이름을 가진 사용자가 등록되어 있습니다. 다른 이름으로 등록해 주십시오.");
        }
    }

    // public void registerOneBorrower(String name){
    // Iterator<Borrower> userIte = user.iterator();
    // while(userIte.hasNext()){
    // Borrower user = userIte.next();
    // String userName = user.getName();
    // if(name == userName){
    // System.out.println("already borrower was registered");
    // break;
    // }
    // }
    // Borrower newBorrower = new Borrower(name);
    // user.add(newBorrower);
    // System.out.println("It has been processed normally");
    // }

    public void registerOneBook(String title, String author, int catalogueNumber){
        Iterator<Book> proIte = property.iterator();
        while(proIte.hasNext()){
            Book book = proIte.next();
            int cN = book.getCatalogueNumber();
            if(catalogueNumber == cN){
                System.out.println("already borrower was registered");
                break;
            }
        }
        Book newBook = new Book(title, author);
        property.add(newBook);
        System.out.println("It has been processed normally");
    }

    public void displayForLoan(){
        System.out.println("Title Author CatalogueNumber");
        Iterator<Book> proIte = property.iterator();
        while(proIte.hasNext()){
            Book book = proIte.next();
            if(book.is_a_loan_abaliable()){
                System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getCatalogueNumber());
            }
        }
    }

    public void displayOnLoan(){
        System.out.println("Title Author CatalogueNumber");
        Iterator<Book> proIte = property.iterator();
        while(proIte.hasNext()){
            Book book = proIte.next();
            if(!(book.is_a_loan_abaliable())){
                System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getCatalogueNumber());
            }
        }
    }

    public void lendOneBook(int catalogueNumber, String name){

    }

    public void returnOneBook(int catalogueNumber, String name){

    }
}
