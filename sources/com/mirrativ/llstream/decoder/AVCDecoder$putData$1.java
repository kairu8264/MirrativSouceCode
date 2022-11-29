package com.mirrativ.llstream.decoder;

import co.f;

@f(c = "com.mirrativ.llstream.decoder.AVCDecoder", f = "AVCDecoder.kt", l = {225, 232}, m = "putData")
/* loaded from: classes4.dex */
public final class AVCDecoder$putData$1 extends co.d {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AVCDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVCDecoder$putData$1(AVCDecoder aVCDecoder, ao.d<? super AVCDecoder$putData$1> dVar) {
        super(dVar);
        this.this$0 = aVCDecoder;
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.putData(null, 0L, null, this);
    }
}
