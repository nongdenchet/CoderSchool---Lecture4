package apidez.com.week4;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import apidez.com.week4.R;
import apidez.com.week4.SimpleFragmentAdapter;
import github.chenupt.springindicator.SpringIndicator;

public class TabLayoutActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    SpringIndicator indicator;

    private int[] icons = new int[]{
            R.drawable.ic_walk,
            R.drawable.ic_car,
            R.drawable.ic_bus,
            R.drawable.ic_walk,
            R.drawable.ic_car,
            R.drawable.ic_bus,
            R.drawable.ic_walk,
            R.drawable.ic_car,
            R.drawable.ic_bus,
            R.drawable.ic_walk,
            R.drawable.ic_car,
            R.drawable.ic_bus,
            R.drawable.ic_walk,
            R.drawable.ic_car,
            R.drawable.ic_bus,
            R.drawable.ic_walk,
            R.drawable.ic_car,
            R.drawable.ic_bus,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.activity_tab_layout, SimpleFragment.newInstance("Manta"))
//                .commit();

        // Toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        // Tablayout
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new SimpleFragmentAdapter(getSupportFragmentManager()));
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.getTabAt(i).setIcon(icons[i]);
            tabLayout.getTabAt(i).setText(null);
        }

        // Indicator
        indicator = (SpringIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
