package org.webrtc;

/* loaded from: classes4.dex */
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    int getCodecConfigFramerate();

    void reportEncodedFrame(int i10);

    void setTargets(int i10, int i11);
}
