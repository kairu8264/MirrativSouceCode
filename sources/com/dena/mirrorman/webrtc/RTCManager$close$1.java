package com.dena.mirrorman.webrtc;

import ao.d;
import bo.c;
import co.f;
import co.l;
import io.p;
import java.util.HashMap;
import org.webrtc.PeerConnectionFactory;
import uo.q0;
import wn.m;
import wn.v;

@f(c = "com.dena.mirrorman.webrtc.RTCManager$close$1", f = "RTCManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RTCManager$close$1 extends l implements p<q0, d<? super v>, Object> {
    public final /* synthetic */ boolean $isMirroring;
    public int label;
    public final /* synthetic */ RTCManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCManager$close$1(RTCManager rTCManager, boolean z10, d<? super RTCManager$close$1> dVar) {
        super(2, dVar);
        this.this$0 = rTCManager;
        this.$isMirroring = z10;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new RTCManager$close$1(this.this$0, this.$isMirroring, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((RTCManager$close$1) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        v vVar;
        RTCAudioManager audioManager;
        PeerConnectionFactory factory;
        c.c();
        if (this.label == 0) {
            m.b(obj);
            HashMap<String, RTCClient> clients = this.this$0.getClients();
            RTCManager rTCManager = this.this$0;
            synchronized (clients) {
                for (RTCClient rTCClient : rTCManager.getClients().values()) {
                    rTCClient.close();
                }
                rTCManager.getClients().clear();
                vVar = v.f59242a;
            }
            if (!this.$isMirroring) {
                factory = this.this$0.getFactory();
                factory.dispose();
            }
            audioManager = this.this$0.getAudioManager();
            audioManager.close();
            return vVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
