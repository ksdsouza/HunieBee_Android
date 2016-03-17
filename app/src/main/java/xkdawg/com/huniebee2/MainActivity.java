package xkdawg.com.huniebee2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {
    public static int[] num = new int[4];
    public final String PREFS_NAME = "HunieBee2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.appbar);
        loadImageSettings();


    }

    private void loadImageSettings() {
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        String str = settings.getString("imageVals", "075025000000");

        num[0] = Integer.parseInt(str.substring(0, 3));
        num[1] = Integer.parseInt(str.substring(3, 6));
        num[2] = Integer.parseInt(str.substring(6, 9));
        num[3] = Integer.parseInt(str.substring(9, 12));
    }

    public void goToDetail(View v) {
        String id = v.getResources().getResourceName(v.getId());
        Intent intent = new Intent(this, Detail.class);
        intent.putExtra("Person", id);
        startActivity(intent);
    }

    public void goToSettings(View v) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

}
