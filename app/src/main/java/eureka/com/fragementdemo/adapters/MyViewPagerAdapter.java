package eureka.com.fragementdemo.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import eureka.com.fragementdemo.fragments.GalleryFragment;
import eureka.com.fragementdemo.fragments.HomeFragment;

/**
 * Created by hp on 7/8/2017.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0) {
            return new HomeFragment();
        }else if(position == 1) {
            return new HomeFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
