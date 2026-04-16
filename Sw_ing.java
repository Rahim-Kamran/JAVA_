// import javax.swing.*;
// public class Sw_ing {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Swing Example");
//         JButton button = new JButton("Click Me");
//         frame.add(button);
//         button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked!"));
//         frame.setSize(300, 200);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setVisible(true);
        
//     }
// }   


//format dates and times 
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// public class Sw_ing {
//     public static void main(String[] args) {
//         LocalDateTime now = LocalDateTime.now();
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//         String formattedDate = now.format(formatter);
//         System.out.println("Current date and time: " + formattedDate);
//     }
// }

 // to calculate age form the birthday 
import java.time.LocalDate;
import java.time.Period;

public class Sw_ing {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2002, 12, 3);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        System.out.println("Age: " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
    }
}