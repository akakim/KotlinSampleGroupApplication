package tripath.com.kotlinsamplegroupapplicatoin.adapter;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import tripath.com.kotlinsamplegroupapplicatoin.data.ActivityListItem;

/**
 * Created by SSLAB on 2017-06-08.
 */

public class ActivityListAdapter extends RecyclerView.Adapter<ActivityListAdapter.ViewHolder> {

    final String TAG = getClass().getSimpleName();

    ArrayList<ActivityListItem> items = new ArrayList<>();
    Context context = null;

    public ActivityListAdapter(Context context , ArrayList<ActivityListItem> items){
        this.context = context;
        this.items.addAll(items);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1,parent,false);

        return new ViewHolder( v );
    }

    /**
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.getTextView().setText( items.get(position).getClazzSimpleName() );
        holder.getTextView().setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(context, items.get(position).getClazz());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        final TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);

            textView = ( TextView) itemView.findViewById( android.R.id.text1 );
        }

        public TextView getTextView() {
            return textView;
        }
    }
}
