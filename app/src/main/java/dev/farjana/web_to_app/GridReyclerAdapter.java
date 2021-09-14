package dev.farjana.web_to_app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class GridReyclerAdapter extends RecyclerView.Adapter<GridReyclerAdapter.GridRecyclerViewHolder> {

    ArrayList<SiteImages> siteImageArrayList;
    Context recyclerContext;

    Intent intent;


    public GridReyclerAdapter(ArrayList<SiteImages> siteImageArrayList, Context recyclerContext){
        this.siteImageArrayList = siteImageArrayList;
        this.recyclerContext = recyclerContext;
    }

    @NonNull
    @Override
    public GridRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);

       final GridRecyclerViewHolder holder = new GridRecyclerViewHolder(view);

        view.setOnClickListener(view1 -> {

            int position = holder.getAbsoluteAdapterPosition();
            intent = new Intent(parent.getContext(),SplashAct.class);

            intent.putExtra("Url",siteImageArrayList.get(position).getSiteUrl());
            intent.putExtra("ImageId",siteImageArrayList.get(position).getImageSiteId());

            recyclerContext.startActivity(intent);
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final GridReyclerAdapter.GridRecyclerViewHolder holder, int position) {

        SiteImages images = siteImageArrayList.get(position);
        holder.siteImage.setImageResource(images.getImageSiteId());

    }

    @Override
    public int getItemCount() {
        return siteImageArrayList.size();
    }

    public static class GridRecyclerViewHolder extends RecyclerView.ViewHolder {
        private final CircleImageView siteImage;
        public GridRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            siteImage = itemView.findViewById(R.id.image1);

        }
    }
}
