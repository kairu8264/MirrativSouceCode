package ai;

import com.google.android.gms.internal.ads.zzggm;

/* loaded from: classes3.dex */
public class ej3 {

    /* renamed from: c  reason: collision with root package name */
    public static final di3 f3685c = di3.a();

    /* renamed from: a  reason: collision with root package name */
    public volatile xj3 f3686a;

    /* renamed from: b  reason: collision with root package name */
    public volatile oh3 f3687b;

    public final int a() {
        if (this.f3687b != null) {
            return ((kh3) this.f3687b).A.length;
        }
        if (this.f3686a != null) {
            return this.f3686a.b();
        }
        return 0;
    }

    public final oh3 b() {
        if (this.f3687b != null) {
            return this.f3687b;
        }
        synchronized (this) {
            if (this.f3687b != null) {
                return this.f3687b;
            }
            if (this.f3686a == null) {
                this.f3687b = oh3.f7807x;
            } else {
                this.f3687b = this.f3686a.T();
            }
            return this.f3687b;
        }
    }

    public final void c(xj3 xj3Var) {
        if (this.f3686a != null) {
            return;
        }
        synchronized (this) {
            if (this.f3686a == null) {
                try {
                    this.f3686a = xj3Var;
                    this.f3687b = oh3.f7807x;
                } catch (zzggm unused) {
                    this.f3686a = xj3Var;
                    this.f3687b = oh3.f7807x;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ej3) {
            ej3 ej3Var = (ej3) obj;
            xj3 xj3Var = this.f3686a;
            xj3 xj3Var2 = ej3Var.f3686a;
            if (xj3Var == null && xj3Var2 == null) {
                return b().equals(ej3Var.b());
            }
            if (xj3Var == null || xj3Var2 == null) {
                if (xj3Var != null) {
                    ej3Var.c(xj3Var.g());
                    return xj3Var.equals(ej3Var.f3686a);
                }
                c(xj3Var2.g());
                return this.f3686a.equals(xj3Var2);
            }
            return xj3Var.equals(xj3Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
