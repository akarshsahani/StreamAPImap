package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StudentMap {

	 static double sum=0;
	
	public static void main(String[] args) {
		List<Student> staff = Arrays.asList(
                new Student("Ak", 30, 25000, "White Field"),
                new Student("Bk", 27, 28000, "Bangalore"),
                new Student("Ck", 33, 35000, "Kundanhali")
        );
//		double sum=0;
		
		 List<Student> result = staff.stream()
				 .filter(p->p.getSalary()>26000)
				 .map(temp -> {
					 Student obj = new Student();
					 obj.setName(temp.getName());
					 obj.setAge(temp.getAge());
					 obj.setSalary(temp.getSalary());
					 if ("Bk".equals(temp.getName())) {
						 obj.setAddress("Soft Suave, Bangalore");
					 }
					 findingSum(obj.getSalary());
					 return obj;
				 }).collect(Collectors.toList());
		 
		 System.out.println(result);
		 System.out.println(sum);
		 
		
	}
	 public static double findingSum(double sal) {
		 sum = sum+sal;
		 return sum;
	}
}
