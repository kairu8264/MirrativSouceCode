package rp;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: h  reason: collision with root package name */
    public static final a f51664h = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f51665a;

    /* renamed from: b  reason: collision with root package name */
    public int f51666b;

    /* renamed from: c  reason: collision with root package name */
    public int f51667c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f51668d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f51669e;

    /* renamed from: f  reason: collision with root package name */
    public c0 f51670f;

    /* renamed from: g  reason: collision with root package name */
    public c0 f51671g;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public c0() {
        this.f51665a = new byte[8192];
        this.f51669e = true;
        this.f51668d = false;
    }

    public final void a() {
        c0 c0Var = this.f51671g;
        int i10 = 0;
        if (c0Var != this) {
            jo.p.e(c0Var);
            if (c0Var.f51669e) {
                int i11 = this.f51667c - this.f51666b;
                c0 c0Var2 = this.f51671g;
                jo.p.e(c0Var2);
                int i12 = 8192 - c0Var2.f51667c;
                c0 c0Var3 = this.f51671g;
                jo.p.e(c0Var3);
                if (!c0Var3.f51668d) {
                    c0 c0Var4 = this.f51671g;
                    jo.p.e(c0Var4);
                    i10 = c0Var4.f51666b;
                }
                if (i11 > i12 + i10) {
                    return;
                }
                c0 c0Var5 = this.f51671g;
                jo.p.e(c0Var5);
                f(c0Var5, i11);
                b();
                d0.b(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final c0 b() {
        c0 c0Var = this.f51670f;
        if (c0Var == this) {
            c0Var = null;
        }
        c0 c0Var2 = this.f51671g;
        jo.p.e(c0Var2);
        c0Var2.f51670f = this.f51670f;
        c0 c0Var3 = this.f51670f;
        jo.p.e(c0Var3);
        c0Var3.f51671g = this.f51671g;
        this.f51670f = null;
        this.f51671g = null;
        return c0Var;
    }

    public final c0 c(c0 c0Var) {
        jo.p.h(c0Var, "segment");
        c0Var.f51671g = this;
        c0Var.f51670f = this.f51670f;
        c0 c0Var2 = this.f51670f;
        jo.p.e(c0Var2);
        c0Var2.f51671g = c0Var;
        this.f51670f = c0Var;
        return c0Var;
    }

    public final c0 d() {
        this.f51668d = true;
        return new c0(this.f51665a, this.f51666b, this.f51667c, true, false);
    }

    public final c0 e(int i10) {
        c0 c10;
        if (i10 > 0 && i10 <= this.f51667c - this.f51666b) {
            if (i10 >= 1024) {
                c10 = d();
            } else {
                c10 = d0.c();
                byte[] bArr = this.f51665a;
                byte[] bArr2 = c10.f51665a;
                int i11 = this.f51666b;
                xn.n.j(bArr, bArr2, 0, i11, i11 + i10, 2, null);
            }
            c10.f51667c = c10.f51666b + i10;
            this.f51666b += i10;
            c0 c0Var = this.f51671g;
            jo.p.e(c0Var);
            c0Var.c(c10);
            return c10;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final void f(c0 c0Var, int i10) {
        jo.p.h(c0Var, "sink");
        if (c0Var.f51669e) {
            int i11 = c0Var.f51667c;
            if (i11 + i10 > 8192) {
                if (!c0Var.f51668d) {
                    int i12 = c0Var.f51666b;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = c0Var.f51665a;
                        xn.n.j(bArr, bArr, 0, i12, i11, 2, null);
                        c0Var.f51667c -= c0Var.f51666b;
                        c0Var.f51666b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f51665a;
            byte[] bArr3 = c0Var.f51665a;
            int i13 = c0Var.f51667c;
            int i14 = this.f51666b;
            xn.n.d(bArr2, bArr3, i13, i14, i14 + i10);
            c0Var.f51667c += i10;
            this.f51666b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public c0(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        jo.p.h(bArr, "data");
        this.f51665a = bArr;
        this.f51666b = i10;
        this.f51667c = i11;
        this.f51668d = z10;
        this.f51669e = z11;
    }
}
