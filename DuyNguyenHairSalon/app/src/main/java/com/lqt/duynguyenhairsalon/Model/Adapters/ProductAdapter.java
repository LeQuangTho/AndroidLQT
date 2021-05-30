package com.lqt.duynguyenhairsalon.Model.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lqt.duynguyenhairsalon.Model.ProductDuyNguyenHairSalon;
import com.lqt.duynguyenhairsalon.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder> {
    private Context context;
    private List<ProductDuyNguyenHairSalon> productList;
    private View view;

    public ProductAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<ProductDuyNguyenHairSalon> productList) {
        this.productList = productList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.item_product, parent, false);
        return new ProductHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {
        ProductDuyNguyenHairSalon product = productList.get(position);
        if(product == null){
            return;
        }

        holder.imageViewProduct.setImageResource(R.drawable.sp_demo);
        holder.textViewNameProduct.setText("" + product.getName_Product());
        holder.textViewPriceProduct.setText("đ " + product.getPrice_Produce()/1000 + ".000");
    }

    @Override
    public int getItemCount() {
        if (productList != null) {
            return productList.size();
        }
        return 0;
    }

    public class ProductHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewProduct;
        private TextView textViewNameProduct, textViewPriceProduct;

        public ProductHolder(@NonNull View itemView) {
            super(itemView);
            imageViewProduct = (ImageView) itemView.findViewById(R.id.imageView_Product);
            textViewNameProduct = (TextView) itemView.findViewById(R.id.textView_NameProduct);
            textViewPriceProduct = (TextView) itemView.findViewById(R.id.textView_PriceProduct);
        }
    }
}