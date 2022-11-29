package ai;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ok {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f7836a;

    /* renamed from: b  reason: collision with root package name */
    public final pk f7837b;

    public ok(Handler handler, pk pkVar) {
        Objects.requireNonNull(handler);
        this.f7836a = handler;
        this.f7837b = pkVar;
    }

    public final void b(de deVar) {
        this.f7836a.post(new hk(this, deVar));
    }

    public final void c(String str, long j10, long j11) {
        this.f7836a.post(new ik(this, str, j10, j11));
    }

    public final void d(oc ocVar) {
        this.f7836a.post(new jk(this, ocVar));
    }

    public final void e(int i10, long j10) {
        this.f7836a.post(new kk(this, i10, j10));
    }

    public final void f(int i10, int i11, int i12, float f10) {
        this.f7836a.post(new lk(this, i10, i11, i12, f10));
    }

    public final void g(Surface surface) {
        this.f7836a.post(new mk(this, surface));
    }

    public final void h(de deVar) {
        this.f7836a.post(new nk(this, deVar));
    }
}
