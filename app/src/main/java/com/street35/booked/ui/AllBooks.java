package com.street35.booked.ui;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.street35.booked.R;
import com.street35.booked.viewmodel.AllBooksViewModel;

public class AllBooks extends Fragment {

    private AllBooksViewModel mViewModel;

    public static AllBooks newInstance() {
        return new AllBooks();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.all_books_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AllBooksViewModel.class);
        // TODO: Use the ViewModel
        mViewModel.getBooks().observe(this, users -> {
            // update UI
        });
    }

}
