package org.webrtc;

import org.webrtc.VideoFrame;

/* loaded from: classes4.dex */
class NativeCapturerObserver implements CapturerObserver {
    private final long nativeSource;

    @CalledByNative
    public NativeCapturerObserver(long j10) {
        this.nativeSource = j10;
    }

    private static native void nativeCapturerStarted(long j10, boolean z10);

    private static native void nativeCapturerStopped(long j10);

    private static native void nativeOnFrameCaptured(long j10, int i10, int i11, int i12, long j11, VideoFrame.Buffer buffer);

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z10) {
        nativeCapturerStarted(this.nativeSource, z10);
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        nativeCapturerStopped(this.nativeSource);
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        nativeOnFrameCaptured(this.nativeSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer());
    }
}
