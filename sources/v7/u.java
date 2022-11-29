package v7;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class u implements o7.u<BitmapDrawable>, o7.q {

    /* renamed from: w  reason: collision with root package name */
    public final Resources f56903w;

    /* renamed from: x  reason: collision with root package name */
    public final o7.u<Bitmap> f56904x;

    public u(Resources resources, o7.u<Bitmap> uVar) {
        this.f56903w = (Resources) i8.j.d(resources);
        this.f56904x = (o7.u) i8.j.d(uVar);
    }

    public static o7.u<BitmapDrawable> f(Resources resources, o7.u<Bitmap> uVar) {
        if (uVar == null) {
            return null;
        }
        return new u(resources, uVar);
    }

    @Override // o7.u
    public int a() {
        return this.f56904x.a();
    }

    @Override // o7.q
    public void b() {
        o7.u<Bitmap> uVar = this.f56904x;
        if (uVar instanceof o7.q) {
            ((o7.q) uVar).b();
        }
    }

    @Override // o7.u
    public void c() {
        this.f56904x.c();
    }

    @Override // o7.u
    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @Override // o7.u
    /* renamed from: e */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f56903w, this.f56904x.get());
    }
}
