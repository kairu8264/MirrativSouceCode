package com.dena.mirrorman.unity;

import ao.d;
import bo.c;
import co.f;
import co.l;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import io.p;
import uo.b1;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.dena.mirrorman.unity.UnityManager$closetFocus$1", f = "UnityManager.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UnityManager$closetFocus$1 extends l implements p<q0, d<? super v>, Object> {
    public int label;
    public final /* synthetic */ UnityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityManager$closetFocus$1(UnityManager unityManager, d<? super UnityManager$closetFocus$1> dVar) {
        super(2, dVar);
        this.this$0 = unityManager;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new UnityManager$closetFocus$1(this.this$0, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((UnityManager$closetFocus$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object c10 = c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            this.label = 1;
            if (b1.a(100L, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m.b(obj);
        }
        this.this$0.addClosetDolly(1.0f);
        this.this$0.addClosetDollyJob = null;
        return v.f59242a;
    }
}
