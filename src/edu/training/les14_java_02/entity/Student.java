package edu.training.les14_java_02.entity;

public class Student {
	
	private String name;
	private int groupNumber;
	private int[] grades;

	public Student(String name, int groupNumber, int[] grades) {
		this.name = name;
		this.groupNumber = groupNumber;
		this.grades = grades;
	}
	
	public boolean hasExcellentGrades() {
        for (int grade : grades) {
            if (grade < 9) {
                return false;
            }
        }
        return true;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getGrades() {
		return grades;
	}
	public void setGrades(int[] grades) {
		this.grades = grades;
	}

}
