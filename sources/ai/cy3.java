package ai;

import android.support.v4.media.session.PlaybackStateCompat;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class cy3 {

    /* renamed from: a  reason: collision with root package name */
    public final hb f3074a = new hb(8);

    /* renamed from: b  reason: collision with root package name */
    public int f3075b;

    public final boolean a(nv3 nv3Var) throws IOException {
        long b10;
        int i10;
        long o10 = nv3Var.o();
        int i11 = (o10 > (-1L) ? 1 : (o10 == (-1L) ? 0 : -1));
        long j10 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (i11 != 0 && o10 <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j10 = o10;
        }
        int i12 = (int) j10;
        hv3 hv3Var = (hv3) nv3Var;
        hv3Var.c(this.f3074a.q(), 0, 4, false);
        long B = this.f3074a.B();
        this.f3075b = 4;
        while (B != 440786851) {
            int i13 = this.f3075b + 1;
            this.f3075b = i13;
            if (i13 == i12) {
                return false;
            }
            hv3Var.c(this.f3074a.q(), 0, 1, false);
            B = ((B << 8) & (-256)) | (this.f3074a.q()[0] & TagConstant.TAG_CAT_RESERVED);
        }
        long b11 = b(nv3Var);
        long j11 = this.f3075b;
        if (b11 != Long.MIN_VALUE && (i11 == 0 || j11 + b11 < o10)) {
            while (true) {
                int i14 = (this.f3075b > (j11 + b11) ? 1 : (this.f3075b == (j11 + b11) ? 0 : -1));
                if (i14 < 0) {
                    if (b(nv3Var) == Long.MIN_VALUE || (b10 = b(nv3Var)) < 0) {
                        return false;
                    }
                    if (i10 != 0) {
                        int i15 = (int) b10;
                        hv3Var.r(i15, false);
                        this.f3075b += i15;
                    }
                } else if (i14 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final long b(nv3 nv3Var) throws IOException {
        hv3 hv3Var = (hv3) nv3Var;
        int i10 = 0;
        hv3Var.c(this.f3074a.q(), 0, 1, false);
        int i11 = this.f3074a.q()[0] & TagConstant.TAG_CAT_RESERVED;
        if (i11 != 0) {
            int i12 = 128;
            int i13 = 0;
            while ((i11 & i12) == 0) {
                i12 >>= 1;
                i13++;
            }
            int i14 = i11 & (~i12);
            hv3Var.c(this.f3074a.q(), 1, i13, false);
            while (i10 < i13) {
                i10++;
                i14 = (this.f3074a.q()[i10] & TagConstant.TAG_CAT_RESERVED) + (i14 << 8);
            }
            this.f3075b += i13 + 1;
            return i14;
        }
        return Long.MIN_VALUE;
    }
}
