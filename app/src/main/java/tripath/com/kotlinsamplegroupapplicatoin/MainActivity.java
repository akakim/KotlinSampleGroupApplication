package tripath.com.kotlinsamplegroupapplicatoin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import java.util.ArrayList;

import tripath.com.kotlinsamplegroupapplicatoin.adapter.ActivityListAdapter;
import tripath.com.kotlinsamplegroupapplicatoin.data.ActivityListItem;

public class MainActivity extends AppCompatActivity {

    RecyclerView activityListView;
    ActivityListAdapter activityListAdapter;
    ArrayList<ActivityListItem> activityListItemArrayList = new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;
    LinearLayoutManager linearLayoutManager;
    GridLayoutManager gridLayoutManager;
    StaggeredGridLayoutManager staggeredGridLayoutManager; // 높이가 불규칙적인 그리드 리스트

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(tripath.com.kotlinsamplegroupapplicatoin.R.layout.activity_main);

        activityListView = (RecyclerView) findViewById( tripath.com.kotlinsamplegroupapplicatoin.R.id.activityListView);

        activityListItemArrayList.add(new ActivityListItem(HelloKotlin.class));


        activityListAdapter= new ActivityListAdapter(this,activityListItemArrayList);
        activityListView.setAdapter( activityListAdapter );

        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        linearLayoutManager.setMeasuredDimension( LinearLayout.LayoutParams.MATCH_PARENT, 50 );
        gridLayoutManager   = new GridLayoutManager(this,2);


        activityListView.setLayoutManager( linearLayoutManager );
    }
}
