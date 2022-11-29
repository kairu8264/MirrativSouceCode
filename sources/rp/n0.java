package rp;

import com.dena.showroom.flvplayback.Sample;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import rp.c;

/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f51721a = new c.a();

    /* renamed from: b  reason: collision with root package name */
    public static final int f51722b = -1234567890;

    public static final boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        jo.p.h(bArr, TopicConstant.EXTEND_LIPMETA_A);
        jo.p.h(bArr2, "b");
        if (i12 <= 0) {
            return true;
        }
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
            if (i14 >= i12) {
                return true;
            }
            i13 = i14;
        }
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c() {
        return f51722b;
    }

    public static final int d(f fVar, int i10) {
        jo.p.h(fVar, "<this>");
        return i10 == f51722b ? fVar.G() : i10;
    }

    public static final int e(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long f(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((Sample.MEDIA_FLAG_CODEC_MASK & j10) << 40);
    }

    public static final short g(short s10) {
        int i10 = s10 & 65535;
        return (short) (((i10 & 255) << 8) | ((65280 & i10) >>> 8));
    }

    public static final String h(byte b10) {
        return so.n.m(new char[]{sp.g.f()[(b10 >> 4) & 15], sp.g.f()[b10 & 15]});
    }

    public static final String i(int i10) {
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {sp.g.f()[(i10 >> 28) & 15], sp.g.f()[(i10 >> 24) & 15], sp.g.f()[(i10 >> 20) & 15], sp.g.f()[(i10 >> 16) & 15], sp.g.f()[(i10 >> 12) & 15], sp.g.f()[(i10 >> 8) & 15], sp.g.f()[(i10 >> 4) & 15], sp.g.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return so.n.n(cArr, i11, 8);
    }
}
