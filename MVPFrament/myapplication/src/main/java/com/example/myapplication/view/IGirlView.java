package com.example.myapplication.view;

import com.example.myapplication.bean.Girl;

import java.util.List;

/**
 * Created by luoling on 2017/3/5.
 */

public interface IGirlView {

    void showLoading();

    void showGirls(List<Girl> girlList);
}
