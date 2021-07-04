package com.example.sketsaid.Account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.sketsaid.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class FragmentAccountDetailsContent extends Fragment {
    TextView fullname, gender, dateOfBirth;
    public FragmentAccountDetailsContent(){
        super(R.layout.fragment_account_details);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account_details, container, false);

        fullname = (TextView) view.findViewById(R.id.textFullName);
        gender = (TextView) view.findViewById(R.id.textGender);
        dateOfBirth = (TextView) view.findViewById(R.id.textDateOfBirth);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) fullname.setText(user.getDisplayName());
        return view;
    }
}
