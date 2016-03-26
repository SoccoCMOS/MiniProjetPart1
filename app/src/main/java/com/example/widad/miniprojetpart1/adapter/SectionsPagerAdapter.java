package com.example.widad.miniprojetpart1.adapter;



        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentPagerAdapter;

        import com.example.widad.miniprojetpart1.fragment.PlaceholderFragment;

public class SectionsPagerAdapter extends FragmentPagerAdapter {


    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        PlaceholderFragment placeholderFragment = new PlaceholderFragment();
        Bundle bundle =new Bundle();
        bundle.putInt("pos",position);
        placeholderFragment.setArguments(bundle);

        return  placeholderFragment;
    }

    @Override
    public int getCount() {
        return 5;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Clothes";
            case 1:
                return "Shoes";
            case 2:
                return "Accessories";
            case 3:
                return "Glasses";
            case 4:
                 return "Bags";

        }
        return null;
    }

}
