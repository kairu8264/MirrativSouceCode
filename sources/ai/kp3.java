package ai;

import android.os.Handler;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class kp3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f6306a;

    /* renamed from: b  reason: collision with root package name */
    public final bp3 f6307b;

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList<jp3> f6308c;

    public kp3() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public kp3(CopyOnWriteArrayList<jp3> copyOnWriteArrayList, int i10, bp3 bp3Var, long j10) {
        this.f6308c = copyOnWriteArrayList;
        this.f6306a = i10;
        this.f6307b = bp3Var;
    }

    public static final long n(long j10) {
        long a10 = y2.a(j10);
        return a10 == C.TIME_UNSET ? C.TIME_UNSET : a10;
    }

    public final kp3 a(int i10, bp3 bp3Var, long j10) {
        return new kp3(this.f6308c, i10, bp3Var, 0L);
    }

    public final void b(Handler handler, lp3 lp3Var) {
        this.f6308c.add(new jp3(handler, lp3Var));
    }

    public final void c(lp3 lp3Var) {
        Iterator<jp3> it = this.f6308c.iterator();
        while (it.hasNext()) {
            jp3 next = it.next();
            if (next.f5883b == lp3Var) {
                this.f6308c.remove(next);
            }
        }
    }

    public final void d(so3 so3Var, int i10, int i11, v4 v4Var, int i12, Object obj, long j10, long j11) {
        e(so3Var, new yo3(1, -1, null, 0, null, n(j10), n(j11)));
    }

    public final void e(final so3 so3Var, final yo3 yo3Var) {
        Iterator<jp3> it = this.f6308c.iterator();
        while (it.hasNext()) {
            jp3 next = it.next();
            final lp3 lp3Var = next.f5883b;
            sb.O(next.f5882a, new Runnable(this, lp3Var, so3Var, yo3Var) { // from class: ai.ep3

                /* renamed from: w  reason: collision with root package name */
                public final kp3 f3739w;

                /* renamed from: x  reason: collision with root package name */
                public final lp3 f3740x;

                /* renamed from: y  reason: collision with root package name */
                public final so3 f3741y;

                /* renamed from: z  reason: collision with root package name */
                public final yo3 f3742z;

                {
                    this.f3739w = this;
                    this.f3740x = lp3Var;
                    this.f3741y = so3Var;
                    this.f3742z = yo3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    kp3 kp3Var = this.f3739w;
                    this.f3740x.a(kp3Var.f6306a, kp3Var.f6307b, this.f3741y, this.f3742z);
                }
            });
        }
    }

    public final void f(so3 so3Var, int i10, int i11, v4 v4Var, int i12, Object obj, long j10, long j11) {
        g(so3Var, new yo3(1, -1, null, 0, null, n(j10), n(j11)));
    }

    public final void g(final so3 so3Var, final yo3 yo3Var) {
        Iterator<jp3> it = this.f6308c.iterator();
        while (it.hasNext()) {
            jp3 next = it.next();
            final lp3 lp3Var = next.f5883b;
            sb.O(next.f5882a, new Runnable(this, lp3Var, so3Var, yo3Var) { // from class: ai.fp3

                /* renamed from: w  reason: collision with root package name */
                public final kp3 f4152w;

                /* renamed from: x  reason: collision with root package name */
                public final lp3 f4153x;

                /* renamed from: y  reason: collision with root package name */
                public final so3 f4154y;

                /* renamed from: z  reason: collision with root package name */
                public final yo3 f4155z;

                {
                    this.f4152w = this;
                    this.f4153x = lp3Var;
                    this.f4154y = so3Var;
                    this.f4155z = yo3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    kp3 kp3Var = this.f4152w;
                    this.f4153x.f(kp3Var.f6306a, kp3Var.f6307b, this.f4154y, this.f4155z);
                }
            });
        }
    }

    public final void h(so3 so3Var, int i10, int i11, v4 v4Var, int i12, Object obj, long j10, long j11) {
        i(so3Var, new yo3(1, -1, null, 0, null, n(j10), n(j11)));
    }

    public final void i(final so3 so3Var, final yo3 yo3Var) {
        Iterator<jp3> it = this.f6308c.iterator();
        while (it.hasNext()) {
            jp3 next = it.next();
            final lp3 lp3Var = next.f5883b;
            sb.O(next.f5882a, new Runnable(this, lp3Var, so3Var, yo3Var) { // from class: ai.gp3

                /* renamed from: w  reason: collision with root package name */
                public final kp3 f4539w;

                /* renamed from: x  reason: collision with root package name */
                public final lp3 f4540x;

                /* renamed from: y  reason: collision with root package name */
                public final so3 f4541y;

                /* renamed from: z  reason: collision with root package name */
                public final yo3 f4542z;

                {
                    this.f4539w = this;
                    this.f4540x = lp3Var;
                    this.f4541y = so3Var;
                    this.f4542z = yo3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    kp3 kp3Var = this.f4539w;
                    this.f4540x.b(kp3Var.f6306a, kp3Var.f6307b, this.f4541y, this.f4542z);
                }
            });
        }
    }

    public final void j(so3 so3Var, int i10, int i11, v4 v4Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        k(so3Var, new yo3(1, -1, null, 0, null, n(j10), n(j11)), iOException, z10);
    }

    public final void k(final so3 so3Var, final yo3 yo3Var, final IOException iOException, final boolean z10) {
        Iterator<jp3> it = this.f6308c.iterator();
        while (it.hasNext()) {
            jp3 next = it.next();
            final lp3 lp3Var = next.f5883b;
            sb.O(next.f5882a, new Runnable(this, lp3Var, so3Var, yo3Var, iOException, z10) { // from class: ai.hp3
                public final IOException A;
                public final boolean B;

                /* renamed from: w  reason: collision with root package name */
                public final kp3 f4925w;

                /* renamed from: x  reason: collision with root package name */
                public final lp3 f4926x;

                /* renamed from: y  reason: collision with root package name */
                public final so3 f4927y;

                /* renamed from: z  reason: collision with root package name */
                public final yo3 f4928z;

                {
                    this.f4925w = this;
                    this.f4926x = lp3Var;
                    this.f4927y = so3Var;
                    this.f4928z = yo3Var;
                    this.A = iOException;
                    this.B = z10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    kp3 kp3Var = this.f4925w;
                    this.f4926x.l(kp3Var.f6306a, kp3Var.f6307b, this.f4927y, this.f4928z, this.A, this.B);
                }
            });
        }
    }

    public final void l(int i10, v4 v4Var, int i11, Object obj, long j10) {
        m(new yo3(1, i10, v4Var, 0, null, n(j10), C.TIME_UNSET));
    }

    public final void m(final yo3 yo3Var) {
        Iterator<jp3> it = this.f6308c.iterator();
        while (it.hasNext()) {
            jp3 next = it.next();
            final lp3 lp3Var = next.f5883b;
            sb.O(next.f5882a, new Runnable(this, lp3Var, yo3Var) { // from class: ai.ip3

                /* renamed from: w  reason: collision with root package name */
                public final kp3 f5316w;

                /* renamed from: x  reason: collision with root package name */
                public final lp3 f5317x;

                /* renamed from: y  reason: collision with root package name */
                public final yo3 f5318y;

                {
                    this.f5316w = this;
                    this.f5317x = lp3Var;
                    this.f5318y = yo3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    kp3 kp3Var = this.f5316w;
                    this.f5317x.v(kp3Var.f6306a, kp3Var.f6307b, this.f5318y);
                }
            });
        }
    }
}
