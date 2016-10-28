package apidez.com.week4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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
        Intent intent = new Intent(this, DrawerActivity.class);
        startActivity(intent);
    }

    public void bottomSheet(View view) {
        Intent intent = new Intent(this, BottomSheetActivity.class);
        startActivity(intent);
    }
}
