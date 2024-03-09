import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegisterButtonListener implements ActionListener {
    private final StudentWindow studentWindow;
    private final ArrayList<String> studentsRegistered;
    private static final int MAX_REGISTRATIONS = 3;

    public RegisterButtonListener(StudentWindow studentWindow) {
        this.studentWindow = studentWindow;
        this.studentsRegistered = new ArrayList<>();
    }

    @Override // to ensure that the method is overriding the superclass
    public void actionPerformed(ActionEvent e) {
        String firstName = studentWindow.getFirstName();
        String lastName = studentWindow.getLastName();

        if (!firstName.isEmpty() && !lastName.isEmpty()) {
            if (studentsRegistered.size() < MAX_REGISTRATIONS) {
                // Record the registration
                studentsRegistered.add(firstName + " " + lastName + "\n");
                studentWindow.clearData();
                studentWindow.setOutputText(getRegisteredStudentsAsString());
            } 
            else {
                studentWindow.setOutputText(getRegisteredStudentsAsString() + "REGISTRATION IF FULL");
            }
        } 
        else {
            studentWindow.setOutputText("Please enter first name and last name alone");
        }
    }

    public String getRegisteredStudentsAsString() {
        String ans = "Registered students: " + studentsRegistered.size() + "\n";
        for (String student : studentsRegistered)
            ans += student;
        return ans;
    }

    public ArrayList<String> getRegisteredStudents() {
        return this.studentsRegistered;
    }
}