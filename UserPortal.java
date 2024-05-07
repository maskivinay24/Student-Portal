import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.*;



class StudentPortal {
	private int rollNum;
	private String name;
	private int studentClass;
	private String section;
	
	StudentPortal(int rollNum,String name,int studentClass,String section){
		this.rollNum = rollNum;
		this.name = name;
		this.studentClass = studentClass;
		this.section = section;	
	}
	
	public int getRollNum() {                                                                             
		return rollNum;
	}
	public String getName() {
		return name;
	}
	public int getStudentClass() {
		return studentClass;
	}

	public String getSection() {
		return section;
	}

	@Override
	public String toString() {
		return "StudentPortal [rollNum=" + rollNum + ", name=" + name + ", studentClass=" + studentClass + ", section="
				+ section + "]";
	}

}
class UserPortal{
	public static void main(String[]args) {
	
		
		List<StudentPortal> s = new ArrayList<>();
		boolean hasData = false; 
		Scanner sc = new Scanner(System.in);
		Scanner sc1= new Scanner(System.in);
		
		System.out.println("                 ************Welcome To Student Portal***************           ");
	    int ch;
	    do {
	    	System.out.println("1.Add Student");
	    	System.out.println("2.View Student Details");
	    	System.out.println("3.Search Student");
	    	System.out.println("4.Delete Student");
	    	System.out.println("5.Update Student Details");
	    	System.out.println("6.Exit");
	    	System.out.println("--------------------------------");
	    	System.out.println("Enter your choice");
	    	ch=sc.nextInt();
	    	switch(ch) {
	    	case 1: System.out.println("Enter the roll number of the student:  ");
	    	        int rollNum=sc.nextInt();
	    	        System.out.println("Enter the student name: ");
	    	        String name=sc1.nextLine();
	    	        System.out.println("Enter the class of student: ");
	    	        int studentClass= sc.nextInt();
	    	        System.out.println("Enter the section of student: ");
	    	        String section=sc1.nextLine();
	    	        s.add(new StudentPortal(rollNum,name,studentClass,section));
	    	        hasData = true;
	    	break;
	    	case 2:
	    	    System.out.println("--------------------------------");
	    	    if (hasData) {
	    	    Iterator <StudentPortal> i = s.iterator();
	    	    while(i.hasNext()){
	    	        StudentPortal r = i.next();
	    	        System.out.println(r);
	    	        
	    	        
	    	    }
	    	    }
	    	    else {
	    	    	if (s.isEmpty()) {
                    System.out.println("No student data found. Here's some dummy data:");
                    s.add(new StudentPortal(101, "Maski Vinay", 11, "C"));
                    s.add(new StudentPortal(102, "Christopher", 10, "A"));
                    Iterator<StudentPortal> i = s.iterator();
                    while (i.hasNext()) {
                        StudentPortal r = i.next();
                        System.out.println(r);
                    }
                    s.clear(); 
                    hasData = false; 
                }
	    	    }
	    	    System.out.println("--------------------------------");
	    	 break;
	    	 case 3:
	    	     System.out.println("--------------------------------");
	    	     boolean found=false;
	    	     System.out.println("Enter a Rollnumber to serach: ");
	    	      rollNum=sc.nextInt();
	    	     System.out.println("--------------------------------");
		    	 Iterator <StudentPortal> i = s.iterator();

	    	     i=s.iterator();
	    	     while(i.hasNext()){
	    	       StudentPortal r = i.next();
	    	       if(r.getRollNum()==rollNum){
	    	           System.out.println(r);
	    	           found = true;
	    	           
	    	       }
	    	      
	    	    }
	    	    if(!found){
	    	        System.out.println("Roll Number "+rollNum+" Student Details is not found!!!");
	    	    }
	    	    System.out.println("--------------------------------");
	    	  break;
	    	case 4:
	    	     System.out.println("--------------------------------");
	    	     found=false;
	    	     System.out.println("Enter a Rollnumber to Delete: ");
	    	     rollNum=sc.nextInt();
	    	     System.out.println("--------------------------------");
	    	     i=s.iterator();
	    	     while(i.hasNext()){
	    	       StudentPortal r = i.next();
	    	       if(r.getRollNum()==rollNum){
	    	           i.remove();
	    	           found = true;
	    	           
	    	       }
	    	      
	    	    }
	    	    if(!found){
	    	        System.out.println("Record not found");
	    	    }
	    	    else{
	    	        System.out.println("Record Deleted Successfully");
	    	    }
	    	    System.out.println("--------------------------------");
	    	  break;
	    	case 5:
	    	    System.out.println("--------------------------------");
	    	     found=false;
	    	     System.out.println("Enter a Rollnumber to Update: ");
	    	     rollNum=sc.nextInt();
	    	     System.out.println("--------------------------------");
	    	     ListIterator <StudentPortal> li = s.listIterator();
	    	     while(li.hasNext()){
	    	       StudentPortal r = li.next();
	    	       if(r.getRollNum()==rollNum){
	    	        System.out.println("Enter a new name of  student: ");
	    	        name=sc1.nextLine();
	    	        System.out.println("Enter the  new class of student: ");
	    	        studentClass= sc.nextInt();
	    	        System.out.println("Enter the new section of student: ");
	    	        section=sc1.nextLine();
	    	        li.set (new StudentPortal(rollNum,name,studentClass,section));
	    	           
	    	        found = true;
	    	           
	    	       }
	    	      
	    	    }
	    	    if(!found){
	    	        System.out.println("Record not found");
	    	    }
	    	    else{
	    	        System.out.println("Record Updated  Successfully");
	    	    }
	    	    System.out.println("--------------------------------");
	    	  break;
	    	case 6: 
	    		System.out.println("--------------------------------");
	            System.out.println("Thank you for using the Student Portal Application!");
	            System.out.println("--------------------------------");
	            System.exit(0);
	            break;
	    	default:
	            System.out.println("--------------------------------");
	            System.out.println("Invalid choice. Please select a valid option.");
	            System.out.println("--------------------------------");
	            break;
	    	
	    	  
	    	     

	    	     

	    	        
	    	        
	    	        
	    	        
	    	
	    	}
	    	
	    	
	    	
	    }while(ch!=0);
	}
}

 