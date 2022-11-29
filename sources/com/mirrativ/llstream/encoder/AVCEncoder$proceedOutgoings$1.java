package com.mirrativ.llstream.encoder;

import co.d;
import co.f;

@f(c = "com.mirrativ.llstream.encoder.AVCEncoder", f = "AVCEncoder.kt", l = {169, 174}, m = "proceedOutgoings")
/* loaded from: classes4.dex */
public final class AVCEncoder$proceedOutgoings$1 extends d {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AVCEncoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVCEncoder$proceedOutgoings$1(AVCEncoder aVCEncoder, ao.d<? super AVCEncoder$proceedOutgoings$1> dVar) {
        super(dVar);
        this.this$0 = aVCEncoder;
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object proceedOutgoings;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        proceedOutgoings = this.this$0.proceedOutgoings(this);
        return proceedOutgoings;
    }
}
