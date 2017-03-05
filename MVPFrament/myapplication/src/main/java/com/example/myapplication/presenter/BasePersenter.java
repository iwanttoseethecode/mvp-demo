package com.example.myapplication.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by luoling on 2017/3/5.
 *
 * T 代表mvp的view层，即现在实现IGirlView的activity
 */

public abstract class BasePersenter <T> {

    protected WeakReference<T> mView;

    public void attach(T view){
        mView = new WeakReference<T>(view);
    }

    public void detach(){

        if (mView!=null){

            mView.clear();

            mView = null;

        }

    }

    public abstract void fecth();
}
