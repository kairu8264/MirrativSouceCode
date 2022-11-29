package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Arrays;
import java.util.List;
import pk.c;
import vk.d;
import vk.e;
import vk.h;
import vk.i;
import vk.q;
import xk.a;
import yl.f;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements i {
    public final FirebaseCrashlytics b(e eVar) {
        return FirebaseCrashlytics.a((c) eVar.a(c.class), (f) eVar.a(f.class), eVar.e(a.class), eVar.e(tk.a.class));
    }

    @Override // vk.i
    public List<d<?>> getComponents() {
        return Arrays.asList(d.c(FirebaseCrashlytics.class).b(q.j(c.class)).b(q.j(f.class)).b(q.a(a.class)).b(q.a(tk.a.class)).f(new h() { // from class: wk.f
            @Override // vk.h
            public final Object a(vk.e eVar) {
                FirebaseCrashlytics b10;
                b10 = CrashlyticsRegistrar.this.b(eVar);
                return b10;
            }
        }).e().d(), um.h.b("fire-cls", "18.2.6"));
    }
}
