package ai;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes3.dex */
public final class of implements lf {

    /* renamed from: a  reason: collision with root package name */
    public final nj f7733a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7734b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7735c;

    /* renamed from: d  reason: collision with root package name */
    public int f7736d;

    /* renamed from: e  reason: collision with root package name */
    public int f7737e;

    public of(Cif cif) {
        nj njVar = cif.P0;
        this.f7733a = njVar;
        njVar.i(12);
        this.f7735c = njVar.u() & 255;
        this.f7734b = njVar.u();
    }

    @Override // ai.lf
    public final boolean b() {
        return false;
    }

    @Override // ai.lf
    public final int zza() {
        return this.f7734b;
    }

    @Override // ai.lf
    public final int zzb() {
        int i10 = this.f7735c;
        if (i10 == 8) {
            return this.f7733a.l();
        }
        if (i10 == 16) {
            return this.f7733a.m();
        }
        int i11 = this.f7736d;
        this.f7736d = i11 + 1;
        if (i11 % 2 == 0) {
            int l10 = this.f7733a.l();
            this.f7737e = l10;
            return (l10 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
        return this.f7737e & 15;
    }
}
