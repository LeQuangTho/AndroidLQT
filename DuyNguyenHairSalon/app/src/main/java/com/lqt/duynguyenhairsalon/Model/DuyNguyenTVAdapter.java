package com.lqt.duynguyenhairsalon.Model;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lqt.duynguyenhairsalon.Activities.LoadWebViewActivity;
import com.lqt.duynguyenhairsalon.R;

import java.util.List;

/*
 * Đây là adapter ở trong fragmenthome
 * */
public class DuyNguyenTVAdapter extends RecyclerView.Adapter<DuyNguyenTVAdapter.DuyNguyenTVViewHolder> {
    private List<DuyNguyenTV> mDuyNguyenTV;
    private Context context;

    public DuyNguyenTVAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<DuyNguyenTV> list) {
        this.mDuyNguyenTV = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DuyNguyenTVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_duy_nguyen_tv, parent, false);
        return new DuyNguyenTVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DuyNguyenTVViewHolder holder, int position) {
        DuyNguyenTV duyNguyenTV = mDuyNguyenTV.get(position);
        if (duyNguyenTV == null) {
            return;
        }
        holder.imageViewDuyNguyenTV.setImageResource(duyNguyenTV.getResourceID());
    }

    @Override
    public int getItemCount() {
        if (mDuyNguyenTV != null) return mDuyNguyenTV.size();
        return 0;
    }

    public class DuyNguyenTVViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewDuyNguyenTV;

        public DuyNguyenTVViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewDuyNguyenTV = (ImageView) itemView.findViewById(R.id.imageViewDuyNguyenTV);
            imageViewDuyNguyenTV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, LoadWebViewActivity.class);
                    context.startActivity(intent);
                    Toast.makeText(context, "Load Web", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}