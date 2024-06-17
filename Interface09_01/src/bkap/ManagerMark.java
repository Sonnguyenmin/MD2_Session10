package bkap;

import java.util.Arrays;
import java.util.Scanner;

public class ManagerMark {
    public static BkapStudent[] bkapStudent;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*********************          Menu             *************************");
            System.out.println("*                                                                       *");
            System.out.println("*  1. Nhập vào n sinh viên và điểm thi của n sinh viên                  *");
            System.out.println("*  2. Hiển thị thông tin vừa nhập                                       *");
            System.out.println("*  3. Sắp xếp và hiển thị thông tin giảm dần theo học bổng nhận được    *");
            System.out.println("*  4. Sắp xếp và hiển thị thông tin tăng dần theo tên lớp               *");
            System.out.println("*  5. Tìm kiếm thông tin sinh viên theo tên lớp                         *");
            System.out.println("*  6. Kết thúc                                                          *");
            System.out.println("*                                                                       *");
            System.out.println("*************************************************************************");
            System.out.println("Lựa chọn chức năng : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    inputStudent(scanner);
                    break;
                case 2:
                    displayListStudent();
                    break;
                case 3:
                    sortScholarShip();
                    break;
                case 4:
                    sortClassName();
                    break;
                case 5:
                    searchClassName(scanner);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng nhập tu 1 - 6");
            }
        } while (true);
    }
    //case 1: nhap n sinh vien
    public static void inputStudent(Scanner scanner) {
        System.out.println("Nhap vao so sinh vien: ");
        int countStudent = Integer.parseInt(scanner.nextLine());
        bkapStudent = new BkapStudent[countStudent];
        for (int i = 0; i < countStudent; i++) {
            System.out.println("Nhap Thông tin sinh vien thu: " +(i+1));
            bkapStudent[i] = new BkapStudent();
            bkapStudent[i].input(scanner);
        }
    }

    //case 2: Hiển thị thông tin vừa nhập
    public static void displayListStudent() {
        System.out.println("\n Thong tin cac sinh vien: ");
        for (BkapStudent student : bkapStudent) {
            student.display();
        }
    }

    //case 3: Sắp xếp và hiển thị thông tin giảm dần theo học bổng nhận được
    public static void sortScholarShip() {
        Arrays.sort(bkapStudent, new StudentScholarShipComparator());
        System.out.println("\n Danh sach Sắp xếp và hiển thị thông tin giảm dần theo học bổng nhận được: ");
        for (BkapStudent student : bkapStudent) {
            student.display();
        }
    }
    //case 4: Sắp xếp và hiển thị thông tin tăng dần theo tên lớp
    public static void sortClassName() {
        Arrays.sort(bkapStudent, new StudentClassNameComparator());
        System.out.println("\n Danh sach Sắp xếp và hiển thị thông tin tăng dần theo tên lớp: ");
        for (BkapStudent student : bkapStudent) {
            student.display();
        }
    }
    //case 5: Tìm kiếm thông tin sinh viên theo tên lớp
    public static void searchClassName(Scanner scanner) {
        System.out.print("Nhập tên khóa học để tìm kiếm: ");
        String courseName = scanner.nextLine();
        boolean found = false;
        System.out.println("Học viên có tên khóa học \"" + courseName + "\":");
        for (BkapStudent student : bkapStudent) {
            if (student.getCourseName().toLowerCase().contains(courseName.toLowerCase())) {
                student.display();
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên nào có tên khóa học \"" + courseName + "\".");
        }
    }
}
