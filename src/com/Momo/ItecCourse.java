package com.Momo;

import java.util.ArrayList;

public class ItecCourse {
    protected String name;
    protected int code;
    protected ArrayList<String> students;
    protected int maxStudents;
    protected String room;
    protected int remainder;



    public ItecCourse(String courseName, int courseCode, int maxStudents, String room) {
        this.maxStudents = maxStudents;
        this.code = courseCode;
        this.students = new ArrayList<>();
        this.name = courseName;
        this.room = room;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<String> getStudents()
    {
        return students;
    }

    public void setStudents(ArrayList<String> students)
    {
        this.students = students;
    }

    public int getMaxStudents()
    {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents)
    {
        this.maxStudents = maxStudents;
    }

    public void addStudent(String studentName)
    {


        if(students.size() == maxStudents){
            System.out.println("This class is full student can't be added");

        }
        else {
            students.add(studentName);
            System.out.println(studentName + " is has added to this class");

        }
    }
    public void writeCourseInfo() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Room: "+ this.room);

        System.out.println("Students enrolled:");
        for (String student : this.students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is  " + this.maxStudents);
        System.out.println("Available Space: "+ this.remainder);
    }
    int getNumberOfStudents() {
        return this.students.size();
    }
    public void removeStudent(String studentName){
        if(students.contains(studentName)){
            students.remove(studentName);
            System.out.println(studentName +" was un-enrolled from this class " + this.name);
        }
        else {
            System.out.println("Student didn't register for this class.");
        }
    }

    void setRoom(String room){
        this.room = room;
    }

    String room(){
        return room;
    }

   void setAvailableSpace(int remainder){
       this.remainder=remainder;
   }
    //Setting of the Avaialable space method
    int availableSpace(){
        if(students.size()<maxStudents){
            //Determining available space for each class
            remainder = maxStudents-students.size();
        }
        return remainder;
    }


}
