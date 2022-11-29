package ai;

/* loaded from: classes3.dex */
public final class vz3 implements c04 {

    /* renamed from: a  reason: collision with root package name */
    public final b04 f11425a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11426b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11427c;

    /* renamed from: d  reason: collision with root package name */
    public final h04 f11428d;

    /* renamed from: e  reason: collision with root package name */
    public int f11429e;

    /* renamed from: f  reason: collision with root package name */
    public long f11430f;

    /* renamed from: g  reason: collision with root package name */
    public long f11431g;

    /* renamed from: h  reason: collision with root package name */
    public long f11432h;

    /* renamed from: i  reason: collision with root package name */
    public long f11433i;

    /* renamed from: j  reason: collision with root package name */
    public long f11434j;

    /* renamed from: k  reason: collision with root package name */
    public long f11435k;

    /* renamed from: l  reason: collision with root package name */
    public long f11436l;

    public vz3(h04 h04Var, long j10, long j11, long j12, long j13, boolean z10) {
        u9.a(j10 >= 0 && j11 > j10);
        this.f11428d = h04Var;
        this.f11426b = j10;
        this.f11427c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f11429e = 0;
        } else {
            this.f11430f = j13;
            this.f11429e = 4;
        }
        this.f11425a = new b04();
    }

    @Override // ai.c04
    public final void a(long j10) {
        this.f11432h = sb.d0(j10, 0L, this.f11430f - 1);
        this.f11429e = 2;
        this.f11433i = this.f11426b;
        this.f11434j = this.f11427c;
        this.f11435k = 0L;
        this.f11436l = this.f11430f;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    @Override // ai.c04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(ai.nv3 r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.vz3.b(ai.nv3):long");
    }

    @Override // ai.c04
    public final /* bridge */ /* synthetic */ lw3 f() {
        if (this.f11430f != 0) {
            return new tz3(this, null);
        }
        return null;
    }
}
