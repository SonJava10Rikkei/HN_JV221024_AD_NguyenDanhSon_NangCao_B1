package ra.run;

import ra.bussinessImp.Author;
import ra.bussinessImp.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    public static List<Author> authors = new ArrayList<>();
    public static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập số tác giả và nhập thông tin các tác giả \n" +
                    "2. Nhập số sách và nhập thông tin các sách \n" +
                    "3. Sắp xếp sách theo giá xuất sách tăng dần (Comparable/Comparator) \n" +
                    "4. Tìm kiếm sách theo tên tác giả sách \n" +
                    "5. Thoát ");
            System.out.println("Nhập sự lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("- Số tác giả cần nhập là? ");
                    int numberOfAuthors = Integer.parseInt(sc.nextLine());
                    System.out.println("- Nhập thông tin của tác giả:");
                    for (int i = 0; i < numberOfAuthors; i++) {
                        System.out.println("- Nhập thông tin của tác giả thứ " + (i + 1) + " :");
                        authors.add(new Author());
                        authors.get(i).inputData();
                    }
                    break;
                case 2:
                    System.out.println("- Nhập số lượng sách!");
                    int numberOfBook = Integer.parseInt(sc.nextLine());
                    System.out.println("- Nhập thông tin của sách");
                    for (int i = 0; i < numberOfBook; i++) {
                        System.out.println("- Nhập thông tin của sách thứ " + (i + 1) + " :");
                        books.add(new Book());
                        books.get(i).inputData();
                    }
                    break;
                case 3:
                    Collections.sort(books);
                    break;
                case 4:
                    System.out.println("Nhập tên-tác giả sách cần tìm :");
                    String findNameAuthor = sc.nextLine();
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getAuthor().contains(findNameAuthor))
                            books.get(i).displayData();
                    }
                    break;
                case 5:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Mời bạn nhập lại lựa chọn từ (1-5)");
            }
        } while (choice != 0);
    }
}