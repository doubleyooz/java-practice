import java.util.Scanner;

import models.Professor;

import java.util.ArrayList;

import repositories.ProfessorRepository;
import repositories.StudentRepository;
import repositories.CourseRepository;

public class App {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ACADEMIC CONTROL\n");
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
                    secondMenu();
                    break;
                case 3:
                    thirdMenu();
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
                                System.out.println("The new Professor was registered");
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

    private static void secondMenu() {

    }

    private static void thirdMenu() {

    }
}
