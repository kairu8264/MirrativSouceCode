package jo;

import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class d implements qo.a, Serializable {
    public static final Object C = a.f38134w;
    public final String A;
    public final boolean B;

    /* renamed from: w  reason: collision with root package name */
    public transient qo.a f38130w;

    /* renamed from: x  reason: collision with root package name */
    public final Object f38131x;

    /* renamed from: y  reason: collision with root package name */
    public final Class f38132y;

    /* renamed from: z  reason: collision with root package name */
    public final String f38133z;

    /* loaded from: classes4.dex */
    public static class a implements Serializable {

        /* renamed from: w  reason: collision with root package name */
        public static final a f38134w = new a();
    }

    public d() {
        this(C);
    }

    public qo.a b() {
        qo.a aVar = this.f38130w;
        if (aVar == null) {
            qo.a c10 = c();
            this.f38130w = c10;
            return c10;
        }
        return aVar;
    }

    public abstract qo.a c();

    public Object d() {
        return this.f38131x;
    }

    public String e() {
        return this.f38133z;
    }

    public qo.c f() {
        Class cls = this.f38132y;
        if (cls == null) {
            return null;
        }
        return this.B ? f0.c(cls) : f0.b(cls);
    }

    public qo.a g() {
        qo.a b10 = b();
        if (b10 != this) {
            return b10;
        }
        throw new ho.b();
    }

    public String h() {
        return this.A;
    }

    public d(Object obj) {
        this(obj, null, null, null, false);
    }

    public d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f38131x = obj;
        this.f38132y = cls;
        this.f38133z = str;
        this.A = str2;
        this.B = z10;
    }
}
