package com.aditya.OOP.ModelViewControlPattern;

public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    public void updateView(){
        view.showStudentDetails(model.getName(), model.getRollNo());
    }
    public void setStudentRoll(String rollNo){
        model.setRollNo(rollNo);
    }
    public String getStudentName(){
        return model.getName();
    }
    public String getStudentRoll(){
        return model.getRollNo();
    }
}
