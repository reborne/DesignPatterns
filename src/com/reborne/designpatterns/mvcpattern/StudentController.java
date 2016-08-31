package com.reborne.designpatterns.mvcpattern;

/**
 * Created by Reborn on 8/31/2016.
 */
public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name){
        model.setName(name);
    }

    public String getName(){
        return model.getName();
    }

    public void setStudentId(Long rollNo){
        model.setId(rollNo);
    }

    public Long getStudentId(){
        return model.getId();
    }

    public void updateView() {
        view.displayDetails(model.getName(), model.getId());
    }
}
