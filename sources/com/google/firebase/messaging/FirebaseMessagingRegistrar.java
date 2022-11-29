package com.google.firebase.messaging;

import androidx.annotation.Keep;
import em.x;
import java.util.Arrays;
import java.util.List;
import um.h;
import vk.i;
import vk.q;
import zf.g;

@Keep
/* loaded from: classes4.dex */
public class FirebaseMessagingRegistrar implements i {
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(vk.e eVar) {
        return new FirebaseMessaging((pk.c) eVar.a(pk.c.class), (wl.a) eVar.a(wl.a.class), eVar.d(um.i.class), eVar.d(vl.f.class), (yl.f) eVar.a(yl.f.class), (g) eVar.a(g.class), (ul.d) eVar.a(ul.d.class));
    }

    @Override // vk.i
    @Keep
    public List<vk.d<?>> getComponents() {
        return Arrays.asList(vk.d.c(FirebaseMessaging.class).b(q.j(pk.c.class)).b(q.h(wl.a.class)).b(q.i(um.i.class)).b(q.i(vl.f.class)).b(q.h(g.class)).b(q.j(yl.f.class)).b(q.j(ul.d.class)).f(x.f30765a).c().d(), h.b("fire-fcm", "23.0.0"));
    }
}
