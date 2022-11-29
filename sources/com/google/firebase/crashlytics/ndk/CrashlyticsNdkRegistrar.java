package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.crashlytics.ndk.CrashlyticsNdkRegistrar;
import java.util.Arrays;
import java.util.List;
import vk.d;
import vk.e;
import vk.h;
import vk.i;
import vk.q;

/* loaded from: classes4.dex */
public class CrashlyticsNdkRegistrar implements i {
    public final xk.a b(e eVar) {
        Context context = (Context) eVar.a(Context.class);
        return a.f(context, !xk.e.g(context));
    }

    @Override // vk.i
    public List<d<?>> getComponents() {
        return Arrays.asList(d.c(xk.a.class).b(q.j(Context.class)).f(new h() { // from class: ll.a
            @Override // vk.h
            public final Object a(vk.e eVar) {
                xk.a b10;
                b10 = CrashlyticsNdkRegistrar.this.b(eVar);
                return b10;
            }
        }).e().d(), um.h.b("fire-cls-ndk", "18.2.6"));
    }
}
