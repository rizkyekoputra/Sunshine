package api.sunshine;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Rizky Eko Putra on 1/9/2015.
 */
public class Utility {
    public static String getPreferredLocation(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
                return prefs.getString(context.getString(R.string.pref_location_key),
                        context.getString(R.string.pref_location_default));
    }
}
