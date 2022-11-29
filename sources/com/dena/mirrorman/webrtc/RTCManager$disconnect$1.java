package com.dena.mirrorman.webrtc;

import ao.d;
import bo.c;
import co.f;
import co.l;
import io.p;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.dena.mirrorman.webrtc.RTCManager$disconnect$1", f = "RTCManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RTCManager$disconnect$1 extends l implements p<q0, d<? super v>, Object> {
    public final /* synthetic */ RTCClient $client;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCManager$disconnect$1(RTCClient rTCClient, d<? super RTCManager$disconnect$1> dVar) {
        super(2, dVar);
        this.$client = rTCClient;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new RTCManager$disconnect$1(this.$client, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((RTCManager$disconnect$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        c.c();
        if (this.label == 0) {
            m.b(obj);
            this.$client.close();
            return v.f59242a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
