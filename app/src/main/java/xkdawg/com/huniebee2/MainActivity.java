/**
 * Main Activity for HunieBee
 *
 * @since 1.0.0
 */
package xkdawg.com.huniebee2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static int[] num = new int[4];
    public final String PREFS_NAME = "HunieBee2";


    /**
     * On Creation
     * <p/>
     * Set the custom appbar from layout, load detail activity's image probabilities from settings
     *
     * @return void
     * @since 1.0.0
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.appbar);
        loadImageSettings();
    }

    /**
     * Load image settings
     * <p/>
     * Loads image settings from preferences and stored them into an array that the rest of the app can access.
     *
     * @return void
     * @since 1.0.0
     */
    private void loadImageSettings() {
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        String str = settings.getString("imageVals", "075025000000");

        num[0] = Integer.parseInt(str.substring(0, 3));
        num[1] = Integer.parseInt(str.substring(3, 6));
        num[2] = Integer.parseInt(str.substring(6, 9));
        num[3] = Integer.parseInt(str.substring(9, 12));
    }

    /**
     * Go to Settings
     * <p/>
     * When the user taps the settings button, take them to that activity
     *
     * @return void
     * @since 1.0.0
     */
    public void goToSettings(View v) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    /**
     * Go To Detail
     * <p/>
     * When one of the row's is tapped. Send id of the row and launch the detail activity
     *
     * @param v which view called the listener
     * @return void
     * @since 1.0.0
     */
    public void goToDetail(View v) {
        String id = v.getResources().getResourceName(v.getId());
        Util.info("HunieBee", "Id of person selected: " + id);
        Intent intent = new Intent(this, Detail.class);
        intent.putExtra("Person", id);
        startActivity(intent);
    }
}
