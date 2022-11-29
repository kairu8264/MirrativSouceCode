package pi;

/* loaded from: classes3.dex */
public final class b3<V> {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f47606h = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f47607a;

    /* renamed from: b  reason: collision with root package name */
    public final y2<V> f47608b;

    /* renamed from: c  reason: collision with root package name */
    public final V f47609c;

    /* renamed from: d  reason: collision with root package name */
    public final V f47610d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f47611e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile V f47612f = null;

    /* renamed from: g  reason: collision with root package name */
    public volatile V f47613g = null;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b3(String str, Object obj, Object obj2, y2 y2Var, a3 a3Var) {
        this.f47607a = str;
        this.f47609c = obj;
        this.f47610d = obj2;
        this.f47608b = y2Var;
    }

    public final V a(V v10) {
        synchronized (this.f47611e) {
        }
        if (v10 != null) {
            return v10;
        }
        if (z2.f48396a != null) {
            synchronized (f47606h) {
                if (b.a()) {
                    return this.f47613g == null ? this.f47609c : this.f47613g;
                }
                try {
                    for (b3 b3Var : c3.b()) {
                        if (!b.a()) {
                            V v11 = null;
                            try {
                                y2<V> y2Var = b3Var.f47608b;
                                if (y2Var != null) {
                                    v11 = y2Var.zza();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (f47606h) {
                                b3Var.f47613g = v11;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                y2<V> y2Var2 = this.f47608b;
                if (y2Var2 == null) {
                    return this.f47609c;
                }
                try {
                    return y2Var2.zza();
                } catch (IllegalStateException unused3) {
                    return this.f47609c;
                } catch (SecurityException unused4) {
                    return this.f47609c;
                }
            }
        }
        return this.f47609c;
    }

    public final String b() {
        return this.f47607a;
    }
}
