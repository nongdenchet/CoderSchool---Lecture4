package apidez.com.week4.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import apidez.com.week4.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by nongdenchet on 10/20/16.
 */

public class SimpleFragment extends Fragment {

    @BindView(R.id.tvTitle)
    TextView tvTitle;

    public static SimpleFragment newInstance(String title) {
        Bundle args = new Bundle();
        args.putString("title", title);
        SimpleFragment fragment = new SimpleFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = LayoutInflater.from(getContext())
                .inflate(R.layout.fragment_simple, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String title = getArguments().getString("title", "Hello World");
        tvTitle.setText(title);
    }
}
