package com.example.widad.miniprojetpart1.adapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.widad.miniprojetpart1.Object.Product;
import com.example.widad.miniprojetpart1.R;

import java.util.List;

/**
 * Created by widad on 23/03/2016.
 */
public class ProductAdapter  extends BaseAdapter {
    private Context context;
    private List<Product> productList ;

    public ProductAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return  0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

                if (convertView == null) {
                    convertView = parent.inflate(context, R.layout.list_items, null);
                }
                ImageView coverIcon = (ImageView) convertView.findViewById(R.id.coverIcon);
                TextView textTitle = (TextView) convertView.findViewById(R.id.produit);
                coverIcon.setImageResource(productList.get(position).getIconCover());
                textTitle.setText(productList.get(position).getDetails());
                return  convertView;
            }
}
