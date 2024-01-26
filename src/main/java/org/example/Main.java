package org.example;

import org.example.Entity.Student;
import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        FullName fullName = new FullName("kamal","kumara");
        student.setId(String.valueOf(2));
        student.setName(fullName);
        student.setAddress("matugama");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction =  session.beginTransaction(); // hibernate waladi hama sql ekakma run krnne traceaction ekak athule natnm query eka insert wnne na
        //session.save,persist(student);
         //session.delete(student);
//       session.update(student);

//        Student s = session.get(Student.class,1); //session.load(Student.class,1);
//        System.out.println(s);

        transaction.commit();
        session.close();
        //hibernate wala delete query ekk run wnna kalin select query ekak ghnwa database eke id eka thiynwda balanna
    }
}