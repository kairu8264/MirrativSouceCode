package v7;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class e implements o7.u<Bitmap>, o7.q {

    /* renamed from: w  reason: collision with root package name */
    public final Bitmap f56851w;

    /* renamed from: x  reason: collision with root package name */
    public final p7.e f56852x;

    public e(Bitmap bitmap, p7.e eVar) {
        this.f56851w = (Bitmap) i8.j.e(bitmap, "Bitmap must not be null");
        this.f56852x = (p7.e) i8.j.e(eVar, "BitmapPool must not be null");
    }

    public static e f(Bitmap bitmap, p7.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, eVar);
    }

    @Override // o7.u
    public int a() {
        return i8.k.h(this.f56851w);
    }

    @Override // o7.q
    public void b() {
        this.f56851w.prepareToDraw();
    }

    @Override // o7.u
    public void c() {
        this.f56852x.c(this.f56851w);
    }

    @Override // o7.u
    public Class<Bitmap> d() {
        return Bitmap.class;
    }

    @Override // o7.u
    /* renamed from: e */
    public Bitmap get() {
        return this.f56851w;
    }
}
