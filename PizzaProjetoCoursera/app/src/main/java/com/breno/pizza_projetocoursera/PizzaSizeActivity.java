package com.breno.pizza_projetocoursera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class PizzaSizeActivity extends AppCompatActivity {
    private ListView pizzaSizeListView;
    public  static   OrderDetails pizza = new OrderDetails();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_size);

        pizzaSizeListView = (ListView) findViewById(R.id.sizelistview);

        pizzaSizeListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Toast.makeText(PizzaSizeActivity.this,"A partir de R$ 10", Toast.LENGTH_SHORT).show();
                }
                if(position == 1){
                    Toast.makeText(PizzaSizeActivity.this,"A partir de R$ 18", Toast.LENGTH_SHORT).show();
                }
                if(position == 2){
                    Toast.makeText(PizzaSizeActivity.this,"A partir de R$ 25", Toast.LENGTH_SHORT).show();
                }
                if(position == 3){
                    Toast.makeText(PizzaSizeActivity.this,"A partir de R$ 50", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

        pizzaSizeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), FlavorsActivity.class);

                if(position == 0){
                    pizza.setSize("Brotinho");
                    pizza.plusSetTotalPrice(10);
                    startActivity(intent);
                }
                if(position == 1){
                    pizza.setSize("Média");
                    pizza.plusSetTotalPrice(18);
                    startActivity(intent);
                }
                if(position == 2){
                    pizza.setSize("Grande");
                    pizza.plusSetTotalPrice(25);
                    startActivity(intent);
                }
                if(position == 3){
                    pizza.setSize("Família");
                    pizza.plusSetTotalPrice(50);
                    startActivity(intent);
                }
            }
        });
    }
}