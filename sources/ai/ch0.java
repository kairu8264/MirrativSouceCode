package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ch0 {

    /* renamed from: a  reason: collision with root package name */
    public final vh.f f2826a;

    /* renamed from: b  reason: collision with root package name */
    public final ah0 f2827b;

    public ch0(vh.f fVar, ah0 ah0Var) {
        this.f2826a = fVar;
        this.f2827b = ah0Var;
    }

    public static ch0 a(Context context) {
        return bi0.d(context).b();
    }

    public final void b() {
        this.f2827b.a(-1, this.f2826a.currentTimeMillis());
    }

    public final void c(pw pwVar) {
        this.f2827b.a(-1, this.f2826a.currentTimeMillis());
    }

    public final void d(int i10, long j10) {
        this.f2827b.a(i10, j10);
    }

    public final void e() {
        this.f2827b.b();
    }
}
