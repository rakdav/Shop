package com.example.shop.Controllers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.shop.Models.Tovar;
import com.example.shop.R;
import com.example.shop.adapters.ProductAdapter;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {
    private RecyclerView productRV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        setTitle(R.string.tovars);
        productRV=findViewById(R.id.productRV);
        List<Tovar> tovars=new ArrayList<Tovar>();
        tovars.add(new Tovar(R.drawable.android,"Bred","dsfdsfdsfdsfssf",45,0,"шт."));
        tovars.add(new Tovar(R.drawable.android,"Bred","dsfdsfdsfdsfssf",45,0,"шт."));
        ProductAdapter adapter = new ProductAdapter(this,tovars);
        // устанавливаем для списка адаптер
        productRV.setAdapter(adapter);
    }
}