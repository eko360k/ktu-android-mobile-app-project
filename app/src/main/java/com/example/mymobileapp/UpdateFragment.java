package com.example.mymobileapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class UpdateFragment extends Fragment {

    Button btn_explore, btn_explore_more;
    FloatingActionButton btn_edit, btn_add_photo;

    com.google.android.material.card.MaterialCardView siv_image1;

    com.google.android.material.imageview.ShapeableImageView siv_image2, siv_image3, siv_image4, siv_image5, siv_image6, siv_image7, siv_image8;

    public UpdateFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update, container, false);

        // Now findViewById on the view, not the fragment
        btn_explore = view.findViewById(R.id.btn_explore);
        btn_edit = view.findViewById(R.id.btn_edit);
        btn_add_photo = view.findViewById(R.id.btn_add_photo);
        siv_image1 = view.findViewById(R.id.siv_image1);
        siv_image2 = view.findViewById(R.id.siv_image2);
        siv_image3 = view.findViewById(R.id.siv_image3);
        siv_image4 = view.findViewById(R.id.siv_image4);
        siv_image5 = view.findViewById(R.id.siv_image5);
        siv_image6 = view.findViewById(R.id.siv_image6);
        siv_image7 = view.findViewById(R.id.siv_image7);
        siv_image8 = view.findViewById(R.id.siv_image8);
        btn_explore_more = view.findViewById(R.id.btn_explore_more);

        btn_explore.setOnClickListener(v -> {
            Intent i = new Intent(requireActivity(), ExploreChannels.class);
            startActivity(i);
        });

        btn_edit.setOnClickListener(v -> {
            Intent i = new Intent(requireActivity(), EditStat.class);
            startActivity(i);
        });

        btn_add_photo.setOnClickListener(v -> {
            Intent i = new Intent(requireActivity(), UploadMedia.class);
            startActivity(i);
        });

        siv_image1.setOnClickListener(v -> {
            Intent i = new Intent(requireActivity(), UploadMedia.class);
            startActivity(i);
        });

        btn_explore_more.setOnClickListener(v -> {
            Intent i = new Intent(requireActivity(), ExploreChannels.class);
            startActivity(i);
        });

        //for stat open
        siv_image2.setOnClickListener(v -> openStatus(R.drawable.him));
        siv_image3.setOnClickListener(v -> openStatus(R.drawable.supes));
        siv_image4.setOnClickListener(v -> openStatus(R.drawable.becca));
        siv_image5.setOnClickListener(v -> openStatus(R.drawable.luffy));
        siv_image6.setOnClickListener(v -> openStatus(R.drawable.becca_guns));
        siv_image7.setOnClickListener(v -> openStatus(R.drawable.peak));
        siv_image8.setOnClickListener(v -> openStatus(R.drawable.shaula));

        return view;
    }

    private void openStatus(int drawableId) {
        Intent i = new Intent(requireActivity(), com.example.mymobileapp.StatusViewActivity.class);
        i.putExtra("resId", drawableId);
        startActivity(i);
    }}