package ai;

import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class c24 {

    /* renamed from: c  reason: collision with root package name */
    public boolean f2678c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2679d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2680e;

    /* renamed from: a  reason: collision with root package name */
    public final pb f2676a = new pb(0);

    /* renamed from: f  reason: collision with root package name */
    public long f2681f = C.TIME_UNSET;

    /* renamed from: g  reason: collision with root package name */
    public long f2682g = C.TIME_UNSET;

    /* renamed from: h  reason: collision with root package name */
    public long f2683h = C.TIME_UNSET;

    /* renamed from: b  reason: collision with root package name */
    public final hb f2677b = new hb();

    public c24(int i10) {
    }

    public final boolean a() {
        return this.f2678c;
    }

    public final int b(nv3 nv3Var, iw3 iw3Var, int i10) throws IOException {
        if (i10 <= 0) {
            e(nv3Var);
            return 0;
        }
        boolean z10 = this.f2680e;
        long j10 = C.TIME_UNSET;
        if (!z10) {
            long o10 = nv3Var.o();
            int min = (int) Math.min(112800L, o10);
            long j11 = o10 - min;
            if (nv3Var.n() != j11) {
                iw3Var.f5438a = j11;
                return 1;
            }
            this.f2677b.i(min);
            nv3Var.j();
            ((hv3) nv3Var).c(this.f2677b.q(), 0, min, false);
            hb hbVar = this.f2677b;
            int o11 = hbVar.o();
            int m10 = hbVar.m();
            int i11 = m10 - 188;
            while (true) {
                if (i11 < o11) {
                    break;
                }
                byte[] q10 = hbVar.q();
                int i12 = -4;
                int i13 = 0;
                while (true) {
                    if (i12 > 4) {
                        break;
                    }
                    int i14 = (i12 * TsExtractor.TS_PACKET_SIZE) + i11;
                    if (i14 < o11 || i14 >= m10 || q10[i14] != 71) {
                        i13 = 0;
                    } else {
                        i13++;
                        if (i13 == 5) {
                            long b10 = m24.b(hbVar, i11, i10);
                            if (b10 != C.TIME_UNSET) {
                                j10 = b10;
                                break;
                            }
                        }
                    }
                    i12++;
                }
                i11--;
            }
            this.f2682g = j10;
            this.f2680e = true;
            return 0;
        } else if (this.f2682g == C.TIME_UNSET) {
            e(nv3Var);
            return 0;
        } else if (this.f2679d) {
            long j12 = this.f2681f;
            if (j12 == C.TIME_UNSET) {
                e(nv3Var);
                return 0;
            }
            long e10 = this.f2676a.e(this.f2682g) - this.f2676a.e(j12);
            this.f2683h = e10;
            if (e10 < 0) {
                StringBuilder sb2 = new StringBuilder(65);
                sb2.append("Invalid duration: ");
                sb2.append(e10);
                sb2.append(". Using TIME_UNSET instead.");
                Log.w("TsDurationReader", sb2.toString());
                this.f2683h = C.TIME_UNSET;
            }
            e(nv3Var);
            return 0;
        } else {
            int min2 = (int) Math.min(112800L, nv3Var.o());
            if (nv3Var.n() != 0) {
                iw3Var.f5438a = 0L;
                return 1;
            }
            this.f2677b.i(min2);
            nv3Var.j();
            ((hv3) nv3Var).c(this.f2677b.q(), 0, min2, false);
            hb hbVar2 = this.f2677b;
            int o12 = hbVar2.o();
            int m11 = hbVar2.m();
            while (true) {
                if (o12 >= m11) {
                    break;
                }
                if (hbVar2.q()[o12] == 71) {
                    long b11 = m24.b(hbVar2, o12, i10);
                    if (b11 != C.TIME_UNSET) {
                        j10 = b11;
                        break;
                    }
                }
                o12++;
            }
            this.f2681f = j10;
            this.f2679d = true;
            return 0;
        }
    }

    public final long c() {
        return this.f2683h;
    }

    public final pb d() {
        return this.f2676a;
    }

    public final int e(nv3 nv3Var) {
        hb hbVar = this.f2677b;
        byte[] bArr = sb.f9783f;
        int length = bArr.length;
        hbVar.j(bArr, 0);
        this.f2678c = true;
        nv3Var.j();
        return 0;
    }
}
