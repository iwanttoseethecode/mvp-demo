package com.example.myapplication.presenter;

import com.example.myapplication.bean.Girl;
import com.example.myapplication.model.GirlModelImpl;
import com.example.myapplication.model.IGirlModel;
import com.example.myapplication.view.IGirlView;

import java.util.List;

/**
 * Created by luoling on 2017/3/5.
 */

public class GirlPersenterImpl<T> extends BasePersenter<IGirlView>{

    private IGirlModel iGirlModel = new GirlModelImpl();

    public void fecth(){
        mView.get().showLoading();

        iGirlModel.loadModel(new IGirlModel.IModelOnLoadListener() {
            @Override
            public void onComplete(List<Girl> list) {
                mView.get().showGirls(list);
            }
        });
    }

}
