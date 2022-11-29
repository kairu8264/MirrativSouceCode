package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import c8.c;
import com.bumptech.glide.Registry;
import com.bumptech.glide.d;
import com.bumptech.glide.integration.okhttp3.b;
import java.io.InputStream;
import s7.g;

@Deprecated
/* loaded from: classes.dex */
public class OkHttpGlideModule implements c {
    @Override // c8.b
    public void applyOptions(Context context, d dVar) {
    }

    @Override // c8.f
    public void registerComponents(Context context, com.bumptech.glide.c cVar, Registry registry) {
        registry.u(g.class, InputStream.class, new b.a());
    }
}
