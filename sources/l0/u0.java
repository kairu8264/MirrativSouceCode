package l0;

import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class u0<N> implements e<N> {

    /* renamed from: a  reason: collision with root package name */
    public final e<N> f39277a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39278b;

    /* renamed from: c  reason: collision with root package name */
    public int f39279c;

    public u0(e<N> eVar, int i10) {
        jo.p.h(eVar, "applier");
        this.f39277a = eVar;
        this.f39278b = i10;
    }

    @Override // l0.e
    public N a() {
        return this.f39277a.a();
    }

    @Override // l0.e
    public void b(int i10, int i11, int i12) {
        int i13 = this.f39279c == 0 ? this.f39278b : 0;
        this.f39277a.b(i10 + i13, i11 + i13, i12);
    }

    @Override // l0.e
    public void c(int i10, int i11) {
        this.f39277a.c(i10 + (this.f39279c == 0 ? this.f39278b : 0), i11);
    }

    @Override // l0.e
    public void clear() {
        k.x("Clear is not valid on OffsetApplier".toString());
        throw new KotlinNothingValueException();
    }

    @Override // l0.e
    public void d(int i10, N n10) {
        this.f39277a.d(i10 + (this.f39279c == 0 ? this.f39278b : 0), n10);
    }

    @Override // l0.e
    public void f(int i10, N n10) {
        this.f39277a.f(i10 + (this.f39279c == 0 ? this.f39278b : 0), n10);
    }

    @Override // l0.e
    public void g(N n10) {
        this.f39279c++;
        this.f39277a.g(n10);
    }

    @Override // l0.e
    public void i() {
        int i10 = this.f39279c;
        if (i10 > 0) {
            this.f39279c = i10 - 1;
            this.f39277a.i();
            return;
        }
        k.x("OffsetApplier up called with no corresponding down".toString());
        throw new KotlinNothingValueException();
    }
}
