package ai;

/* loaded from: classes3.dex */
public final class ah0 {

    /* renamed from: a  reason: collision with root package name */
    public final vh.f f1849a;

    /* renamed from: b  reason: collision with root package name */
    public final yg.r1 f1850b;

    /* renamed from: c  reason: collision with root package name */
    public final ai0 f1851c;

    public ah0(vh.f fVar, yg.r1 r1Var, ai0 ai0Var) {
        this.f1849a = fVar;
        this.f1850b = r1Var;
        this.f1851c = ai0Var;
    }

    public final void a(int i10, long j10) {
        if (((Boolean) ft.c().c(ox.f8021k0)).booleanValue()) {
            return;
        }
        if (j10 - this.f1850b.M() < 0) {
            yg.p1.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) ft.c().c(ox.f8029l0)).booleanValue()) {
            this.f1850b.h(-1);
            this.f1850b.q(j10);
        } else {
            this.f1850b.h(i10);
            this.f1850b.q(j10);
        }
        b();
    }

    public final void b() {
        if (((Boolean) ft.c().c(ox.f8029l0)).booleanValue()) {
            this.f1851c.f();
        }
    }
}
