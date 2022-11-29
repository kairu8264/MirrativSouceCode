package com.bumptech.glide.integration.webp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import c8.c;
import com.bumptech.glide.Registry;
import com.bumptech.glide.d;
import java.io.InputStream;
import java.nio.ByteBuffer;
import l7.f;
import l7.g;
import l7.j;
import l7.k;
import l7.l;
import p7.b;
import p7.e;

@Deprecated
/* loaded from: classes.dex */
public class WebpGlideModule implements c {
    @Override // c8.b
    public void applyOptions(Context context, d dVar) {
    }

    @Override // c8.f
    public void registerComponents(Context context, com.bumptech.glide.c cVar, Registry registry) {
        Resources resources = context.getResources();
        e g10 = cVar.g();
        b f10 = cVar.f();
        j jVar = new j(registry.g(), resources.getDisplayMetrics(), g10, f10);
        l7.a aVar = new l7.a(f10, g10);
        l7.c cVar2 = new l7.c(jVar);
        f fVar = new f(jVar, f10);
        l7.d dVar = new l7.d(context, f10, g10);
        registry.q("Bitmap", ByteBuffer.class, Bitmap.class, cVar2).q("Bitmap", InputStream.class, Bitmap.class, fVar).q("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new v7.a(resources, cVar2)).q("BitmapDrawable", InputStream.class, BitmapDrawable.class, new v7.a(resources, fVar)).q("Bitmap", ByteBuffer.class, Bitmap.class, new l7.b(aVar)).q("Bitmap", InputStream.class, Bitmap.class, new l7.e(aVar)).o(ByteBuffer.class, k.class, dVar).o(InputStream.class, k.class, new g(dVar, f10)).p(k.class, new l());
    }
}
