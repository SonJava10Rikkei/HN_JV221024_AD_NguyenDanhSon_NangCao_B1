package ra.bussinessImp;

import ra.bussiness.IShop;
import ra.run.BookManagement;

import java.util.Scanner;

public class Book implements IShop, Comparable<Book> {
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private String author;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private boolean bookStatus;


    public Book() {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }


    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập ID của sách:");
        this.bookId = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên sách:");
        this.bookName = sc.nextLine();

        System.out.println("Nhập tiêu đề của sách:");
        this.title = sc.nextLine();

        System.out.println("Nhập số trang sách:");
        this.numberOfPages = Integer.parseInt(sc.nextLine());

        System.out.println("Giá nhập của sách: ");
        this.importPrice = Float.parseFloat(sc.nextLine());

        System.out.println("Nhập số lượng sách: ");
        this.quantity = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập trạng thái sách: ");
        this.bookStatus = Boolean.parseBoolean(sc.nextLine());

        this.exportPrice = importPrice * RATE;

        //Chon tac gia:
        System.out.println("Vui long chon tac gia theo STT:");
        for (int i = 0; i < BookManagement.authors.size(); i++) {
            System.out.println(i + 1 + ". " + BookManagement.authors.get(i).getAuthorName());
        }
        int choice = Integer.parseInt(sc.nextLine());
        this.author = BookManagement.authors.get(choice - 1).getAuthorName();
    }


    @Override
    public void displayData() {
        System.out.println("Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", quantity=" + quantity +
                ", bookStatus=" + bookStatus +
                '}');
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "bookId=" + bookId +
//                ", bookName='" + bookName + '\'' +
//                ", title='" + title + '\'' +
//                ", numberOfPages=" + numberOfPages +
//                ", author='" + author + '\'' +
//                ", importPrice=" + importPrice +
//                ", exportPrice=" + exportPrice +
//                ", quantity=" + quantity +
//                ", bookStatus=" + bookStatus +
//                '}';
//    }

    @Override
    public int compareTo(Book o) {
        return (int) (this.exportPrice - o.exportPrice);
    }
}
