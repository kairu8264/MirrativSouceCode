package com.dena.showroom.flvplayback.impl;

import android.os.Build;
import android.os.Looper;
import com.dena.showroom.flvplayback.FLVPlayback;
import com.dena.showroom.flvplayback.FLVPlaybackConfig;
import com.dena.showroom.flvplayback.FLVPublisher;
import com.dena.showroom.flvplayback.RTMPEndpoint;
import com.dena.showroom.flvplayback.RTMPReader;
import com.dena.showroom.flvplayback.RTMPWriter;
import com.dena.showroom.flvplayback.SamplePlayer;
import com.dena.showroom.flvplayback.impl.net.AsyncSecureSocketLooper;
import com.dena.showroom.flvplayback.impl.net.AsyncSocketLooper;
import com.dena.showroom.flvplayback.impl.publish.Publisher;

/* loaded from: classes3.dex */
public final class Factory {
    public static final boolean DEBUG = true;
    public static final String TAG = "flvplayback";

    public static boolean isFLVPlaybackAvailable() {
        return Build.VERSION.SDK_INT >= 16;
    }

    public static FLVPlayback newPlayback() {
        return newPlayback(Looper.myLooper(), FLVPlaybackConfig.getDefaultConfig());
    }

    public static FLVPublisher newPublisher(RTMPEndpoint rTMPEndpoint, Looper looper) {
        return new Publisher(rTMPEndpoint, new AsyncSocketLooper(looper));
    }

    public static RTMPReader newReader(RTMPEndpoint rTMPEndpoint) {
        return new DefaultRTMPReader(rTMPEndpoint);
    }

    public static SamplePlayer newSamplePlayer(Looper looper, FLVPlaybackConfig fLVPlaybackConfig) {
        return new DefaultSamplePlayer(looper, fLVPlaybackConfig);
    }

    public static RTMPWriter newWriter(RTMPEndpoint rTMPEndpoint) {
        return new DefaultRTMPWriter(rTMPEndpoint);
    }

    public static FLVPlayback newPlayback(Looper looper, FLVPlaybackConfig fLVPlaybackConfig) {
        if (looper != Looper.getMainLooper()) {
            return new DefaultFLVPlayback(newSamplePlayer(looper, fLVPlaybackConfig), new AsyncSocketLooper(looper));
        }
        throw new IllegalArgumentException("Hey, please don't give me the main looper. Android forbids us from networking in the main thread.");
    }

    public static FLVPlayback newPlayback(RTMPEndpoint rTMPEndpoint) {
        AsyncSocketLooper asyncSocketLooper;
        Looper myLooper = Looper.myLooper();
        if (myLooper != Looper.getMainLooper()) {
            if (RTMPEndpoint.RTMP_SECURE_SCHEME_NAMES.contains(rTMPEndpoint.getTcUrl().getScheme())) {
                asyncSocketLooper = new AsyncSecureSocketLooper(myLooper, 5000, 5000);
            } else {
                asyncSocketLooper = new AsyncSocketLooper(myLooper, 5000, 5000);
            }
            return new DefaultFLVPlayback(newSamplePlayer(myLooper, new FLVPlaybackConfig(false)), asyncSocketLooper);
        }
        throw new IllegalArgumentException("Hey, please don't give me the main looper. Android forbids us from networking in the main thread.");
    }
}
