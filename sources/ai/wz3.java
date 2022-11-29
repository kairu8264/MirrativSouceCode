package ai;

/* loaded from: classes3.dex */
public final class wz3 implements c04 {

    /* renamed from: a  reason: collision with root package name */
    public final zv3 f11827a;

    /* renamed from: b  reason: collision with root package name */
    public final yv3 f11828b;

    /* renamed from: c  reason: collision with root package name */
    public long f11829c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f11830d = -1;

    public wz3(zv3 zv3Var, yv3 yv3Var) {
        this.f11827a = zv3Var;
        this.f11828b = yv3Var;
    }

    @Override // ai.c04
    public final void a(long j10) {
        long[] jArr = this.f11828b.f12755a;
        this.f11830d = jArr[sb.d(jArr, j10, true, true)];
    }

    @Override // ai.c04
    public final long b(nv3 nv3Var) {
        long j10 = this.f11830d;
        if (j10 >= 0) {
            this.f11830d = -1L;
            return -(j10 + 2);
        }
        return -1L;
    }

    public final void c(long j10) {
        this.f11829c = j10;
    }

    @Override // ai.c04
    public final lw3 f() {
        u9.d(this.f11829c != -1);
        return new xv3(this.f11827a, this.f11829c);
    }
}
