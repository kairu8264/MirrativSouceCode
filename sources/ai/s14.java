package ai;

import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class s14 {

    /* renamed from: c  reason: collision with root package name */
    public boolean f9675c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9676d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9677e;

    /* renamed from: a  reason: collision with root package name */
    public final pb f9673a = new pb(0);

    /* renamed from: f  reason: collision with root package name */
    public long f9678f = C.TIME_UNSET;

    /* renamed from: g  reason: collision with root package name */
    public long f9679g = C.TIME_UNSET;

    /* renamed from: h  reason: collision with root package name */
    public long f9680h = C.TIME_UNSET;

    /* renamed from: b  reason: collision with root package name */
    public final hb f9674b = new hb();

    public static long e(hb hbVar) {
        int o10 = hbVar.o();
        if (hbVar.l() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        hbVar.u(bArr, 0, 9);
        hbVar.p(o10);
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            long j10 = bArr[0];
            byte b10 = bArr[1];
            long j11 = bArr[2];
            return ((bArr[3] & 255) << 5) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((b10 & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((j11 & 3) << 13) | ((bArr[4] & 248) >> 3);
        }
        return C.TIME_UNSET;
    }

    public static final int g(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & TagConstant.TAG_CAT_RESERVED) | ((bArr[i10] & TagConstant.TAG_CAT_RESERVED) << 24) | ((bArr[i10 + 1] & TagConstant.TAG_CAT_RESERVED) << 16) | ((bArr[i10 + 2] & TagConstant.TAG_CAT_RESERVED) << 8);
    }

    public final boolean a() {
        return this.f9675c;
    }

    public final pb b() {
        return this.f9673a;
    }

    public final int c(nv3 nv3Var, iw3 iw3Var) throws IOException {
        boolean z10 = this.f9677e;
        long j10 = C.TIME_UNSET;
        if (!z10) {
            long o10 = nv3Var.o();
            int min = (int) Math.min((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, o10);
            long j11 = o10 - min;
            if (nv3Var.n() != j11) {
                iw3Var.f5438a = j11;
                return 1;
            }
            this.f9674b.i(min);
            nv3Var.j();
            ((hv3) nv3Var).c(this.f9674b.q(), 0, min, false);
            hb hbVar = this.f9674b;
            int o11 = hbVar.o();
            int m10 = hbVar.m() - 4;
            while (true) {
                if (m10 < o11) {
                    break;
                }
                if (g(hbVar.q(), m10) == 442) {
                    hbVar.p(m10 + 4);
                    long e10 = e(hbVar);
                    if (e10 != C.TIME_UNSET) {
                        j10 = e10;
                        break;
                    }
                }
                m10--;
            }
            this.f9679g = j10;
            this.f9677e = true;
            return 0;
        } else if (this.f9679g == C.TIME_UNSET) {
            f(nv3Var);
            return 0;
        } else if (this.f9676d) {
            long j12 = this.f9678f;
            if (j12 == C.TIME_UNSET) {
                f(nv3Var);
                return 0;
            }
            long e11 = this.f9673a.e(this.f9679g) - this.f9673a.e(j12);
            this.f9680h = e11;
            if (e11 < 0) {
                StringBuilder sb2 = new StringBuilder(65);
                sb2.append("Invalid duration: ");
                sb2.append(e11);
                sb2.append(". Using TIME_UNSET instead.");
                Log.w("PsDurationReader", sb2.toString());
                this.f9680h = C.TIME_UNSET;
            }
            f(nv3Var);
            return 0;
        } else {
            int min2 = (int) Math.min((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, nv3Var.o());
            if (nv3Var.n() != 0) {
                iw3Var.f5438a = 0L;
                return 1;
            }
            this.f9674b.i(min2);
            nv3Var.j();
            ((hv3) nv3Var).c(this.f9674b.q(), 0, min2, false);
            hb hbVar2 = this.f9674b;
            int o12 = hbVar2.o();
            int m11 = hbVar2.m();
            while (true) {
                if (o12 >= m11 - 3) {
                    break;
                }
                if (g(hbVar2.q(), o12) == 442) {
                    hbVar2.p(o12 + 4);
                    long e12 = e(hbVar2);
                    if (e12 != C.TIME_UNSET) {
                        j10 = e12;
                        break;
                    }
                }
                o12++;
            }
            this.f9678f = j10;
            this.f9676d = true;
            return 0;
        }
    }

    public final long d() {
        return this.f9680h;
    }

    public final int f(nv3 nv3Var) {
        hb hbVar = this.f9674b;
        byte[] bArr = sb.f9783f;
        int length = bArr.length;
        hbVar.j(bArr, 0);
        this.f9675c = true;
        nv3Var.j();
        return 0;
    }
}
