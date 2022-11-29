package j1;

import jo.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0489a f37049b = new C0489a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f37050c = d(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f37051d = d(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f37052a;

    /* renamed from: j1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0489a {
        public C0489a() {
        }

        public /* synthetic */ C0489a(h hVar) {
            this();
        }

        public final int a() {
            return a.f37051d;
        }

        public final int b() {
            return a.f37050c;
        }
    }

    public /* synthetic */ a(int i10) {
        this.f37052a = i10;
    }

    public static final /* synthetic */ a c(int i10) {
        return new a(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof a) && i10 == ((a) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f37050c) ? "Touch" : f(i10, f37051d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f37052a, obj);
    }

    public int hashCode() {
        return g(this.f37052a);
    }

    public final /* synthetic */ int i() {
        return this.f37052a;
    }

    public String toString() {
        return h(this.f37052a);
    }
}
