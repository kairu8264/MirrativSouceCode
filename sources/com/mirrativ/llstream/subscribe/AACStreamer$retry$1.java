package com.mirrativ.llstream.subscribe;

import ao.d;
import bo.c;
import co.f;
import co.l;
import io.p;
import java.net.URI;
import java.util.concurrent.atomic.AtomicInteger;
import uo.b1;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.subscribe.AACStreamer$retry$1", f = "AACStreamer.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AACStreamer$retry$1 extends l implements p<q0, d<? super v>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AACStreamer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AACStreamer$retry$1(AACStreamer aACStreamer, d<? super AACStreamer$retry$1> dVar) {
        super(2, dVar);
        this.this$0 = aACStreamer;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        AACStreamer$retry$1 aACStreamer$retry$1 = new AACStreamer$retry$1(this.this$0, dVar);
        aACStreamer$retry$1.L$0 = obj;
        return aACStreamer$retry$1;
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((AACStreamer$retry$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        AtomicInteger atomicInteger;
        q0 q0Var;
        WebSocketStream webSocketStream;
        Object c10 = c.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            q0 q0Var2 = (q0) this.L$0;
            atomicInteger = this.this$0.retryCount;
            this.L$0 = q0Var2;
            this.label = 1;
            if (b1.a((long) (Math.pow(2.0d, atomicInteger.get()) * 1000), this) == c10) {
                return c10;
            }
            q0Var = q0Var2;
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            q0Var = (q0) this.L$0;
            m.b(obj);
        }
        r0.f(q0Var);
        this.this$0.webSocket = new WebSocketStream(this.this$0.getCoroutineScope(), new URI(this.this$0.getUrl()), "", this.this$0);
        webSocketStream = this.this$0.webSocket;
        if (webSocketStream != null) {
            webSocketStream.open();
        }
        return v.f59242a;
    }
}
