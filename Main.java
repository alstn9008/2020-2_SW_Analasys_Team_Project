import java.util.Scanner;
/**
 * 실행결과를 확인하기 위한 main class.
 *
 * @author (2019315066 사사키 야스오, 2019315065 우노 히데노리, 2019315064 사토 리츠시, 2017210105 김민수)
 * @version (2020.12.05)
 */
public class Main
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        Library library = new Library("선문대학교 중앙 도서관");
        
        do
        {
            choice = displayMenu();
            switch(choice)
            {
                case 0:
                    System.out.println("\n" + "프로그램 종료!" + "\n");
                    System.out.println();
                    // scan.close();
                    break;
                case 1:
                    System.out.println("사용자 이름을 입력하시오 : ");
                    String newBorrowerName = scan.next();
                    library.registerOneBorrower(newBorrowerName);// この名前の人いますか？
                    library.printBorrower();
                    break;
                case 2:
                    System.out.println("input the Title");
                    String title = scan.next();
                    System.out.println("input the Author");
                    String author = scan.next();
                    library.registerOneBook(title, author);
                    library.printBook();
                    break;
                case 3:
                    System.out.println("Title Author CatalogueNumber");
                    library.displayForLoan();
                    break;
                case 4:
                    System.out.println("Title Author CatalogueNumber");
                    library.displayOnLoan();
                    break;
            }
        }
        while(choice != 0);
    }
    
    public static int displayMenu()
    {
        System.out.println("0 : 종료");
        System.out.println("1 : 이용자 등록");
        System.out.println("2 : 서적 등록");
        System.out.println("3 : 대출가능적 출력");
        System.out.println("4 : 대출중 서적 출력");
        System.out.println("5 : 대출");
        System.out.println("6 : 반납");
        System.out.println("메뉴를 선택하시오(0~6) : ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
