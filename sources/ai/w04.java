package ai;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class w04 implements x04 {

    /* renamed from: a  reason: collision with root package name */
    public final List<h24> f11449a;

    /* renamed from: b  reason: collision with root package name */
    public final pw3[] f11450b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11451c;

    /* renamed from: d  reason: collision with root package name */
    public int f11452d;

    /* renamed from: e  reason: collision with root package name */
    public int f11453e;

    /* renamed from: f  reason: collision with root package name */
    public long f11454f = C.TIME_UNSET;

    public w04(List<h24> list) {
        this.f11449a = list;
        this.f11450b = new pw3[list.size()];
    }

    @Override // ai.x04
    public final void a(pv3 pv3Var, k24 k24Var) {
        for (int i10 = 0; i10 < this.f11450b.length; i10++) {
            h24 h24Var = this.f11449a.get(i10);
            k24Var.a();
            pw3 p10 = pv3Var.p(k24Var.b(), 3);
            t4 t4Var = new t4();
            t4Var.d(k24Var.c());
            t4Var.n(MimeTypes.APPLICATION_DVBSUBS);
            t4Var.p(Collections.singletonList(h24Var.f4720b));
            t4Var.g(h24Var.f4719a);
            p10.b(t4Var.I());
            this.f11450b[i10] = p10;
        }
    }

    @Override // ai.x04
    public final void b(hb hbVar) {
        pw3[] pw3VarArr;
        if (this.f11451c) {
            if (this.f11452d != 2 || e(hbVar, 32)) {
                if (this.f11452d != 1 || e(hbVar, 0)) {
                    int o10 = hbVar.o();
                    int l10 = hbVar.l();
                    for (pw3 pw3Var : this.f11450b) {
                        hbVar.p(o10);
                        pw3Var.a(hbVar, l10);
                    }
                    this.f11453e += l10;
                }
            }
        }
    }

    @Override // ai.x04
    public final void c() {
        if (this.f11451c) {
            if (this.f11454f != C.TIME_UNSET) {
                for (pw3 pw3Var : this.f11450b) {
                    pw3Var.e(this.f11454f, 1, this.f11453e, 0, null);
                }
            }
            this.f11451c = false;
        }
    }

    @Override // ai.x04
    public final void d(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f11451c = true;
        if (j10 != C.TIME_UNSET) {
            this.f11454f = j10;
        }
        this.f11453e = 0;
        this.f11452d = 2;
    }

    public final boolean e(hb hbVar, int i10) {
        if (hbVar.l() == 0) {
            return false;
        }
        if (hbVar.v() != i10) {
            this.f11451c = false;
        }
        this.f11452d--;
        return this.f11451c;
    }

    @Override // ai.x04
    public final void zza() {
        this.f11451c = false;
        this.f11454f = C.TIME_UNSET;
    }
}
