package com.example.admins.musicsample.other;

import android.app.Application;

import com.example.admins.musicsample.db.SongDb;
import com.example.admins.musicsample.manager.SongManager;
import com.example.admins.musicsample.model.LastSong;
import com.example.admins.musicsample.utils.SharedUtils;


/**
 * * * * * * * * * * * * * * * * * * * * * * *
 * Created by zhaoyiding
 * Date: 15/10/21
 * * * * * * * * * * * * * * * * * * * * * * *
 **/
public class HideApplication extends Application {

    public static boolean showListAnim;

    @Override
    public void onCreate() {
        super.onCreate();

        showListAnim = SharedUtils.getBoolean(this, Constants.KEY_SHOW_LIST_ANIM, true);

        LastSong lastSong = SongDb.getLastSong(this);
        if (lastSong != null) {
            SongManager.with(this).setCurrentSong(lastSong.getId());
        }
    }
}
