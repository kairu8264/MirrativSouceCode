package ai;

import com.google.android.exoplayer2.C;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public final class i14 implements x04 {

    /* renamed from: a  reason: collision with root package name */
    public final z14 f5082a;

    /* renamed from: b  reason: collision with root package name */
    public String f5083b;

    /* renamed from: c  reason: collision with root package name */
    public pw3 f5084c;

    /* renamed from: d  reason: collision with root package name */
    public h14 f5085d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5086e;

    /* renamed from: l  reason: collision with root package name */
    public long f5093l;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f5087f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    public final m14 f5088g = new m14(32, 128);

    /* renamed from: h  reason: collision with root package name */
    public final m14 f5089h = new m14(33, 128);

    /* renamed from: i  reason: collision with root package name */
    public final m14 f5090i = new m14(34, 128);

    /* renamed from: j  reason: collision with root package name */
    public final m14 f5091j = new m14(39, 128);

    /* renamed from: k  reason: collision with root package name */
    public final m14 f5092k = new m14(40, 128);

    /* renamed from: m  reason: collision with root package name */
    public long f5094m = C.TIME_UNSET;

    /* renamed from: n  reason: collision with root package name */
    public final hb f5095n = new hb();

    public i14(z14 z14Var) {
        this.f5082a = z14Var;
    }

    @Override // ai.x04
    public final void a(pv3 pv3Var, k24 k24Var) {
        k24Var.a();
        this.f5083b = k24Var.c();
        pw3 p10 = pv3Var.p(k24Var.b(), 2);
        this.f5084c = p10;
        this.f5085d = new h14(p10);
        this.f5082a.a(pv3Var, k24Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x039a  */
    @Override // ai.x04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(ai.hb r30) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.i14.b(ai.hb):void");
    }

    @Override // ai.x04
    public final void c() {
    }

    @Override // ai.x04
    public final void d(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f5094m = j10;
        }
    }

    @RequiresNonNull({"sampleReader"})
    public final void e(byte[] bArr, int i10, int i11) {
        this.f5085d.c(bArr, i10, i11);
        if (!this.f5086e) {
            this.f5088g.d(bArr, i10, i11);
            this.f5089h.d(bArr, i10, i11);
            this.f5090i.d(bArr, i10, i11);
        }
        this.f5091j.d(bArr, i10, i11);
        this.f5092k.d(bArr, i10, i11);
    }

    @Override // ai.x04
    public final void zza() {
        this.f5093l = 0L;
        this.f5094m = C.TIME_UNSET;
        xa.e(this.f5087f);
        this.f5088g.a();
        this.f5089h.a();
        this.f5090i.a();
        this.f5091j.a();
        this.f5092k.a();
        h14 h14Var = this.f5085d;
        if (h14Var != null) {
            h14Var.a();
        }
    }
}
