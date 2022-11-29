package ai;

import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes3.dex */
public final class d04 extends h04 {

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f3096o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n  reason: collision with root package name */
    public boolean f3097n;

    public static boolean j(hb hbVar) {
        if (hbVar.l() < 8) {
            return false;
        }
        byte[] bArr = new byte[8];
        hbVar.u(bArr, 0, 8);
        return Arrays.equals(bArr, f3096o);
    }

    @Override // ai.h04
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f3097n = false;
        }
    }

    @Override // ai.h04
    public final long b(hb hbVar) {
        int i10;
        byte[] q10 = hbVar.q();
        int i11 = q10[0] & TagConstant.TAG_CAT_RESERVED;
        int i12 = i11 & 3;
        int i13 = 2;
        if (i12 == 0) {
            i13 = 1;
        } else if (i12 != 1 && i12 != 2) {
            i13 = q10[1] & 63;
        }
        int i14 = i11 >> 3;
        return h(i13 * (i14 >= 16 ? DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << i10 : i14 >= 12 ? 10000 << (i10 & 1) : (i14 & 3) == 3 ? 60000 : 10000 << i10));
    }

    @Override // ai.h04
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(hb hbVar, long j10, f04 f04Var) {
        if (!this.f3097n) {
            byte[] copyOf = Arrays.copyOf(hbVar.q(), hbVar.m());
            byte b10 = copyOf[9];
            List<byte[]> a10 = hw3.a(copyOf);
            t4 t4Var = new t4();
            t4Var.n(MimeTypes.AUDIO_OPUS);
            t4Var.B(b10 & TagConstant.TAG_CAT_RESERVED);
            t4Var.C(OpusUtil.SAMPLE_RATE);
            t4Var.p(a10);
            f04Var.f3873a = t4Var.I();
            this.f3097n = true;
            return true;
        }
        Objects.requireNonNull(f04Var.f3873a);
        boolean z10 = hbVar.D() == 1332770163;
        hbVar.p(0);
        return z10;
    }
}
