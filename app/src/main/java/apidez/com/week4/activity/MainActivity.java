package apidez.com.week4.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import apidez.com.week4.CollapsingToolbarActivity;
import apidez.com.week4.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tabLayout(View view) {
        Intent intent = new Intent(this, TabLayoutActivity.class);
        startActivity(intent);
    }

    public void collapsingToolbar(View view) {
        Intent intent = new Intent(this, CollapsingToolbarActivity.class);
        startActivity(intent);
    }

    public void drawerLayout(View view) {
    }
}
