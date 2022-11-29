package ai;

/* loaded from: classes3.dex */
public final class kf {

    /* renamed from: a  reason: collision with root package name */
    public final int f6185a;

    /* renamed from: b  reason: collision with root package name */
    public int f6186b;

    /* renamed from: c  reason: collision with root package name */
    public int f6187c;

    /* renamed from: d  reason: collision with root package name */
    public long f6188d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6189e;

    /* renamed from: f  reason: collision with root package name */
    public final nj f6190f;

    /* renamed from: g  reason: collision with root package name */
    public final nj f6191g;

    /* renamed from: h  reason: collision with root package name */
    public int f6192h;

    /* renamed from: i  reason: collision with root package name */
    public int f6193i;

    public kf(nj njVar, nj njVar2, boolean z10) {
        this.f6191g = njVar;
        this.f6190f = njVar2;
        this.f6189e = z10;
        njVar2.i(12);
        this.f6185a = njVar2.u();
        njVar.i(12);
        this.f6193i = njVar.u();
        fj.e(njVar.r() == 1, "first_chunk must be 1");
        this.f6186b = -1;
    }

    public final boolean a() {
        int i10 = this.f6186b + 1;
        this.f6186b = i10;
        if (i10 == this.f6185a) {
            return false;
        }
        this.f6188d = this.f6189e ? this.f6190f.v() : this.f6190f.p();
        if (this.f6186b == this.f6192h) {
            this.f6187c = this.f6191g.u();
            this.f6191g.j(4);
            int i11 = this.f6193i - 1;
            this.f6193i = i11;
            this.f6192h = i11 > 0 ? (-1) + this.f6191g.u() : -1;
        }
        return true;
    }
}
