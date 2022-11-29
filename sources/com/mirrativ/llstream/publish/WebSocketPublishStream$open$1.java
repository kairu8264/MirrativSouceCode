package com.mirrativ.llstream.publish;

import ao.d;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.v;

@f(c = "com.mirrativ.llstream.publish.WebSocketPublishStream$open$1", f = "WebSocketPublishStream.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class WebSocketPublishStream$open$1 extends l implements p<q0, d<? super v>, Object> {
    public int label;
    public final /* synthetic */ WebSocketPublishStream this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketPublishStream$open$1(WebSocketPublishStream webSocketPublishStream, d<? super WebSocketPublishStream$open$1> dVar) {
        super(2, dVar);
        this.this$0 = webSocketPublishStream;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new WebSocketPublishStream$open$1(this.this$0, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((WebSocketPublishStream$open$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0021 */
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
            if (r1 == 0) goto L14
            if (r1 != r2) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L14:
            wn.m.b(r6)
        L17:
            com.mirrativ.llstream.publish.WebSocketPublishStream r6 = r5.this$0
            java.util.concurrent.atomic.AtomicBoolean r6 = com.mirrativ.llstream.publish.WebSocketPublishStream.access$isActive$p(r6)
            boolean r6 = r6.get()
            if (r6 == 0) goto L33
            com.mirrativ.llstream.publish.WebSocketPublishStream r6 = r5.this$0
            com.mirrativ.llstream.publish.WebSocketPublishStream.access$checkSent(r6)
            r5.label = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = uo.b1.a(r3, r5)
            if (r6 != r0) goto L17
            return r0
        L33:
            wn.v r6 = wn.v.f59242a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.publish.WebSocketPublishStream$open$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
