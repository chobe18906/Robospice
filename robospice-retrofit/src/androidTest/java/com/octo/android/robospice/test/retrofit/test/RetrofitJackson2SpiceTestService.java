package com.octo.android.robospice.test.retrofit.test;

import java.io.File;

import com.octo.android.robospice.retrofit.RetrofitGsonSpiceService;

public class RetrofitJackson2SpiceTestService extends RetrofitGsonSpiceService {

    @Override
    protected String getServerUrl() {
        return "non-blank.random.server";
    }

    @Override
    public File getCacheFolder() {
        return new File("/");
    }

}
