package ai;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.google.android.exoplayer2.extractor.mp3.IndexSeeker;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class q14 implements cv3 {

    /* renamed from: a  reason: collision with root package name */
    public final pb f8772a;

    /* renamed from: b  reason: collision with root package name */
    public final hb f8773b = new hb();

    public /* synthetic */ q14(pb pbVar, p14 p14Var) {
        this.f8772a = pbVar;
    }

    @Override // ai.cv3
    public final bv3 a(nv3 nv3Var, long j10) throws IOException {
        int h10;
        long j11;
        long n10 = nv3Var.n();
        int min = (int) Math.min((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, nv3Var.o() - n10);
        this.f8773b.i(min);
        ((hv3) nv3Var).c(this.f8773b.q(), 0, min, false);
        hb hbVar = this.f8773b;
        int i10 = -1;
        int i11 = -1;
        long j12 = -9223372036854775807L;
        while (hbVar.l() >= 4) {
            if (r14.h(hbVar.q(), hbVar.o()) != 442) {
                hbVar.s(1);
            } else {
                hbVar.s(4);
                long e10 = s14.e(hbVar);
                if (e10 != C.TIME_UNSET) {
                    long e11 = this.f8772a.e(e10);
                    if (e11 > j10) {
                        if (j12 == C.TIME_UNSET) {
                            return bv3.d(e11, n10);
                        }
                        j11 = i11;
                    } else if (IndexSeeker.MIN_TIME_BETWEEN_POINTS_US + e11 > j10) {
                        j11 = hbVar.o();
                    } else {
                        i11 = hbVar.o();
                        j12 = e11;
                    }
                    return bv3.f(n10 + j11);
                }
                int m10 = hbVar.m();
                if (hbVar.l() < 10) {
                    hbVar.p(m10);
                } else {
                    hbVar.s(9);
                    int v10 = hbVar.v() & 7;
                    if (hbVar.l() < v10) {
                        hbVar.p(m10);
                    } else {
                        hbVar.s(v10);
                        if (hbVar.l() < 4) {
                            hbVar.p(m10);
                        } else {
                            if (r14.h(hbVar.q(), hbVar.o()) == 443) {
                                hbVar.s(4);
                                int w10 = hbVar.w();
                                if (hbVar.l() < w10) {
                                    hbVar.p(m10);
                                } else {
                                    hbVar.s(w10);
                                }
                            }
                            while (true) {
                                if (hbVar.l() < 4 || (h10 = r14.h(hbVar.q(), hbVar.o())) == 442 || h10 == 441 || (h10 >>> 8) != 1) {
                                    break;
                                }
                                hbVar.s(4);
                                if (hbVar.l() < 2) {
                                    hbVar.p(m10);
                                    break;
                                }
                                hbVar.p(Math.min(hbVar.m(), hbVar.o() + hbVar.w()));
                            }
                        }
                    }
                }
                i10 = hbVar.o();
            }
        }
        return j12 != C.TIME_UNSET ? bv3.e(j12, n10 + i10) : bv3.f2561d;
    }

    @Override // ai.cv3
    public final void zzb() {
        hb hbVar = this.f8773b;
        byte[] bArr = sb.f9783f;
        int length = bArr.length;
        hbVar.j(bArr, 0);
    }
}
