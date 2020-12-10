import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Loans here.
 *
 * @author (2019315066 사사키 야스오, 2019315065 우노 히데노리, 2019315064 사토 리츠시, 2017210105 김민수)
 * @version (2020.12.03)
 */
public class Loans
{
    ArrayList<Loan> loans;
    public Loans()
    {
        this.loans = new ArrayList();
    }
    
    public boolean checkLoan()
    {
        try{
            Iterator<Loan> iter = loans.iterator();
            // Loan loan;
            while(iter.hasNext())
            {
                Loan loan = (Loan)iter.next();
                if(!(loan.checkDeadline()))
                {
                    return false;
                }
            }
        }catch(NullPointerException e){
            System.out.println("nullだよ");
            return true;
        }
        return true;
        //借りてる本がない
        //本は借りてるけど期限は過ぎてない
    }

    public void addLoan(Loan loan){
        loans.add(loan);
    }
}
