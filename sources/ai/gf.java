package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class gf {

    /* renamed from: d  reason: collision with root package name */
    public static final long[] f4403d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4404a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public int f4405b;

    /* renamed from: c  reason: collision with root package name */
    public int f4406c;

    public static int c(int i10) {
        int i11 = 0;
        while (i11 < 8) {
            int i12 = ((f4403d[i11] & i10) > 0L ? 1 : ((f4403d[i11] & i10) == 0L ? 0 : -1));
            i11++;
            if (i12 != 0) {
                return i11;
            }
        }
        return -1;
    }

    public static long d(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f4403d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public final void a() {
        this.f4405b = 0;
        this.f4406c = 0;
    }

    public final int b() {
        return this.f4406c;
    }

    public final long e(le leVar, boolean z10, boolean z11, int i10) throws IOException, InterruptedException {
        if (this.f4405b == 0) {
            if (!leVar.b(this.f4404a, 0, 1, z10)) {
                return -1L;
            }
            int c10 = c(this.f4404a[0] & TagConstant.TAG_CAT_RESERVED);
            this.f4406c = c10;
            if (c10 != -1) {
                this.f4405b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f4406c;
        if (i11 > i10) {
            this.f4405b = 0;
            return -2L;
        }
        if (i11 != 1) {
            leVar.b(this.f4404a, 1, i11 - 1, false);
        }
        this.f4405b = 0;
        return d(this.f4404a, this.f4406c, z11);
    }
}
