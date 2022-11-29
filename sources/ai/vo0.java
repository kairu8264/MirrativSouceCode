package ai;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class vo0 implements a8 {

    /* renamed from: a  reason: collision with root package name */
    public final a8 f11137a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11138b;

    /* renamed from: c  reason: collision with root package name */
    public final a8 f11139c;

    /* renamed from: d  reason: collision with root package name */
    public long f11140d;

    /* renamed from: e  reason: collision with root package name */
    public Uri f11141e;

    public vo0(a8 a8Var, int i10, a8 a8Var2) {
        this.f11137a = a8Var;
        this.f11138b = i10;
        this.f11139c = a8Var2;
    }

    @Override // ai.a8
    public final Map<String, List<String>> a() {
        return d03.d();
    }

    @Override // ai.a6
    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.f11140d;
        long j11 = this.f11138b;
        if (j10 < j11) {
            int b10 = this.f11137a.b(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.f11140d + b10;
            this.f11140d = j12;
            i12 = b10;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 >= this.f11138b) {
            int b11 = this.f11139c.b(bArr, i10 + i12, i11 - i12);
            this.f11140d += b11;
            return i12 + b11;
        }
        return i12;
    }

    @Override // ai.a8
    public final void g() throws IOException {
        this.f11137a.g();
        this.f11139c.g();
    }

    @Override // ai.a8
    public final Uri h() {
        return this.f11141e;
    }

    @Override // ai.a8
    public final void l(pm pmVar) {
    }

    @Override // ai.a8
    public final long m(bc bcVar) throws IOException {
        bc bcVar2;
        this.f11141e = bcVar.f2279a;
        long j10 = bcVar.f2284f;
        long j11 = this.f11138b;
        bc bcVar3 = null;
        if (j10 >= j11) {
            bcVar2 = null;
        } else {
            long j12 = bcVar.f2285g;
            bcVar2 = new bc(bcVar.f2279a, null, j10, j10, j12 != -1 ? Math.min(j12, j11 - j10) : j11 - j10, null, 0);
        }
        long j13 = bcVar.f2285g;
        if (j13 == -1 || bcVar.f2284f + j13 > this.f11138b) {
            long max = Math.max(this.f11138b, bcVar.f2284f);
            long j14 = bcVar.f2285g;
            bcVar3 = new bc(bcVar.f2279a, null, max, max, j14 != -1 ? Math.min(j14, (bcVar.f2284f + j14) - this.f11138b) : -1L, null, 0);
        }
        long m10 = bcVar2 != null ? this.f11137a.m(bcVar2) : 0L;
        long m11 = bcVar3 != null ? this.f11139c.m(bcVar3) : 0L;
        this.f11140d = bcVar.f2284f;
        if (m10 == -1 || m11 == -1) {
            return -1L;
        }
        return m10 + m11;
    }
}
