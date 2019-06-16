package com.street35.booked;

import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.street35.booked.ui.AllBooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    AllBooks allBooksFragment = new AllBooks();
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, allBooksFragment).commit();
                    return true;
                case R.id.navigation_dashboard:
                    //mTextMessage.setText(R.string.title_dashboard);
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, allBooksFragment).commit();
                    return true;
                case R.id.navigation_notifications:
                    //mTextMessage.setText(R.string.title_notifications);
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, allBooksFragment).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        //mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        if(savedInstanceState== null)
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, allBooksFragment).commit();

        else
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, allBooksFragment).commit();

    }

}
