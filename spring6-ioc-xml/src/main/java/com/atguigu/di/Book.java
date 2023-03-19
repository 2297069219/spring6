package com.atguigu.di;

/**
 * ClassName: Book
 * Package: com.atguigu.di
 * Description:
 *
 * @Author: GuanYuJie
 * @Create:2023/3/19 - 19:38
 * Version: v1.0
 */
public class Book {

    private String bName;
    private String author;
    private String others;

    public Book() {
    }

    public Book(String bName, String author, String others) {
        this.bName = bName;
        this.author = author;
        this.others = others;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public Book(String bName, String author) {
        this.bName = bName;
        this.author = author;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setbName("Java");
        book.setAuthor("ok");

        //构造器注入
        Book book1 = new Book("Java", "kkk");

    }

}
