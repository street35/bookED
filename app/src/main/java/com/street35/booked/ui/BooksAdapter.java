package com.street35.booked.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.street35.booked.R;
import com.street35.booked.db.entity.BookEntity;
import com.street35.booked.model.IBook;

import java.util.ArrayList;
import java.util.List;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.BooksViewHolder> {

    private ArrayList<BookEntity> bookEntities = new ArrayList<>();

    @NonNull
    @Override
    public BooksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        BooksViewHolder booksViewHolder = new BooksViewHolder(LayoutInflater.
                from(parent.getContext()).inflate(R.layout.bookslistitem, parent, false));

        return booksViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BooksViewHolder holder, int position) {
        //set data

        BookEntity bookEntity = bookEntities.get(position);
        holder.textViewTitle.setText(bookEntity.getTitle());
        holder.textViewDescription.setText(bookEntity.getPublisher());
    }

    @Override
    public int getItemCount() {
        return bookEntities.size();
    }

    public void setBookEntities(ArrayList<BookEntity> bookEntities) {
        this.bookEntities = bookEntities;
        notifyDataSetChanged(); //TODO : Use better methods
    }

    static class BooksViewHolder extends RecyclerView.ViewHolder  {

        private TextView textViewTitle;
        private TextView textViewDescription;

        BooksViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = (TextView) itemView.findViewById(R.id.text);
            textViewDescription = (TextView) itemView.findViewById(R.id.text2);
        }
    }
}
