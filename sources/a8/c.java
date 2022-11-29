package a8;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import m7.h;
import o7.u;

/* loaded from: classes.dex */
public final class c implements e<Drawable, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final p7.e f640a;

    /* renamed from: b  reason: collision with root package name */
    public final e<Bitmap, byte[]> f641b;

    /* renamed from: c  reason: collision with root package name */
    public final e<z7.c, byte[]> f642c;

    public c(p7.e eVar, e<Bitmap, byte[]> eVar2, e<z7.c, byte[]> eVar3) {
        this.f640a = eVar;
        this.f641b = eVar2;
        this.f642c = eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u<z7.c> b(u<Drawable> uVar) {
        return uVar;
    }

    @Override // a8.e
    public u<byte[]> a(u<Drawable> uVar, h hVar) {
        Drawable drawable = uVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f641b.a(v7.e.f(((BitmapDrawable) drawable).getBitmap(), this.f640a), hVar);
        }
        if (drawable instanceof z7.c) {
            return this.f642c.a(b(uVar), hVar);
        }
        return null;
    }
}
