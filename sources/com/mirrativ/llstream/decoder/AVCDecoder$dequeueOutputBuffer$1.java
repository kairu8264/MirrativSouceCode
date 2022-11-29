package com.mirrativ.llstream.decoder;

import co.f;

@f(c = "com.mirrativ.llstream.decoder.AVCDecoder", f = "AVCDecoder.kt", l = {567, 576}, m = "dequeueOutputBuffer")
/* loaded from: classes4.dex */
public final class AVCDecoder$dequeueOutputBuffer$1 extends co.d {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AVCDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVCDecoder$dequeueOutputBuffer$1(AVCDecoder aVCDecoder, ao.d<? super AVCDecoder$dequeueOutputBuffer$1> dVar) {
        super(dVar);
        this.this$0 = aVCDecoder;
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
