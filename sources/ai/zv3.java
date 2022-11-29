package ai;

import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.mirrativ.llstream.encoder.AACEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zv3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f13212a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13213b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13214c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13215d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13216e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13217f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13218g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13219h;

    /* renamed from: i  reason: collision with root package name */
    public final int f13220i;

    /* renamed from: j  reason: collision with root package name */
    public final long f13221j;

    /* renamed from: k  reason: collision with root package name */
    public final yv3 f13222k;

    /* renamed from: l  reason: collision with root package name */
    public final v7 f13223l;

    public zv3(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, yv3 yv3Var, v7 v7Var) {
        this.f13212a = i10;
        this.f13213b = i11;
        this.f13214c = i12;
        this.f13215d = i13;
        this.f13216e = i14;
        this.f13217f = h(i14);
        this.f13218g = i15;
        this.f13219h = i16;
        this.f13220i = i(i16);
        this.f13221j = j10;
        this.f13222k = yv3Var;
        this.f13223l = v7Var;
    }

    public zv3(byte[] bArr, int i10) {
        gb gbVar = new gb(bArr, bArr.length);
        gbVar.d(i10 * 8);
        this.f13212a = gbVar.h(16);
        this.f13213b = gbVar.h(16);
        this.f13214c = gbVar.h(24);
        this.f13215d = gbVar.h(24);
        int h10 = gbVar.h(20);
        this.f13216e = h10;
        this.f13217f = h(h10);
        this.f13218g = gbVar.h(3) + 1;
        int h11 = gbVar.h(5) + 1;
        this.f13219h = h11;
        this.f13220i = i(h11);
        this.f13221j = sb.l(gbVar.h(4), gbVar.h(32));
        this.f13222k = null;
        this.f13223l = null;
    }

    public static int h(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case AACEncoder.SAMPLING_RATE /* 44100 */:
                return 9;
            case OpusUtil.SAMPLE_RATE /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    public static int i(int i10) {
        if (i10 != 8) {
            if (i10 != 12) {
                if (i10 != 16) {
                    if (i10 != 20) {
                        return i10 != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static v7 j(List<String> list, List<d8> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] Z = sb.Z(str, "=");
            if (Z.length != 2) {
                String valueOf = String.valueOf(str);
                Log.w("FlacStreamMetadata", valueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(valueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new f8(Z[0], Z[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new v7(arrayList);
    }

    public final long a() {
        long j10 = this.f13221j;
        return j10 == 0 ? C.TIME_UNSET : (j10 * 1000000) / this.f13216e;
    }

    public final long b(long j10) {
        return sb.d0((j10 * this.f13216e) / 1000000, 0L, this.f13221j - 1);
    }

    public final v4 c(byte[] bArr, v7 v7Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f13215d;
        if (i10 <= 0) {
            i10 = -1;
        }
        v7 d10 = d(v7Var);
        t4 t4Var = new t4();
        t4Var.n(MimeTypes.AUDIO_FLAC);
        t4Var.o(i10);
        t4Var.B(this.f13218g);
        t4Var.C(this.f13216e);
        t4Var.p(Collections.singletonList(bArr));
        t4Var.l(d10);
        return t4Var.I();
    }

    public final v7 d(v7 v7Var) {
        v7 v7Var2 = this.f13223l;
        return v7Var2 == null ? v7Var : v7Var2.c(v7Var);
    }

    public final zv3 e(yv3 yv3Var) {
        return new zv3(this.f13212a, this.f13213b, this.f13214c, this.f13215d, this.f13216e, this.f13218g, this.f13219h, this.f13221j, yv3Var, this.f13223l);
    }

    public final zv3 f(List<String> list) {
        return new zv3(this.f13212a, this.f13213b, this.f13214c, this.f13215d, this.f13216e, this.f13218g, this.f13219h, this.f13221j, this.f13222k, d(j(list, Collections.emptyList())));
    }

    public final zv3 g(List<d8> list) {
        return new zv3(this.f13212a, this.f13213b, this.f13214c, this.f13215d, this.f13216e, this.f13218g, this.f13219h, this.f13221j, this.f13222k, d(j(Collections.emptyList(), list)));
    }
}
