import java.io.*;

public class FileHandling {

    public static void main(String[] args) throws IOException {

        // 1. Create and Write
        FileWriter fw = new FileWriter("file1.txt");
        fw.write("Hello Java\nFile Handling");
        fw.close();

        // 2. Read
        BufferedReader br = new BufferedReader(
                new FileReader("file1.txt"));

        String line;
        System.out.println("File Content:");

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

        // 3. Append / Add
        fw = new FileWriter("file1.txt", true);
        fw.write("\nNew Data Added");
        fw.close();

        // 4. Copy
        FileInputStream in = new FileInputStream("file1.txt");
        FileOutputStream out = new FileOutputStream("file2.txt");

        int ch;
        while ((ch = in.read()) != -1) {
            out.write(ch);
        }

        in.close();
        out.close();

        System.out.println("File copied successfully.");

        // 5. File Information
        File file = new File("file1.txt");

        System.out.println("File Name: " + file.getName());
        System.out.println("File Exists: " + file.exists());
        System.out.println("File Size: " + file.length() + " bytes");

        // 6. Delete
        // file.delete();

        System.out.println("File handling completed.");
    }
}
