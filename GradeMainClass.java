package ro.crystal.demo;

import java.util.List;

import ro.crystal.demo.grade.Grade;

public class GradeMainClass {
	public static void main(String[] args) {
		final List<Grade> studentsGrades = MockData.getInstance().getAllStudentsGrades();
		for (Grade grade : studentsGrades) {
			System.out.println("Student " + grade.getStudent().getFirstName() + ". Materie: " + grade.getSubject() + " " + grade.getValue());
		}
	}
}
