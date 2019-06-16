package com.street35.booked.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.street35.booked.model.Book;

import java.util.List;

public class AllBooksViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<List<Book>> books;

    public MutableLiveData<List<Book>> getBooks() {
        if(books == null) {
            books = new MutableLiveData<List<Book>>();
            loadBooks();
        }
        return books;
    }

    private void loadBooks() {
        // Asynchronous operation to fetch users
    }
}
