package org.webrtc;

import java.util.IdentityHashMap;

/* loaded from: classes4.dex */
public class VideoTrack extends MediaStreamTrack {
    private final IdentityHashMap<VideoSink, Long> sinks;

    public VideoTrack(long j10) {
        super(j10);
        this.sinks = new IdentityHashMap<>();
    }

    private static native void nativeAddSink(long j10, long j11);

    private static native void nativeFreeSink(long j10);

    private static native void nativeRemoveSink(long j10, long j11);

    private static native long nativeWrapSink(VideoSink videoSink);

    public void addSink(VideoSink videoSink) {
        if (videoSink != null) {
            if (this.sinks.containsKey(videoSink)) {
                return;
            }
            long nativeWrapSink = nativeWrapSink(videoSink);
            this.sinks.put(videoSink, Long.valueOf(nativeWrapSink));
            nativeAddSink(getNativeMediaStreamTrack(), nativeWrapSink);
            return;
        }
        throw new IllegalArgumentException("The VideoSink is not allowed to be null");
    }

    @Override // org.webrtc.MediaStreamTrack
    public void dispose() {
        for (Long l10 : this.sinks.values()) {
            long longValue = l10.longValue();
            nativeRemoveSink(getNativeMediaStreamTrack(), longValue);
            nativeFreeSink(longValue);
        }
        this.sinks.clear();
        super.dispose();
    }

    public long getNativeVideoTrack() {
        return getNativeMediaStreamTrack();
    }

    public void removeSink(VideoSink videoSink) {
        Long remove = this.sinks.remove(videoSink);
        if (remove != null) {
            nativeRemoveSink(getNativeMediaStreamTrack(), remove.longValue());
            nativeFreeSink(remove.longValue());
        }
    }
}
