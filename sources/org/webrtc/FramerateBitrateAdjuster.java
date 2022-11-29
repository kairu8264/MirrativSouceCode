package org.webrtc;

/* loaded from: classes4.dex */
class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    private static final int INITIAL_FPS = 30;

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public int getCodecConfigFramerate() {
        return 30;
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i10, int i11) {
        if (this.targetFps == 0) {
            i11 = 30;
        }
        super.setTargets(i10, i11);
        this.targetBitrateBps = (this.targetBitrateBps * 30) / this.targetFps;
    }
}
