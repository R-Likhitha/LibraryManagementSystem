import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Library {
    private int bookID;
    private int userID;
    private int period;
    private LocalDate issueDate;

    // Constructor to initialize the book issue details
    public Library(int bookID, int userID, int period, String issueDateStr) {
        this.bookID = bookID;
        this.userID = userID;
        this.period = period;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.issueDate = LocalDate.parse(issueDateStr, formatter);
    }

    // Method to display the issue details
    public void displayIssueDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("User ID: " + userID);
        System.out.println("Period (Days): " + period);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Return Date: " + issueDate.plusDays(period));
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details
        System.out.print("Enter Book ID: ");
        int bookID = scanner.nextInt();

        System.out.print("Enter User ID: ");
        int userID = scanner.nextInt();

        System.out.print("Enter Period (in days): ");
        int period = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter Issue Date (DD-MM-YYYY): ");
        String issueDate = scanner.nextLine();

        // Create a new Library object with input values
        Library library = new Library(bookID, userID, period, issueDate);

        // Display the book issue details
        System.out.println("\n--- Book Issue Details ---");
        library.displayIssueDetails();

        scanner.close();
    }
}
