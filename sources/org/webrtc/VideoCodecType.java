package org.webrtc;

import com.google.android.exoplayer2.util.MimeTypes;

/* loaded from: classes4.dex */
enum VideoCodecType {
    VP8(MimeTypes.VIDEO_VP8),
    VP9(MimeTypes.VIDEO_VP9),
    H264(MimeTypes.VIDEO_H264);
    
    private final String mimeType;

    VideoCodecType(String str) {
        this.mimeType = str;
    }

    public String mimeType() {
        return this.mimeType;
    }
}
