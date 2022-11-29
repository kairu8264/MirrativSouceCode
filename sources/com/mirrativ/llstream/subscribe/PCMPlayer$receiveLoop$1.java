package com.mirrativ.llstream.subscribe;

import co.d;
import co.f;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;

@f(c = "com.mirrativ.llstream.subscribe.PCMPlayer", f = "PCMPlayer.kt", l = {PsExtractor.AUDIO_STREAM}, m = "receiveLoop")
/* loaded from: classes4.dex */
public final class PCMPlayer$receiveLoop$1 extends d {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PCMPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCMPlayer$receiveLoop$1(PCMPlayer pCMPlayer, ao.d<? super PCMPlayer$receiveLoop$1> dVar) {
        super(dVar);
        this.this$0 = pCMPlayer;
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object receiveLoop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        receiveLoop = this.this$0.receiveLoop(this);
        return receiveLoop;
    }
}
