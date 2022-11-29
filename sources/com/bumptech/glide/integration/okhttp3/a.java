package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import c8.d;
import com.bumptech.glide.Registry;
import com.bumptech.glide.c;
import com.bumptech.glide.integration.okhttp3.b;
import java.io.InputStream;
import s7.g;

/* loaded from: classes.dex */
public final class a extends d {
    @Override // c8.d, c8.f
    public void registerComponents(Context context, c cVar, Registry registry) {
        registry.u(g.class, InputStream.class, new b.a());
    }
}
