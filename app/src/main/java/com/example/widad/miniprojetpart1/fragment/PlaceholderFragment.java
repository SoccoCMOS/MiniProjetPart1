package com.example.widad.miniprojetpart1.fragment;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.widad.miniprojetpart1.Object.Product;
import com.example.widad.miniprojetpart1.R;
import com.example.widad.miniprojetpart1.ViewPack.ProductActivity;
import com.example.widad.miniprojetpart1.adapter.ProductAdapter;

import java.util.ArrayList;
import java.util.List;

/*********
 *  cette  classe  represente le modele de fragement d'un seule tab
 *
 *
 * ***********/

public class PlaceholderFragment extends Fragment {
    ListView listView ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categories,container,false);

        int i = getArguments().getInt("pos");
        if(i==0){
            listView = (ListView) view.findViewById(R.id.listView);
            ProductAdapter pa = new ProductAdapter (getActivity(),getProductList());
            listView.setAdapter(pa);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    showView((Product) listView.getAdapter().getItem(position));
                }
            });
        }

        if(i==1){
            listView = (ListView) view.findViewById(R.id.listView);
            ProductAdapter  pa = new ProductAdapter (getActivity(),getProductList());
            listView.setAdapter(pa);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    showView((Product) listView.getAdapter().getItem(position));
                }
            });
        }

        if(i==2){
            listView = (ListView) view.findViewById(R.id.listView);
            ProductAdapter  pa = new ProductAdapter (getActivity(),getProductList());
            listView.setAdapter(pa);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    showView((Product) listView.getAdapter().getItem(position));
                }
            });
        }

        if(i==3){
             listView = (ListView) view.findViewById(R.id.listView);
            ProductAdapter  pa = new ProductAdapter (getActivity(),getProductList());
            listView.setAdapter(pa);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    showView((Product) listView.getAdapter().getItem(position));
                }
            });
        }

        if(i==4){
            listView = (ListView) view.findViewById(R.id.listView);
            ProductAdapter  pa = new ProductAdapter (getActivity(),getProductList());
            listView.setAdapter(pa);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    showView((Product) listView.getAdapter().getItem(position));
                }
            });        }
        return view;
    }



    public List<Product> getProductList() {

        List<Product> pdList = new ArrayList<Product>();
        // le 1er produit
        Product pd = new Product();
        pd.setDetails(" bala bla bla bla produit 1");
        pd.setIconCover(R.drawable.ic_sqlpc);
        pd.setCover(R.drawable.ic_sqlpc);
        pdList.add(pd);
       
        // le 2eme produit
        pd = new Product();
        pd.setDetails(" bala bla bla bla produit 2");
        pd.setIconCover(R.drawable.ic_sqlpc);
        pd.setCover(R.drawable.ic_sqlpc);
        pdList.add(pd);
        // le 3eme produit
        pd = new Product();
        pd.setDetails(" bala bla bla bla produit 3");
        pd.setIconCover(R.drawable.ic_sqlpc);
        pd.setCover(R.drawable.ic_sqlpc);
        pdList.add(pd);
        // le 4ème produit
        pd = new Product();
        pd.setDetails(" bala bla bla bla produit 4");
        pd.setIconCover(R.drawable.ic_sqlpc);
        pd.setCover(R.drawable.ic_sqlpc);
        pdList.add(pd);
        // le 5ème produit
        pd = new Product();
        pd.setDetails(" bala bla bla bla produit 5");
        pd.setIconCover(R.drawable.ic_sqlpc);
        pd.setCover(R.drawable.ic_sqlpc);
        pdList.add(pd);
        // le 6 ème produit
        pd = new Product();
        pd.setDetails(" bala bla bla bla produit 6");
        pd.setIconCover(R.drawable.ic_sqlpc);
        pd.setCover(R.drawable.ic_sqlpc);
        pdList.add(pd);
        // le 7 ème produit
        return pdList;
    }

    public boolean isTwoPane() {

        View v  = getActivity().findViewById(R.id.frameLayout);
        return (v!=null);

    }

    public void showView (Product pd) {
        if (isTwoPane()) {
            productFragment detailFragment = new productFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("PRODUCT", pd);
            detailFragment.setArguments(bundle);
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.frameLayout,detailFragment);
            ft.commit();

        }
        else {
            Intent intent = new Intent(getActivity(),ProductActivity.class);
            intent.putExtra("PRODUCT",pd);
            startActivity(intent);
        }

    }


}
