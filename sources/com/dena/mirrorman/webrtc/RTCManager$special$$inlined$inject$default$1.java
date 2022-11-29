package com.dena.mirrorman.webrtc;

import jo.f0;
import jo.q;

/* loaded from: classes3.dex */
public final class RTCManager$special$$inlined$inject$default$1 extends q implements io.a<q8.a> {
    public final /* synthetic */ io.a $parameters;
    public final /* synthetic */ vq.a $qualifier;
    public final /* synthetic */ oq.a $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCManager$special$$inlined$inject$default$1(oq.a aVar, vq.a aVar2, io.a aVar3) {
        super(0);
        this.$this_inject = aVar;
        this.$qualifier = aVar2;
        this.$parameters = aVar3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, q8.a] */
    @Override // io.a
    public final q8.a invoke() {
        xq.a b10;
        oq.a aVar = this.$this_inject;
        vq.a aVar2 = this.$qualifier;
        io.a<? extends uq.a> aVar3 = this.$parameters;
        if (aVar instanceof oq.b) {
            b10 = ((oq.b) aVar).e();
        } else {
            b10 = aVar.getKoin().e().b();
        }
        return b10.c(f0.b(q8.a.class), aVar2, aVar3);
    }
}
