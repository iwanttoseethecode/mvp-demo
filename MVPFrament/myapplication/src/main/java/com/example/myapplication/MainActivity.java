package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.adapter.GirlListAdapter;
import com.example.myapplication.bean.Girl;
import com.example.myapplication.presenter.GirlPersenterImpl;
import com.example.myapplication.view.IGirlView;

import java.util.List;

public class MainActivity extends BaseActivity<IGirlView,GirlPersenterImpl<IGirlView>> {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.listview);
        mPersenter.fecth();
    }

    @Override
    protected GirlPersenterImpl<IGirlView> createPersenter() {
        return new GirlPersenterImpl<IGirlView>();
    }

    @Override
    public void showGirls(List<Girl> girlList) {
        mListView.setAdapter(new GirlListAdapter(this,girlList));
    }
}
