package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText itemEt;
    private Button btn;
    private ListView itemlist;

    private ArrayList<String> items;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemEt=findViewById(R.id.edit);
        btn=findViewById(R.id.add_btn);
       itemlist= findViewById(R.id.list);

       btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.add_btn:
                String ItemEntered = itemEt.getText().toString();
                adapter.add(ItemEntered);
                itemEt.setText("");

                Toast.  makeText(this, "Item added", Toast.LENGTH_SHORT).show();


                        break;
        }
    }
}
