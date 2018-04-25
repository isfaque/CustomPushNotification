package apps.isfaque.com.customnavigationdrawer.fragments.contact;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import apps.isfaque.com.customnavigationdrawer.MainActivity;
import apps.isfaque.com.customnavigationdrawer.R;


/**
 * Created by Mascot on 1/8/2017.
 */
public class ContactFragment extends Fragment {

    TextView sendmail;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contact, container, false);

        ((MainActivity) getActivity()).setActionBarTitle("Contact");

        return v;
    }

}
