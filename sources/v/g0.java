package v;

import java.util.Objects;
import y.t0;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f56227a;

    /* renamed from: b  reason: collision with root package name */
    public final t0 f56228b;

    public g0(long j10, t0 t0Var) {
        this.f56227a = j10;
        this.f56228b = t0Var;
    }

    public /* synthetic */ g0(long j10, t0 t0Var, jo.h hVar) {
        this(j10, t0Var);
    }

    public final t0 a() {
        return this.f56228b;
    }

    public final long b() {
        return this.f56227a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (jo.p.c(g0.class, obj != null ? obj.getClass() : null)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
            g0 g0Var = (g0) obj;
            return c1.c0.m(this.f56227a, g0Var.f56227a) && jo.p.c(this.f56228b, g0Var.f56228b);
        }
        return false;
    }

    public int hashCode() {
        return (c1.c0.s(this.f56227a) * 31) + this.f56228b.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) c1.c0.t(this.f56227a)) + ", drawPadding=" + this.f56228b + ')';
    }

    public /* synthetic */ g0(long j10, t0 t0Var, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? c1.e0.c(4284900966L) : j10, (i10 & 2) != 0 ? y.r0.c(0.0f, 0.0f, 3, null) : t0Var, null);
    }
}
