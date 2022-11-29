package com.google.firebase.installations;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import pk.c;
import um.h;
import vk.d;
import vk.e;
import vk.i;
import vk.q;
import yl.f;
import yl.g;

@Keep
/* loaded from: classes4.dex */
public class FirebaseInstallationsRegistrar implements i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(e eVar) {
        return new a((c) eVar.a(c.class), eVar.d(um.i.class), eVar.d(vl.f.class));
    }

    @Override // vk.i
    public List<d<?>> getComponents() {
        return Arrays.asList(d.c(f.class).b(q.j(c.class)).b(q.i(vl.f.class)).b(q.i(um.i.class)).f(g.f62059a).d(), h.b("fire-installations", "17.0.0"));
    }
}
