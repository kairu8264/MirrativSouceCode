package com.mirrativ.llstream.encoder;

import co.d;
import co.f;

@f(c = "com.mirrativ.llstream.encoder.AACEncoder", f = "AACEncoder.kt", l = {160, 166, 170, 175}, m = "encodeInputLoop")
/* loaded from: classes4.dex */
public final class AACEncoder$encodeInputLoop$1 extends d {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AACEncoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AACEncoder$encodeInputLoop$1(AACEncoder aACEncoder, ao.d<? super AACEncoder$encodeInputLoop$1> dVar) {
        super(dVar);
        this.this$0 = aACEncoder;
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object encodeInputLoop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        encodeInputLoop = this.this$0.encodeInputLoop(this);
        return encodeInputLoop;
    }
}
