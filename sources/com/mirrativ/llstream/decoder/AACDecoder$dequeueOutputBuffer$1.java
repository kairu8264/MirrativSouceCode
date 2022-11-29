package com.mirrativ.llstream.decoder;

import co.f;

@f(c = "com.mirrativ.llstream.decoder.AACDecoder", f = "AACDecoder.kt", l = {481, 499}, m = "dequeueOutputBuffer")
/* loaded from: classes4.dex */
public final class AACDecoder$dequeueOutputBuffer$1 extends co.d {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AACDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AACDecoder$dequeueOutputBuffer$1(AACDecoder aACDecoder, ao.d<? super AACDecoder$dequeueOutputBuffer$1> dVar) {
        super(dVar);
        this.this$0 = aACDecoder;
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object dequeueOutputBuffer;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        dequeueOutputBuffer = this.this$0.dequeueOutputBuffer(null, this);
        return dequeueOutputBuffer;
    }
}
