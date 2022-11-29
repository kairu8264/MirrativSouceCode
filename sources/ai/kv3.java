package ai;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.mirrativ.llstream.encoder.AACEncoder;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class kv3 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f6375a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f6376b = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, AACEncoder.SAMPLING_RATE, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f6377c = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f6378d = 0;

    public static v4 a(byte[] bArr, String str, String str2, ru3 ru3Var) {
        gb gbVar;
        if (bArr[0] == Byte.MAX_VALUE) {
            gbVar = new gb(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b10 = copyOf[0];
            if (b10 == -2 || b10 == -1) {
                for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                    byte b11 = copyOf[i10];
                    int i11 = i10 + 1;
                    copyOf[i10] = copyOf[i11];
                    copyOf[i11] = b11;
                }
            }
            int length = copyOf.length;
            gbVar = new gb(copyOf, length);
            if (copyOf[0] == 31) {
                gb gbVar2 = new gb(copyOf, length);
                while (gbVar2.b() >= 16) {
                    gbVar2.f(2);
                    gbVar.l(gbVar2.h(14), 14);
                }
            }
            gbVar.a(copyOf, copyOf.length);
        }
        gbVar.f(60);
        int i12 = f6375a[gbVar.h(6)];
        int i13 = f6376b[gbVar.h(4)];
        int h10 = gbVar.h(5);
        int i14 = h10 < 29 ? (f6377c[h10] * 1000) / 2 : -1;
        gbVar.f(10);
        int i15 = gbVar.h(2) > 0 ? 1 : 0;
        t4 t4Var = new t4();
        t4Var.d(str);
        t4Var.n(MimeTypes.AUDIO_DTS);
        t4Var.i(i14);
        t4Var.B(i12 + i15);
        t4Var.C(i13);
        t4Var.q(null);
        t4Var.g(str2);
        return t4Var.I();
    }
}
