package com.dena.mirrorman.net.glide;

import android.content.Context;
import c8.a;
import com.bumptech.glide.Registry;
import com.bumptech.glide.c;
import com.bumptech.glide.integration.okhttp3.b;
import ep.z;
import java.io.InputStream;
import jo.p;
import oq.a;
import wn.f;
import wn.g;

/* loaded from: classes2.dex */
public final class MyAppGlideModule extends a implements oq.a {
    public static final int $stable = 8;
    private final f client$delegate = g.b(cr.a.f28611a.b(), new MyAppGlideModule$special$$inlined$inject$default$1(this, null, null));

    private final z getClient() {
        return (z) this.client$delegate.getValue();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // c8.d, c8.f
    public void registerComponents(Context context, c cVar, Registry registry) {
        p.h(context, "context");
        p.h(cVar, "glide");
        p.h(registry, "registry");
        registry.u(s7.g.class, InputStream.class, new b.a(getClient()));
    }
}
