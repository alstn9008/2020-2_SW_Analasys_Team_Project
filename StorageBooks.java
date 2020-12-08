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
    ArrayList<Book> SBs = new ArrayList<>();
    Iterator<Book> iter;
    
    public void addBook(Book book){
        iter = SBs.iterator();
        int bCN = book.getCatalogueNumber();
        if(SBs.isEmpty()){
            SBs.add(book);
        }
        else{
            for(int i = 0; i < SBs.size(); i++){
                Book temp = SBs.get(i);
                int tempCN = temp.getCatalogueNumber();
                if(bCN < tempCN){
                    SBs.add(i, book);
                }
            }
            SBs.add(book);
        }
    }
    
    public Book getBook(){
        Iterator iter = SBs.iterator();
        while(iter.hasNext()){
            Book book = (Book)iter.next();
            return book;
        }
        return null;
    }
    
    public Book findBook(int catalogueNumber){
        Iterator iter = SBs.iterator();
        Book book;
        while(iter.hasNext()){
            book = (Book)iter.next();
            if(catalogueNumber == book.getCatalogueNumber()){
                return book;
            }
        }
        return null;
    }
    
    public ArrayList<Book> getStorageBooks(){
        return SBs;
    }
}
