package org.webrtc;

/* loaded from: classes4.dex */
public class AudioTrack extends MediaStreamTrack {
    public AudioTrack(long j10) {
        super(j10);
    }

    private static native void nativeSetVolume(long j10, double d10);

    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void setVolume(double d10) {
        nativeSetVolume(getNativeAudioTrack(), d10);
    }
}
