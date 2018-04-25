package apps.isfaque.com.customnavigationdrawer.fragments.skill;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import apps.isfaque.com.customnavigationdrawer.MainActivity;
import apps.isfaque.com.customnavigationdrawer.R;

/**
 * Created by apps2 on 4/16/2018.
 */
public class SkillFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.skill_layout, container, false);

        ((MainActivity) getActivity()).setActionBarTitle("Home");


        return v;
    }

}
