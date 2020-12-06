import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class User here.
 *
 * @author (2019315066 사사키 야스오, 2019315065 우노 히데노리, 2019315064 사토 리츠시, 2017210105 김민수)
 * @version (2020.12.05)
 */
public class User extends ArrayList
{
    public void addBorrower(Borrower borrower){
        this.add(borrower);
    }

    public Borrower getBorrower(){
        Iterator iter = this.iterator();
        while(iter.hasNext()){
            Borrower borrower = (Borrower)iter.next();
            return borrower;
        }
        return null;
    }

    public Borrower findBorrower(String name){
        Iterator iter = this.iterator();
        Borrower borrower;
        while(iter.hasNext()){
            borrower = (Borrower)iter.next();
            if(name == borrower.getName()){
                return borrower;
            }
        }
        return null;
    }
}
