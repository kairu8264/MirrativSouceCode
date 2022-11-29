package ai;

/* loaded from: classes3.dex */
public final class xv3 implements lw3 {

    /* renamed from: a  reason: collision with root package name */
    public final zv3 f12325a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12326b;

    public xv3(zv3 zv3Var, long j10) {
        this.f12325a = zv3Var;
        this.f12326b = j10;
    }

    @Override // ai.lw3
    public final jw3 a(long j10) {
        u9.e(this.f12325a.f13222k);
        zv3 zv3Var = this.f12325a;
        yv3 yv3Var = zv3Var.f13222k;
        long[] jArr = yv3Var.f12755a;
        long[] jArr2 = yv3Var.f12756b;
        int d10 = sb.d(jArr, zv3Var.b(j10), true, false);
        mw3 e10 = e(d10 == -1 ? 0L : jArr[d10], d10 != -1 ? jArr2[d10] : 0L);
        if (e10.f7082a != j10 && d10 != jArr.length - 1) {
            int i10 = d10 + 1;
            return new jw3(e10, e(jArr[i10], jArr2[i10]));
        }
        return new jw3(e10, e10);
    }

    @Override // ai.lw3
    public final boolean c() {
        return true;
    }

    public final mw3 e(long j10, long j11) {
        return new mw3((j10 * 1000000) / this.f12325a.f13216e, this.f12326b + j11);
    }

    @Override // ai.lw3
    public final long f() {
        return this.f12325a.a();
    }
}
