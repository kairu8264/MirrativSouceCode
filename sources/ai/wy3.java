package ai;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes3.dex */
public final class wy3 implements sy3 {

    /* renamed from: a  reason: collision with root package name */
    public final hb f11814a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11815b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11816c;

    /* renamed from: d  reason: collision with root package name */
    public int f11817d;

    /* renamed from: e  reason: collision with root package name */
    public int f11818e;

    public wy3(py3 py3Var) {
        hb hbVar = py3Var.f8740b;
        this.f11814a = hbVar;
        hbVar.p(12);
        this.f11816c = hbVar.b() & 255;
        this.f11815b = hbVar.b();
    }

    @Override // ai.sy3
    public final int b() {
        int i10 = this.f11816c;
        if (i10 == 8) {
            return this.f11814a.v();
        }
        if (i10 == 16) {
            return this.f11814a.w();
        }
        int i11 = this.f11817d;
        this.f11817d = i11 + 1;
        if (i11 % 2 == 0) {
            int v10 = this.f11814a.v();
            this.f11818e = v10;
            return (v10 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
        return this.f11818e & 15;
    }

    @Override // ai.sy3
    public final int zza() {
        return this.f11815b;
    }

    @Override // ai.sy3
    public final int zzb() {
        return -1;
    }
}
