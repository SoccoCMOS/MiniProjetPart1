package com.example.widad.miniprojetpart1.ViewPack;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import com.example.widad.miniprojetpart1.Object.Product;
import com.example.widad.miniprojetpart1.R;
import android.support.v7.app.AppCompatActivity;

public class ProductActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_product);
        setContentView(R.layout.activity_product);

       /* Configuration config = getResources().getConfiguration();
        if ((config.orientation ==
                Configuration.ORIENTATION_LANDSCAPE)
                &&(config.smallestScreenWidthDp>=600))
        {
            finish();
        }
        else {
            setContentView(R.layout.activity_product);
            Product PD = (Product) getIntent().getSerializableExtra("PRODCUT");
            productFragment detailFragment = new productFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("PRODUCT", PD);
            detailFragment.setArguments(bundle);
          //  FragmentTransaction ft = getFragmentManager().beginTransaction();
            //ft.replace(R.id.frameLayout, detailFragment);
            //ft.commit();


            /*Intent secondeActivite = new Intent(ProductActivity.this,
                    productFragment.class);
            startActivity(secondeActivite);*/
        //}


    }


}
