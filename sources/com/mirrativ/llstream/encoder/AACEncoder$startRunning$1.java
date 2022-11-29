package com.mirrativ.llstream.encoder;

import ao.d;
import bo.c;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.encoder.AACEncoder$startRunning$1", f = "AACEncoder.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AACEncoder$startRunning$1 extends l implements p<q0, d<? super v>, Object> {
    public int label;
    public final /* synthetic */ AACEncoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AACEncoder$startRunning$1(AACEncoder aACEncoder, d<? super AACEncoder$startRunning$1> dVar) {
        super(2, dVar);
        this.this$0 = aACEncoder;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new AACEncoder$startRunning$1(this.this$0, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((AACEncoder$startRunning$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object encodeInputLoop;
        Object c10 = c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            AACEncoder aACEncoder = this.this$0;
            this.label = 1;
            encodeInputLoop = aACEncoder.encodeInputLoop(this);
            if (encodeInputLoop == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m.b(obj);
        }
        return v.f59242a;
    }
}
