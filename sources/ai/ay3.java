package ai;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public final class ay3 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f2153a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    public boolean f2154b;

    /* renamed from: c  reason: collision with root package name */
    public int f2155c;

    /* renamed from: d  reason: collision with root package name */
    public long f2156d;

    /* renamed from: e  reason: collision with root package name */
    public int f2157e;

    /* renamed from: f  reason: collision with root package name */
    public int f2158f;

    /* renamed from: g  reason: collision with root package name */
    public int f2159g;

    public final void a() {
        this.f2154b = false;
        this.f2155c = 0;
    }

    public final void b(nv3 nv3Var) throws IOException {
        if (this.f2154b) {
            return;
        }
        ((hv3) nv3Var).c(this.f2153a, 0, 10, false);
        nv3Var.j();
        byte[] bArr = this.f2153a;
        int i10 = su3.f10000g;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f2154b = true;
        }
    }

    @RequiresNonNull({"#1.output"})
    public final void c(zx3 zx3Var, long j10, int i10, int i11, int i12) {
        if (this.f2154b) {
            int i13 = this.f2155c;
            int i14 = i13 + 1;
            this.f2155c = i14;
            if (i13 == 0) {
                this.f2156d = j10;
                this.f2157e = i10;
                this.f2158f = 0;
            }
            this.f2158f += i11;
            this.f2159g = i12;
            if (i14 >= 16) {
                d(zx3Var);
            }
        }
    }

    @RequiresNonNull({"#1.output"})
    public final void d(zx3 zx3Var) {
        if (this.f2155c > 0) {
            zx3Var.X.e(this.f2156d, this.f2157e, this.f2158f, this.f2159g, zx3Var.f13257j);
            this.f2155c = 0;
        }
    }
}
