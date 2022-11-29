package org.webrtc;

/* loaded from: classes4.dex */
public class VideoSource extends MediaSource {
    private final NativeCapturerObserver capturerObserver;

    public VideoSource(long j10) {
        super(j10);
        this.capturerObserver = new NativeCapturerObserver(nativeGetInternalSource(j10));
    }

    private static native void nativeAdaptOutputFormat(long j10, int i10, int i11, int i12);

    private static native long nativeGetInternalSource(long j10);

    public void adaptOutputFormat(int i10, int i11, int i12) {
        nativeAdaptOutputFormat(getNativeVideoTrackSource(), i10, i11, i12);
    }

    public CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    public long getNativeVideoTrackSource() {
        return getNativeMediaSource();
    }
}
