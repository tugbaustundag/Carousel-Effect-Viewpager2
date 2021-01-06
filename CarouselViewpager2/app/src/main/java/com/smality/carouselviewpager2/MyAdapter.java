package com.smality.carouselviewpager2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    public MyAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    //Kullanılacak arayüz xml dosyasını çağırıyoruz
        View view = LayoutInflater.from(context).inflate(R.layout.row_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    //ViewPager2 widget'da gösterilecek resimlerimizi ImageView nesneni yüklüyorüz.
        int images[]={R.drawable.nature1,R.drawable.nature2,R.drawable.nature3,R.drawable.nature4};
        holder.imgBanner.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return 4;
    }
    //ViewPager2 widget içinde kullanacağımız ImageView nesneni tanımlıyoruz
    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgBanner;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBanner = itemView.findViewById(R.id.imgBanner);
        }
    }
}
