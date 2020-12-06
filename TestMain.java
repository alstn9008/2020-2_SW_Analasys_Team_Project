import java.util.Iterator;
/**
 * 실행결과를 확인하기 위한 main class.
 *
 * @author (2019315066 사사키 야스오, 2019315065 우노 히데노리, 2019315064 사토 리츠시, 2017210105 김민수)
 * @version (2020.12.05)
 */
public class TestMain
{
    public static void main(String[] args){
        StorageBooks sB = new StorageBooks();
        Book book1 = new Book("book1", "ritsu");
        Book book2 = new Book("book2", "yasu");
        Book book3 = new Book("book3", "yoshi");
        Book book4 = new Book("book4", "taka");
        
        sB.addBook(book1);
        sB.addBook(book2);
        sB.addBook(book3);
        sB.addBook(book4);
        
        Iterator<Book> iter = sB.iterator();
        while(iter.hasNext()){
            Book temp = iter.next();
            System.out.println(temp.getCatalogueNumber());
        }
    }
}
