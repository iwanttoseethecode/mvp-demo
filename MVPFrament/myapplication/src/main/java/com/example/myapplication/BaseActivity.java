package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.myapplication.bean.Girl;
import com.example.myapplication.presenter.BasePersenter;
import com.example.myapplication.view.IGirlView;

import java.util.List;

public abstract class BaseActivity<T,V extends BasePersenter<T>> extends AppCompatActivity implements IGirlView{

    protected V mPersenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPersenter = createPersenter();
        mPersenter.attach((T) this);
    }

    @Override
    protected void onDestroy() {
        mPersenter.detach();
        super.onDestroy();
    }

    protected abstract V createPersenter();

    @Override
    public void showLoading() {
        Toast.makeText(this,"正在努力加载",Toast.LENGTH_SHORT).show();
    }

    @Override
    public abstract void showGirls(List<Girl> girlList);
}
