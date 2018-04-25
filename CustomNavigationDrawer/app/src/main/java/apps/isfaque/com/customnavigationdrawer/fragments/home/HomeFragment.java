package apps.isfaque.com.customnavigationdrawer.fragments.home;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import apps.isfaque.com.customnavigationdrawer.MainActivity;
import apps.isfaque.com.customnavigationdrawer.R;

/**
 * Created by Mascot on 1/8/2017.
 */
public class HomeFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        ((MainActivity) getActivity()).setActionBarTitle("Home");


        return v;
    }


}
