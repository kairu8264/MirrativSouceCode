package ai;

import android.util.Pair;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.mirrativ.llstream.encoder.AACEncoder;

/* loaded from: classes3.dex */
public final class gj {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f4471a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4472b = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, AACEncoder.SAMPLING_RATE, 32000, 24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4473c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair<Integer, Integer> a(byte[] bArr) {
        mj mjVar = new mj(bArr, bArr.length);
        int c10 = c(mjVar);
        int d10 = d(mjVar);
        int a10 = mjVar.a(4);
        if (c10 == 5 || c10 == 29) {
            d10 = d(mjVar);
            if (c(mjVar) == 22) {
                a10 = mjVar.a(4);
            }
        }
        int i10 = f4473c[a10];
        fj.a(i10 != -1);
        return Pair.create(Integer.valueOf(d10), Integer.valueOf(i10));
    }

    public static byte[] b(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 4];
        System.arraycopy(f4471a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }

    public static int c(mj mjVar) {
        int a10 = mjVar.a(5);
        return a10 == 31 ? mjVar.a(6) + 32 : a10;
    }

    public static int d(mj mjVar) {
        int a10 = mjVar.a(4);
        if (a10 == 15) {
            return mjVar.a(24);
        }
        fj.a(a10 < 13);
        return f4472b[a10];
    }
}
