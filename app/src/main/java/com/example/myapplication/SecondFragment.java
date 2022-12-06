package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(view1 -> NavHostFragment.findNavController(SecondFragment.this)
                .navigate(R.id.action_SecondFragment_to_FirstFragment));

        binding.buttonFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchUp = new Intent((Context)getActivity(),UserPage.class);
                startActivity(launchUp);
            }
        });

        binding.checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String bListItem = binding.checkBox1.getText().toString();
                if (b) {
                    bListItem = bListItem + " Complete!";
                    Toast myToast = Toast.makeText(getActivity(), bListItem , Toast.LENGTH_SHORT);
                    myToast.show();
                }

            }
        });


        binding.checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String bListItem = binding.checkBox2.getText().toString();
                if (b) {
                    bListItem = bListItem + " Complete!";
                    Toast myToast = Toast.makeText(getActivity(), bListItem , Toast.LENGTH_SHORT);
                    myToast.show();
                }

            }
        });



        binding.checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String bListItem = binding.checkBox3.getText().toString();
                if (b) {
                    bListItem = bListItem + " Complete!";
                    Toast myToast = Toast.makeText(getActivity(), bListItem , Toast.LENGTH_SHORT);
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