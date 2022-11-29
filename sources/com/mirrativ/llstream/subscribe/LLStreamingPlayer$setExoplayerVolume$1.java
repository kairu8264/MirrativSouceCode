package com.mirrativ.llstream.subscribe;

import ao.d;
import bo.c;
import co.f;
import co.l;
import com.google.android.exoplayer2.SimpleExoPlayer;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.subscribe.LLStreamingPlayer$setExoplayerVolume$1", f = "LLStreamingPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LLStreamingPlayer$setExoplayerVolume$1 extends l implements p<q0, d<? super v>, Object> {
    public final /* synthetic */ float $value;
    public int label;
    public final /* synthetic */ LLStreamingPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LLStreamingPlayer$setExoplayerVolume$1(LLStreamingPlayer lLStreamingPlayer, float f10, d<? super LLStreamingPlayer$setExoplayerVolume$1> dVar) {
        super(2, dVar);
        this.this$0 = lLStreamingPlayer;
        this.$value = f10;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new LLStreamingPlayer$setExoplayerVolume$1(this.this$0, this.$value, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((LLStreamingPlayer$setExoplayerVolume$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        SimpleExoPlayer simpleExoPlayer;
        c.c();
        if (this.label == 0) {
            m.b(obj);
            simpleExoPlayer = this.this$0.exoPlayer;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setVolume(this.$value);
            }
            return v.f59242a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
