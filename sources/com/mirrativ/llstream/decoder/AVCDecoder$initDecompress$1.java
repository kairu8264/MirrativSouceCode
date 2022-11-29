package com.mirrativ.llstream.decoder;

import co.f;

@f(c = "com.mirrativ.llstream.decoder.AVCDecoder", f = "AVCDecoder.kt", l = {473}, m = "initDecompress")
/* loaded from: classes4.dex */
public final class AVCDecoder$initDecompress$1 extends co.d {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AVCDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVCDecoder$initDecompress$1(AVCDecoder aVCDecoder, ao.d<? super AVCDecoder$initDecompress$1> dVar) {
        super(dVar);
        this.this$0 = aVCDecoder;
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object initDecompress;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        initDecompress = this.this$0.initDecompress(this);
        return initDecompress;
    }
}
