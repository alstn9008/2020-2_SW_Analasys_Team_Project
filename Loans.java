import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Loans here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
                // else if(loan.equals(null)){
                // System.out.println("null");
                // }
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
