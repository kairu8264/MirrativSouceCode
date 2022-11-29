package com.google.firebase.datatransport;

import ag.a;
import android.content.Context;
import androidx.annotation.Keep;
import cg.t;
import java.util.Arrays;
import java.util.List;
import um.h;
import vk.d;
import vk.e;
import vk.i;
import vk.q;
import zf.g;

@Keep
/* loaded from: classes4.dex */
public class TransportRegistrar implements i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$0(e eVar) {
        t.f((Context) eVar.a(Context.class));
        return t.c().g(a.f1600h);
    }

    @Override // vk.i
    public List<d<?>> getComponents() {
        return Arrays.asList(d.c(g.class).b(q.j(Context.class)).f(ml.a.f41205a).d(), h.b("fire-transport", "18.1.1"));
    }
}
