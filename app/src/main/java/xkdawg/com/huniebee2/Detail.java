package xkdawg.com.huniebee2;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Random;
import java.util.Scanner;

public class Detail extends AppCompatActivity {
    private String girlName = "";
    private final String[] DETAILFILEHEADERS = {"Age", "Education", "Height", "Weight", "Occupation", "Cup Size",
            "Birthday", "Hobby", "Fav. Color", "Fav. Season", "Hangout"};
    private final String[] PREFERENCES = {"Most Desired Trait", "Least Desired Trait", "Loves Gift Type", "Unique Gift Type", "Likes Gift Types", "Likes Food Types", "Favorite Drink", "Alcohol Tolerance"};
    private final String[] PREFFILEHEADERS = {"MDT", "LDT", "LovesGifts", "UniqueGifts", "LikesGifts", "LikesFood", "FavDrink", "AlcoholTolerance"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            final Window window = getWindow();
            window.getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            );


            window.setStatusBarColor(getResources().getColor(R.color.statusTransparent));
            CollapsingToolbarLayout ctl = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
            Intent intent = getIntent();
            String person = intent.getStringExtra("Person");
            ImageView img = (ImageView) findViewById(R.id.image);
            assert ctl != null;
            ctl.setExpandedTitleTextAppearance(R.style.DetailTheme);
            TextView desc = (TextView) findViewById(R.id.character_description);
            TextView personality = (TextView) findViewById(R.id.character_personality);
            TextView history = (TextView) findViewById(R.id.character_history);

            int picNum = random();
            switch (person) {
                case "xkdawg.com.huniebee2:id/aiko":
                    if (picNum == 1) {
                        assert img != null;
                        img.setImageResource(R.drawable.aikobg);
                    } else if (picNum == 2) {
                        assert img != null;
                        img.setImageResource(R.drawable.aikobg2);
                    } else if (picNum == 3) {
                        assert img != null;
                        img.setImageResource(R.drawable.aikobg3);
                    } else {
                        assert img != null;
                        img.setImageResource(R.drawable.aikobg4);
                    }
                    ctl.setTitle("Aiko Yumi");
                    assert desc != null;
                    desc.setText(R.string.aiko_description);
                    assert personality != null;
                    personality.setText(R.string.aiko_personality);
                    assert history != null;
                    history.setText(R.string.aiko_history);
                    girlName = "Aiko";
                    break;
                case "xkdawg.com.huniebee2:id/audrey":
                    if (picNum == 1) {
                        assert img != null;
                        img.setImageResource(R.drawable.audreybg);
                    } else if (picNum == 2) {
                        assert img != null;
                        img.setImageResource(R.drawable.audreybg2);
                    } else if (picNum == 3) {
                        assert img != null;
                        img.setImageResource(R.drawable.audreybg3);
                    } else {
                        assert img != null;
                        img.setImageResource(R.drawable.audreybg4);
                    }
                    assert desc != null;
                    desc.setText(R.string.audrey_description);
                    assert personality != null;
                    personality.setText(R.string.audrey_personality);
                    assert history != null;
                    history.setText(R.string.audrey_history);
                    ctl.setTitle("Audrey Delrose");
                    girlName = "Audrey";
                    break;
                case "xkdawg.com.huniebee2:id/beli":
                    if (picNum == 1) {
                        assert img != null;
                        img.setImageResource(R.drawable.belibg);
                    } else if (picNum == 2) {
                        assert img != null;
                        img.setImageResource(R.drawable.belibg2);
                    } else if (picNum == 3) {
                        assert img != null;
                        img.setImageResource(R.drawable.belibg3);
                    } else {
                        assert img != null;
                        img.setImageResource(R.drawable.belibg4);
                    }
                    assert desc != null;
                    desc.setText(R.string.beli_description);
                    assert personality != null;
                    personality.setText(R.string.beli_personality);
                    assert history != null;
                    history.setText(R.string.beli_history);
                    ctl.setTitle("Beli Lapran");
                    girlName = "Beli";
                    break;
                case "xkdawg.com.huniebee2:id/jessie":
                    if (picNum == 1) {
                        assert img != null;
                        img.setImageResource(R.drawable.jessiebg);
                    } else if (picNum == 2) {
                        assert img != null;
                        img.setImageResource(R.drawable.jessiebg2);
                    } else if (picNum == 3) {
                        assert img != null;
                        img.setImageResource(R.drawable.jessiebg3);
                    } else {
                        assert img != null;
                        img.setImageResource(R.drawable.jessiebg4);
                    }
                    assert desc != null;
                    desc.setText(R.string.jessie_description);
                    assert personality != null;
                    personality.setText(R.string.jessie_personality);
                    assert history != null;
                    history.setText(R.string.jessie_history);
                    ctl.setTitle("Jessie Maye");
                    girlName = "Jessie";
                    break;
                case "xkdawg.com.huniebee2:id/kyanna":
                    if (picNum == 1) {
                        assert img != null;
                        img.setImageResource(R.drawable.kyannabg);
                    } else if (picNum == 2) {
                        assert img != null;
                        img.setImageResource(R.drawable.kyannabg2);
                    } else if (picNum == 3) {
                        assert img != null;
                        img.setImageResource(R.drawable.kyannabg3);
                    } else {
                        assert img != null;
                        img.setImageResource(R.drawable.kyannabg4);
                    }
                    assert desc != null;
                    desc.setText(R.string.kyanna_description);
                    assert personality != null;
                    personality.setText(R.string.kyanna_personality);
                    assert history != null;
                    history.setText(R.string.kyanna_history);
                    ctl.setTitle("Kyanna Delrio");
                    girlName = "Kyanna";
                    break;
                case "xkdawg.com.huniebee2:id/kyu":
                    if (picNum == 1) {
                        assert img != null;
                        img.setImageResource(R.drawable.kyubg);
                    } else if (picNum == 2) {
                        assert img != null;
                        img.setImageResource(R.drawable.kyubg2);
                    } else if (picNum == 3) {
                        assert img != null;
                        img.setImageResource(R.drawable.kyubg3);
                    } else {
                        assert img != null;
                        img.setImageResource(R.drawable.kyubg4);
                    }
                    assert desc != null;
                    desc.setText(R.string.kyu_description);
                    assert personality != null;
                    personality.setText(R.string.kyu_personality);
                    assert history != null;
                    history.setText(R.string.kyu_history);
                    ctl.setTitle("Kyu Sugardust");
                    girlName = "Kyu";
                    break;
                case "xkdawg.com.huniebee2:id/lola":
                    if (picNum == 1) {
                        assert img != null;
                        img.setImageResource(R.drawable.lolabg);
                    } else if (picNum == 2) {
                        assert img != null;
                        img.setImageResource(R.drawable.lolabg2);
                    } else if (picNum == 3) {
                        assert img != null;
                        img.setImageResource(R.drawable.lolabg3);
                    } else {
                        assert img != null;
                        img.setImageResource(R.drawable.lolabg4);
                    }
                    assert desc != null;
                    desc.setText(R.string.lola_description);
                    assert personality != null;
                    personality.setText(R.string.lola_personality);
                    assert history != null;
                    history.setText(R.string.lola_history);
                    ctl.setTitle("Lola Rembrite");
                    girlName = "Lola";
                    break;
                case "xkdawg.com.huniebee2:id/nikki":
                    if (picNum == 1) {
                        assert img != null;
                        img.setImageResource(R.drawable.nikkibg);
                    } else if (picNum == 2) {
                        assert img != null;
                        img.setImageResource(R.drawable.nikkibg2);
                    } else if (picNum == 3) {
                        assert img != null;
                        img.setImageResource(R.drawable.nikkibg3);
                    } else {
                        assert img != null;
                        img.setImageResource(R.drawable.nikkibg4);
                    }
                    assert desc != null;
                    desc.setText(R.string.nikki_description);
                    assert personality != null;
                    personality.setText(R.string.nikki_personality);
                    assert history != null;
                    history.setText(R.string.nikki_history);
                    ctl.setTitle("Nikki Ann-Marie");
                    girlName = "Nikki";
                    break;
                case "xkdawg.com.huniebee2:id/tiffany":
                    if (picNum == 1) {
                        assert img != null;
                        img.setImageResource(R.drawable.tiffanybg);
                    } else if (picNum == 2) {
                        assert img != null;
                        img.setImageResource(R.drawable.tiffanybg2);
                    } else if (picNum == 3) {
                        assert img != null;
                        img.setImageResource(R.drawable.tiffanybg3);
                    } else {
                        assert img != null;
                        img.setImageResource(R.drawable.tiffanybg4);
                    }
                    assert desc != null;
                    desc.setText(R.string.tiffany_description);
                    assert personality != null;
                    personality.setText(R.string.tiffany_personality);
                    assert history != null;
                    history.setText(R.string.tiffany_history);
                    ctl.setTitle("Tiffany Maye");
                    girlName = "Tiffany";
                    break;
                default:
                    System.out.println("NOTHING" + "\n" + person);
                    break;
            }
            TableLayout detail = (TableLayout) findViewById(R.id.detail);
            assert detail != null;
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
                if (girlName.equalsIgnoreCase("Kyu") && i == 1) {
                    tv.setText("Homeworld");
                } else {
                    tv.setText(DETAILFILEHEADERS[i]);
                }

                header.addView(tv);
                tv = new TextView(this);
                tv.setTextAppearance(this, android.support.design.R.style.TextAppearance_AppCompat_Body1);
                if (girlName.equalsIgnoreCase("Kyu") && i == 1) {
                    tv.setText("Sky Garden");
                } else {
                    tv.setText(getInfo(DETAILFILEHEADERS[i]));
                }
                tv.setPadding(42, 10, 42, 42);
                tv.setGravity(Gravity.RIGHT);
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
            e.printStackTrace();
        }
        return null;
    }

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
            Logger.warning("Hunie Bee", e.toString());
        }
        return null;
    }

    public void onBack(View v) {
        finish();
    }

    private int random() {
        int sum = MainActivity.num[1] + MainActivity.num[2] + MainActivity.num[3] + MainActivity.num[0];
        if (sum == 0) {
            return 1;
        }
        Random rand = new Random();
        int n = rand.nextInt(sum);
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
