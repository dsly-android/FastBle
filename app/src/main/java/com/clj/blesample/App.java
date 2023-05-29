package com.clj.blesample;

import android.app.Application;

import com.clj.fastble.BleManager;

/**
 * @author: czp
 * @date: 2023/5/26 11:46
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BleManager.getInstance().init(this);
        BleManager.getInstance()
                .enableLog(BuildConfig.DEBUG)
                .setReConnectCount(1, 5000)
                .setConnectOverTime(20000)
                .setOperateTimeout(5000);
    }
}
