package com.google.firebase.perf;

import androidx.annotation.Keep;
import gm.b;
import gm.c;
import java.util.Arrays;
import java.util.List;
import jm.a;
import um.h;
import vk.d;
import vk.e;
import vk.i;
import vk.q;
import vm.l;
import yl.f;
import zf.g;

@Keep
/* loaded from: classes4.dex */
public class FirebasePerfRegistrar implements i {
    /* JADX INFO: Access modifiers changed from: private */
    public static c providesFirebasePerformance(e eVar) {
        return a.b().b(new km.a((pk.c) eVar.a(pk.c.class), (f) eVar.a(f.class), eVar.d(l.class), eVar.d(g.class))).a().a();
    }

    @Override // vk.i
    @Keep
    public List<d<?>> getComponents() {
        return Arrays.asList(d.c(c.class).b(q.j(pk.c.class)).b(q.k(l.class)).b(q.j(f.class)).b(q.k(g.class)).f(b.f33664a).d(), h.b("fire-perf", "20.0.4"));
    }
}
