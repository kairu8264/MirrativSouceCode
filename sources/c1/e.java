package c1;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class e implements k0 {

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap f18657b;

    public e(Bitmap bitmap) {
        jo.p.h(bitmap, "bitmap");
        this.f18657b = bitmap;
    }

    @Override // c1.k0
    public void a() {
        this.f18657b.prepareToDraw();
    }

    @Override // c1.k0
    public int b() {
        Bitmap.Config config = this.f18657b.getConfig();
        jo.p.g(config, "bitmap.config");
        return f.e(config);
    }

    public final Bitmap c() {
        return this.f18657b;
    }

    @Override // c1.k0
    public int getHeight() {
        return this.f18657b.getHeight();
    }

    @Override // c1.k0
    public int getWidth() {
        return this.f18657b.getWidth();
    }
}
