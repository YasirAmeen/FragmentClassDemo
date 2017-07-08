package eureka.com.fragementdemo.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import eureka.com.fragementdemo.R;
import eureka.com.fragementdemo.adapters.MyViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.myViewpager);
        pager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager()));



    }
}
