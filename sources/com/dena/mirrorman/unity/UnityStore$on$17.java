package com.dena.mirrorman.unity;

import ao.d;
import bo.c;
import co.f;
import co.l;
import com.dena.mirrorman.unity.UnityActionEvent;
import io.p;
import uo.q0;
import wn.m;
import wn.v;
import xo.r;

@f(c = "com.dena.mirrorman.unity.UnityStore$on$17", f = "UnityStore.kt", l = {316}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UnityStore$on$17 extends l implements p<q0, d<? super v>, Object> {
    public final /* synthetic */ UnityActionEvent.MiniGameOutputEmomoRunTouchResultShare $event;
    public int label;
    public final /* synthetic */ UnityStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityStore$on$17(UnityStore unityStore, UnityActionEvent.MiniGameOutputEmomoRunTouchResultShare miniGameOutputEmomoRunTouchResultShare, d<? super UnityStore$on$17> dVar) {
        super(2, dVar);
        this.this$0 = unityStore;
        this.$event = miniGameOutputEmomoRunTouchResultShare;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new UnityStore$on$17(this.this$0, this.$event, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((UnityStore$on$17) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        r rVar;
        Object c10 = c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            rVar = this.this$0.miniGameOutputTouchResultShareMutableFlow;
            EmomoGameName gameName = this.$event.getGameName();
            this.label = 1;
            if (rVar.emit(gameName, this) == c10) {
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
