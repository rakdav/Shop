package com.example.shop.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shop.Models.Tovar;
import com.example.shop.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private Context context;
    private List<Tovar> tovars;
    private LayoutInflater inflater;

    public ProductAdapter(Context context, List<Tovar> tovars) {
        this.context = context;
        this.tovars = tovars;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.tovar_items_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Tovar tovar = tovars.get(position);
        holder.imageView.setImageResource(tovar.getPicture());
        holder.nameView.setText(tovar.getName());
        holder.edizmView.setText(tovar.getEdizm());
        holder.priceview.setText(Double.toString(tovar.getPrice()));
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return tovars.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView nameView, edizmView,priceview;
        final CardView cv;
        ViewHolder(View view){
            super(view);
            imageView = (ImageView)view.findViewById(R.id.person_photo);
            nameView = (TextView) view.findViewById(R.id.person_name);
            edizmView = (TextView) view.findViewById(R.id.person_age);
            priceview=view.findViewById(R.id.person_age);
            cv=view.findViewById(R.id.cv);
        }
    }

}
