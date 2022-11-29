package com.mirrativ.llstream.decoder;

import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.v;

@f(c = "com.mirrativ.llstream.decoder.AACDecoder$initDecompress$2", f = "AACDecoder.kt", l = {300}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AACDecoder$initDecompress$2 extends l implements p<q0, ao.d<? super v>, Object> {
    public final /* synthetic */ int $channel;
    public int label;
    public final /* synthetic */ AACDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AACDecoder$initDecompress$2(AACDecoder aACDecoder, int i10, ao.d<? super AACDecoder$initDecompress$2> dVar) {
        super(2, dVar);
        this.this$0 = aACDecoder;
        this.$channel = i10;
    }

    @Override // co.a
    public final ao.d<v> create(Object obj, ao.d<?> dVar) {
        return new AACDecoder$initDecompress$2(this.this$0, this.$channel, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
        return ((AACDecoder$initDecompress$2) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0021 */
    @Override // co.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = bo.c.c()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L14:
            wn.m.b(r4)
        L17:
            com.mirrativ.llstream.decoder.AACDecoder r4 = r3.this$0
            java.util.concurrent.atomic.AtomicBoolean r4 = com.mirrativ.llstream.decoder.AACDecoder.access$getDecoding$p(r4)
            boolean r4 = r4.get()
            if (r4 == 0) goto L30
            com.mirrativ.llstream.decoder.AACDecoder r4 = r3.this$0
            int r1 = r3.$channel
            r3.label = r2
            java.lang.Object r4 = com.mirrativ.llstream.decoder.AACDecoder.access$selectFormatChanged(r4, r1, r3)
            if (r4 != r0) goto L17
            return r0
        L30:
            java.lang.String r4 = "AACDecoder"
            java.lang.String r0 = "audio select loop finished"
            android.util.Log.i(r4, r0)
            wn.v r4 = wn.v.f59242a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.decoder.AACDecoder$initDecompress$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
