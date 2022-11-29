package ai;

import com.google.android.exoplayer2.C;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public final class g14 implements x04 {

    /* renamed from: a  reason: collision with root package name */
    public final z14 f4279a;

    /* renamed from: e  reason: collision with root package name */
    public long f4283e;

    /* renamed from: g  reason: collision with root package name */
    public String f4285g;

    /* renamed from: h  reason: collision with root package name */
    public pw3 f4286h;

    /* renamed from: i  reason: collision with root package name */
    public f14 f4287i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4288j;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4290l;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f4284f = new boolean[3];

    /* renamed from: b  reason: collision with root package name */
    public final m14 f4280b = new m14(7, 128);

    /* renamed from: c  reason: collision with root package name */
    public final m14 f4281c = new m14(8, 128);

    /* renamed from: d  reason: collision with root package name */
    public final m14 f4282d = new m14(6, 128);

    /* renamed from: k  reason: collision with root package name */
    public long f4289k = C.TIME_UNSET;

    /* renamed from: m  reason: collision with root package name */
    public final hb f4291m = new hb();

    public g14(z14 z14Var, boolean z10, boolean z11) {
        this.f4279a = z14Var;
    }

    @Override // ai.x04
    public final void a(pv3 pv3Var, k24 k24Var) {
        k24Var.a();
        this.f4285g = k24Var.c();
        pw3 p10 = pv3Var.p(k24Var.b(), 2);
        this.f4286h = p10;
        this.f4287i = new f14(p10, false, false);
        this.f4279a.a(pv3Var, k24Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0183 A[SYNTHETIC] */
    @Override // ai.x04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(ai.hb r20) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.g14.b(ai.hb):void");
    }

    @Override // ai.x04
    public final void c() {
    }

    @Override // ai.x04
    public final void d(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f4289k = j10;
        }
        this.f4290l |= (i10 & 2) != 0;
    }

    @RequiresNonNull({"sampleReader"})
    public final void e(byte[] bArr, int i10, int i11) {
        if (!this.f4288j) {
            this.f4280b.d(bArr, i10, i11);
            this.f4281c.d(bArr, i10, i11);
        }
        this.f4282d.d(bArr, i10, i11);
    }

    @Override // ai.x04
    public final void zza() {
        this.f4283e = 0L;
        this.f4290l = false;
        this.f4289k = C.TIME_UNSET;
        xa.e(this.f4284f);
        this.f4280b.a();
        this.f4281c.a();
        this.f4282d.a();
        f14 f14Var = this.f4287i;
        if (f14Var != null) {
            f14Var.c();
        }
    }
}
