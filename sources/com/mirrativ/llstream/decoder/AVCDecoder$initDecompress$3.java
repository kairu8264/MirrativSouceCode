package com.mirrativ.llstream.decoder;

import android.view.Choreographer;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.decoder.AVCDecoder$initDecompress$3", f = "AVCDecoder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AVCDecoder$initDecompress$3 extends l implements p<q0, ao.d<? super v>, Object> {
    public int label;
    public final /* synthetic */ AVCDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVCDecoder$initDecompress$3(AVCDecoder aVCDecoder, ao.d<? super AVCDecoder$initDecompress$3> dVar) {
        super(2, dVar);
        this.this$0 = aVCDecoder;
    }

    @Override // co.a
    public final ao.d<v> create(Object obj, ao.d<?> dVar) {
        return new AVCDecoder$initDecompress$3(this.this$0, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
        return ((AVCDecoder$initDecompress$3) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Choreographer choreographer;
        bo.c.c();
        if (this.label == 0) {
            m.b(obj);
            this.this$0.choreographer = Choreographer.getInstance();
            choreographer = this.this$0.choreographer;
            if (choreographer != null) {
                choreographer.postFrameCallback(this.this$0);
                return v.f59242a;
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
