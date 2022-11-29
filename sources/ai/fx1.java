package ai;

/* loaded from: classes3.dex */
public final class fx1 implements k61, y41 {

    /* renamed from: y  reason: collision with root package name */
    public static final Object f4238y = new Object();

    /* renamed from: z  reason: collision with root package name */
    public static int f4239z;

    /* renamed from: w  reason: collision with root package name */
    public final yg.r1 f4240w;

    /* renamed from: x  reason: collision with root package name */
    public final px1 f4241x;

    public fx1(px1 px1Var, yg.r1 r1Var) {
        this.f4241x = px1Var;
        this.f4240w = r1Var;
    }

    @Override // ai.k61
    public final void a() {
        b(true);
    }

    public final void b(boolean z10) {
        int i10;
        int intValue;
        if (((Boolean) ft.c().c(ox.f8129x4)).booleanValue() && !this.f4240w.x()) {
            Object obj = f4238y;
            synchronized (obj) {
                i10 = f4239z;
                intValue = ((Integer) ft.c().c(ox.f8137y4)).intValue();
            }
            if (i10 >= intValue) {
                return;
            }
            this.f4241x.f(z10);
            synchronized (obj) {
                f4239z++;
            }
        }
    }

    @Override // ai.y41
    public final void z(sr srVar) {
        b(false);
    }
}
