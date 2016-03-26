package com.example.widad.miniprojetpart1.fragment;

import android.support.v4.app.Fragment;
        import android.os.Bundle;
import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
import com.example.widad.miniprojetpart1.Object.Product;
import com.example.widad.miniprojetpart1.R;

/**
 * Created by pc on 04/03/2016.
 */
public class productFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_product,null);
        Bundle bundle = getArguments();
      if (bundle != null) {
          Product product = (Product) bundle.getSerializable("produit");
            ImageView coverImage = (ImageView) v.findViewById(R.id.coverImage);
            TextView textDetails= (TextView) v.findViewById(R.id.detailText);
            ((TextView) v.findViewById(R.id.textView)).setVisibility(v.VISIBLE);
            coverImage.setImageResource(product.getCover());
            textDetails.setText("details of product " + product.getDetails());


       }

        return v;
    }
}





