package j2;

import jo.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0490a f37055b = new C0490a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final float f37056c = c(0.5f);

    /* renamed from: d  reason: collision with root package name */
    public static final float f37057d = c(-0.5f);

    /* renamed from: e  reason: collision with root package name */
    public static final float f37058e = c(0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f37059a;

    /* renamed from: j2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0490a {
        public C0490a() {
        }

        public /* synthetic */ C0490a(jo.h hVar) {
            this();
        }

        public final float a() {
            return a.f37058e;
        }
    }

    public /* synthetic */ a(float f10) {
        this.f37059a = f10;
    }

    public static final /* synthetic */ a b(float f10) {
        return new a(f10);
    }

    public static float c(float f10) {
        return f10;
    }

    public static boolean d(float f10, Object obj) {
        if (obj instanceof a) {
            return p.c(Float.valueOf(f10), Float.valueOf(((a) obj).h()));
        }
        return false;
    }

    public static final boolean e(float f10, float f11) {
        return p.c(Float.valueOf(f10), Float.valueOf(f11));
    }

    public static int f(float f10) {
        return Float.hashCode(f10);
    }

    public static String g(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f37059a, obj);
    }

    public final /* synthetic */ float h() {
        return this.f37059a;
    }

    public int hashCode() {
        return f(this.f37059a);
    }

    public String toString() {
        return g(this.f37059a);
    }
}
