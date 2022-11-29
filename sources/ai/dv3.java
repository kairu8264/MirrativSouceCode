package ai;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* loaded from: classes3.dex */
public class dv3 {

    /* renamed from: a  reason: collision with root package name */
    public final xu3 f3416a;

    /* renamed from: b  reason: collision with root package name */
    public final cv3 f3417b;

    /* renamed from: c  reason: collision with root package name */
    public zu3 f3418c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3419d;

    public dv3(av3 av3Var, cv3 cv3Var, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f3417b = cv3Var;
        this.f3419d = i10;
        this.f3416a = new xu3(av3Var, j10, 0L, j12, j13, j14, j15);
    }

    public static final int f(nv3 nv3Var, long j10, iw3 iw3Var) {
        if (j10 == nv3Var.n()) {
            return 0;
        }
        iw3Var.f5438a = j10;
        return 1;
    }

    public static final boolean g(nv3 nv3Var, long j10) throws IOException {
        long n10 = j10 - nv3Var.n();
        if (n10 < 0 || n10 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ((hv3) nv3Var).q((int) n10, false);
        return true;
    }

    public final lw3 a() {
        return this.f3416a;
    }

    public final void b(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        zu3 zu3Var = this.f3418c;
        if (zu3Var != null) {
            j15 = zu3Var.f13192a;
            if (j15 == j10) {
                return;
            }
        }
        long j16 = this.f3416a.j(j10);
        j11 = this.f3416a.f12317c;
        j12 = this.f3416a.f12318d;
        j13 = this.f3416a.f12319e;
        j14 = this.f3416a.f12320f;
        this.f3418c = new zu3(j10, j16, 0L, j11, j12, j13, j14);
    }

    public final boolean c() {
        return this.f3418c != null;
    }

    public final int d(nv3 nv3Var, iw3 iw3Var) throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        while (true) {
            zu3 zu3Var = this.f3418c;
            u9.e(zu3Var);
            j10 = zu3Var.f13197f;
            j11 = zu3Var.f13198g;
            j12 = zu3Var.f13199h;
            if (j11 - j10 <= this.f3419d) {
                e(false, j10);
                return f(nv3Var, j10, iw3Var);
            } else if (!g(nv3Var, j12)) {
                return f(nv3Var, j12, iw3Var);
            } else {
                nv3Var.j();
                cv3 cv3Var = this.f3417b;
                j13 = zu3Var.f13193b;
                bv3 a10 = cv3Var.a(nv3Var, j13);
                i10 = a10.f2562a;
                if (i10 == -3) {
                    e(false, j12);
                    return f(nv3Var, j12, iw3Var);
                } else if (i10 == -2) {
                    j19 = a10.f2563b;
                    j20 = a10.f2564c;
                    zu3.f(zu3Var, j19, j20);
                } else if (i10 != -1) {
                    j14 = a10.f2564c;
                    g(nv3Var, j14);
                    j15 = a10.f2564c;
                    e(true, j15);
                    j16 = a10.f2564c;
                    return f(nv3Var, j16, iw3Var);
                } else {
                    j17 = a10.f2563b;
                    j18 = a10.f2564c;
                    zu3.g(zu3Var, j17, j18);
                }
            }
        }
    }

    public final void e(boolean z10, long j10) {
        this.f3418c = null;
        this.f3417b.zzb();
    }
}
