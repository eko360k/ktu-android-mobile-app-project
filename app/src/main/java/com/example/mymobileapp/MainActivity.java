package com.example.mymobileapp;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0);
            return insets;
        });

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new ChatsFragment()).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                if (item.getItemId() == R.id.chats) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new ChatsFragment()).commit();
                    return true;
                } else if (item.getItemId() == R.id.updates) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new UpdateFragment()).commit();
                    return true;
                } else if (item.getItemId() == R.id.calls) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new CallsFragment()).commit();
                    return true;
                } else if (item.getItemId() == R.id.communities) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new CommunitiesFragment()).commit();
                    return true;
                }
                return false;
            }
        });
    }
}

