
/**
 * Write a description of class Library here.
 *
 * @author (사사키 야스오, 우노 히데노리, 사토 리츠시, 2017210105 김민수)
 * @version (a version number or a date)
 */
public class Library
{
    public String name;
    public Library(String name)
    {
        this.name = name;
    }
    
    public void registerOneBorrower(String name)
    {}
    
    public void registerOneBook(String title, String author, int catalogueNumber)
    {}
    
    public void displayBooksForLoan()
    {}
    
    public void displayBooksOnLoan()
    {}
    
    public void lendoneBook(String name, int catalogueNumber)
    {}
    
    public void returnOneBook(String name, int catalogueNumber)
    {}
}
