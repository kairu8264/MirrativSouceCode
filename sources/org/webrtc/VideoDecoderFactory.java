package org.webrtc;

/* loaded from: classes4.dex */
public interface VideoDecoderFactory {
    @Deprecated
    default VideoDecoder createDecoder(String str) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }

    @CalledByNative
    default VideoCodecInfo[] getSupportedCodecs() {
        return new VideoCodecInfo[0];
    }

    @CalledByNative
    default VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return createDecoder(videoCodecInfo.getName());
    }
}
