package com.example.myapplication.model;

import com.example.myapplication.bean.Girl;

import java.util.List;

/**
 * Created by luoling on 2017/3/5.
 */

public interface IGirlModel {
    void loadModel(IModelOnLoadListener iModelOnLoadListener);

    interface IModelOnLoadListener{
        void onComplete(List<Girl> list);
    }
}
