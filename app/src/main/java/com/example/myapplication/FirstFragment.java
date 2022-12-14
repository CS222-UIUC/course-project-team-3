package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    EditText usernameT;
    EditText passwordT;
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // View fragmentFirstLayout = inflater.inflate(R.layout.fragment_first, container, false);
        // usernameT = (EditText) fragmentFirstLayout.findViewById(R.id.username_box);
        // passwordT = (EditText) fragmentFirstLayout.findViewById(R.id.password_box);
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = binding.usernameBox.getText().toString();
                String password = binding.passwordBox.getText().toString();
                Log.d("debug", username);
                Log.d("debug", password);
                if (username.equals("CS222User") && password.equals("CS222Password")) {
                    NavHostFragment.findNavController(FirstFragment.this)
                            .navigate(R.id.action_FirstFragment_to_SecondFragment);
                } else {
                    Toast myToast = Toast.makeText(getActivity(), "Wrong Username or Password", Toast.LENGTH_SHORT);
                    myToast.show();
                }
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



}