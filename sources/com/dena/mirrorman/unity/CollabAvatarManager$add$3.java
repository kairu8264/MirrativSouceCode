package com.dena.mirrorman.unity;

import ao.d;
import bo.c;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.dena.mirrorman.unity.CollabAvatarManager$add$3", f = "CollabAvatarManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CollabAvatarManager$add$3 extends l implements p<q0, d<? super v>, Object> {
    public final /* synthetic */ CollabAvatar $collabAvatar;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollabAvatarManager$add$3(CollabAvatar collabAvatar, d<? super CollabAvatarManager$add$3> dVar) {
        super(2, dVar);
        this.$collabAvatar = collabAvatar;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new CollabAvatarManager$add$3(this.$collabAvatar, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((CollabAvatarManager$add$3) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        c.c();
        if (this.label == 0) {
            m.b(obj);
            UnityManager.Companion.getInstance().loadAvatarModel(this.$collabAvatar.getClosetAvatarModel(), this.$collabAvatar.getSlot());
            return v.f59242a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
