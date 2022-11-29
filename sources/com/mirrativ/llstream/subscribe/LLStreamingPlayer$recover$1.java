package com.mirrativ.llstream.subscribe;

import ao.d;
import bo.c;
import co.f;
import co.l;
import io.p;
import uo.b1;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.subscribe.LLStreamingPlayer$recover$1", f = "LLStreamingPlayer.kt", l = {635}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LLStreamingPlayer$recover$1 extends l implements p<q0, d<? super v>, Object> {
    public final /* synthetic */ long $delayMs;
    public int label;
    public final /* synthetic */ LLStreamingPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LLStreamingPlayer$recover$1(long j10, LLStreamingPlayer lLStreamingPlayer, d<? super LLStreamingPlayer$recover$1> dVar) {
        super(2, dVar);
        this.$delayMs = j10;
        this.this$0 = lLStreamingPlayer;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new LLStreamingPlayer$recover$1(this.$delayMs, this.this$0, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((LLStreamingPlayer$recover$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object c10 = c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            long j10 = this.$delayMs;
            this.label = 1;
            if (b1.a(j10, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m.b(obj);
        }
        this.this$0.stop();
        LLStreamingPlayer lLStreamingPlayer = this.this$0;
        lLStreamingPlayer.type = lLStreamingPlayer.savedType;
        this.this$0.play();
        return v.f59242a;
    }
}
