import java.awt.event.*;
//Part 2 Task 2
public class ClearButtonListener implements ActionListener{
    private StudentWindow studentWindow;

    public ClearButtonListener(StudentWindow studentWindow) {
        this.studentWindow = studentWindow;
    }

    public void actionPerformed(ActionEvent event) {
        studentWindow.clearData();
    }
}