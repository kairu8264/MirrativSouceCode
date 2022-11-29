package ai;

/* loaded from: classes3.dex */
public final class nf implements lf {

    /* renamed from: a  reason: collision with root package name */
    public final int f7292a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7293b;

    /* renamed from: c  reason: collision with root package name */
    public final nj f7294c;

    public nf(Cif cif) {
        nj njVar = cif.P0;
        this.f7294c = njVar;
        njVar.i(12);
        this.f7292a = njVar.u();
        this.f7293b = njVar.u();
    }

    @Override // ai.lf
    public final boolean b() {
        return this.f7292a != 0;
    }

    @Override // ai.lf
    public final int zza() {
        return this.f7293b;
    }

    @Override // ai.lf
    public final int zzb() {
        int i10 = this.f7292a;
        return i10 == 0 ? this.f7294c.u() : i10;
    }
}
