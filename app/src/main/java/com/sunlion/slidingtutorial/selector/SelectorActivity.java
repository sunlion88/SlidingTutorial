package com.sunlion.slidingtutorial.selector;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.sunlion.slidingtutorial.R;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

public class SelectorActivity extends ListActivity implements AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_name);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.options,
                android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
          switch (i){
              case 0:
                  com.sunlion.slidingtutorial.support.MainActivity.start(this);
                  break;
              case 1:
                  com.sunlion.slidingtutorial.MainActivity.start(this);
                  break;
          }
    }
}
