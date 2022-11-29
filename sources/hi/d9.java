package hi;

import com.google.android.gms.internal.measurement.zzkh;

/* loaded from: classes3.dex */
public class d9 {

    /* renamed from: c  reason: collision with root package name */
    public static final g8 f35725c = g8.a();

    /* renamed from: a  reason: collision with root package name */
    public volatile w9 f35726a;

    /* renamed from: b  reason: collision with root package name */
    public volatile u7 f35727b;

    public final int a() {
        if (this.f35727b != null) {
            return ((s7) this.f35727b).A.length;
        }
        if (this.f35726a != null) {
            return this.f35726a.z0();
        }
        return 0;
    }

    public final u7 b() {
        if (this.f35727b != null) {
            return this.f35727b;
        }
        synchronized (this) {
            if (this.f35727b != null) {
                return this.f35727b;
            }
            if (this.f35726a == null) {
                this.f35727b = u7.f36014x;
            } else {
                this.f35727b = this.f35726a.s0();
            }
            return this.f35727b;
        }
    }

    public final void c(w9 w9Var) {
        if (this.f35726a != null) {
            return;
        }
        synchronized (this) {
            if (this.f35726a == null) {
                try {
                    this.f35726a = w9Var;
                    this.f35727b = u7.f36014x;
                } catch (zzkh unused) {
                    this.f35726a = w9Var;
                    this.f35727b = u7.f36014x;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d9) {
            d9 d9Var = (d9) obj;
            w9 w9Var = this.f35726a;
            w9 w9Var2 = d9Var.f35726a;
            if (w9Var == null && w9Var2 == null) {
                return b().equals(d9Var.b());
            }
            if (w9Var == null || w9Var2 == null) {
                if (w9Var != null) {
                    d9Var.c(w9Var.b());
                    return w9Var.equals(d9Var.f35726a);
                }
                c(w9Var2.b());
                return this.f35726a.equals(w9Var2);
            }
            return w9Var.equals(w9Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
