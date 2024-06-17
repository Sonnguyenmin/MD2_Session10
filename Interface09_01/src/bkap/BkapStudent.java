package bkap;

import mark.Mark;

import java.util.Comparator;
import java.util.Scanner;


public class BkapStudent extends Mark {
    private String courseName;
	private double scholarShip;

    public BkapStudent() {
    }

    public BkapStudent(String fullName, Boolean gender, String className, float markOfC, float markOfHTML, float markOfSQL, float markOfPHP, String courseName, double scholarShip) {
        super(fullName, gender, className, markOfC, markOfHTML, markOfSQL, markOfPHP);
        this.courseName = courseName;
        this.scholarShip = scholarShip;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getScholarShip() {
        return scholarShip;
    }

    public void setScholarShip(double scholarShip) {
        this.scholarShip = scholarShip;
    }

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.print("Nhập vào tên khóa học: ");
        this.courseName = scanner.nextLine();
        calculateScholarship();
    }

    private void calculateScholarship() {
        if (averageMark() >= 17
                && getMarkOfC() >= 8
                && getMarkOfHTML() >= 8
                && getMarkOfSQL() >= 8
                && getMarkOfPHP() >= 8) {
            this.scholarShip = 3500;
        } else if (averageMark() >= 12 && averageMark() < 17
                && getMarkOfC() >= 8
                && getMarkOfHTML() >= 8
                && getMarkOfSQL() >= 8
                && getMarkOfPHP() >= 8) {
            this.scholarShip = 2500;
        } else {
            this.scholarShip = 0;
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tên khóa học: " + courseName);
        System.out.println("Học bổng: " + scholarShip);
    }
}
