import java.util.*;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class Lab404 {

	public static void main(String[] args) {
		inputStudent ();
	}
	public static void inputStudent() {
		Scanner scanner = new Scanner (System.in);
		String studentID,subjectCode;
		boolean isStudentID, isSubjectCode;
		
		while (true) {
			System.out.print("Enter student ID (10 digits): ");
			studentID = scanner.nextLine();
			
			System.out.print("Enter subject code (7 digits): ");
			subjectCode = scanner.nextLine();
			
			isStudentID = isLenght(studentID, 10);
			isSubjectCode = isLenght(subjectCode, 7);
			
			if (isStudentID && isSubjectCode) {
				boolean isITStudent = isITstudent(studentID);
				boolean isSubjectCode = isSubjectCode(subjectCode);
				displayData(isITStudent,isSubjectCode,isStudentID);
				break;
			}else {
				System.out.print("");
			}
		}
	}
	public static boolean isLenght (String ID,int digits) {
		return ID.length()==digits;
	}
		
	}

}
