package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class bk3<T> implements ok3<T> {

    /* renamed from: a  reason: collision with root package name */
    public final xj3 f2387a;

    /* renamed from: b  reason: collision with root package name */
    public final dl3<?, ?> f2388b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2389c;

    /* renamed from: d  reason: collision with root package name */
    public final ei3<?> f2390d;

    public bk3(dl3<?, ?> dl3Var, ei3<?> ei3Var, xj3 xj3Var) {
        this.f2388b = dl3Var;
        this.f2389c = ei3Var.a(xj3Var);
        this.f2390d = ei3Var;
        this.f2387a = xj3Var;
    }

    public static <T> bk3<T> a(dl3<?, ?> dl3Var, ei3<?> ei3Var, xj3 xj3Var) {
        return new bk3<>(dl3Var, ei3Var, xj3Var);
    }

    @Override // ai.ok3
    public final void e(T t10) {
        this.f2388b.m(t10);
        this.f2390d.d(t10);
    }

    @Override // ai.ok3
    public final void f(T t10, zh3 zh3Var) throws IOException {
        this.f2390d.b(t10);
        throw null;
    }

    @Override // ai.ok3
    public final int g(T t10) {
        dl3<?, ?> dl3Var = this.f2388b;
        int p10 = dl3Var.p(dl3Var.j(t10));
        if (this.f2389c) {
            this.f2390d.b(t10);
            throw null;
        }
        return p10;
    }

    @Override // ai.ok3
    public final int h(T t10) {
        int hashCode = this.f2388b.j(t10).hashCode();
        if (this.f2389c) {
            this.f2390d.b(t10);
            throw null;
        }
        return hashCode;
    }

    @Override // ai.ok3
    public final void i(T t10, byte[] bArr, int i10, int i11, ah3 ah3Var) throws IOException {
        ri3 ri3Var = (ri3) t10;
        if (ri3Var.zzc == el3.a()) {
            ri3Var.zzc = el3.b();
        }
        oi3 oi3Var = (oi3) t10;
        throw null;
    }

    @Override // ai.ok3
    public final void j(T t10, T t11) {
        rk3.f(this.f2388b, t10, t11);
        if (this.f2389c) {
            rk3.e(this.f2390d, t10, t11);
        }
    }

    @Override // ai.ok3
    public final void k(T t10, ik3 ik3Var, di3 di3Var) throws IOException {
        boolean d10;
        dl3<?, ?> dl3Var = this.f2388b;
        ei3<?> ei3Var = this.f2390d;
        Object k10 = dl3Var.k(t10);
        ii3<?> c10 = ei3Var.c(t10);
        while (ik3Var.zzb() != Integer.MAX_VALUE) {
            try {
                int b10 = ik3Var.b();
                if (b10 != 11) {
                    if ((b10 & 7) == 2) {
                        Object f10 = ei3Var.f(di3Var, this.f2387a, b10 >>> 3);
                        if (f10 != null) {
                            ei3Var.g(ik3Var, f10, di3Var, c10);
                        } else {
                            d10 = dl3Var.n(k10, ik3Var);
                        }
                    } else {
                        d10 = ik3Var.d();
                    }
                    if (!d10) {
                        return;
                    }
                } else {
                    int i10 = 0;
                    Object obj = null;
                    oh3 oh3Var = null;
                    while (ik3Var.zzb() != Integer.MAX_VALUE) {
                        int b11 = ik3Var.b();
                        if (b11 == 16) {
                            i10 = ik3Var.w();
                            obj = ei3Var.f(di3Var, this.f2387a, i10);
                        } else if (b11 == 26) {
                            if (obj != null) {
                                ei3Var.g(ik3Var, obj, di3Var, c10);
                            } else {
                                oh3Var = ik3Var.l();
                            }
                        } else if (!ik3Var.d()) {
                            break;
                        }
                    }
                    if (ik3Var.b() != 12) {
                        throw zzggm.h();
                    } else if (oh3Var != null) {
                        if (obj != null) {
                            ei3Var.h(oh3Var, obj, di3Var, c10);
                        } else {
                            dl3Var.e(k10, i10, oh3Var);
                        }
                    }
                }
            } finally {
                dl3Var.l(t10, k10);
            }
        }
    }

    @Override // ai.ok3
    public final boolean l(T t10) {
        this.f2390d.b(t10);
        throw null;
    }

    @Override // ai.ok3
    public final boolean m(T t10, T t11) {
        if (this.f2388b.j(t10).equals(this.f2388b.j(t11))) {
            if (this.f2389c) {
                this.f2390d.b(t10);
                this.f2390d.b(t11);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // ai.ok3
    public final T zza() {
        return (T) this.f2387a.e().P();
    }
}
