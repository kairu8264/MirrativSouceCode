package ai;

import android.os.Handler;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class id {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f5186a;

    /* renamed from: b  reason: collision with root package name */
    public final jd f5187b;

    public id(Handler handler, jd jdVar) {
        Objects.requireNonNull(handler);
        this.f5186a = handler;
        this.f5187b = jdVar;
    }

    public final void b(de deVar) {
        this.f5186a.post(new cd(this, deVar));
    }

    public final void c(String str, long j10, long j11) {
        this.f5186a.post(new dd(this, str, j10, j11));
    }

    public final void d(oc ocVar) {
        this.f5186a.post(new ed(this, ocVar));
    }

    public final void e(int i10, long j10, long j11) {
        this.f5186a.post(new fd(this, i10, j10, j11));
    }

    public final void f(de deVar) {
        this.f5186a.post(new gd(this, deVar));
    }

    public final void g(int i10) {
        this.f5186a.post(new hd(this, i10));
    }
}
