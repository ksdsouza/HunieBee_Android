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
import java.text.DecimalFormat;

public class Settings extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private SeekBar[] sb = new SeekBar[4];
    public final String PREFS_NAME = "HunieBee2";
    private TextView[] tv = new TextView[4];
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
        sb[0] = (SeekBar)findViewById(R.id.seek1);
        sb[1] = (SeekBar)findViewById(R.id.seek2);
        sb[2] = (SeekBar)findViewById(R.id.seek3);
        sb[3] = (SeekBar)findViewById(R.id.seek4);

        tv[0] = (TextView)findViewById(R.id.val1);
        tv[1] = (TextView)findViewById(R.id.val2);
        tv[2] = (TextView)findViewById(R.id.val3);
        tv[3] = (TextView)findViewById(R.id.val4);
        for(int i = 0;i<4;i++){
            sb[i].setOnSeekBarChangeListener(this);
        }





        for(int i = 0;i<4;i++){
            sb[i].setOnSeekBarChangeListener(this);
            sb[i].setProgress(MainActivity.num[i]);
            tv[i].setText(""+MainActivity.num[i]);
        }



    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        switch (seekBar.getId()) {
            case R.id.seek1:
                Logger.info("HunieBee2", "" + sb[0].getProgress());
                tv[0].setText("" + seekBar.getProgress());
                break;
            case R.id.seek2:
                Logger.info("HunieBee2", "" + sb[1].getProgress());
                tv[1].setText("" + seekBar.getProgress());
                break;
            case R.id.seek3:
                Logger.info("HunieBee2", "" + sb[2].getProgress());
                tv[2].setText("" + seekBar.getProgress());
                break;
            default:
                Logger.info("HunieBee2", "" + sb[3].getProgress());
                tv[3].setText("" + seekBar.getProgress());
                break;
        }


    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
    private void savePrefs(){
        SharedPreferences   settings = getSharedPreferences(PREFS_NAME,0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("imageVals",""+stringFormatter(sb[0].getProgress())+stringFormatter(sb[1].getProgress())
                +stringFormatter(sb[2].getProgress())+stringFormatter(sb[3].getProgress()));
        Logger.info("HunieBee2",(""+stringFormatter(sb[0].getProgress())+stringFormatter(sb[1].getProgress())
                +stringFormatter(sb[2].getProgress())+stringFormatter(sb[3].getProgress())));

        for (int i = 0;i<4;i++){
            MainActivity.num[i]=sb[i].getProgress();
        }
        editor.commit();
    }
    private String stringFormatter(int num){
        String pattern = "000";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String str = decimalFormat.format(num);
        return str;

    }
    public void onBack(View v) {
        finish();
    }
}
