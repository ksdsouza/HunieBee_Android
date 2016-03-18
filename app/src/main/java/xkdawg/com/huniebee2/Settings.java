/**
 * Settings Activity for HunieBee
 *
 * @since 1.0.0
 */
package xkdawg.com.huniebee2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class Settings extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private SeekBar[] sb = new SeekBar[4];
    public final String PREFS_NAME = "HunieBee2";
    private TextView[] tv = new TextView[4];

    /**
     * On Creation
     *
     * Load toolbar, and floating action button(save button), and each seekbar and textview for
     * each image's appearance probability.
     *
     * Set an onChangeListener to each slider, and set initial progress to whatever was saved in
     * preference file(or 75,25,0,0 by default)
     *
     * @since 1.0.0
     * @return void
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab3);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savePrefs();
                Snackbar.make(view, "Saved", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        sb[0] = (SeekBar) findViewById(R.id.seek1);
        sb[1] = (SeekBar) findViewById(R.id.seek2);
        sb[2] = (SeekBar) findViewById(R.id.seek3);
        sb[3] = (SeekBar) findViewById(R.id.seek4);

        tv[0] = (TextView) findViewById(R.id.val1);
        tv[1] = (TextView) findViewById(R.id.val2);
        tv[2] = (TextView) findViewById(R.id.val3);
        tv[3] = (TextView) findViewById(R.id.val4);

        for (int i = 0; i < 4; i++) {
            sb[i].setOnSeekBarChangeListener(this);
            sb[i].setProgress(MainActivity.num[i]);
            tv[i].setText("" + MainActivity.num[i]);
        }
    }

    /**
     * On Progress Change
     *
     * Determine which seekbar moved, and update it's textview based on the seekbar's progress.
     *
     * @since 1.0.0
     * @return void
     */
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        switch (seekBar.getId()) {
            case R.id.seek1:
                Util.info("HunieBee2", "" + sb[0].getProgress());
                tv[0].setText("" + seekBar.getProgress());
                break;

            case R.id.seek2:
                Util.info("HunieBee2", "" + sb[1].getProgress());
                tv[1].setText("" + seekBar.getProgress());
                break;

            case R.id.seek3:
                Util.info("HunieBee2", "" + sb[2].getProgress());
                tv[2].setText("" + seekBar.getProgress());
                break;

            default:
                Util.info("HunieBee2", "" + sb[3].getProgress());
                tv[3].setText("" + seekBar.getProgress());
                break;
        }
    }

    /**
     * On StartTrackingTouch
     *
     * Does nothing. Necessary method when implementing onProgressChanged
     * @since 1.0.0
     * @return void
     */
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    /**
     * On onStopTrackingTouch
     *
     * Does nothing. Necessary method when implementing onProgressChanged
     * @since 1.0.0
     * @return void
     */
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    /**
     * Save Preferences
     *
     * When user presses the floating action bar, edit shared preferences, and save settings under the appName.
     * Then, load these preferences as probability for current run of the app.
     *
     * Each probability is saved as a 3 digit number. Ex. if slider values are 75,25,0,0: probability would be saved as: 075025000000
     * @since 1.0.0
     * @return void
     */
    private void savePrefs() {

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();

        editor.putString("imageVals", "" + Util.to3Digit(sb[0].getProgress()) + Util.to3Digit(sb[1].getProgress())
                + Util.to3Digit(sb[2].getProgress()) + Util.to3Digit(sb[3].getProgress()));

        Util.info("HunieBee2", ("" + Util.to3Digit(sb[0].getProgress()) + Util.to3Digit(sb[1].getProgress())
                + Util.to3Digit(sb[2].getProgress()) + Util.to3Digit(sb[3].getProgress())));

        for (int i = 0; i < 4; i++) {
            MainActivity.num[i] = sb[i].getProgress();
        }

        editor.commit();
    }


    /**
     * On Back
     *
     * What to do if back button is pressed(go back...duh)
     *
     * @since 1.0.0
     * @param  v       which view called this
     * @return void
     */
    public void onBack(View v) {
        finish();
    }
}
