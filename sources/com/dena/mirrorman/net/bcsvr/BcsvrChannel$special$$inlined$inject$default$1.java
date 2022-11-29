package com.dena.mirrorman.net.bcsvr;

import hf.e0;
import io.a;
import jo.f0;
import jo.q;
import oq.b;

/* loaded from: classes2.dex */
public final class BcsvrChannel$special$$inlined$inject$default$1 extends q implements a<e0> {
    public final /* synthetic */ a $parameters;
    public final /* synthetic */ vq.a $qualifier;
    public final /* synthetic */ oq.a $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BcsvrChannel$special$$inlined$inject$default$1(oq.a aVar, vq.a aVar2, a aVar3) {
        super(0);
        this.$this_inject = aVar;
        this.$qualifier = aVar2;
        this.$parameters = aVar3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [hf.e0, java.lang.Object] */
    @Override // io.a
    public final e0 invoke() {
        xq.a b10;
        oq.a aVar = this.$this_inject;
        vq.a aVar2 = this.$qualifier;
        a<? extends uq.a> aVar3 = this.$parameters;
        if (aVar instanceof b) {
            b10 = ((b) aVar).e();
        } else {
            b10 = aVar.getKoin().e().b();
        }
        return b10.c(f0.b(e0.class), aVar2, aVar3);
    }
}
