package ai;

/* loaded from: classes3.dex */
public final class n4 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7177a;

    /* renamed from: b  reason: collision with root package name */
    public c6 f7178b;

    /* renamed from: c  reason: collision with root package name */
    public int f7179c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7180d;

    /* renamed from: e  reason: collision with root package name */
    public int f7181e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7182f;

    /* renamed from: g  reason: collision with root package name */
    public int f7183g;

    public n4(c6 c6Var) {
        this.f7178b = c6Var;
    }

    public final void b(int i10) {
        this.f7177a = 1 == ((this.f7177a ? 1 : 0) | i10);
        this.f7179c += i10;
    }

    public final void c(c6 c6Var) {
        this.f7177a |= this.f7178b != c6Var;
        this.f7178b = c6Var;
    }

    public final void d(int i10) {
        if (this.f7180d && this.f7181e != 5) {
            u9.a(i10 == 5);
            return;
        }
        this.f7177a = true;
        this.f7180d = true;
        this.f7181e = i10;
    }

    public final void e(int i10) {
        this.f7177a = true;
        this.f7182f = true;
        this.f7183g = i10;
    }
}
