package ai;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp3.IndexSeeker;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class a24 implements cv3 {

    /* renamed from: a  reason: collision with root package name */
    public final pb f1696a;

    /* renamed from: b  reason: collision with root package name */
    public final hb f1697b = new hb();

    /* renamed from: c  reason: collision with root package name */
    public final int f1698c;

    public a24(int i10, pb pbVar, int i11) {
        this.f1698c = i10;
        this.f1696a = pbVar;
    }

    @Override // ai.cv3
    public final bv3 a(nv3 nv3Var, long j10) throws IOException {
        int a10;
        int a11;
        long j11;
        long n10 = nv3Var.n();
        int min = (int) Math.min(112800L, nv3Var.o() - n10);
        this.f1697b.i(min);
        ((hv3) nv3Var).c(this.f1697b.q(), 0, min, false);
        hb hbVar = this.f1697b;
        int m10 = hbVar.m();
        long j12 = -1;
        long j13 = -1;
        long j14 = -9223372036854775807L;
        while (hbVar.l() >= 188 && (a11 = (a10 = m24.a(hbVar.q(), hbVar.o(), m10)) + TsExtractor.TS_PACKET_SIZE) <= m10) {
            long b10 = m24.b(hbVar, a10, this.f1698c);
            if (b10 != C.TIME_UNSET) {
                long e10 = this.f1696a.e(b10);
                if (e10 > j10) {
                    if (j14 == C.TIME_UNSET) {
                        return bv3.d(e10, n10);
                    }
                    j11 = n10 + j13;
                } else if (IndexSeeker.MIN_TIME_BETWEEN_POINTS_US + e10 > j10) {
                    j11 = n10 + a10;
                } else {
                    j13 = a10;
                    j14 = e10;
                }
                return bv3.f(j11);
            }
            hbVar.p(a11);
            j12 = a11;
        }
        return j14 != C.TIME_UNSET ? bv3.e(j14, n10 + j12) : bv3.f2561d;
    }

    @Override // ai.cv3
    public final void zzb() {
        hb hbVar = this.f1697b;
        byte[] bArr = sb.f9783f;
        int length = bArr.length;
        hbVar.j(bArr, 0);
    }
}
