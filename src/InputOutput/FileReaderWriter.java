package InputOutput;
import java.io.*;
import java.util.Scanner;

public class FileReaderWriter {
    public static void main(String[] args) {
        String filename = "myNotes.txt";
        Scanner sc = new Scanner(System.in);
        int choice;

        while(true){
            System.out.println("Notes App Menu:");
            System.out.println("1. Write a new note");
            System.out.println("2. Read all notes");
            System.out.println("3. Exit");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter your note and type END on a new line when done writing : ");
                    writeNote(sc,filename);
                    break;
                case 2:
                    System.out.println("\n--- Your Notes ---");
                    readNote(filename);
                    break;
                case 3:
                    System.out.println("Exiting Notes App. Goodbye!");
                    sc.close();
                    return; // Exit the main method
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void readNote(String filename) {
        try (BufferedReader bf = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = bf.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading notes.");
            e.printStackTrace();
        }
    }

    private static void writeNote(Scanner sc, String filename) {
        try( FileWriter writer = new FileWriter(filename,true)) {
            String note;

            while(true){
                 note = sc.nextLine();
                 if(note.equalsIgnoreCase("END"))break;
                writer.write(note+"\n");
            }

            System.out.println("Notes Written");

        } catch (IOException e) {
            System.err.println("Error saving note.");
            e.printStackTrace();
        }
    }
}

