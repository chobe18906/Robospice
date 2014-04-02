package com.octo.android.robospice.test.persistence.retrofit;

import android.app.Application;
import android.test.suitebuilder.annotation.SmallTest;

import com.octo.android.robospice.persistence.exception.CacheCreationException;
import com.octo.android.robospice.persistence.retrofit.GsonRetrofitObjectPersisterFactory;
import com.octo.android.robospice.persistence.retrofit.RetrofitObjectPersisterFactory;

@SmallTest
public class InFileWeatherPersisterGsonTest extends JsonObjectPersisterFactoryTest {

    @Override
    protected RetrofitObjectPersisterFactory getRetrofitObjectPersisterFactory(Application application)
        throws CacheCreationException {
        return new GsonRetrofitObjectPersisterFactory(application);
    }
}
