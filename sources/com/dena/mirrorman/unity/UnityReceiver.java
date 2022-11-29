package com.dena.mirrorman.unity;

import com.mirrativ.unityavatar.UnityPlayerToAndroid;
import dq.c;
import dq.l;
import ff.c;
import hf.n;
import jo.p;
import nd.r0;
import oq.a;

/* loaded from: classes3.dex */
public final class UnityReceiver implements UnityPlayerToAndroid.ICallback, a {
    public static final int $stable = 8;
    private final n createUnityActionEvent;
    private final q8.a dispatcher;

    public UnityReceiver(q8.a aVar, n nVar) {
        p.h(aVar, "dispatcher");
        p.h(nVar, "createUnityActionEvent");
        this.dispatcher = aVar;
        this.createUnityActionEvent = nVar;
        c.c().p(this);
    }

    private final void handleMessage(String str) {
        g9.a.g("UnityReceiver message = " + str);
        r0.f42205a.d().b(str);
        UnityActionEvent a10 = this.createUnityActionEvent.a(str);
        if (a10 != null) {
            this.dispatcher.a(a10);
        }
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @l
    public final void onEvent(c.b bVar) {
        p.h(bVar, "event");
        throw null;
    }

    @Override // com.mirrativ.unityavatar.UnityPlayerToAndroid.ICallback
    public void receiveMessage(String str) {
        p.h(str, "message");
        handleMessage(str);
    }
}
