package com.example.admins.musicsample.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admins.musicsample.R;


public class AlbumFragment extends BaseFragment {


    @Override
    protected View inflateView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_album, container, false);
    }

    @Override
    protected void onLoading() {

    }

    @Override
    protected void onLoadFinish() {

    }
}
