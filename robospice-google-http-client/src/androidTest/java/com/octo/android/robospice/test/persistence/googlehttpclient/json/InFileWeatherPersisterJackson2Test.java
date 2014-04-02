package com.octo.android.robospice.test.persistence.googlehttpclient.json;

import android.app.Application;
import android.test.suitebuilder.annotation.SmallTest;

import com.octo.android.robospice.persistence.exception.CacheCreationException;
import com.octo.android.robospice.persistence.googlehttpclient.json.Jackson2ObjectPersisterFactory;
import com.octo.android.robospice.persistence.googlehttpclient.json.JsonObjectPersisterFactory;

@SmallTest
public class InFileWeatherPersisterJackson2Test extends JsonObjectPersisterFactoryTest {

    @Override
    protected JsonObjectPersisterFactory getJsonObjectPersisterFactory(Application application)
        throws CacheCreationException {
        return new Jackson2ObjectPersisterFactory(application);
    }
}
