import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
	
        return Students;
	// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		this.students=students;
// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		return Student.index;
// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		this.student=student;
                this.index=index;
// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
         String first="David";
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
	String last="Louis";
// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
        if(!students.contains(student))
        students.add(student);
	if(index!= NULL)
        students.add(index);
		// Add your implementation here
	}

       public boolean contains(Student student)
{
return students.contains(student);
}


	@Override
	public void remove(int index) {
        students.remove(index);
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
	students.remove(student);
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
	students.removeFromIndex(index);
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
	students.removeFromElement(student);
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
	students.removeToIndex(index);
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
	students.removeToElement(student);
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
	   int n = student.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > student[j]){  
                                 //swap elements  
                                 temp = student[j-1];  
                                 student[j-1] = student[j];  
                                 student[j] = temp;  
                         }  
                          
		}
	}
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
	
     return ByBirthDate(date);
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
return BetweenBirthDates.firstDate;
return BetweenBirthdates.lastDate;
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
	return NearBirthDate.date;
return NearBirthDate.days;
	// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
 return CurrentAgeByDate.indexOfStudents;
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
	return StudentsByAge.age;
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
	return StudentWithMaxAvgMark;
			// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
	return NextStudent.student;
			// Add your implementation here
		return null;
	}
}
