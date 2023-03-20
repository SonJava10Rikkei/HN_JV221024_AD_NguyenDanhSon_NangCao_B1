package ra.bussinessImp;

import ra.bussiness.IShop;
import java.util.Scanner;

public class Author implements IShop {
    private int authorId;
    private String authorName;
    private Boolean sex;
    private int year;

    public Author() {
    }

    public Author(int authorId, String authorName, Boolean sex, int year) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.sex = sex;
        this.year = year;
    }

    // getter/setter methods
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("- Nhập ID tác giả: ");
        authorId = scanner.nextInt();

        System.out.print("- Nhập tên tác giả: ");
        scanner.nextLine();
        authorName = scanner.nextLine();

        System.out.print("- Nhập giới tính (true là nam, false là nữ): ");
        sex = scanner.nextBoolean();

        System.out.print("- Nhập ngày sinh : ");
        year = scanner.nextInt();

    }

    @Override
    public void displayData() {
        System.out.println("Author{" +
                "authorId=" + this.authorId +
                ", authorName='" + this.authorName + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", sex=" + sex +
                ", year=" + year +
                '}';
    }
}
