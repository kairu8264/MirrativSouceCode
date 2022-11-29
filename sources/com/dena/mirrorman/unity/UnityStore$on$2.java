package com.dena.mirrorman.unity;

import ao.d;
import bo.c;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.m;
import wn.v;
import xo.r;

@f(c = "com.dena.mirrorman.unity.UnityStore$on$2", f = "UnityStore.kt", l = {195}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UnityStore$on$2 extends l implements p<q0, d<? super v>, Object> {
    public int label;
    public final /* synthetic */ UnityStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityStore$on$2(UnityStore unityStore, d<? super UnityStore$on$2> dVar) {
        super(2, dVar);
        this.this$0 = unityStore;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new UnityStore$on$2(this.this$0, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((UnityStore$on$2) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        r rVar;
        Object c10 = c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            rVar = this.this$0.initAssetBundleFailedMutableFlow;
            v vVar = v.f59242a;
            this.label = 1;
            if (rVar.emit(vVar, this) == c10) {
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
