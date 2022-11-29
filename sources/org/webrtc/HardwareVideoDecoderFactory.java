package org.webrtc;

import org.webrtc.EglBase;

/* loaded from: classes4.dex */
public class HardwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    @Deprecated
    public HardwareVideoDecoderFactory() {
        this(null);
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }

    public HardwareVideoDecoderFactory(EglBase.Context context) {
        super(context, new String[]{""}, MediaCodecUtils.SOFTWARE_IMPLEMENTATION_PREFIXES);
    }
}
