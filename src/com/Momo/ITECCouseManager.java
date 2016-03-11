package com.Momo;

import java.util.ArrayList;

public class ITECCouseManager {

    public static void main(String[] args) {
        ItecCourse maintenanceCourse = new ItecCourse("Microcomputer Systems Maintenance", 1310, 20, null);
        //Add some students.
        //TODO check that we have not exceeded the max number for the class

        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");
        maintenanceCourse.availableSpace();
        maintenanceCourse.writeCourseInfo();
        System.out.println("\n");

        ItecCourse datacomCourse = new ItecCourse("Microcomputer Systems Maintenance", 1310, 20, null);
        datacomCourse.addStudent("Dava");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");
        datacomCourse.removeStudent("Dava");
        datacomCourse.setCode(2345);
        datacomCourse.availableSpace();
        datacomCourse.writeCourseInfo();
        System.out.println("\n");


        ItecCourse java = new ItecCourse("Java Programming", 2545, 24, null);
        java.addStudent("Gus");
        java.addStudent("Harry");
        java.addStudent("Izzy");
        java.availableSpace();
        java.writeCourseInfo();
        System.out.println("\n");

        ItecCourse infotechConcepts = new ItecCourse("Infotech Concepts", 1100, 30, "T2030");
        infotechConcepts.addStudent("Max");
        infotechConcepts.addStudent("Nancy");
        infotechConcepts.addStudent("Orson");
        infotechConcepts.availableSpace();
        infotechConcepts.writeCourseInfo();



    }
}
