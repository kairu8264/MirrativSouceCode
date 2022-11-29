package ai;

/* loaded from: classes3.dex */
public final class f3 {

    /* renamed from: d  reason: collision with root package name */
    public static final f3 f3906d = new f3(0, 0, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final x2<f3> f3907e = e3.f3510a;

    /* renamed from: a  reason: collision with root package name */
    public final int f3908a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f3909b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3910c;

    public f3(int i10, int i11, int i12) {
        this.f3909b = i11;
        this.f3910c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f3) {
            f3 f3Var = (f3) obj;
            int i10 = f3Var.f3908a;
            return this.f3909b == f3Var.f3909b && this.f3910c == f3Var.f3910c;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3909b + 16337) * 31) + this.f3910c;
    }
}
