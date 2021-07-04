package com.example.sketsaid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class FragmentArtDisplay extends Fragment {
    TextView fullname, gender, dateOfBirth;

    public FragmentArtDisplay(){
        super(R.layout.fragment_display_art);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display_art, container, false);
        return view;
    }
}
