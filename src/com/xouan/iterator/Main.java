package com.xouan.iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("java核心技术"));
        bookShelf.addBook(new Book("java编程的逻辑"));
        bookShelf.addBook(new Book("图解设计模式"));
        bookShelf.addBook(new Book("计算机网络"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
