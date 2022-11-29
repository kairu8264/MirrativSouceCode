package com.mirrativ.llstream.encoder;

import ao.d;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.v;

@f(c = "com.mirrativ.llstream.encoder.AVCEncoder$startRunning$3", f = "AVCEncoder.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AVCEncoder$startRunning$3 extends l implements p<q0, d<? super v>, Object> {
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ AVCEncoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVCEncoder$startRunning$3(AVCEncoder aVCEncoder, d<? super AVCEncoder$startRunning$3> dVar) {
        super(2, dVar);
        this.this$0 = aVCEncoder;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        AVCEncoder$startRunning$3 aVCEncoder$startRunning$3 = new AVCEncoder$startRunning$3(this.this$0, dVar);
        aVCEncoder$startRunning$3.L$0 = obj;
        return aVCEncoder$startRunning$3;
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((AVCEncoder$startRunning$3) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075 A[Catch: all -> 0x009b, TryCatch #1 {all -> 0x009b, blocks: (B:22:0x006d, B:24:0x0075, B:26:0x0081), top: B:40:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0064 -> B:21:0x006c). Please submit an issue!!! */
    @Override // co.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = bo.c.c()
            int r1 = r10.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            java.lang.Object r1 = r10.L$3
            wo.k r1 = (wo.k) r1
            java.lang.Object r3 = r10.L$2
            wo.x r3 = (wo.x) r3
            java.lang.Object r4 = r10.L$1
            com.mirrativ.llstream.encoder.AVCEncoder r4 = (com.mirrativ.llstream.encoder.AVCEncoder) r4
            java.lang.Object r5 = r10.L$0
            uo.q0 r5 = (uo.q0) r5
            wn.m.b(r11)     // Catch: java.lang.Throwable -> L25
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            goto L6c
        L25:
            r11 = move-exception
            goto L9d
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L30:
            wn.m.b(r11)
            java.lang.Object r11 = r10.L$0
            uo.q0 r11 = (uo.q0) r11
            r1 = r10
        L38:
            com.mirrativ.llstream.encoder.AVCEncoder r3 = r1.this$0
            boolean r3 = com.mirrativ.llstream.encoder.AVCEncoder.access$getKeepAlive$p(r3)
            if (r3 == 0) goto La4
            uo.r0.f(r11)
            com.mirrativ.llstream.encoder.AVCEncoder r3 = r1.this$0
            wo.i r3 = com.mirrativ.llstream.encoder.AVCEncoder.access$getChannel$p(r3)
            com.mirrativ.llstream.encoder.AVCEncoder r4 = r1.this$0
            wo.k r5 = r3.iterator()     // Catch: java.lang.Throwable -> L25
            r9 = r5
            r5 = r11
            r11 = r1
            r1 = r9
        L53:
            r11.L$0 = r5     // Catch: java.lang.Throwable -> L25
            r11.L$1 = r4     // Catch: java.lang.Throwable -> L25
            r11.L$2 = r3     // Catch: java.lang.Throwable -> L25
            r11.L$3 = r1     // Catch: java.lang.Throwable -> L25
            r11.label = r2     // Catch: java.lang.Throwable -> L25
            java.lang.Object r6 = r1.a(r11)     // Catch: java.lang.Throwable -> L25
            if (r6 != r0) goto L64
            return r0
        L64:
            r9 = r0
            r0 = r11
            r11 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r9
        L6c:
            r7 = 0
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L9b
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L9b
            if (r11 == 0) goto L93
            java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> L9b
            com.mirrativ.llstream.encoder.CompressedBuffer r11 = (com.mirrativ.llstream.encoder.CompressedBuffer) r11     // Catch: java.lang.Throwable -> L9b
            com.mirrativ.llstream.encoder.VideoEncoderListener r7 = r5.getListener()     // Catch: java.lang.Throwable -> L9b
            if (r7 == 0) goto L8c
            android.media.MediaCodec$BufferInfo r8 = r11.getInfo()     // Catch: java.lang.Throwable -> L9b
            java.nio.ByteBuffer r11 = r11.getBuffer()     // Catch: java.lang.Throwable -> L9b
            r7.onVideoSampleOutput(r8, r11)     // Catch: java.lang.Throwable -> L9b
        L8c:
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            goto L53
        L93:
            wo.n.a(r4, r7)
            r11 = r6
            r9 = r1
            r1 = r0
            r0 = r9
            goto L38
        L9b:
            r11 = move-exception
            goto L9e
        L9d:
            r4 = r3
        L9e:
            throw r11     // Catch: java.lang.Throwable -> L9f
        L9f:
            r0 = move-exception
            wo.n.a(r4, r11)
            throw r0
        La4:
            wn.v r11 = wn.v.f59242a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.encoder.AVCEncoder$startRunning$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
