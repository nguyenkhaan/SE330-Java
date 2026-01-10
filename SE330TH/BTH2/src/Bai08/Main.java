package Bai08;
import java.util.*;
public class Main {
    static HeThong ht = new HeThong();
    static Scanner sc = new Scanner(System.in);
    static int choice = 0;
    public static void listAll()
    {
        System.out.println("Here is all the information");
        ht.listAll();
    }
    public static void listDetail()
    {
        System.out.println("Enter the name to find: ");
        String name = sc.nextLine().trim();
        ht.listByName(name);
    }
    public static void Add() {
        System.out.print("Enter the name: ");
        String name = sc.nextLine().trim();
        Double value = null;

        while (value == null) {
            System.out.print("Enter the value: ");
            String input = sc.nextLine().trim();

            try {
                value = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid double.");
            }
        }
        ht.addNewMachDien(name , value);
    }
    public static void update()
    {
        System.out.print("Enter the name to update: ");
        String name = sc.nextLine().trim();
        ht.update(name);
    }
    public static void delete()
    {
        System.out.print("Enter the name to delete: ");
        String name = sc.nextLine().trim();
        ht.delete(name);
    }
    public static void restore(double value)
    {
        String saveChoice = "No";
        System.out.print("Do you want to save this (Type Y/N): ");
        saveChoice = sc.nextLine().trim();
        if (saveChoice.equals("Y") || saveChoice.equals("y"))
        {
            String name;
            System.out.print("Enter the name to save: ");
            name = sc.nextLine().trim();
            ht.addNewMachDien(name , value);
        }
    }
    public static void noiTiep()
    {
        System.out.print("Enter name 1: ");
        String name1 = sc.nextLine().trim();
        System.out.print("Enter name 2: ");
        String name2 = sc.nextLine().trim();
        double ans = ht.seriesCircuit(name1 , name2);
        System.out.println("Answer: " + ans);
        restore(ans);    //Luu tru lai de su dung
    }
    public static void songsong()
    {
        System.out.print("Enter name 1: ");
        String name1 = sc.nextLine().trim();
        System.out.print("Enter name 2: ");
        String name2 = sc.nextLine().trim();
        double ans = ht.parallelCircuit(name1 , name2);
        System.out.println("Answer: " + ans);
        restore(ans);    //Luu tru lai de su dung
    }
    public static void main(String[] args) {

        while (true)
        {
            try
            {

                System.out.println("1. List all Mach Diens");
                System.out.println("2. List detail");
                System.out.println("3. Add new MachDien");
                System.out.println("4. Update MachDien");
                System.out.println("5. Delete MachDien");
                System.out.println("6. Noi Tiep");
                System.out.println("7. Song song");
                System.out.println("Other: Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();  //Clear the buffer
                switch (choice)
                {
                    case 1: listAll(); break;
                    case 2: listDetail(); break;
                    case 3: Add(); break;
                    case 4: update(); break;
                    case 5: delete(); break;
                    case 6: noiTiep(); break;
                    case 7: songsong(); break;
                    default:
                        System.out.println("Bye");
                        return;
                }
            }
            catch (Exception e)
            {
                System.out.println("Fucking timeline");
                return;
            }
        }
    }
}
