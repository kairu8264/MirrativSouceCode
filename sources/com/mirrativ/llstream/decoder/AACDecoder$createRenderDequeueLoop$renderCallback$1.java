package com.mirrativ.llstream.decoder;

import ao.g;
import co.f;
import com.mirrativ.llstream.subscribe.PCMPlayer;
import io.l;
import io.p;
import java.util.concurrent.atomic.AtomicLong;
import jo.q;
import uo.q0;
import wn.m;
import wn.v;

/* loaded from: classes4.dex */
public final class AACDecoder$createRenderDequeueLoop$renderCallback$1 extends q implements l<PCMData, v> {
    public final /* synthetic */ PCMPlayer $player;
    public final /* synthetic */ AtomicLong $underrunCount;
    public final /* synthetic */ AACDecoder this$0;

    @f(c = "com.mirrativ.llstream.decoder.AACDecoder$createRenderDequeueLoop$renderCallback$1$1", f = "AACDecoder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.mirrativ.llstream.decoder.AACDecoder$createRenderDequeueLoop$renderCallback$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends co.l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ PCMData $it;
        public final /* synthetic */ PCMPlayer $player;
        public final /* synthetic */ AtomicLong $underrunCount;
        public int label;
        public final /* synthetic */ AACDecoder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PCMData pCMData, AACDecoder aACDecoder, AtomicLong atomicLong, PCMPlayer pCMPlayer, ao.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$it = pCMData;
            this.this$0 = aACDecoder;
            this.$underrunCount = atomicLong;
            this.$player = pCMPlayer;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new AnonymousClass1(this.$it, this.this$0, this.$underrunCount, this.$player, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((AnonymousClass1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.label == 0) {
                m.b(obj);
                if (this.$it.getPts() > 0) {
                    this.this$0.getCoordinator().getAudioPacketLastPlayedPTS().set(this.$it.getPts());
                    this.this$0.getCoordinator().getConfig().getRemainingScheduledBufferSize().decrementAndGet();
                    if (this.this$0.getCoordinator().getConfig().getRemainingScheduledBufferSize().get() < 1 && this.$underrunCount.incrementAndGet() > this.this$0.getParams().getThresholdOfUnderrunCountForFadeOut()) {
                        this.$player.setVolume(0.0f);
                    }
                }
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AACDecoder$createRenderDequeueLoop$renderCallback$1(AACDecoder aACDecoder, AtomicLong atomicLong, PCMPlayer pCMPlayer) {
        super(1);
        this.this$0 = aACDecoder;
        this.$underrunCount = atomicLong;
        this.$player = pCMPlayer;
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ v invoke(PCMData pCMData) {
        invoke2(pCMData);
        return v.f59242a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PCMData pCMData) {
        g gVar;
        jo.p.h(pCMData, "it");
        q0 coroutineScope = this.this$0.getCoroutineScope();
        gVar = this.this$0.playContext;
        uo.l.d(coroutineScope, gVar, null, new AnonymousClass1(pCMData, this.this$0, this.$underrunCount, this.$player, null), 2, null);
    }
}
