import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentsStart {
    public static void main(String[] args) {


        Student student1 = new Student("Mike", "Black", "25.01.1997", "Washington, green street 25/7", "+375292641017",
                "IT", 2, "IT5", 100);
        Student student2 = new Student("Ann", "Sitnick", "19.04.1999", "Chicago, Blue street 19a", "+375298930914",
                "economy", 1, "E6", 101);
        Student student3 = new Student("Marta", "Roislland", "16.12.2001", "Minnesota, Central avenue 10", "+3754890917",
                "politics", 2, "P7", 102);
        Student student4 = new Student("Ivan", "Petrov", "01.01.1998", "Vitebsk, Chernyahovskogo 27b, 27 ", "+3756988485",
                "IT", 2, "IT5", 103);
        Student student5 = new Student("Andy", "Robertson", "17.10.1989", "Minsk, Nezawisimosti 14,27", "+375339400500",
                "economy", 1, "E6", 104);
        Student student6 = new Student("Artem", "Belyaev", "09.06.1995", "Mogilev, Pravdy 27", "+375256899498",
                "politics", 2, "P7", 105);
        Student student7 = new Student("Artur", "Zelenyi", "11.01.1965", "Paris, Red street 14", "+375296988910",
                "economy", 1, "E6", 106);
        Student student8 = new Student("Victoria", "Sky", "12.08.2005", "New Your, Long street 56/7", "+375445678909",
                "economy", 4, "E2", 107);
        Student student9 = new Student("Anastasia", "Sidorova", "31.04.2001", "Gomel, Lenina 24/24", "+375448799887",
                "IT", 1, "IT6", 108);
        Student students10 = new Student("Andrei", "Bogachov", "25.03.1997", "Vitebsk, Titowa 45,29", "+375298765443",
                "economy", 1, "E6", 109);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);
        studentArrayList.add(student6);
        studentArrayList.add(student7);
        studentArrayList.add(student8);
        studentArrayList.add(student9);
        studentArrayList.add(students10);


        System.out.println(studentArrayList);
        System.out.println();

        System.out.println("Введите факултет");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        ArrayList<Student> facultyArrayList = new ArrayList<>();
        for (Student student: studentArrayList) {
            if (student.getFaculty().equals(str))
                facultyArrayList.add(student);}
            System.out.println(str);
            System.out.println(facultyArrayList);

        System.out.println("Введите курс");
        scanner = new Scanner(System.in);
        int course = Integer.parseInt(scanner.nextLine());

        ArrayList<Student> courseArrayList = new ArrayList<>();
        for (Student student: studentArrayList) {
            if (student.getCourse()==course)
                courseArrayList.add(student);}
        System.out.println(course + "course");
        System.out.println(courseArrayList);


        System.out.println("Введите год");
        scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());

        String s="";
        String s1="";
        ArrayList<Student> birthAfter=new ArrayList<>();
        for (Student student: studentArrayList) {
            s=student.getDateOfBirth();
            for(int i=6; i<s.length(); i++ )
                s1=s1+s.charAt(i);
            if (Integer.parseInt(s1)>year)
                birthAfter.add(student);
            s1="";}

            System.out.println("Younger then " + year + " years" );
            System.out.println(birthAfter);



        System.out.println("Введите группу" );
        scanner = new Scanner(System.in);
        String group = scanner.nextLine();

        ArrayList<Student> groupArrayList = new ArrayList<>();
        for (Student student: studentArrayList) {
            if (student.getGroup().equals(group))
                groupArrayList.add(student);}
        System.out.println(group);
        System.out.println(groupArrayList);


        }

        }









