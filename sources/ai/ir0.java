package ai;

/* loaded from: classes3.dex */
public final class ir0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f5330a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5331b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5332c;

    public ir0(int i10, int i11, int i12) {
        this.f5330a = i10;
        this.f5332c = i11;
        this.f5331b = i12;
    }

    public static ir0 a(fs fsVar) {
        if (fsVar.f4176z) {
            return new ir0(3, 0, 0);
        }
        if (fsVar.E) {
            return new ir0(2, 0, 0);
        }
        return fsVar.D ? b() : c(fsVar.B, fsVar.f4175y);
    }

    public static ir0 b() {
        return new ir0(0, 0, 0);
    }

    public static ir0 c(int i10, int i11) {
        return new ir0(1, i10, i11);
    }

    public static ir0 d() {
        return new ir0(4, 0, 0);
    }

    public static ir0 e() {
        return new ir0(5, 0, 0);
    }

    public final boolean f() {
        return this.f5330a == 2;
    }

    public final boolean g() {
        return this.f5330a == 3;
    }

    public final boolean h() {
        return this.f5330a == 0;
    }

    public final boolean i() {
        return this.f5330a == 4;
    }

    public final boolean j() {
        return this.f5330a == 5;
    }
}
