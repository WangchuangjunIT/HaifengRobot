package com.ocean.mvp.library;

import android.content.Context;

import com.ocean.mvp.library.view.PresenterActivity;

public class MainActivity extends PresenterActivity<MainPresenter> implements IMainView{

    @Override
    protected int getContentViewResource() {
        return R.layout.activity_main;
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    protected void onViewInit() {
        super.onViewInit();

    }

    @Override
    protected void setOnListener() {
        super.setOnListener();

    }

    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter(this);
    }
}
