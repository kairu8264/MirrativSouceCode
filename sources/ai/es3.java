package ai;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzak;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class es3 extends z4 {

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f3762e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f3763f;

    /* renamed from: g  reason: collision with root package name */
    public int f3764g;

    /* renamed from: h  reason: collision with root package name */
    public int f3765h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3766i;

    public es3(byte[] bArr) {
        super(false);
        Objects.requireNonNull(bArr);
        u9.a(bArr.length > 0);
        this.f3762e = bArr;
    }

    @Override // ai.a6
    public final int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f3765h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(this.f3762e, this.f3764g, bArr, i10, min);
        this.f3764g += min;
        this.f3765h -= min;
        s(min);
        return min;
    }

    @Override // ai.a8
    public final void g() {
        if (this.f3766i) {
            this.f3766i = false;
            t();
        }
        this.f3763f = null;
    }

    @Override // ai.a8
    public final Uri h() {
        return this.f3763f;
    }

    @Override // ai.a8
    public final long m(bc bcVar) throws IOException {
        this.f3763f = bcVar.f2279a;
        q(bcVar);
        long j10 = bcVar.f2284f;
        int length = this.f3762e.length;
        if (j10 <= length) {
            int i10 = (int) j10;
            this.f3764g = i10;
            int i11 = length - i10;
            this.f3765h = i11;
            long j11 = bcVar.f2285g;
            if (j11 != -1) {
                this.f3765h = (int) Math.min(i11, j11);
            }
            this.f3766i = true;
            r(bcVar);
            long j12 = bcVar.f2285g;
            return j12 != -1 ? j12 : this.f3765h;
        }
        throw new zzak(2008);
    }
}
