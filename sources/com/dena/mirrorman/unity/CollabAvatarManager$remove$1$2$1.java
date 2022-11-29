package com.dena.mirrorman.unity;

import ao.d;
import bo.c;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.dena.mirrorman.unity.CollabAvatarManager$remove$1$2$1", f = "CollabAvatarManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CollabAvatarManager$remove$1$2$1 extends l implements p<q0, d<? super v>, Object> {
    public final /* synthetic */ CollabAvatar $it;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollabAvatarManager$remove$1$2$1(CollabAvatar collabAvatar, d<? super CollabAvatarManager$remove$1$2$1> dVar) {
        super(2, dVar);
        this.$it = collabAvatar;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new CollabAvatarManager$remove$1$2$1(this.$it, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((CollabAvatarManager$remove$1$2$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        c.c();
        if (this.label == 0) {
            m.b(obj);
            UnityManager.Companion.getInstance().unloadAvatarModel(this.$it.getSlot());
            return v.f59242a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
