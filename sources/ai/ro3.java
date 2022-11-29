package ai;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ro3 implements a8 {

    /* renamed from: a  reason: collision with root package name */
    public final a8 f9525a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9526b;

    /* renamed from: c  reason: collision with root package name */
    public final qo3 f9527c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f9528d;

    /* renamed from: e  reason: collision with root package name */
    public int f9529e;

    public ro3(a8 a8Var, int i10, qo3 qo3Var) {
        u9.a(i10 > 0);
        this.f9525a = a8Var;
        this.f9526b = i10;
        this.f9527c = qo3Var;
        this.f9528d = new byte[1];
        this.f9529e = i10;
    }

    @Override // ai.a8
    public final Map<String, List<String>> a() {
        return this.f9525a.a();
    }

    @Override // ai.a6
    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f9529e;
        if (i12 == 0) {
            int i13 = 0;
            if (this.f9525a.b(this.f9528d, 0, 1) != -1) {
                int i14 = (this.f9528d[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr2 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int b10 = this.f9525a.b(bArr2, i13, i15);
                        if (b10 != -1) {
                            i13 += b10;
                            i15 -= b10;
                        }
                    }
                    while (i14 > 0) {
                        int i16 = i14 - 1;
                        if (bArr2[i16] != 0) {
                            break;
                        }
                        i14 = i16;
                    }
                    if (i14 > 0) {
                        this.f9527c.a(new hb(bArr2, i14));
                    }
                }
                i12 = this.f9526b;
                this.f9529e = i12;
            }
            return -1;
        }
        int b11 = this.f9525a.b(bArr, i10, Math.min(i12, i11));
        if (b11 != -1) {
            this.f9529e -= b11;
        }
        return b11;
    }

    @Override // ai.a8
    public final void g() {
        throw new UnsupportedOperationException();
    }

    @Override // ai.a8
    public final Uri h() {
        return this.f9525a.h();
    }

    @Override // ai.a8
    public final void l(pm pmVar) {
        Objects.requireNonNull(pmVar);
        this.f9525a.l(pmVar);
    }

    @Override // ai.a8
    public final long m(bc bcVar) {
        throw new UnsupportedOperationException();
    }
}
