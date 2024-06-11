package edu.training.les14_java_02.entity;

public class Group {
	
	private Student[] students;
	
	public Group(Student[] students) {
		this.students = students;
	}
	
	public void printExcellentStudents() {
		System.out.println("Список студентов, имеющих оценки, равные только 9 или 10:");
        for (Student student : students) {
            if (student.hasExcellentGrades()) {
                System.out.println(student.getName() + ", группа номер " + student.getGroupNumber());
            }
        }
    }
}
