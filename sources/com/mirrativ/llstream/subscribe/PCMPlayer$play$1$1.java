package com.mirrativ.llstream.subscribe;

import ao.d;
import bo.c;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.subscribe.PCMPlayer$play$1$1", f = "PCMPlayer.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PCMPlayer$play$1$1 extends l implements p<q0, d<? super v>, Object> {
    public int label;
    public final /* synthetic */ PCMPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCMPlayer$play$1$1(PCMPlayer pCMPlayer, d<? super PCMPlayer$play$1$1> dVar) {
        super(2, dVar);
        this.this$0 = pCMPlayer;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new PCMPlayer$play$1$1(this.this$0, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((PCMPlayer$play$1$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object receiveLoop;
        Object c10 = c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            PCMPlayer pCMPlayer = this.this$0;
            this.label = 1;
            receiveLoop = pCMPlayer.receiveLoop(this);
            if (receiveLoop == c10) {
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
