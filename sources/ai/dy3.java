package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class dy3 {

    /* renamed from: d  reason: collision with root package name */
    public static final long[] f3454d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f3455a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public int f3456b;

    /* renamed from: c  reason: collision with root package name */
    public int f3457c;

    public static int d(int i10) {
        int i11 = 0;
        while (i11 < 8) {
            int i12 = ((f3454d[i11] & i10) > 0L ? 1 : ((f3454d[i11] & i10) == 0L ? 0 : -1));
            i11++;
            if (i12 != 0) {
                return i11;
            }
        }
        return -1;
    }

    public static long e(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f3454d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public final void a() {
        this.f3456b = 0;
        this.f3457c = 0;
    }

    public final long b(nv3 nv3Var, boolean z10, boolean z11, int i10) throws IOException {
        if (this.f3456b == 0) {
            if (!nv3Var.f(this.f3455a, 0, 1, z10)) {
                return -1L;
            }
            int d10 = d(this.f3455a[0] & TagConstant.TAG_CAT_RESERVED);
            this.f3457c = d10;
            if (d10 != -1) {
                this.f3456b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f3457c;
        if (i11 > i10) {
            this.f3456b = 0;
            return -2L;
        }
        if (i11 != 1) {
            ((hv3) nv3Var).f(this.f3455a, 1, i11 - 1, false);
        }
        this.f3456b = 0;
        return e(this.f3455a, this.f3457c, z11);
    }

    public final int c() {
        return this.f3457c;
    }
}
