/**
 * Detail Activity for HunieBee
 *
 * @since 1.0.0
 */
package xkdawg.com.huniebee2;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Scanner;

public class Detail extends AppCompatActivity {
    private String girlName = "";
    private final String[] DETAILFILEHEADERS = {"Age", "Education", "Height", "Weight", "Occupation", "Cup Size",
            "Birthday", "Hobby", "Fav. Color", "Fav. Season", "Hangout"};
    private final String[] PREFERENCES = {"Most Desired Trait", "Least Desired Trait", "Loves Gift Type", "Unique Gift Type", "Likes Gift Types", "Likes Food Types", "Favorite Drink", "Alcohol Tolerance"};
    private final String[] PREFFILEHEADERS = {"MDT", "LDT", "LovesGifts", "UniqueGifts", "LikesGifts", "LikesFood", "FavDrink", "AlcoholTolerance"};


    /**
     * On Creation
     * <p/>
     * Set the transparent status bar, style the collapsing toolbar(give the title a dropshadow)
     * Get id of which row from main activity open this, and load the appropriate information.
     * Create and populate the layout.
     *
     * @return void
     * @since 1.0.0
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            final Window window = getWindow();
            window.getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            );
            window.setStatusBarColor(getResources().getColor(R.color.statusTransparent));

            CollapsingToolbarLayout ctl = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
            ctl.setExpandedTitleTextAppearance(R.style.DetailTheme);
            ctl.setCollapsedTitleTextAppearance(R.style.DetailTheme);

            Intent intent = getIntent();
            String person = intent.getStringExtra("Person");
            ImageView img = (ImageView) findViewById(R.id.image);

            TextView desc = (TextView) findViewById(R.id.character_description);
            TextView personality = (TextView) findViewById(R.id.character_personality);
            TextView history = (TextView) findViewById(R.id.character_history);

            int picNum = picToLoad();
            switch (person) {
                case "xkdawg.com.huniebee2:id/aiko":
                    if (picNum == 1) {
                        img.setImageResource(R.drawable.aikobg);
                    } else if (picNum == 2) {
                        img.setImageResource(R.drawable.aikobg2);
                    } else if (picNum == 3) {
                        img.setImageResource(R.drawable.aikobg3);
                    } else {
                        img.setImageResource(R.drawable.aikobg4);
                    }
                    ctl.setTitle("Aiko Yumi");
                    desc.setText(R.string.aiko_description);
                    personality.setText(R.string.aiko_personality);
                    history.setText(R.string.aiko_history);
                    girlName = "Aiko";
                    break;
                case "xkdawg.com.huniebee2:id/audrey":
                    if (picNum == 1) {

                        img.setImageResource(R.drawable.audreybg);
                    } else if (picNum == 2) {

                        img.setImageResource(R.drawable.audreybg2);
                    } else if (picNum == 3) {
                        img.setImageResource(R.drawable.audreybg3);
                    } else {
                        img.setImageResource(R.drawable.audreybg4);
                    }
                    ctl.setTitle("Audrey Delrose");
                    desc.setText(R.string.audrey_description);
                    personality.setText(R.string.audrey_personality);
                    history.setText(R.string.audrey_history);

                    girlName = "Audrey";
                    break;
                case "xkdawg.com.huniebee2:id/beli":
                    if (picNum == 1) {
                        img.setImageResource(R.drawable.belibg);
                    } else if (picNum == 2) {
                        img.setImageResource(R.drawable.belibg2);
                    } else if (picNum == 3) {
                        img.setImageResource(R.drawable.belibg3);
                    } else {
                        img.setImageResource(R.drawable.belibg4);
                    }
                    desc.setText(R.string.beli_description);
                    personality.setText(R.string.beli_personality);
                    history.setText(R.string.beli_history);
                    ctl.setTitle("Beli Lapran");
                    girlName = "Beli";
                    break;
                case "xkdawg.com.huniebee2:id/celeste":
                    if (picNum == 1) {
                        img.setImageResource(R.drawable.celestebg);
                    } else if (picNum == 2) {
                        img.setImageResource(R.drawable.celestebg2);
                    } else if (picNum == 3) {
                        img.setImageResource(R.drawable.celestebg3);
                    } else {
                        img.setImageResource(R.drawable.celestebg4);
                    }
                    desc.setText(R.string.celeste_description);
                    personality.setText(R.string.celeste_personality);
                    history.setText(R.string.celeste_history);
                    ctl.setTitle("Celeste Luvendass");
                    girlName = "Celeste";
                    break;
                case "xkdawg.com.huniebee2:id/momo":
                    if (picNum == 1) {
                        img.setImageResource(R.drawable.momobg);
                    } else if (picNum == 2) {
                        img.setImageResource(R.drawable.momobg2);
                    } else if (picNum == 3) {
                        img.setImageResource(R.drawable.momobg3);
                    } else {
                        img.setImageResource(R.drawable.momobg4);
                    }
                    desc.setText(R.string.momo_description);
                    personality.setText(R.string.momo_personality);
                    history.setText(R.string.momo_history);
                    ctl.setTitle("Momo");
                    girlName = "Momo";
                    break;
                case "xkdawg.com.huniebee2:id/jessie":
                    if (picNum == 1) {
                        img.setImageResource(R.drawable.jessiebg);
                    } else if (picNum == 2) {
                        img.setImageResource(R.drawable.jessiebg2);
                    } else if (picNum == 3) {
                        img.setImageResource(R.drawable.jessiebg3);
                    } else {
                        img.setImageResource(R.drawable.jessiebg4);
                    }
                    desc.setText(R.string.jessie_description);
                    personality.setText(R.string.jessie_personality);
                    history.setText(R.string.jessie_history);
                    ctl.setTitle("Jessie Maye");
                    girlName = "Jessie";
                    break;
                case "xkdawg.com.huniebee2:id/kyanna":
                    if (picNum == 1) {
                        img.setImageResource(R.drawable.kyannabg);
                    } else if (picNum == 2) {
                        img.setImageResource(R.drawable.kyannabg2);
                    } else if (picNum == 3) {
                        img.setImageResource(R.drawable.kyannabg3);
                    } else {
                        img.setImageResource(R.drawable.kyannabg4);
                    }
                    desc.setText(R.string.kyanna_description);
                    personality.setText(R.string.kyanna_personality);
                    history.setText(R.string.kyanna_history);
                    ctl.setTitle("Kyanna Delrio");
                    girlName = "Kyanna";
                    break;
                case "xkdawg.com.huniebee2:id/kyu":
                    if (picNum == 1) {
                        img.setImageResource(R.drawable.kyubg);
                    } else if (picNum == 2) {
                        img.setImageResource(R.drawable.kyubg2);
                    } else if (picNum == 3) {
                        img.setImageResource(R.drawable.kyubg3);
                    } else {
                        img.setImageResource(R.drawable.kyubg4);
                    }
                    desc.setText(R.string.kyu_description);
                    personality.setText(R.string.kyu_personality);
                    history.setText(R.string.kyu_history);
                    ctl.setTitle("Kyu Sugardust");
                    girlName = "Kyu";
                    break;
                case "xkdawg.com.huniebee2:id/lola":
                    if (picNum == 1) {
                        img.setImageResource(R.drawable.lolabg);
                    } else if (picNum == 2) {
                        img.setImageResource(R.drawable.lolabg2);
                    } else if (picNum == 3) {
                        img.setImageResource(R.drawable.lolabg3);
                    } else {
                        img.setImageResource(R.drawable.lolabg4);
                    }
                    desc.setText(R.string.lola_description);
                    personality.setText(R.string.lola_personality);
                    history.setText(R.string.lola_history);
                    ctl.setTitle("Lola Rembrite");
                    girlName = "Lola";
                    break;
                case "xkdawg.com.huniebee2:id/nikki":
                    if (picNum == 1) {
                        img.setImageResource(R.drawable.nikkibg);
                    } else if (picNum == 2) {
                        img.setImageResource(R.drawable.nikkibg2);
                    } else if (picNum == 3) {
                        img.setImageResource(R.drawable.nikkibg3);
                    } else {
                        img.setImageResource(R.drawable.nikkibg4);
                    }
                    desc.setText(R.string.nikki_description);
                    personality.setText(R.string.nikki_personality);
                    history.setText(R.string.nikki_history);
                    ctl.setTitle("Nikki Ann-Marie");
                    girlName = "Nikki";
                    break;
                case "xkdawg.com.huniebee2:id/tiffany":
                    if (picNum == 1) {
                        img.setImageResource(R.drawable.tiffanybg);
                    } else if (picNum == 2) {
                        img.setImageResource(R.drawable.tiffanybg2);
                    } else if (picNum == 3) {
                        img.setImageResource(R.drawable.tiffanybg3);
                    } else {
                        img.setImageResource(R.drawable.tiffanybg4);
                    }
                    desc.setText(R.string.tiffany_description);
                    personality.setText(R.string.tiffany_personality);
                    history.setText(R.string.tiffany_history);
                    ctl.setTitle("Tiffany Maye");
                    girlName = "Tiffany";
                    break;
                case "xkdawg.com.huniebee2:id/venus":
                    if (picNum == 1) {
                        img.setImageResource(R.drawable.venusbg);
                    } else if (picNum == 2) {
                        img.setImageResource(R.drawable.venusbg2);
                    } else if (picNum == 3) {
                        img.setImageResource(R.drawable.venusbg3);
                    } else {
                        img.setImageResource(R.drawable.venusbg4);
                    }
                    desc.setText(R.string.venus_description);
                    personality.setText(R.string.venus_personality);
                    history.setText(R.string.venus_history);
                    ctl.setTitle("Theiatena Venus");
                    girlName = "Venus";
                    break;
                default:
                    Util.wtf("HunieBee", "Unknown Selection!?");
                    break;
            }

            TableLayout detail = (TableLayout) findViewById(R.id.detail);
            detail.setColumnStretchable(1, true);

            TableRow answer = new TableRow(this);
            answer.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            TextView tv;
            TableRow header;
            for (int i = 0; i < 11; i++) {
                header = new TableRow(this);
                header.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

                tv = new TextView(this);
                tv.setPadding(42, 10, 42, 42);
                tv.setTextAppearance(this, android.support.design.R.style.TextAppearance_AppCompat_Body1);

                if ((girlName.equalsIgnoreCase("Kyu") || girlName.equalsIgnoreCase("Celeste") || girlName.equalsIgnoreCase("Venus")) && i == 1) {
                    tv.setText("Homeworld");
                } else if (girlName.equalsIgnoreCase("Kyu") && i == 1) {
                    continue;
                } else {
                    tv.setText(DETAILFILEHEADERS[i]);
                }

                header.addView(tv);

                tv = new TextView(this);
                tv.setTextAppearance(this, android.support.design.R.style.TextAppearance_AppCompat_Body1);
                tv.setPadding(42, 10, 42, 42);
                tv.setGravity(Gravity.RIGHT);

                if ((girlName.equalsIgnoreCase("Kyu") || girlName.equalsIgnoreCase("Celeste") || girlName.equalsIgnoreCase("Venus")) && i == 1) {
                    tv.setText(getInfo("Homeworld"));
                } else if (girlName.equalsIgnoreCase("Momo") && i == 1) {
                    continue;
                } else {
                    tv.setText(getInfo(DETAILFILEHEADERS[i]));
                }

                header.addView(tv);
                detail.addView(header);
            }

            detail = (TableLayout) findViewById(R.id.preferences);
            detail.setColumnStretchable(1, true);

            for (int i = 0; i < 8; i++) {
                header = new TableRow(this);
                header.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

                tv = new TextView(this);
                tv.setText(PREFERENCES[i]);
                tv.setTextAppearance(this, android.support.design.R.style.TextAppearance_AppCompat_Body1);
                tv.setPadding(42, 10, 42, 42);

                header.addView(tv);

                tv = new TextView(this);
                tv.setText(getPref(PREFFILEHEADERS[i]));
                tv.setTextAppearance(this, android.support.design.R.style.TextAppearance_AppCompat_Body1);
                tv.setPadding(42, 10, 42, 42);
                tv.setGravity(Gravity.RIGHT);

                header.addView(tv);
                detail.addView(header);
            }
        }
    }

    /**
     * Get Info
     * <p/>
     * Read the information file, and load relevant information
     *
     * @param infoType what info we are looking for
     * @return String   corresponding information
     * @since 1.0.0
     */
    public String getInfo(String infoType) {
        try {
            Scanner fileScanner = new Scanner(getAssets().open(String.format("information.txt")));
            String currentLine;
            String info;

            while (fileScanner.hasNextLine()) {
                currentLine = fileScanner.nextLine();

                if (currentLine.equals(girlName + ":")) {
                    while (fileScanner.hasNextLine()) {
                        currentLine = fileScanner.nextLine();

                        if (currentLine.contains(infoType + ":")) {
                            info = currentLine.substring(infoType.length() + 2);
                            return info;
                        }
                        if (currentLine.equals("Hangout:")) {
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            Util.error("HunieBee", "Unexpected error: " + e.toString());
        }
        return null;
    }

    /**
     * Get Character Preferences
     * <p/>
     * Read the preferences file, and load relevant information
     *
     * @param prefType what preferences we are looking for
     * @return String   corresponding preferences
     * @since 1.0.0
     */
    public String getPref(String prefType) {
        try {
            Scanner fileScanner = new Scanner(getAssets().open(String.format("preferences.txt")));
            String currentLine;
            String info;

            while (fileScanner.hasNextLine()) {
                currentLine = fileScanner.nextLine();

                if (currentLine.equals(girlName + ":")) {
                    while (fileScanner.hasNextLine()) {
                        currentLine = (fileScanner.nextLine());

                        if (currentLine.contains(prefType + ":")) {
                            info = currentLine.substring(prefType.length() + 2);
                            return info;
                        }
                        if (currentLine.equals("AlcoholTolerance:")) {
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            Util.warning("Hunie Bee", e.toString());
        }
        return null;
    }

    /**
     * On Back
     * <p/>
     * What to do if back button is pressed(go back...duh)
     *
     * @param v which view called this
     * @return void
     * @since 1.0.0
     */
    public void onBack(View v) {
        finish();
    }

    /**
     * Header picture to Load
     * <p/>
     * Use RNG with user preferences to determine which picture should be used as header.
     *
     * @return int     picture number to load(1-4)
     * @since 1.0.0
     */
    private int picToLoad() {
        int sum = MainActivity.num[1] + MainActivity.num[2] + MainActivity.num[3] + MainActivity.num[0];

        if (sum == 0) {
            return 1;
        }

        int n = Util.Random(sum);

        if (0 <= n && n < MainActivity.num[0]) {
            return 1;
        } else if (MainActivity.num[0] <= n && n < MainActivity.num[1] + MainActivity.num[0]) {
            return 2;
        } else if (MainActivity.num[1] <= n && n < MainActivity.num[2] + MainActivity.num[1] + MainActivity.num[0]) {
            return 3;
        } else {
            return 4;
        }
    }
}
