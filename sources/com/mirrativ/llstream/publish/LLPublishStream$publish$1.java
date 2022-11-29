package com.mirrativ.llstream.publish;

import android.util.Log;
import ao.d;
import bo.c;
import co.f;
import co.l;
import com.mirrativ.llstream.decoder.a;
import io.p;
import uo.b1;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.publish.LLPublishStream$publish$1", f = "LLPublishStream.kt", l = {154}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LLPublishStream$publish$1 extends l implements p<q0, d<? super v>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ LLPublishStream this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LLPublishStream$publish$1(LLPublishStream lLPublishStream, d<? super LLPublishStream$publish$1> dVar) {
        super(2, dVar);
        this.this$0 = lLPublishStream;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        LLPublishStream$publish$1 lLPublishStream$publish$1 = new LLPublishStream$publish$1(this.this$0, dVar);
        lLPublishStream$publish$1.L$0 = obj;
        return lLPublishStream$publish$1;
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((LLPublishStream$publish$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        q0 q0Var;
        Object c10 = c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            q0Var = (q0) this.L$0;
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            q0Var = (q0) this.L$0;
            m.b(obj);
        }
        do {
            r0.f(q0Var);
            if (this.this$0.getTotalQueuedOutCount() - this.this$0.getTotalOutCount() <= LLPublishStream.Companion.getMaxDelayFrameCount()) {
                LLPublishStreamListener listener = this.this$0.getListener();
                if (listener != null) {
                    listener.onPublishSufficientBitrate(this.this$0);
                }
            } else {
                LLPublishStreamListener listener2 = this.this$0.getListener();
                if (listener2 != null) {
                    listener2.onPublishInsufficientBitrate(this.this$0);
                }
            }
            if (Log.isLoggable(LLPublishStream.TAG, 2)) {
                StringBuilder a10 = a.a("totalQueuedOutCount: ");
                a10.append(this.this$0.getTotalQueuedOutCount());
                a10.append(", totalOutCount: ");
                a10.append(this.this$0.getTotalOutCount());
                Log.v(LLPublishStream.TAG, a10.toString());
                Log.v(LLPublishStream.TAG, "totalQueuedOutBytes: " + this.this$0.getTotalQueuedOutBytes() + ", totalOutBytes: " + this.this$0.getTotalOutBytes());
            }
            this.L$0 = q0Var;
            this.label = 1;
        } while (b1.a(1000L, this) != c10);
        return c10;
    }
}
