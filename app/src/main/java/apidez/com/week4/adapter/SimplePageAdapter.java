package apidez.com.week4.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import apidez.com.week4.R;
import apidez.com.week4.fragment.SimpleFragment;

/**
 * Created by nongdenchet on 10/20/16.
 */

public class SimplePageAdapter extends FragmentPagerAdapter {
    private final String[] mTitles = new String[]{"Walk", "Car", "Bus"};
    private final int[] mIcons = new int[]{
            R.drawable.ic_run,
            R.drawable.ic_car,
            R.drawable.ic_bus
    };
    private Context mContext;

    public SimplePageAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        return SimpleFragment.newInstance(mTitles[position]);
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }

    public View getTabView(int position) {
        View rootView = LayoutInflater.from(mContext).inflate(R.layout.tab_simple, null);
        TextView tvTitle = (TextView) rootView.findViewById(R.id.tvTitle);
        tvTitle.setText(mTitles[position]);
        ImageView ivIcon = (ImageView) rootView.findViewById(R.id.ivIcon);
        ivIcon.setImageResource(mIcons[position]);
        return rootView;
    }
}
