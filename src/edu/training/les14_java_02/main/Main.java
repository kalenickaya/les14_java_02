package edu.training.les14_java_02.main;

import edu.training.les14_java_02.entity.*;

	// 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
	// Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки,
	// равные только 9 или 10.

public class Main {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		students = initStudents(students);
		
		Group group = new Group(students);
        group.printExcellentStudents();
	}

	public static Student[] initStudents(Student[] students) {		
		students[0] = new Student("Иванов И.И.", 1, new int[] { 9, 10, 9, 10, 9 });
		students[1] = new Student("Петров П.П.", 1, new int[] { 8, 9, 10, 9, 10 });
		students[2] = new Student("Сидоров С.С.", 2, new int[] { 10, 10, 10, 10, 10 });
		students[3] = new Student("Козлов К.К.", 2, new int[] { 9, 9, 9, 9, 9 });
		students[4] = new Student("Николаев Н.Н.", 3, new int[] { 7, 8, 7, 8, 7 });
		students[5] = new Student("Григорьев Г.Г.", 3, new int[] { 10, 10, 9, 10, 9 });
		students[6] = new Student("Алексеев А.А.", 4, new int[] { 8, 8, 8, 8, 8 });
		students[7] = new Student("Дмитриев Д.Д.", 4, new int[] { 9, 10, 9, 10, 9 });
		students[8] = new Student("Олегов О.О.", 5, new int[] { 10, 9, 10, 9, 10 });
		students[9] = new Student("Егоров Е.Е.", 5, new int[] { 7, 6, 7, 6, 7 });
		return students;
	}

}
