package com.octo.android.robospice.test.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.octo.android.robospice.test.request.listener.RequestProgress;

public class RequestListenerWithProgressHistoryStub<T> extends RequestListenerWithProgressStub<T> {

    private List<RequestProgress> requestProgressesHistory = Collections.synchronizedList(new ArrayList<RequestProgress>());

    @Override
    public void onRequestProgressUpdate(RequestProgress progress) {
        requestProgressesHistory.add(progress);
        super.onRequestProgressUpdate(progress);
    }

    public List<RequestProgress> getRequestProgressesHistory() {
        return requestProgressesHistory;
    }
}
