import javax.swing.*;
import java.io.File;

public class FileScan {
    public static void main(String[] args) {
        File file = null;

        if (args.length > 0) {
            // If a command-line argument is provided, use it as the file path
            file = new File(args[0]);
        } else {
            // If no command-line argument, show JFileChooser to pick a file
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile();
            }
        }

        // Proceed with the file if found
        if (file != null && file.exists()) {
            System.out.println("Scanning file: " + file.getName());
            // Add code here to scan the file (e.g., read or process its contents)
        } else {
            System.out.println("File not found.");
        }
    }
}
