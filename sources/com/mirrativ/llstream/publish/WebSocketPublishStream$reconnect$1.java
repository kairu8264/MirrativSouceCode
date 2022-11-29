package com.mirrativ.llstream.publish;

import android.util.Log;
import ao.d;
import bo.c;
import co.f;
import co.l;
import io.p;
import java.util.concurrent.atomic.AtomicBoolean;
import uo.b1;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;

@f(c = "com.mirrativ.llstream.publish.WebSocketPublishStream$reconnect$1", f = "WebSocketPublishStream.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class WebSocketPublishStream$reconnect$1 extends l implements p<q0, d<? super v>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ WebSocketPublishStream this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketPublishStream$reconnect$1(WebSocketPublishStream webSocketPublishStream, d<? super WebSocketPublishStream$reconnect$1> dVar) {
        super(2, dVar);
        this.this$0 = webSocketPublishStream;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        WebSocketPublishStream$reconnect$1 webSocketPublishStream$reconnect$1 = new WebSocketPublishStream$reconnect$1(this.this$0, dVar);
        webSocketPublishStream$reconnect$1.L$0 = obj;
        return webSocketPublishStream$reconnect$1;
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((WebSocketPublishStream$reconnect$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        int i11;
        q0 q0Var;
        AtomicBoolean atomicBoolean;
        int i12;
        AtomicBoolean atomicBoolean2;
        Object c10 = c.c();
        int i13 = this.label;
        if (i13 == 0) {
            m.b(obj);
            q0 q0Var2 = (q0) this.L$0;
            WebSocketPublishStream webSocketPublishStream = this.this$0;
            i10 = webSocketPublishStream.retryCount;
            webSocketPublishStream.retryCount = i10 + 1;
            i11 = this.this$0.retryCount;
            this.L$0 = q0Var2;
            this.label = 1;
            if (b1.a(((long) Math.pow(2.0d, i11)) * 1000, this) == c10) {
                return c10;
            }
            q0Var = q0Var2;
        } else if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            q0Var = (q0) this.L$0;
            m.b(obj);
        }
        r0.f(q0Var);
        atomicBoolean = this.this$0.isNetworkAvailable;
        if (!atomicBoolean.get()) {
            if (Log.isLoggable(WebSocketPublishStream.TAG, 3)) {
                Log.d(WebSocketPublishStream.TAG, "wait until network available");
            }
            atomicBoolean2 = this.this$0.waitUntilNetworkIsAvailable;
            atomicBoolean2.set(true);
            return v.f59242a;
        }
        if (Log.isLoggable(WebSocketPublishStream.TAG, 3)) {
            Log.d(WebSocketPublishStream.TAG, "Reconnecting...");
        }
        this.this$0.resetWebsocket();
        this.this$0.open();
        WebSocketPublishStreamListener listener = this.this$0.getListener();
        if (listener != null) {
            WebSocketPublishStream webSocketPublishStream2 = this.this$0;
            i12 = webSocketPublishStream2.retryCount;
            listener.onRetryToConnect(webSocketPublishStream2, i12);
        }
        return v.f59242a;
    }
}
