package com.mirrativ.llstream.subscribe;

import ao.d;
import bo.c;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.subscribe.LLStreamingPlayer$checkHealth$2", f = "LLStreamingPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LLStreamingPlayer$checkHealth$2 extends l implements p<q0, d<? super v>, Object> {
    public int label;
    public final /* synthetic */ LLStreamingPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LLStreamingPlayer$checkHealth$2(LLStreamingPlayer lLStreamingPlayer, d<? super LLStreamingPlayer$checkHealth$2> dVar) {
        super(2, dVar);
        this.this$0 = lLStreamingPlayer;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new LLStreamingPlayer$checkHealth$2(this.this$0, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((LLStreamingPlayer$checkHealth$2) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        c.c();
        if (this.label == 0) {
            m.b(obj);
            this.this$0.fallback();
            return v.f59242a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
