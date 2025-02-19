import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	       
	    System.out.print("Input movie id : ");
	    String id = scan.nextLine();
	    System.out.print("Input movie name : ");
	    String movieName = scan.nextLine();

	    System.out.println();

	    System.out.print("Input director name : ");
	    String diName = scan.nextLine();
	    System.out.print("Input director e-mail : ");
	    String diEmail = scan.nextLine();
	    System.out.print("Input director gender : ");


	    String diGender = scan.next();
	    while (diGender.equalsIgnoreCase("f") == false && diGender.equalsIgnoreCase("m") == false)
	    {
	       System.out.print("Input director gender, again : ");
	            diGender = scan.next();
	    }
	       System.out.println();

	       System.out.print("Input movie theater no. : ");
	       int mTheaterNo = scan.nextInt();
	       scan.nextLine();
	       while (mTheaterNo < 1 || mTheaterNo > 15)
	    {
	       System.out.print("Please input 1 - 15 only : ");
	       mTheaterNo = scan.nextInt();
	       scan.nextLine();
	       
	    }
	        System.out.println();


	        char c = diGender.charAt(0);
	        Director director = new Director(diName , diEmail ,c);

	        Movie movie1 = new Movie(id , movieName , director);
	        movie1.setDirector(director);

	        Theater theater = new Theater(id , movieName , director , mTheaterNo);
	        System.out.print(theater);
	        scan.close();

	}

}
