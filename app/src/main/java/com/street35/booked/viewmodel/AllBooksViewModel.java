package com.street35.booked.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.street35.booked.db.entity.BookEntity;
import com.street35.booked.model.IBook;

import java.util.ArrayList;
import java.util.List;

public class AllBooksViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<ArrayList<BookEntity>> books;

    public MutableLiveData<ArrayList<BookEntity>> getBooks() {
        if(books == null) {
            books = new MutableLiveData<ArrayList<BookEntity>>();
            loadBooks();
        }
        return books;
    }

    private void loadBooks() {
        // Asynchronous operation to fetch users

        ArrayList<BookEntity> arrayList = new ArrayList<>();
        BookEntity bookEntity = new BookEntity();
        bookEntity.setTitle("Hello");
        bookEntity.setPublisher("Moto");
        bookEntity.setIsbn("123");

        arrayList.add(bookEntity);
        books.setValue(arrayList);

    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
