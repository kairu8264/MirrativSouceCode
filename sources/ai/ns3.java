package ai;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ns3 implements a8 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7454a;

    /* renamed from: b  reason: collision with root package name */
    public final List<pm> f7455b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final a8 f7456c;

    /* renamed from: d  reason: collision with root package name */
    public a8 f7457d;

    /* renamed from: e  reason: collision with root package name */
    public a8 f7458e;

    /* renamed from: f  reason: collision with root package name */
    public a8 f7459f;

    /* renamed from: g  reason: collision with root package name */
    public a8 f7460g;

    /* renamed from: h  reason: collision with root package name */
    public a8 f7461h;

    /* renamed from: i  reason: collision with root package name */
    public a8 f7462i;

    /* renamed from: j  reason: collision with root package name */
    public a8 f7463j;

    /* renamed from: k  reason: collision with root package name */
    public a8 f7464k;

    public ns3(Context context, a8 a8Var) {
        this.f7454a = context.getApplicationContext();
        this.f7456c = a8Var;
    }

    public static final void s(a8 a8Var, pm pmVar) {
        if (a8Var != null) {
            a8Var.l(pmVar);
        }
    }

    @Override // ai.a8
    public final Map<String, List<String>> a() {
        a8 a8Var = this.f7464k;
        return a8Var == null ? Collections.emptyMap() : a8Var.a();
    }

    @Override // ai.a6
    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        a8 a8Var = this.f7464k;
        Objects.requireNonNull(a8Var);
        return a8Var.b(bArr, i10, i11);
    }

    @Override // ai.a8
    public final void g() throws IOException {
        a8 a8Var = this.f7464k;
        if (a8Var != null) {
            try {
                a8Var.g();
            } finally {
                this.f7464k = null;
            }
        }
    }

    @Override // ai.a8
    public final Uri h() {
        a8 a8Var = this.f7464k;
        if (a8Var == null) {
            return null;
        }
        return a8Var.h();
    }

    @Override // ai.a8
    public final void l(pm pmVar) {
        Objects.requireNonNull(pmVar);
        this.f7456c.l(pmVar);
        this.f7455b.add(pmVar);
        s(this.f7457d, pmVar);
        s(this.f7458e, pmVar);
        s(this.f7459f, pmVar);
        s(this.f7460g, pmVar);
        s(this.f7461h, pmVar);
        s(this.f7462i, pmVar);
        s(this.f7463j, pmVar);
    }

    @Override // ai.a8
    public final long m(bc bcVar) throws IOException {
        a8 a8Var;
        u9.d(this.f7464k == null);
        String scheme = bcVar.f2279a.getScheme();
        if (sb.G(bcVar.f2279a)) {
            String path = bcVar.f2279a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.f7464k = q();
            } else {
                if (this.f7457d == null) {
                    qs3 qs3Var = new qs3();
                    this.f7457d = qs3Var;
                    r(qs3Var);
                }
                this.f7464k = this.f7457d;
            }
        } else if ("asset".equals(scheme)) {
            this.f7464k = q();
        } else if ("content".equals(scheme)) {
            if (this.f7459f == null) {
                gs3 gs3Var = new gs3(this.f7454a);
                this.f7459f = gs3Var;
                r(gs3Var);
            }
            this.f7464k = this.f7459f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f7460g == null) {
                try {
                    a8 a8Var2 = (a8) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f7460g = a8Var2;
                    r(a8Var2);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating RTMP extension", e10);
                }
                if (this.f7460g == null) {
                    this.f7460g = this.f7456c;
                }
            }
            this.f7464k = this.f7460g;
        } else if ("udp".equals(scheme)) {
            if (this.f7461h == null) {
                it3 it3Var = new it3(2000);
                this.f7461h = it3Var;
                r(it3Var);
            }
            this.f7464k = this.f7461h;
        } else if ("data".equals(scheme)) {
            if (this.f7462i == null) {
                hs3 hs3Var = new hs3();
                this.f7462i = hs3Var;
                r(hs3Var);
            }
            this.f7464k = this.f7462i;
        } else {
            if (!RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) && !"android.resource".equals(scheme)) {
                a8Var = this.f7456c;
            } else {
                if (this.f7463j == null) {
                    bt3 bt3Var = new bt3(this.f7454a);
                    this.f7463j = bt3Var;
                    r(bt3Var);
                }
                a8Var = this.f7463j;
            }
            this.f7464k = a8Var;
        }
        return this.f7464k.m(bcVar);
    }

    public final a8 q() {
        if (this.f7458e == null) {
            yr3 yr3Var = new yr3(this.f7454a);
            this.f7458e = yr3Var;
            r(yr3Var);
        }
        return this.f7458e;
    }

    public final void r(a8 a8Var) {
        for (int i10 = 0; i10 < this.f7455b.size(); i10++) {
            a8Var.l(this.f7455b.get(i10));
        }
    }
}
