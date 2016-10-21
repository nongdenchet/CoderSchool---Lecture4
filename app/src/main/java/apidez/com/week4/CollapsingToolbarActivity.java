package apidez.com.week4;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import apidez.com.week4.adapter.UserAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;

public class CollapsingToolbarActivity extends AppCompatActivity {

    @BindView(R.id.rvUsers)
    RecyclerView rvUsers;

    @BindView(R.id.appBar)
    AppBarLayout appBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar);
        ButterKnife.bind(this);
        setStatusBarColor();
        rvUsers.setAdapter(new UserAdapter());
        rvUsers.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.transparent_color));
        }
    }
}
