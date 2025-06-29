import java.io.*;
import java.util.Scanner;

public class NotesManager {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = "notes.txt";
        int choice;

        do {
            System.out.println("\n--- Notes Manager ---");
            System.out.println("1. Write a Note");
            System.out.println("2. Read Notes");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear input buffer

            if (choice == 1) {
                System.out.print("Enter your note: ");
                String note = sc.nextLine();
                writeNote(fileName, note);
                System.out.println("Note saved!");
            } else if (choice == 2) {
                System.out.println("\n--- Your Notes ---");
                readNotes(fileName);
            }

        } while (choice != 0);

        System.out.println("Goodbye!");
        sc.close();
    }

    // Function to write a note to the file
    public static void writeNote(String fileName, String note) throws IOException {
        FileWriter writer = new FileWriter(fileName, true); // 'true' = append mode
        writer.write(note + "\n");
        writer.close();
    }

    // Function to read all notes from the file
    public static void readNotes(String fileName) throws IOException {
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("No notes found.");
            return;
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println("- " + line);
        }

        reader.close();
    }
}
