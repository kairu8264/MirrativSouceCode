package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import pk.c;
import rk.a;
import um.h;
import vk.d;
import vk.e;
import vk.i;
import vk.q;
import vm.l;
import vm.m;
import yl.f;

@Keep
/* loaded from: classes4.dex */
public class RemoteConfigRegistrar implements i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l lambda$getComponents$0(e eVar) {
        return new l((Context) eVar.a(Context.class), (c) eVar.a(c.class), (f) eVar.a(f.class), ((a) eVar.a(a.class)).b("frc"), eVar.d(tk.a.class));
    }

    @Override // vk.i
    public List<d<?>> getComponents() {
        return Arrays.asList(d.c(l.class).b(q.j(Context.class)).b(q.j(c.class)).b(q.j(f.class)).b(q.j(a.class)).b(q.i(tk.a.class)).f(m.f57528a).e().d(), h.b("fire-rc", "21.0.1"));
    }
}
