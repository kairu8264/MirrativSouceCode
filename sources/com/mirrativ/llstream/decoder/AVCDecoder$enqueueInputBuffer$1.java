package com.mirrativ.llstream.decoder;

import co.f;

@f(c = "com.mirrativ.llstream.decoder.AVCDecoder", f = "AVCDecoder.kt", l = {503, 527}, m = "enqueueInputBuffer")
/* loaded from: classes4.dex */
public final class AVCDecoder$enqueueInputBuffer$1 extends co.d {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AVCDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVCDecoder$enqueueInputBuffer$1(AVCDecoder aVCDecoder, ao.d<? super AVCDecoder$enqueueInputBuffer$1> dVar) {
        super(dVar);
        this.this$0 = aVCDecoder;
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object enqueueInputBuffer;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        enqueueInputBuffer = this.this$0.enqueueInputBuffer(null, this);
        return enqueueInputBuffer;
    }
}
