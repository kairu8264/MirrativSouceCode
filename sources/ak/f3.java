package ak;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class f3 {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f13354a;

    /* renamed from: b  reason: collision with root package name */
    public final dk.b0<u4> f13355b;

    /* renamed from: c  reason: collision with root package name */
    public final k2 f13356c;

    /* renamed from: d  reason: collision with root package name */
    public final dk.b0<Executor> f13357d;

    /* renamed from: e  reason: collision with root package name */
    public final t1 f13358e;

    /* renamed from: f  reason: collision with root package name */
    public final ck.b f13359f;

    /* renamed from: g  reason: collision with root package name */
    public final i3 f13360g;

    public f3(o0 o0Var, dk.b0<u4> b0Var, k2 k2Var, dk.b0<Executor> b0Var2, t1 t1Var, ck.b bVar, i3 i3Var) {
        this.f13354a = o0Var;
        this.f13355b = b0Var;
        this.f13356c = k2Var;
        this.f13357d = b0Var2;
        this.f13358e = t1Var;
        this.f13359f = bVar;
        this.f13360g = i3Var;
    }

    public final void a(final c3 c3Var) {
        File x10 = this.f13354a.x(c3Var.f13533b, c3Var.f13329c, c3Var.f13330d);
        File z10 = this.f13354a.z(c3Var.f13533b, c3Var.f13329c, c3Var.f13330d);
        if (x10.exists() && z10.exists()) {
            File v10 = this.f13354a.v(c3Var.f13533b, c3Var.f13329c, c3Var.f13330d);
            v10.mkdirs();
            if (x10.renameTo(v10)) {
                new File(this.f13354a.v(c3Var.f13533b, c3Var.f13329c, c3Var.f13330d), "merge.tmp").delete();
                File w10 = this.f13354a.w(c3Var.f13533b, c3Var.f13329c, c3Var.f13330d);
                w10.mkdirs();
                if (z10.renameTo(w10)) {
                    if (this.f13359f.a("assetOnlyUpdates")) {
                        try {
                            this.f13360g.b(c3Var.f13533b, c3Var.f13329c, c3Var.f13330d, c3Var.f13331e);
                            this.f13357d.zza().execute(new Runnable() { // from class: ak.e3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    f3.this.b(c3Var);
                                }
                            });
                        } catch (IOException e10) {
                            throw new p1(String.format("Could not write asset pack version tag for pack %s: %s", c3Var.f13533b, e10.getMessage()), c3Var.f13532a);
                        }
                    } else {
                        final o0 o0Var = this.f13354a;
                        o0Var.getClass();
                        this.f13357d.zza().execute(new Runnable() { // from class: ak.d3
                            @Override // java.lang.Runnable
                            public final void run() {
                                o0.this.J();
                            }
                        });
                    }
                    this.f13356c.k(c3Var.f13533b, c3Var.f13329c, c3Var.f13330d);
                    this.f13358e.c(c3Var.f13533b);
                    this.f13355b.zza().b(c3Var.f13532a, c3Var.f13533b);
                    return;
                }
                throw new p1("Cannot move metadata files to final location.", c3Var.f13532a);
            }
            throw new p1("Cannot move merged pack files to final location.", c3Var.f13532a);
        }
        throw new p1(String.format("Cannot find pack files to move for pack %s.", c3Var.f13533b), c3Var.f13532a);
    }

    public final /* synthetic */ void b(c3 c3Var) {
        this.f13354a.b(c3Var.f13533b, c3Var.f13329c, c3Var.f13330d);
    }
}
