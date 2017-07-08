package eureka.com.fragementdemo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import eureka.com.fragementdemo.R;

/**
 * Created by hp on 7/8/2017.
 */

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View myView = inflater.inflate(R.layout.home_fragment,container,false);

        Toast.makeText(getActivity(), "I am Home Fragment", Toast.LENGTH_SHORT).show();
        return myView;
    }
}
