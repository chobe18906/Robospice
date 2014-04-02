package com.octo.android.robospice.test.stub;

import com.octo.android.robospice.test.request.listener.PendingRequestListener;

public class PendingRequestListenerWithProgressStub<T> extends RequestListenerWithProgressStub<T> implements PendingRequestListener<T> {

    private boolean isRequestNotFound = false;

    @Override
    public void onRequestNotFound() {
        isRequestNotFound = true;
    }

    public boolean isRequestNotFound() {
        return isRequestNotFound;
    }
}
