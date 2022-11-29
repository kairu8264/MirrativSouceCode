package ai;

import android.support.v4.media.session.PlaybackStateCompat;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ff {

    /* renamed from: a  reason: collision with root package name */
    public final nj f4005a = new nj(8);

    /* renamed from: b  reason: collision with root package name */
    public int f4006b;

    public final boolean a(le leVar) throws IOException, InterruptedException {
        long b10;
        int i10;
        long i11 = leVar.i();
        int i12 = (i11 > (-1L) ? 1 : (i11 == (-1L) ? 0 : -1));
        long j10 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (i12 != 0 && i11 <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j10 = i11;
        }
        int i13 = (int) j10;
        leVar.e(this.f4005a.f7359a, 0, 4, false);
        long p10 = this.f4005a.p();
        this.f4006b = 4;
        while (p10 != 440786851) {
            int i14 = this.f4006b + 1;
            this.f4006b = i14;
            if (i14 == i13) {
                return false;
            }
            leVar.e(this.f4005a.f7359a, 0, 1, false);
            p10 = ((p10 << 8) & (-256)) | (this.f4005a.f7359a[0] & TagConstant.TAG_CAT_RESERVED);
        }
        long b11 = b(leVar);
        long j11 = this.f4006b;
        if (b11 != Long.MIN_VALUE && (i12 == 0 || j11 + b11 < i11)) {
            while (true) {
                int i15 = (this.f4006b > (j11 + b11) ? 1 : (this.f4006b == (j11 + b11) ? 0 : -1));
                if (i15 < 0) {
                    if (b(leVar) == Long.MIN_VALUE || (b10 = b(leVar)) < 0) {
                        return false;
                    }
                    if (i10 != 0) {
                        leVar.f((int) b10, false);
                        this.f4006b = (int) (this.f4006b + b10);
                    }
                } else if (i15 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final long b(le leVar) throws IOException, InterruptedException {
        int i10 = 0;
        leVar.e(this.f4005a.f7359a, 0, 1, false);
        int i11 = this.f4005a.f7359a[0] & TagConstant.TAG_CAT_RESERVED;
        if (i11 != 0) {
            int i12 = 128;
            int i13 = 0;
            while ((i11 & i12) == 0) {
                i12 >>= 1;
                i13++;
            }
            int i14 = i11 & (~i12);
            leVar.e(this.f4005a.f7359a, 1, i13, false);
            while (i10 < i13) {
                i10++;
                i14 = (this.f4005a.f7359a[i10] & TagConstant.TAG_CAT_RESERVED) + (i14 << 8);
            }
            this.f4006b += i13 + 1;
            return i14;
        }
        return Long.MIN_VALUE;
    }
}
