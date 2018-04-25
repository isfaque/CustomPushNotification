package apps.isfaque.com.customnavigationdrawer.fragments.about;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import apps.isfaque.com.customnavigationdrawer.MainActivity;
import apps.isfaque.com.customnavigationdrawer.R;


/**
 * Created by Mascot on 2/12/2017.
 */
public class AboutFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_about, container, false);

        ((MainActivity) getActivity()).setActionBarTitle("About");

        return v;
    }


}
