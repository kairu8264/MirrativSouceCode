package com.mirrativ.llstream.decoder;

import android.util.Log;
import co.f;
import co.l;
import com.mirrativ.llstream.subscribe.PCMPlayer;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.decoder.AACDecoder$play$2", f = "AACDecoder.kt", l = {554}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AACDecoder$play$2 extends l implements p<q0, ao.d<? super v>, Object> {
    public final /* synthetic */ PCMPlayer $player;
    public int label;
    public final /* synthetic */ AACDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AACDecoder$play$2(AACDecoder aACDecoder, PCMPlayer pCMPlayer, ao.d<? super AACDecoder$play$2> dVar) {
        super(2, dVar);
        this.this$0 = aACDecoder;
        this.$player = pCMPlayer;
    }

    @Override // co.a
    public final ao.d<v> create(Object obj, ao.d<?> dVar) {
        return new AACDecoder$play$2(this.this$0, this.$player, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
        return ((AACDecoder$play$2) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object createRenderDequeueLoop;
        Object c10 = bo.c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            AACDecoder aACDecoder = this.this$0;
            PCMPlayer pCMPlayer = this.$player;
            this.label = 1;
            createRenderDequeueLoop = aACDecoder.createRenderDequeueLoop(pCMPlayer, this);
            if (createRenderDequeueLoop == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m.b(obj);
        }
        Log.i("AACDecoder", "audio play loop finished");
        return v.f59242a;
    }
}
