package p7;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class c implements l {

    /* renamed from: a  reason: collision with root package name */
    public final b f46173a = new b();

    /* renamed from: b  reason: collision with root package name */
    public final h<a, Bitmap> f46174b = new h<>();

    /* loaded from: classes.dex */
    public static class a implements m {

        /* renamed from: a  reason: collision with root package name */
        public final b f46175a;

        /* renamed from: b  reason: collision with root package name */
        public int f46176b;

        /* renamed from: c  reason: collision with root package name */
        public int f46177c;

        /* renamed from: d  reason: collision with root package name */
        public Bitmap.Config f46178d;

        public a(b bVar) {
            this.f46175a = bVar;
        }

        @Override // p7.m
        public void a() {
            this.f46175a.c(this);
        }

        public void b(int i10, int i11, Bitmap.Config config) {
            this.f46176b = i10;
            this.f46177c = i11;
            this.f46178d = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f46176b == aVar.f46176b && this.f46177c == aVar.f46177c && this.f46178d == aVar.f46178d;
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f46176b * 31) + this.f46177c) * 31;
            Bitmap.Config config = this.f46178d;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.g(this.f46176b, this.f46177c, this.f46178d);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends d<a> {
        @Override // p7.d
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        public a e(int i10, int i11, Bitmap.Config config) {
            a b10 = b();
            b10.b(i10, i11, config);
            return b10;
        }
    }

    public static String g(int i10, int i11, Bitmap.Config config) {
        return "[" + i10 + "x" + i11 + "], " + config;
    }

    public static String h(Bitmap bitmap) {
        return g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // p7.l
    public String a(Bitmap bitmap) {
        return h(bitmap);
    }

    @Override // p7.l
    public Bitmap b() {
        return this.f46174b.f();
    }

    @Override // p7.l
    public void c(Bitmap bitmap) {
        this.f46174b.d(this.f46173a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // p7.l
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return this.f46174b.a(this.f46173a.e(i10, i11, config));
    }

    @Override // p7.l
    public String e(int i10, int i11, Bitmap.Config config) {
        return g(i10, i11, config);
    }

    @Override // p7.l
    public int f(Bitmap bitmap) {
        return i8.k.h(bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f46174b;
    }
}
