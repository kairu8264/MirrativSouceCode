package ai;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.gms.internal.ads.zzaha;
import com.mirrativ.llstream.encoder.AACEncoder;

/* loaded from: classes3.dex */
public final class ou3 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f7920a = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, AACEncoder.SAMPLING_RATE, 32000, 24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f7921b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f7922c = 0;

    public static mu3 a(byte[] bArr) throws zzaha {
        return b(new gb(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
        if (r12 != 3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ai.mu3 b(ai.gb r12, boolean r13) throws com.google.android.gms.internal.ads.zzaha {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ou3.b(ai.gb, boolean):ai.mu3");
    }

    public static int c(gb gbVar) {
        int h10 = gbVar.h(5);
        return h10 == 31 ? gbVar.h(6) + 32 : h10;
    }

    public static int d(gb gbVar) throws zzaha {
        int h10 = gbVar.h(4);
        if (h10 == 15) {
            return gbVar.h(24);
        }
        if (h10 < 13) {
            return f7920a[h10];
        }
        throw zzaha.b(null, null);
    }
}
