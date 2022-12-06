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
    int count = 6;
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
                Intent launchUp = new Intent(getActivity(),UserPage.class);
                startActivity(launchUp);
            }
        });


        binding.Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = binding.editItemNumber.getText().toString();
                int num = 0;
                String item = binding.editItemName.getText().toString();
                if (number.isEmpty()) {
                    Toast myToast = Toast.makeText(getActivity(), "You need to put in a number!", Toast.LENGTH_SHORT);
                    myToast.show();
                } else {
                    num = Integer.parseInt(number);
                    if (num > count) {
                        Toast myToast = Toast.makeText(getActivity(), "That item doesn't exist right now!", Toast.LENGTH_SHORT);
                        myToast.show();
                    } else if ("".equals(item)) {
                        Toast myToast = Toast.makeText(getActivity(), "You need to put in an item!", Toast.LENGTH_SHORT);
                        myToast.show();
                    } else {
                        Log.d("debug", String.valueOf(count));
                        if (num == 1) {
                            binding.checkBox1.setText(item);
                        } else if (num == 2) {
                            binding.checkBox2.setText(item);
                        } else if (num == 3) {
                            binding.checkBox3.setText(item);
                        } else if (num == 4) {
                            binding.checkBox4.setText(item);
                        } else if (num == 5) {
                            binding.checkBox5.setText(item);
                        } else if (num == 6) {
                            binding.checkBox6.setText(item);
                        }
                    }
                }

            }
        });

        binding.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == 6) {
                    Toast myToast = Toast.makeText(getActivity(), "The maximum amount of items is 6", Toast.LENGTH_SHORT);
                    myToast.show();
                } else {
                    if (count == 1) {
                        binding.checkBox2.setVisibility(View.VISIBLE);
                        count = count + 1;
                    } else if (count == 2) {
                        binding.checkBox3.setVisibility(View.VISIBLE);
                        count = count + 1;
                    } else if (count == 3) {
                        binding.checkBox4.setVisibility(View.VISIBLE);
                        count = count + 1;
                    } else if (count == 4) {
                        binding.checkBox5.setVisibility(View.VISIBLE);
                        count = count + 1;
                    } else if (count == 5) {
                        binding.checkBox6.setVisibility(View.VISIBLE);
                        count = count + 1;
                    }
                }

            }
        });

        binding.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == 1) {
                    Toast myToast = Toast.makeText(getActivity(), "The minimum amount of items is 1", Toast.LENGTH_SHORT);
                    myToast.show();
                } else {
                    if (count == 2) {
                        binding.checkBox2.setVisibility(View.INVISIBLE);
                        binding.checkBox2.setText("N/A");
                        count = count - 1;
                    } else if (count == 3) {
                        binding.checkBox3.setVisibility(View.INVISIBLE);
                        binding.checkBox3.setText("N/A");
                        count = count - 1;
                    } else if (count == 4) {
                        binding.checkBox4.setVisibility(View.INVISIBLE);
                        binding.checkBox4.setText("N/A");
                        count = count - 1;
                    } else if (count == 5) {
                        binding.checkBox5.setVisibility(View.INVISIBLE);
                        binding.checkBox5.setText("N/A");
                        count = count - 1;
                    } else if (count == 6) {
                        binding.checkBox6.setVisibility(View.INVISIBLE);
                        binding.checkBox6.setText("N/A");
                        count = count - 1;
                    }
                }
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

        binding.checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String bListItem = binding.checkBox4.getText().toString();
                if (b) {
                    bListItem = bListItem + " Complete!";
                    Toast myToast = Toast.makeText(getActivity(), bListItem , Toast.LENGTH_SHORT);
                    myToast.show();
                }

            }
        });
        binding.checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String bListItem = binding.checkBox5.getText().toString();
                if (b) {
                    bListItem = bListItem + " Complete!";
                    Toast myToast = Toast.makeText(getActivity(), bListItem , Toast.LENGTH_SHORT);
                    myToast.show();
                }

            }
        });
        binding.checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String bListItem = binding.checkBox6.getText().toString();
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