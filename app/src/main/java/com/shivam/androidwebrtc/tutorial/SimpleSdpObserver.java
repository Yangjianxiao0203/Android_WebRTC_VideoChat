package com.shivam.androidwebrtc.tutorial;

import android.util.Log;

import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

class SimpleSdpObserver implements SdpObserver {

    @Override
    public void onCreateSuccess(SessionDescription sessionDescription) {
        Log.e("SimpleSdpObserver", "onCreateSuccess: " + sessionDescription.description);
    }

    @Override
    public void onSetSuccess() {
        Log.e("SimpleSdpObserver", "onSetSuccess: ");
    }

    @Override
    public void onCreateFailure(String s) {
        Log.e("SimpleSdpObserver", "onCreateFailure: " + s);
    }

    @Override
    public void onSetFailure(String s) {
        Log.e("SimpleSdpObserver", "onSetFailure: " + s);
    }

}
