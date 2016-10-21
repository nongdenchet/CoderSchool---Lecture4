package apidez.com.week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import apidez.com.week4.adapter.UserAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;

public class CollapsingToolbarActivity extends AppCompatActivity {

    @BindView(R.id.rvUsers)
    RecyclerView rvUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar);
        ButterKnife.bind(this);
        rvUsers.setAdapter(new UserAdapter());
        rvUsers.setLayoutManager(new LinearLayoutManager(this));
    }
}
