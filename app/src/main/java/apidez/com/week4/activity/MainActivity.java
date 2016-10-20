package apidez.com.week4.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import apidez.com.week4.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tabLayout(View view) {
        startActivity(new Intent(this, TabLayoutActivity.class));
    }

    public void collapsingToolbar(View view) {
        startActivity(new Intent(this, CollapsingToolbarActivity.class));
    }

    public void drawerLayout(View view) {
        startActivity(new Intent(this, DrawerLayoutActivity.class));
    }
}
