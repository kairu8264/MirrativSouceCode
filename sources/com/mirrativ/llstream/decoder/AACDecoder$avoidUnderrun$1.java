package com.mirrativ.llstream.decoder;

import io.l;
import jo.q;

/* loaded from: classes4.dex */
public final class AACDecoder$avoidUnderrun$1 extends q implements l<Float, Float> {
    public final /* synthetic */ AACDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AACDecoder$avoidUnderrun$1(AACDecoder aACDecoder) {
        super(1);
        this.this$0 = aACDecoder;
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ Float invoke(Float f10) {
        return invoke(f10.floatValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
        if (r0 < po.n.e(r4, r8.this$0.getParams().getPlaySpeedNormalThreshold())) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
        if (r0 > po.n.e(r4, r8.this$0.getParams().getPlaySpeedNormalThreshold())) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Float invoke(float r9) {
        /*
            r8 = this;
            com.mirrativ.llstream.decoder.AACDecoder r0 = r8.this$0
            com.mirrativ.llstream.decoder.JitterCoordinator r0 = r0.getCoordinator()
            com.mirrativ.llstream.decoder.PacketJitterConfig r0 = r0.getConfig()
            java.util.concurrent.atomic.AtomicLong r0 = r0.getRemainingScheduledBufferSize()
            long r0 = r0.get()
            com.mirrativ.llstream.decoder.AACDecoder r2 = r8.this$0
            com.mirrativ.llstream.decoder.AudioDecodeParams r2 = r2.getParams()
            float r2 = r2.getPlaySpeedLow()
            com.mirrativ.llstream.decoder.AACDecoder r3 = r8.this$0
            com.mirrativ.llstream.decoder.AudioDecodeParams r3 = r3.getParams()
            float r3 = r3.getPlaySpeedNormal()
            com.mirrativ.llstream.decoder.AACDecoder r4 = r8.this$0
            com.mirrativ.llstream.decoder.AudioDecodeParams r4 = r4.getParams()
            float r4 = r4.getPlaySpeedHigh()
            int r5 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L38
            r5 = r6
            goto L39
        L38:
            r5 = r7
        L39:
            if (r5 == 0) goto L54
            com.mirrativ.llstream.decoder.AACDecoder r2 = r8.this$0
            long r4 = com.mirrativ.llstream.decoder.AACDecoder.access$getSmoothQueueLengthWithGap(r2)
            com.mirrativ.llstream.decoder.AACDecoder r2 = r8.this$0
            com.mirrativ.llstream.decoder.AudioDecodeParams r2 = r2.getParams()
            long r6 = r2.getPlaySpeedNormalThreshold()
            long r4 = po.n.e(r4, r6)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lab
            goto Laa
        L54:
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 != 0) goto L5a
            r5 = r6
            goto L5b
        L5a:
            r5 = r7
        L5b:
            if (r5 == 0) goto L8a
            com.mirrativ.llstream.decoder.AACDecoder r3 = r8.this$0
            com.mirrativ.llstream.decoder.AudioDecodeParams r3 = r3.getParams()
            long r5 = r3.getPlaySpeedLowThreshold()
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 >= 0) goto L6d
            r9 = r2
            goto Lab
        L6d:
            com.mirrativ.llstream.decoder.AACDecoder r2 = r8.this$0
            long r2 = com.mirrativ.llstream.decoder.AACDecoder.access$getSmoothQueueLengthWithGap(r2)
            r5 = 2
            long r5 = (long) r5
            long r2 = r2 * r5
            com.mirrativ.llstream.decoder.AACDecoder r5 = r8.this$0
            com.mirrativ.llstream.decoder.AudioDecodeParams r5 = r5.getParams()
            long r5 = r5.getPlaySpeedHighThreshold()
            long r2 = po.n.e(r2, r5)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lab
            r9 = r4
            goto Lab
        L8a:
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 != 0) goto L8f
            goto L90
        L8f:
            r6 = r7
        L90:
            if (r6 == 0) goto Laa
            com.mirrativ.llstream.decoder.AACDecoder r2 = r8.this$0
            long r4 = com.mirrativ.llstream.decoder.AACDecoder.access$getSmoothQueueLengthWithGap(r2)
            com.mirrativ.llstream.decoder.AACDecoder r2 = r8.this$0
            com.mirrativ.llstream.decoder.AudioDecodeParams r2 = r2.getParams()
            long r6 = r2.getPlaySpeedNormalThreshold()
            long r4 = po.n.e(r4, r6)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto Lab
        Laa:
            r9 = r3
        Lab:
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.decoder.AACDecoder$avoidUnderrun$1.invoke(float):java.lang.Float");
    }
}
