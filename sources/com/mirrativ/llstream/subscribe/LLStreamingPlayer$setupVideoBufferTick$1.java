package com.mirrativ.llstream.subscribe;

import ao.d;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.v;

@f(c = "com.mirrativ.llstream.subscribe.LLStreamingPlayer$setupVideoBufferTick$1", f = "LLStreamingPlayer.kt", l = {534}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LLStreamingPlayer$setupVideoBufferTick$1 extends l implements p<q0, d<? super v>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ LLStreamingPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LLStreamingPlayer$setupVideoBufferTick$1(LLStreamingPlayer lLStreamingPlayer, d<? super LLStreamingPlayer$setupVideoBufferTick$1> dVar) {
        super(2, dVar);
        this.this$0 = lLStreamingPlayer;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        LLStreamingPlayer$setupVideoBufferTick$1 lLStreamingPlayer$setupVideoBufferTick$1 = new LLStreamingPlayer$setupVideoBufferTick$1(this.this$0, dVar);
        lLStreamingPlayer$setupVideoBufferTick$1.L$0 = obj;
        return lLStreamingPlayer$setupVideoBufferTick$1;
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((LLStreamingPlayer$setupVideoBufferTick$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[Catch: CancellationException -> 0x004d, TryCatch #0 {CancellationException -> 0x004d, blocks: (B:6:0x000f, B:16:0x003e, B:11:0x0025, B:13:0x0031, B:18:0x0049), top: B:25:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[Catch: CancellationException -> 0x004d, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x004d, blocks: (B:6:0x000f, B:16:0x003e, B:11:0x0025, B:13:0x0031, B:18:0x0049), top: B:25:0x000f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003b -> B:16:0x003e). Please submit an issue!!! */
    @Override // co.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = bo.c.c()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r5.L$0
            uo.q0 r1 = (uo.q0) r1
            wn.m.b(r6)     // Catch: java.util.concurrent.CancellationException -> L4d
            r6 = r5
            goto L3e
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            wn.m.b(r6)
            java.lang.Object r6 = r5.L$0
            uo.q0 r6 = (uo.q0) r6
            r1 = r6
            r6 = r5
        L25:
            com.mirrativ.llstream.subscribe.LLStreamingPlayer r3 = r6.this$0     // Catch: java.util.concurrent.CancellationException -> L4d
            java.util.concurrent.atomic.AtomicBoolean r3 = com.mirrativ.llstream.subscribe.LLStreamingPlayer.access$isVideoPlaying$p(r3)     // Catch: java.util.concurrent.CancellationException -> L4d
            boolean r3 = r3.get()     // Catch: java.util.concurrent.CancellationException -> L4d
            if (r3 == 0) goto L5b
            r3 = 100
            r6.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L4d
            r6.label = r2     // Catch: java.util.concurrent.CancellationException -> L4d
            java.lang.Object r3 = uo.b1.a(r3, r6)     // Catch: java.util.concurrent.CancellationException -> L4d
            if (r3 != r0) goto L3e
            return r0
        L3e:
            uo.r0.f(r1)     // Catch: java.util.concurrent.CancellationException -> L4d
            com.mirrativ.llstream.subscribe.LLStreamingPlayer r3 = r6.this$0     // Catch: java.util.concurrent.CancellationException -> L4d
            com.mirrativ.llstream.subscribe.AVCStreamer r3 = com.mirrativ.llstream.subscribe.LLStreamingPlayer.access$getAvcStreamer$p(r3)     // Catch: java.util.concurrent.CancellationException -> L4d
            if (r3 == 0) goto L25
            r3.tick()     // Catch: java.util.concurrent.CancellationException -> L4d
            goto L25
        L4d:
            r6 = 3
            java.lang.String r0 = "LLStreamingPlayer"
            boolean r6 = android.util.Log.isLoggable(r0, r6)
            if (r6 == 0) goto L5b
            java.lang.String r6 = "videoLoop has been cancelled"
            android.util.Log.d(r0, r6)
        L5b:
            wn.v r6 = wn.v.f59242a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.subscribe.LLStreamingPlayer$setupVideoBufferTick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
