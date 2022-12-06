package com.example.myapplication;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class UserPage extends AppCompatActivity {
    ImageButton pImage, pImage2, pImage3, pImage4, pImage5, pImage6, pImage7, pImage8, pImage9, pImage10, pImage11, pImage12, pImage13;
    private static final int IMAGE_PICK_CODE = 1000;
    private static final int PERMISSION_CODE = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_page);


        pImage2 = (ImageButton)findViewById(R.id.pImage2);
        pImage3 = (ImageButton)findViewById(R.id.pImage3);
        pImage4 = (ImageButton)findViewById(R.id.pImage4);
        pImage5 = (ImageButton)findViewById(R.id.pImage5);
        pImage6 = (ImageButton)findViewById(R.id.pImage6);
        pImage7 = (ImageButton)findViewById(R.id.pImage7);
        pImage8 = (ImageButton)findViewById(R.id.pImage8);
        pImage9 = (ImageButton)findViewById(R.id.pImage9);
        pImage10 = (ImageButton)findViewById(R.id.pImage10);
        pImage11 = (ImageButton)findViewById(R.id.pImage11);
        pImage12 = (ImageButton)findViewById(R.id.pImage12);
        pImage13 = (ImageButton)findViewById(R.id.pImage13);

        pImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserPage.this, Activity2.class);
                startActivity(i);
                finish();
            }
        });
        pImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserPage.this, Activity3.class);
                startActivity(i);
                finish();
            }
        });
        pImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserPage.this, Activity4.class);
                startActivity(i);
                finish();
            }
        });
        pImage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserPage.this, Activity5.class);
                startActivity(i);
                finish();
            }
        });
        pImage6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserPage.this, Activity6.class);
                startActivity(i);
                finish();
            }
        });
        pImage7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserPage.this, Activity7.class);
                startActivity(i);
                finish();
            }
        });
        pImage8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserPage.this, Activity8.class);
                startActivity(i);
                finish();
            }
        });
        pImage9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserPage.this, Activity9.class);
                startActivity(i);
                finish();
            }
        });
        pImage10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserPage.this, Activity10.class);
                startActivity(i);
                finish();
            }
        });
        pImage11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserPage.this, Activity11.class);
                startActivity(i);
                finish();
            }
        });
        pImage12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserPage.this, Activity12.class);
                startActivity(i);
                finish();
            }
        });
        pImage13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserPage.this, Activity13.class);
                startActivity(i);
                finish();
            }
        });


        //assign image button to profile pic
        pImage = findViewById(R.id.profilepic);

        //deal with user clicking on profile pic
        pImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check runtime permission
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) ==
                            PackageManager.PERMISSION_DENIED) {
                        //permission not granted, so request it from user
                        String[] permissions = {Manifest.permission.READ_EXTERNAL_STORAGE};
                        //shows popup for runtime permission
                        requestPermissions(permissions, PERMISSION_CODE);

                    } else {
                        //permission already granted
                        pickImageFromGallery();
                    }
                } else {
                    //old OS (pre-Marshmallow)
                    pickImageFromGallery();
                }
                Intent iGallery = new Intent(Intent.ACTION_PICK);
                iGallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                activityResultLaunch.launch(iGallery);
            }
        });
    }

    void pickImageFromGallery() {
        //intent to pick an image
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        activityResultLaunch.launch(intent);

    }

    ActivityResultLauncher<Intent> activityResultLaunch = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == RESULT_OK) {
                        // change image
                        pImage.setImageURI(result.getData().getData());
                    } else {
                        //do nothing
                    }
                }
            });

    //handle result of runtime permission
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case PERMISSION_CODE: {
                //if permission is granted
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    pickImageFromGallery();
                } else {
                    Toast.makeText(this, "Permission denied :(", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
