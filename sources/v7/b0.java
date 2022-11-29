package v7;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class b0 implements m7.j<Bitmap, Bitmap> {

    /* loaded from: classes.dex */
    public static final class a implements o7.u<Bitmap> {

        /* renamed from: w  reason: collision with root package name */
        public final Bitmap f56836w;

        public a(Bitmap bitmap) {
            this.f56836w = bitmap;
        }

        @Override // o7.u
        public int a() {
            return i8.k.h(this.f56836w);
        }

        @Override // o7.u
        /* renamed from: b */
        public Bitmap get() {
            return this.f56836w;
        }

        @Override // o7.u
        public void c() {
        }

        @Override // o7.u
        public Class<Bitmap> d() {
            return Bitmap.class;
        }
    }

    @Override // m7.j
    /* renamed from: c */
    public o7.u<Bitmap> b(Bitmap bitmap, int i10, int i11, m7.h hVar) {
        return new a(bitmap);
    }

    @Override // m7.j
    /* renamed from: d */
    public boolean a(Bitmap bitmap, m7.h hVar) {
        return true;
    }
}
