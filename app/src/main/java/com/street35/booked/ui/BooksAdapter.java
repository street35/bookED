package com.street35.booked.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.street35.booked.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BooksAdapter extends ArrayAdapter<Book> {

    private Context bookContext;
    private List<Book> bookList = new ArrayList<>();

    public BooksAdapter(@NonNull Context context, int resource, @NonNull List<Book> objects) {
        super(context, resource, objects);
        this.bookContext = context;
        this.bookList = objects;
    }
}
