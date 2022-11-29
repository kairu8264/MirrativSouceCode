package ai;

import com.google.android.gms.internal.ads.zzaha;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class b04 {

    /* renamed from: a  reason: collision with root package name */
    public int f2180a;

    /* renamed from: b  reason: collision with root package name */
    public long f2181b;

    /* renamed from: c  reason: collision with root package name */
    public int f2182c;

    /* renamed from: d  reason: collision with root package name */
    public int f2183d;

    /* renamed from: e  reason: collision with root package name */
    public int f2184e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f2185f = new int[255];

    /* renamed from: g  reason: collision with root package name */
    public final hb f2186g = new hb(255);

    public final void a() {
        this.f2180a = 0;
        this.f2181b = 0L;
        this.f2182c = 0;
        this.f2183d = 0;
        this.f2184e = 0;
    }

    public final boolean b(nv3 nv3Var, long j10) throws IOException {
        int i10;
        u9.a(nv3Var.n() == nv3Var.k());
        this.f2186g.i(4);
        while (true) {
            i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if ((i10 == 0 || nv3Var.n() + 4 < j10) && qv3.e(nv3Var, this.f2186g.q(), 0, 4, true)) {
                this.f2186g.p(0);
                if (this.f2186g.B() != 1332176723) {
                    ((hv3) nv3Var).q(1, false);
                } else {
                    nv3Var.j();
                    return true;
                }
            }
        }
        do {
            if (i10 != 0 && nv3Var.n() >= j10) {
                break;
            }
        } while (nv3Var.F(1) != -1);
        return false;
    }

    public final boolean c(nv3 nv3Var, boolean z10) throws IOException {
        a();
        this.f2186g.i(27);
        if (qv3.e(nv3Var, this.f2186g.q(), 0, 27, z10) && this.f2186g.B() == 1332176723) {
            if (this.f2186g.v() != 0) {
                if (z10) {
                    return false;
                }
                throw zzaha.c("unsupported bit stream revision");
            }
            this.f2180a = this.f2186g.v();
            this.f2181b = this.f2186g.G();
            this.f2186g.C();
            this.f2186g.C();
            this.f2186g.C();
            int v10 = this.f2186g.v();
            this.f2182c = v10;
            this.f2183d = v10 + 27;
            this.f2186g.i(v10);
            if (qv3.e(nv3Var, this.f2186g.q(), 0, this.f2182c, z10)) {
                for (int i10 = 0; i10 < this.f2182c; i10++) {
                    this.f2185f[i10] = this.f2186g.v();
                    this.f2184e += this.f2185f[i10];
                }
                return true;
            }
        }
        return false;
    }
}
