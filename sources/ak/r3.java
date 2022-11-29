package ak;

import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class r3 {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f13625a;

    /* renamed from: b  reason: collision with root package name */
    public final dk.b0<u4> f13626b;

    /* renamed from: c  reason: collision with root package name */
    public final k2 f13627c;

    /* renamed from: d  reason: collision with root package name */
    public final dk.b0<Executor> f13628d;

    /* renamed from: e  reason: collision with root package name */
    public final t1 f13629e;

    public r3(o0 o0Var, dk.b0<u4> b0Var, k2 k2Var, dk.b0<Executor> b0Var2, t1 t1Var) {
        this.f13625a = o0Var;
        this.f13626b = b0Var;
        this.f13627c = k2Var;
        this.f13628d = b0Var2;
        this.f13629e = t1Var;
    }

    public final void a(final p3 p3Var) {
        File v10 = this.f13625a.v(p3Var.f13533b, p3Var.f13582c, p3Var.f13584e);
        if (v10.exists()) {
            File v11 = this.f13625a.v(p3Var.f13533b, p3Var.f13583d, p3Var.f13584e);
            v11.mkdirs();
            if (v10.renameTo(v11)) {
                this.f13628d.zza().execute(new Runnable() { // from class: ak.q3
                    @Override // java.lang.Runnable
                    public final void run() {
                        r3.this.b(p3Var);
                    }
                });
                this.f13627c.k(p3Var.f13533b, p3Var.f13583d, p3Var.f13584e);
                this.f13629e.c(p3Var.f13533b);
                this.f13626b.zza().b(p3Var.f13532a, p3Var.f13533b);
                return;
            }
            throw new p1(String.format("Cannot promote pack %s from %s to %s", p3Var.f13533b, v10.getAbsolutePath(), v11.getAbsolutePath()), p3Var.f13532a);
        }
        throw new p1(String.format("Cannot find pack files to promote for pack %s at %s", p3Var.f13533b, v10.getAbsolutePath()), p3Var.f13532a);
    }

    public final /* synthetic */ void b(p3 p3Var) {
        this.f13625a.b(p3Var.f13533b, p3Var.f13583d, p3Var.f13584e);
    }
}
