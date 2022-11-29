package ai;

/* loaded from: classes3.dex */
public final class w24 implements lw3 {

    /* renamed from: a  reason: collision with root package name */
    public final t24 f11472a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11473b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11474c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11475d;

    /* renamed from: e  reason: collision with root package name */
    public final long f11476e;

    public w24(t24 t24Var, int i10, long j10, long j11) {
        this.f11472a = t24Var;
        this.f11473b = i10;
        this.f11474c = j10;
        long j12 = (j11 - j10) / t24Var.f10083d;
        this.f11475d = j12;
        this.f11476e = e(j12);
    }

    @Override // ai.lw3
    public final jw3 a(long j10) {
        long d02 = sb.d0((this.f11472a.f10082c * j10) / (this.f11473b * 1000000), 0L, this.f11475d - 1);
        long j11 = this.f11474c;
        int i10 = this.f11472a.f10083d;
        long e10 = e(d02);
        mw3 mw3Var = new mw3(e10, j11 + (i10 * d02));
        if (e10 < j10 && d02 != this.f11475d - 1) {
            long j12 = d02 + 1;
            return new jw3(mw3Var, new mw3(e(j12), this.f11474c + (j12 * this.f11472a.f10083d)));
        }
        return new jw3(mw3Var, mw3Var);
    }

    @Override // ai.lw3
    public final boolean c() {
        return true;
    }

    public final long e(long j10) {
        return sb.h(j10 * this.f11473b, 1000000L, this.f11472a.f10082c);
    }

    @Override // ai.lw3
    public final long f() {
        return this.f11476e;
    }
}
