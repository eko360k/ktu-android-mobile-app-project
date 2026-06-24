package com.example.myfirstapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    /**
     * MainActivity is the primary entry point of the application.
     * It sets up the Edge-to-Edge display, binds layout components,
     * initializes the GridView with a custom adapter, and handles action button events.
     */

    // ExpandableGridView component to display the list of items
    private ExpandableGridView gridView;

    // Action button using the custom gradient background
    private Button btnExploreMore;

    // Search button to open the SearchFragment
    private ImageButton btnOpenSearch;

    // Declare the variable for the More Options button
    private ImageButton btnMoreOptions;

        // List of drawable resource IDs for the items in the grid
        private final int[] images = {
                R.drawable.dweeb,
                R.drawable.gencraft,
                R.drawable.shady,
                R.drawable.trio_geng,
                R.drawable.flowers,
                R.drawable.freddy,
                R.drawable.zine,
                R.drawable.drssed
        };

        // Names corresponding to the items in the grid
        private final String[] names = {
                "Dweeb",
                "Gencraft",
                "Shady",
                "Trio Gang",
                "Flowers",
                "Five Night's",
                "Zine",
                "Drssed"
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // Enable edge-to-edge layout styling
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);

            // Handle window insets for device compatibility (notch, status bar, navigation bar)
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0);
                return insets;
            });

            // Find grid view reference and assign custom adapter
            gridView = findViewById(R.id.grid_view);
            MyAdapter myAdapter = new MyAdapter(MainActivity.this, images, names);
            gridView.setAdapter(myAdapter);

            // Bind the gradient action button and handle its click events
            btnExploreMore = findViewById(R.id.btn_explore_more);
            btnExploreMore.setOnClickListener(v -> {
                // Show a simple confirmation toast to the user
                Toast.makeText(MainActivity.this, "Loading more items...", Toast.LENGTH_SHORT).show();
            });

            // SEARCH LOGIC
            btnOpenSearch = findViewById(R.id.search_button);
            btnOpenSearch.setOnClickListener(v -> {
                // Open the Search Fragment on top of the current screen
                getSupportFragmentManager().beginTransaction()
                        .add(android.R.id.content, new SearchFragment())
                        .addToBackStack(null) // Allows the back button to close it
                        .commit();
            });

            // Initialize the button
            btnMoreOptions = findViewById(R.id.three_dot);

            // Set the click listener to show the dropdown menu
            btnMoreOptions.setOnClickListener(v -> {
                // Create a PopupMenu anchored directly to the three-dot button view (v)
                PopupMenu popup = new PopupMenu(MainActivity.this, v);

                // Inflate our menu resource layout into the PopupMenu
                popup.getMenuInflater().inflate(R.menu.more_options, popup.getMenu());

                // Handle frontend item clicks visually
                popup.setOnMenuItemClickListener(item -> {
                    int id = item.getItemId();
                    if (id == R.id.menu_shop) {
                        Toast.makeText(MainActivity.this, "Shop opened", Toast.LENGTH_SHORT).show();
                        return true;
                    } else if (id == R.id.menu_category) {
                        Toast.makeText(MainActivity.this, "Category details displayed", Toast.LENGTH_SHORT).show();
                        return true;
                    } else if (id == R.id.menu_entry) {
                        Toast.makeText(MainActivity.this, "Opens a random book", Toast.LENGTH_SHORT).show();
                        return true;
                    }
                    return false;
                });

                // Make the menu appear on screen
                popup.show();
            });
        }
}