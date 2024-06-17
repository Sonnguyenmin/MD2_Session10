package mark;

import java.util.Scanner;

public interface IMark {
    void input(Scanner scanner);
    void display();
    float averageMark();
    static String schoolName = "Rikkei-Academy";
}
