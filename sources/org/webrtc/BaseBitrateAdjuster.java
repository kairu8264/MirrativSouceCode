package org.webrtc;

/* loaded from: classes4.dex */
class BaseBitrateAdjuster implements BitrateAdjuster {
    public int targetBitrateBps;
    public int targetFps;

    @Override // org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override // org.webrtc.BitrateAdjuster
    public int getCodecConfigFramerate() {
        return this.targetFps;
    }

    @Override // org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i10) {
    }

    @Override // org.webrtc.BitrateAdjuster
    public void setTargets(int i10, int i11) {
        this.targetBitrateBps = i10;
        this.targetFps = i11;
    }
}
