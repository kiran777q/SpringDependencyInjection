package org.example;

public class Student {
    String studName;
    String id;

    public Student(String studName, String id) {
        this.studName = studName;
        this.id = id;
    }

    public Student(String id) {
        this.id = id;
    }
    /*
//the below setters are used when we do dependency injection through setters
    public void setStudName(String studName) {
        this.studName = studName;
    }

    public void setId(String id) {
        this.id = id;
    }
*/

    void displayStudent(){
        System.out.println("Student Name :"+studName+"\nStudent Id : "+id);

    }
}
