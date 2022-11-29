package com.mirrativ.llstream.encoder;

import ao.d;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.v;

@f(c = "com.mirrativ.llstream.encoder.AACEncoder$startRunning$3", f = "AACEncoder.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AACEncoder$startRunning$3 extends l implements p<q0, d<? super v>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AACEncoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AACEncoder$startRunning$3(AACEncoder aACEncoder, d<? super AACEncoder$startRunning$3> dVar) {
        super(2, dVar);
        this.this$0 = aACEncoder;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        AACEncoder$startRunning$3 aACEncoder$startRunning$3 = new AACEncoder$startRunning$3(this.this$0, dVar);
        aACEncoder$startRunning$3.L$0 = obj;
        return aACEncoder$startRunning$3;
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((AACEncoder$startRunning$3) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0029 */
    @Override // co.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = bo.c.c()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r5.L$0
            uo.q0 r1 = (uo.q0) r1
            wn.m.b(r6)
            goto L23
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            wn.m.b(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            uo.q0 r1 = (uo.q0) r1
        L23:
            com.mirrativ.llstream.encoder.AACEncoder r6 = r5.this$0
            boolean r6 = com.mirrativ.llstream.encoder.AACEncoder.access$getKeepAlive$p(r6)
            if (r6 == 0) goto L5d
            uo.r0.f(r1)
            com.mirrativ.llstream.encoder.AACEncoder r6 = r5.this$0
            java.util.concurrent.ConcurrentLinkedQueue r6 = com.mirrativ.llstream.encoder.AACEncoder.access$getOutputQueue$p(r6)
            java.lang.Object r6 = r6.poll()
            com.mirrativ.llstream.encoder.CompressedBuffer r6 = (com.mirrativ.llstream.encoder.CompressedBuffer) r6
            if (r6 != 0) goto L49
            r5.L$0 = r1
            r5.label = r2
            r3 = 20
            java.lang.Object r6 = uo.b1.a(r3, r5)
            if (r6 != r0) goto L23
            return r0
        L49:
            com.mirrativ.llstream.encoder.AACEncoder r3 = r5.this$0
            com.mirrativ.llstream.encoder.AudioEncoderListener r3 = r3.getListener()
            if (r3 == 0) goto L23
            android.media.MediaCodec$BufferInfo r4 = r6.getInfo()
            java.nio.ByteBuffer r6 = r6.getBuffer()
            r3.onAudioSampleOutput(r4, r6)
            goto L23
        L5d:
            wn.v r6 = wn.v.f59242a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.encoder.AACEncoder$startRunning$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
