package apps.isfaque.com.customnavigationdrawer.FCMManager;

import android.util.Log;


import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Mascot on 2/13/2017.
 */
public class FirebaseInstanceIDService extends FirebaseInstanceIdService {



    @Override
    public void onTokenRefresh() {

        String token = FirebaseInstanceId.getInstance().getToken();


    }

}