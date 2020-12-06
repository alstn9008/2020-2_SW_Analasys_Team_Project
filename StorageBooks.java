import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
/**
 * Write a description of class StorageBooks here.
 *
 * @author (2019315066 사사키 야스오, 2019315065 우노 히데노리, 2019315064 사토 리츠시, 2017210105 김민수)
 * @version (2020.12.05)
 */
public class StorageBooks extends ArrayList
{
    public void addBook(Book book){
        Iterator<Book> iter = this.iterator();
        Book temp;
        if(this.isEmpty()){
            this.add(book);
        }
        else{
            //Iterator iter = this.iterator();
            int bookCN = book.getCatalogueNumber();
            int count = 0;
            while(iter.hasNext()){
                temp = iter.next();
                int tempCN = temp.getCatalogueNumber();
                if(tempCN > bookCN){
                    this.add(count, book);
                }
                count++;
            }
        }
    }
    
    public Book getBook(){
        Iterator iter = this.iterator();
        while(iter.hasNext()){
            Book book = (Book)iter.next();
            return book;
        }
        return null;
    }
    
    public Book findBook(int catalogueNumber){
        Iterator iter = this.iterator();
        Book book;
        while(iter.hasNext()){
            book = (Book)iter.next();
            if(catalogueNumber == book.getCatalogueNumber()){
                return book;
            }
        }
        return null;
    }
}
