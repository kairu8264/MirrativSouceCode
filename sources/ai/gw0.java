package ai;

/* loaded from: classes3.dex */
public final class gw0 implements y41 {

    /* renamed from: w  reason: collision with root package name */
    public final kl2 f4604w;

    /* renamed from: x  reason: collision with root package name */
    public final sl2 f4605x;

    /* renamed from: y  reason: collision with root package name */
    public final cr2 f4606y;

    /* renamed from: z  reason: collision with root package name */
    public final fr2 f4607z;

    public gw0(sl2 sl2Var, fr2 fr2Var, cr2 cr2Var) {
        this.f4605x = sl2Var;
        this.f4607z = fr2Var;
        this.f4606y = cr2Var;
        this.f4604w = sl2Var.f9876b.f9497b;
    }

    @Override // ai.y41
    public final void z(sr srVar) {
        this.f4607z.a(this.f4606y.a(this.f4605x, null, this.f4604w.f6276a));
    }
}
