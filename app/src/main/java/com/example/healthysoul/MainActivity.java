package com.example.healthysoul;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerContacts;
    ArrayList<Contact> contactList;
    ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerContacts =
                findViewById(R.id.recyclerContacts);

        contactList = new ArrayList<>();

        contactList.add(new Contact(
                "John Doe",
                "Hey, are we meeting today?",
                "10:30 AM",
                R.drawable.avartar1));

        contactList.add(new Contact(
                "Ama Mensah",
                "Thank you very much.",
                "10:15 AM",
                R.drawable.avartar2));

        contactList.add(new Contact(
                "Kwame Asante",
                "See you tomorrow.",
                "09:45 AM",
                R.drawable.avartar3));

        contactList.add(new Contact(
                "Sarah Wilson",
                "Call me when free.",
                "09:20 AM",
                R.drawable.avartar4));

        contactList.add(new Contact(
                "Michael Brown",
                "Let's finish the project.",
                "Yesterday",
                R.drawable.avartar5));

        contactList.add(new Contact(
                "Grace Boateng",
                "Meeting starts at 2 PM.",
                "Yesterday",
                R.drawable.avartar6));

        contactList.add(new Contact(
                "David Owusu",
                "Check your email.",
                "Monday",
                R.drawable.avartar7));

        contactList.add(new Contact(
                "Esther Mensima",
                "Thanks!",
                "Sunday",
                R.drawable.avartar8));

        contactList.add(new Contact(
                "James Anderson",
                "I'll be there soon.",
                "Saturday",
                R.drawable.avartar9));

        contactList.add(new Contact(
                "Linda Smith",
                "Good morning.",
                "Friday",
                R.drawable.avartar10));

        contactList.add(new Contact(
                "Daniel Mensah",
                "Can we reschedule?",
                "Thursday",
                R.drawable.avartar11));

        contactList.add(new Contact(
                "Patricia Johnson",
                "The report is ready.",
                "Wednesday",
                R.drawable.avartar12));

        adapter = new ContactAdapter(contactList);

        recyclerContacts.setLayoutManager(
                new LinearLayoutManager(this));

        recyclerContacts.setAdapter(adapter);
    }
}