package com.mirrativ.llstream.decoder;

import co.f;

@f(c = "com.mirrativ.llstream.decoder.AVCDecoder", f = "AVCDecoder.kt", l = {492, 493}, m = "decode")
/* loaded from: classes4.dex */
public final class AVCDecoder$decode$1 extends co.d {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AVCDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVCDecoder$decode$1(AVCDecoder aVCDecoder, ao.d<? super AVCDecoder$decode$1> dVar) {
        super(dVar);
        this.this$0 = aVCDecoder;
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object decode;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        decode = this.this$0.decode(this);
        return decode;
    }
}
