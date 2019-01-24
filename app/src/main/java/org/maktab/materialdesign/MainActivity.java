package org.maktab.materialdesign;

import android.content.Intent;
import com.google.android.material.button.MaterialButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MaterialButton partOne;
    private MaterialButton partTwo;
    private MaterialButton partTree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        partOne=findViewById(R.id.btn_pat_1);
        partTwo=findViewById(R.id.btn_pat_2);
        partTree=findViewById(R.id.btn_pat_3);

        partOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,PartOneActivity.class);
                startActivity(intent);
            }
        });

        partTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,PartTwoActivity.class);
                startActivity(intent);
            }
        });

        partTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,PartTreeActivity.class);
                startActivity(intent);
            }
        });


    }


}
