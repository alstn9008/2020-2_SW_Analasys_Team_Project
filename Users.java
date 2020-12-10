import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class User here.
 *
 * @author (2019315066 사사키 야스오, 2019315065 우노 히데노리, 2019315064 사토 리츠시, 2017210105 김민수)
 * @version (2020.12.05)
 */
public class Users
{
    ArrayList<Borrower> users = new ArrayList<>();
    
    public void addBorrower(Borrower borrower){
        users.add(borrower);
    }

    public ArrayList<Borrower> getBorrower(){
        return users;
    }

    public Borrower findBorrower(String name){
        Iterator iter = users.iterator();
        Borrower borrower;
        while(iter.hasNext()){
            borrower = (Borrower)iter.next();
            if(name.equals(borrower.getName())){
                return borrower;
            }
        }
        return null;
    }
}
