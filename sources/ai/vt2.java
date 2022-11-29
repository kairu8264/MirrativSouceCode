package ai;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class vt2 {

    /* renamed from: e  reason: collision with root package name */
    public static volatile int f11356e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f11357f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f11358a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f11359b;

    /* renamed from: c  reason: collision with root package name */
    public final vi.g<xv2> f11360c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11361d;

    public vt2(Context context, Executor executor, vi.g<xv2> gVar, boolean z10) {
        this.f11358a = context;
        this.f11359b = executor;
        this.f11360c = gVar;
        this.f11361d = z10;
    }

    public static vt2 a(final Context context, Executor executor, final boolean z10) {
        return new vt2(context, executor, vi.j.c(executor, new Callable(context, z10) { // from class: ai.st2

            /* renamed from: a  reason: collision with root package name */
            public final Context f9990a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f9991b;

            {
                this.f9990a = context;
                this.f9991b = z10;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new xv2(this.f9990a, true != this.f9991b ? "" : "GLAS", null);
            }
        }), z10);
    }

    public static void g(int i10) {
        f11356e = i10;
    }

    public final vi.g<Boolean> b(int i10, long j10) {
        return h(i10, j10, null, null, null, null);
    }

    public final vi.g<Boolean> c(int i10, long j10, Exception exc) {
        return h(i10, j10, exc, null, null, null);
    }

    public final vi.g<Boolean> d(int i10, long j10, String str, Map<String, String> map) {
        return h(i10, j10, null, str, null, null);
    }

    public final vi.g<Boolean> e(int i10, String str) {
        return h(i10, 0L, null, null, null, str);
    }

    public final vi.g<Boolean> f(int i10, long j10, String str) {
        return h(i10, j10, null, null, null, str);
    }

    public final vi.g<Boolean> h(final int i10, long j10, Exception exc, String str, Map<String, String> map, String str2) {
        if (this.f11361d) {
            final n54 B = r54.B();
            B.r(this.f11358a.getPackageName());
            B.s(j10);
            B.x(f11356e);
            if (exc != null) {
                B.t(zx2.b(exc));
                B.u(exc.getClass().getName());
            }
            if (str2 != null) {
                B.v(str2);
            }
            if (str != null) {
                B.w(str);
            }
            return this.f11360c.j(this.f11359b, new vi.a(B, i10) { // from class: ai.ut2

                /* renamed from: a  reason: collision with root package name */
                public final n54 f10842a;

                /* renamed from: b  reason: collision with root package name */
                public final int f10843b;

                {
                    this.f10842a = B;
                    this.f10843b = i10;
                }

                @Override // vi.a
                public final Object a(vi.g gVar) {
                    n54 n54Var = this.f10842a;
                    int i11 = this.f10843b;
                    int i12 = vt2.f11357f;
                    if (gVar.s()) {
                        vv2 a10 = ((xv2) gVar.o()).a(n54Var.n().L());
                        a10.c(i11);
                        a10.a();
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                }
            });
        }
        return this.f11360c.j(this.f11359b, tt2.f10467a);
    }
}
