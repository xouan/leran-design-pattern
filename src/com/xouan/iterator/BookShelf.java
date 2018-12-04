package com.xouan.iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate{
    private ArrayList<Book> books;
    private int size = 0;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public void addBook(Book book) {
        this.books.add(book);
        size++;
    }

    public int size() {
        return size;
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
