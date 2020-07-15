package sort;

class Student{
	int id;
	String name;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
}

public class InsertionSortObject {

	public static void main(String[] args) {
		Student[] arr = new Student[5];
	
		arr[0] = new Student("hello", 1);
		arr[1] = new Student("B", 2);
		arr[2] = new Student("A", 3);
		arr[3] = new Student("zimbabwe", 4);
		arr[4] = new Student("E", 5);
		
		insertionSort(arr,"name", -1); //"name" or "id", 1 for ASC, -1 for DESC
		
		for (int i = 0; i < arr.length; i++) 
			System.out.println(arr[i].getName() + " " + arr[i].getId());
		

	}
	
	public static int compareTo(Student a, Student b, String method) {
    
        int res = 0;
        if(method.equalsIgnoreCase("id")) {
	        if (a.id < b.getId()) 
	            res = -1;
	        
	        else if (a.id > b.getId()) 
	            res = 1;
        }
        else {
	        if (a.getName().compareTo(b.getName()) < 0) 
	            res = -1;
	        
	        else if (a.getName().compareTo(b.getName()) > 0) 
	            res = 1;
        }
        
        return res;
}
	
	public static void insertionSort(Student[] s, String method, int sign) {
    	int j, i;
    	
    	if(sign != 1 && sign != -1 || !method.equalsIgnoreCase("name") && !method.equalsIgnoreCase("id"))
    		return;
    	
        for (i = 1; i < s.length; i++) {
        	Student temp = s[i];
        	j = i - 1;

        	while (j >= 0 && compareTo(s[j],  temp, method) * sign > 0) 
        		s[j + 1] = s[j--];
          
            s[j + 1] = temp;
	    }
    }
}

