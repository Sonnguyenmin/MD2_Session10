package mark;

import java.util.Scanner;

public class Mark implements IMark{
    private String fullName;
	private Boolean gender;
	private String className;
	private float markOfC;
	private float markOfHTML;
	private float markOfSQL;
	private float markOfPHP;

    public Mark() {
    }

    public Mark(String fullName, Boolean gender, String className, float markOfC, float markOfHTML, float markOfSQL, float markOfPHP) {
        this.fullName = fullName;
        this.gender = gender;
        this.className = className;
        this.markOfC = markOfC;
        this.markOfHTML = markOfHTML;
        this.markOfSQL = markOfSQL;
        this.markOfPHP = markOfPHP;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public float getMarkOfC() {
        return markOfC;
    }

    public void setMarkOfC(float markOfC) {
        this.markOfC = markOfC;
    }

    public float getMarkOfHTML() {
        return markOfHTML;
    }

    public void setMarkOfHTML(float markOfHTML) {
        this.markOfHTML = markOfHTML;
    }

    public float getMarkOfSQL() {
        return markOfSQL;
    }

    public void setMarkOfSQL(float markOfSQL) {
        this.markOfSQL = markOfSQL;
    }

    public float getMarkOfPHP() {
        return markOfPHP;
    }

    public void setMarkOfPHP(float markOfPHP) {
        this.markOfPHP = markOfPHP;
    }

    @Override
    public void input(Scanner scanner) {
        System.out.println("Mời nhập vào họ và tên: ");
        this.fullName = scanner.nextLine();
        System.out.println("Mời nhập vào giới tính: (true/false): ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Mời nhập vào tên lớp học: ");
        this.className = scanner.nextLine();
        System.out.println("Mời nhập điểm của ngôn ngữ C : ");
        this.markOfC = Float.parseFloat(scanner.nextLine());
        System.out.println("Mời nhập điểm của ngôn ngữ HTML : ");
        this.markOfHTML = Float.parseFloat(scanner.nextLine());
        System.out.println("Mời nhập điểm của ngôn ngữ SQL : ");
        this.markOfSQL = Float.parseFloat(scanner.nextLine());
        System.out.println("Mời nhập điểm của ngôn ngữ PHP : ");
        this.markOfPHP = Float.parseFloat(scanner.nextLine());
    }

    @Override
    public void display() {
        System.out.println("School name: " + IMark.schoolName);
        System.out.println("\tHọ và tên: " + this.fullName);
        System.out.println("\tGiới tính: " + (this.gender ? "Nam" : "Nu"));
        System.out.println("\tTên lớp học: " + this.className);
        System.out.println("\tĐiểm của ngôn ngữ C: " + this.markOfC);
        System.out.println("\tĐiểm của ngôn ngữ HTML: " + this.markOfHTML);
        System.out.println("\tĐiểm của ngôn ngữ SQL: " + this.markOfSQL);
        System.out.println("\tĐiểm của ngôn ngữ PHP: " + this.markOfPHP);
        System.out.println("\tAverage mark: " + this.averageMark());
    }

    @Override
    public float averageMark() {
        return (this.markOfSQL + this.markOfHTML + this.markOfC + this.markOfHTML) / 4;
    }
}
