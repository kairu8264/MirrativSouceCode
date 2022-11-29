package ai;

/* loaded from: classes3.dex */
public final class tz3 implements lw3 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ vz3 f10521a;

    public /* synthetic */ tz3(vz3 vz3Var, sz3 sz3Var) {
        this.f10521a = vz3Var;
    }

    @Override // ai.lw3
    public final jw3 a(long j10) {
        h04 h04Var;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        h04Var = this.f10521a.f11428d;
        long h10 = h04Var.h(j10);
        j11 = this.f10521a.f11426b;
        j12 = this.f10521a.f11427c;
        j13 = this.f10521a.f11426b;
        j14 = this.f10521a.f11430f;
        j15 = this.f10521a.f11426b;
        j16 = this.f10521a.f11427c;
        mw3 mw3Var = new mw3(j10, sb.d0((-30000) + j11 + ((h10 * (j12 - j13)) / j14), j15, j16 - 1));
        return new jw3(mw3Var, mw3Var);
    }

    @Override // ai.lw3
    public final boolean c() {
        return true;
    }

    @Override // ai.lw3
    public final long f() {
        h04 h04Var;
        long j10;
        h04Var = this.f10521a.f11428d;
        j10 = this.f10521a.f11430f;
        return h04Var.g(j10);
    }
}
