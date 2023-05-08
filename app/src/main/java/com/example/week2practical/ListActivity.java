package com.example.week2practical;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;
import com.example.week2practical.User;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Random random = new Random();
        ArrayList<User> Users20 = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            Users20.add(new User("Name" + random.nextInt(), "Description" + random.nextInt(), random.nextInt(), random.nextBoolean()));
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(ListActivity.this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(new Adapter(getApplicationContext(), Users20));

        /*ImageView imgButton = findViewById(R.id.imageView2);
        imgButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                new AlertDialog.Builder(ListActivity.this)
                        .setTitle("Profile")
                        .setMessage("MADness")
                        .setPositiveButton("VIEW", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                                Random random = new Random();
                                int randInt = random.nextInt();

                                Intent startMain = new Intent(ListActivity.this, MainActivity.class);
                                startMain.putExtra("randIntKey", randInt);
                                startActivity(startMain);
                            }
                        })
                        .setNegativeButton("CLOSE", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){

                            }
                        })
                        .show();
            }
        }); */
    }
}