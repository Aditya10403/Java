package com.Aditya.OOP.ModelViewControlPattern;

public class TestMVC {
    public static void main(String[] args) {
        // fetching student details from database.
        StudentModel model = retriveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);
        controller.updateView();

        controller.setStudentName("DEF");
        controller.updateView();
    }
    private static StudentModel retriveStudentFromDatabase(){
        StudentModel student = new StudentModel();
        student.setName("ABC");
        student.setRollNo("123");
        return student;
    }
}
