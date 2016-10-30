package apidez.com.week4;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by nongdenchet on 10/20/16.
 */

public class UserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_user, parent, false);
        return new ViewHolder(itemView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Item Click
            }
        });
        viewHolder.tvUsername.setText("User " + position);
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvUsername)
        TextView tvUsername;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
