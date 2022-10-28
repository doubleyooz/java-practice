import java.util.Scanner;

import models.Actor;
import models.Director;
import models.Cameraman;
import models.Cinematographer;
import models.Movie;

import java.util.ArrayList;

import repositories.ActorRepository;
import repositories.CameramanRepository;
import repositories.CinematographerRepository;
import repositories.DirectorRepository;


public class App {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("MOVIE CONTROL\n");
        boolean loop = true;
        while (loop) {
            System.out.println("1 - Professors");
            System.out.println("2 - Students");
            System.out.println("3 - Courses");
            System.out.println("4 - End Program.\n");

            switch (scan.nextInt()) {

                case 1:
                    try {
                        firstMenu();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        secondMenu();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        thirdMenu();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }

    private static void firstMenu() throws InterruptedException {
        boolean loop = true;
        while (loop) {
            System.out.println("\n1 - Register a new Professor");
            System.out.println("2 - List Professors");
            System.out.println("3 - Update Professor");
            System.out.println("4 - Delete Professor");
            System.out.println("5 - Go back.\n");

            switch (scan.nextInt()) {

                case 1:
                    System.out.println("Type their name: ");
                    String name = scan.nextLine();
                    name = scan.nextLine();
                    Thread.sleep(1000);
                    if (ProfessorRepository.store(name))
                        System.out.println("The new Professor was registered");
                    else
                        System.out.println("Something went wrong");
                    break;
                case 2:
                    ProfessorRepository.printAll();
                    break;

                case 3:
                    boolean minorLoop = true;
                    System.out.println("Which professor will be updated?");
                    ArrayList<Professor> professors = ProfessorRepository.list();

                    while (minorLoop) {
                        for (int i = 0; i < professors.size(); i++) {
                            System.out.printf("%d - %s\n", i + 1, professors.get(i).getName());
                        }

                        System.out.println("0 - cancel");
                        int professorID = scan.nextInt();
                        if (professorID > professors.size() || professorID < 0) {
                            System.out.println("Choose a valid option.");
                        } else if (professorID == 0) {
                            minorLoop = false;
                        } else {
                            boolean minorLoop2 = true;
                            while (minorLoop2) {
                                System.out.println("Which property shall be updated?");
                                System.out.printf("1 - name\n");
                                System.out.printf("2 - cancel\n");

                                int option3 = scan.nextInt();
                                switch (option3) {
                                    case 1:
                                        System.out.println("Type their new name: ");
                                        String temp = scan.nextLine();
                                        temp = scan.nextLine();
                                        Thread.sleep(1000);
                                        if (ProfessorRepository.update(professors.get(professorID - 1).getId(), temp))
                                            System.out.println("The new Professor was updated");
                                        else
                                            System.out.println("Something went wrong");
                                        minorLoop = false;
                                        break;
                                    case 2:
                                        minorLoop2 = false;
                                    default:
                                        System.out.println("Choose a valid option.");
                                        break;

                                }

                            }
                        }

                    }

                    break;

                case 4:
                    boolean loop2 = true;
                    System.out.println("Which professor will be updated?");
                    ArrayList<Professor> professors2 = ProfessorRepository.list();

                    while (loop2) {
                        for (int i = 0; i < professors2.size(); i++) {
                            System.out.printf("%d - %s\n", i + 1, professors2.get(i).getName());
                        }

                        System.out.println("0 - cancel");
                        int professorID = scan.nextInt();
                        if (professorID > professors2.size() || professorID < 0) {
                            System.out.println("Choose a valid option.");
                        } else if (professorID == 0) {
                            loop2 = false;
                        } else {

                            if (ProfessorRepository.delete(professors2.get(professorID - 1).getId()))
                                System.out.println("The specified professor was deleted.");
                            else
                                System.out.println("Something went wrong");
                        }

                    }

                    break;

                case 5:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }

    private static void secondMenu() throws InterruptedException {
        boolean loop = true;
        while (loop) {
            System.out.println("\n1 - Register a new Student");
            System.out.println("2 - List Students");
            System.out.println("3 - Update Student");
            System.out.println("4 - Delete Student");
            System.out.println("5 - Go back.\n");

            switch (scan.nextInt()) {

                case 1:
                    System.out.println("Type their name: ");
                    String name = scan.nextLine();
                    name = scan.nextLine();
                    System.out.println("Type their age: ");
                    int age = scan.nextInt();

                    Thread.sleep(1000);
                    if (StudentRepository.store(name, age))
                        System.out.println("The new Student was registered");
                    else
                        System.out.println("Something went wrong");
                    break;
                case 2:
                    StudentRepository.printAll();
                    break;

                case 3:
                    boolean minorLoop = true;
                    System.out.println("Which student shall be updated?");
                    ArrayList<Student> students = StudentRepository.list();

                    while (minorLoop) {
                        for (int i = 0; i < students.size(); i++) {
                            System.out.printf("%d - %s\n", i + 1, students.get(i).getName());
                        }

                        System.out.println("0 - cancel");
                        int studentId = scan.nextInt();
                        if (studentId > students.size() || studentId < 0) {
                            System.out.println("Choose a valid option.");
                        } else if (studentId == 0) {
                            minorLoop = false;
                        } else {
                            boolean minorLoop2 = true;
                            while (minorLoop2) {
                                System.out.println("Which property shall be updated?");
                                System.out.printf("1 - name\n");
                                System.out.printf("2 - age\n");
                                System.out.printf("3 - cancel\n");

                                int option3 = scan.nextInt();
                                switch (option3) {
                                    case 1:
                                        System.out.println("Type their new name: ");
                                        String temp = scan.nextLine();
                                        temp = scan.nextLine();
                                        Thread.sleep(1000);
                                        if (StudentRepository.update(students.get(studentId - 1).getId(), temp))
                                            System.out.println("The Student was updated");
                                        else
                                            System.out.println("Something went wrong");
                                        minorLoop = false;
                                        break;
                                    case 2:
                                        System.out.println("Type their new age: ");
                                        int tempAge = scan.nextInt();
                                        Thread.sleep(1000);
                                        if (StudentRepository.update(students.get(studentId - 1).getId(), tempAge))
                                            System.out.println("The Student was updated");
                                        else
                                            System.out.println("Something went wrong");
                                        minorLoop = false;
                                        break;
                                    case 3:
                                        minorLoop2 = false;
                                    default:
                                        System.out.println("Choose a valid option.");
                                        break;

                                }

                            }
                        }

                    }

                    break;

                case 4:
                    boolean loop2 = true;
                    System.out.println("Which student shall be updated?");
                    ArrayList<Student> students2 = StudentRepository.list();

                    while (loop2) {
                        for (int i = 0; i < students2.size(); i++) {
                            System.out.printf("%d - %s\n", i + 1, students2.get(i).getName());
                        }

                        System.out.println("0 - cancel");
                        int studentID = scan.nextInt();
                        if (studentID > students2.size() || studentID < 0) {
                            System.out.println("Choose a valid option.");
                        } else if (studentID == 0) {
                            loop2 = false;
                        } else {

                            if (StudentRepository.delete(students2.get(studentID - 1).getId()))
                                System.out.println("The specified student was deleted");
                            else
                                System.out.println("Something went wrong");
                        }

                    }

                    break;

                case 5:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }

    private static void thirdMenu() throws InterruptedException {
        boolean loop = true;
        while (loop) {
            System.out.println("\n1 - Register a new Course");
            System.out.println("2 - List Courses");
            System.out.println("3 - Update Course");
            System.out.println("4 - Delete Course");
            System.out.println("5 - Go back.\n");

            switch (scan.nextInt()) {

                case 1:
                    System.out.println("Type its name: ");
                    String name = scan.nextLine();
                    name = scan.nextLine();
                    System.out.println("Type its timetable: ");
                    String timetable = scan.nextLine();
                   

                    Thread.sleep(1000);
                    if (CourseRepository.store(name, timetable))
                        System.out.println("The new Course was registered");
                    else
                        System.out.println("Something went wrong");
                    break;
                case 2:
                    CourseRepository.printAll();
                    break;

                case 3:
                    boolean minorLoop = true;
                    System.out.println("Which course shall be updated?");
                    ArrayList<Actor> courses = CourseRepository.list();

                    while (minorLoop) {
                        for (int i = 0; i < courses.size(); i++) {
                            System.out.printf("%d - %s\n", i + 1, courses.get(i).getName());
                        }

                        System.out.println("0 - cancel");
                        int courseId = scan.nextInt();
                        if (courseId > courses.size() || courseId < 0) {
                            System.out.println("Choose a valid option.");
                        } else if (courseId == 0) {
                            minorLoop = false;
                        } else {
                            boolean minorLoop2 = true;
                            while (minorLoop2) {
                                System.out.println("Which property shall be updated?");
                                System.out.printf("1 - name\n");
                                System.out.printf("2 - timetable\n");
                                System.out.printf("3 - professor\n");
                                System.out.printf("4 - students\n");
                                System.out.printf("5 - cancel\n");

                                int option3 = scan.nextInt();
                                switch (option3) {
                                    case 1:
                                        System.out.println("Type its new name: ");
                                        String temp = scan.nextLine();
                                        temp = scan.nextLine();
                                        Thread.sleep(1000);
                                        if (CourseRepository.update(courses.get(courseId - 1).getId(), temp, ""))
                                            System.out.println("The Course was updated");
                                        else
                                            System.out.println("Something went wrong");
                                        minorLoop = false;
                                        break;
                                    case 2:
                                        System.out.println("Type its new timetable: ");
                                        String tempTimetable = scan.nextLine();
                                        tempTimetable = scan.nextLine();
                                        Thread.sleep(1000);
                                        if (CourseRepository.update(courses.get(courseId - 1).getId(), "",
                                                tempTimetable))
                                            System.out.println("The Course was updated");
                                        else
                                            System.out.println("Something went wrong");
                                        minorLoop = false;
                                        break;
                                    case 3:
                                        ArrayList<Professor> professors = ProfessorRepository.list();
                                        System.out.println("Which professor shall be added to this course?");
                                        boolean loop3 = true;
                                        while (loop3) {
                                            for (int i = 0; i < professors.size(); i++) {
                                                System.out.printf("%d - %s\n", i + 1, professors.get(i).getName());
                                            }

                                            System.out.println("0 - cancel");
                                            int professorID = scan.nextInt();
                                            if (professorID == 0)
                                                loop3 = false;
                                            else if (professorID > 0 && professorID <= professors.size()) {
                                                courses.get(courseId - 1).setProfessor(professors.get(professorID - 1));
                                                System.out.println("The specified student was added to the course.");
                                            } else {
                                                System.out.println("Choose a valid option.\n");
                                            }
                                        }
                                        break;

                                    case 4:
                                        ArrayList<Student> students = StudentRepository.list();
                                        System.out.println("Which students shall be added to this course?");
                                        boolean loop2 = true;
                                        while (loop2) {
                                            for (int i = 0; i < students.size(); i++) {
                                                System.out.printf("%d - %s\n", i + 1, students.get(i).getName());
                                            }

                                            System.out.println("0 - cancel");
                                            int studentID = scan.nextInt();
                                            if (studentID == 0)
                                                loop2 = false;
                                            else if (studentID > 0 && studentID <= students.size()) {
                                                courses.get(courseId - 1).getStudents()
                                                        .add(students.get(studentID - 1));
                                                System.out.println("The specified student was added to the course.");
                                            } else {
                                                System.out.println("Choose a valid option.\n");
                                            }
                                        }

                                        break;

                                    case 5:
                                        minorLoop2 = false;
                                    default:
                                        System.out.println("Choose a valid option.");
                                        break;

                                }

                            }
                        }

                    }

                    break;

                case 4:
                    boolean loop2 = true;
                    System.out.println("Which student shall be updated?");
                    ArrayList<Actor> courses2 = CourseRepository.list();

                    while (loop2) {
                        for (int i = 0; i < courses2.size(); i++) {
                            System.out.printf("%d - %s\n", i + 1, courses2.get(i).getName());
                        }

                        System.out.println("0 - cancel");
                        int courseID = scan.nextInt();
                        if (courseID > courses2.size() || courseID < 0) {
                            System.out.println("Choose a valid option.");
                        } else if (courseID == 0) {
                            loop2 = false;
                        } else {

                            if (CourseRepository.delete(courses2.get(courseID - 1).getId()))
                                System.out.println("The specified course was deleted");
                            else
                                System.out.println("Something went wrong");
                        }

                    }

                    break;

                case 5:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
