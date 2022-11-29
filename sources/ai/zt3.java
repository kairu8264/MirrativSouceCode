package ai;

import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import com.google.android.exoplayer2.C;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zt3 {

    /* renamed from: a  reason: collision with root package name */
    public final nt3 f13170a = new nt3();

    /* renamed from: b  reason: collision with root package name */
    public final vt3 f13171b;

    /* renamed from: c  reason: collision with root package name */
    public final yt3 f13172c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13173d;

    /* renamed from: e  reason: collision with root package name */
    public Surface f13174e;

    /* renamed from: f  reason: collision with root package name */
    public float f13175f;

    /* renamed from: g  reason: collision with root package name */
    public float f13176g;

    /* renamed from: h  reason: collision with root package name */
    public float f13177h;

    /* renamed from: i  reason: collision with root package name */
    public float f13178i;

    /* renamed from: j  reason: collision with root package name */
    public int f13179j;

    /* renamed from: k  reason: collision with root package name */
    public long f13180k;

    /* renamed from: l  reason: collision with root package name */
    public long f13181l;

    /* renamed from: m  reason: collision with root package name */
    public long f13182m;

    /* renamed from: n  reason: collision with root package name */
    public long f13183n;

    /* renamed from: o  reason: collision with root package name */
    public long f13184o;

    /* renamed from: p  reason: collision with root package name */
    public long f13185p;

    /* renamed from: q  reason: collision with root package name */
    public long f13186q;

    public zt3(Context context) {
        vt3 vt3Var;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            vt3Var = sb.f9778a >= 17 ? xt3.b(applicationContext) : null;
            if (vt3Var == null) {
                vt3Var = wt3.b(applicationContext);
            }
        } else {
            vt3Var = null;
        }
        this.f13171b = vt3Var;
        this.f13172c = vt3Var != null ? yt3.a() : null;
        this.f13180k = C.TIME_UNSET;
        this.f13181l = C.TIME_UNSET;
        this.f13175f = -1.0f;
        this.f13178i = 1.0f;
        this.f13179j = 0;
    }

    public final void a(int i10) {
        if (this.f13179j == i10) {
            return;
        }
        this.f13179j = i10;
        o(true);
    }

    public final void b() {
        if (this.f13171b != null) {
            yt3 yt3Var = this.f13172c;
            Objects.requireNonNull(yt3Var);
            yt3Var.b();
            this.f13171b.a(new ut3(this) { // from class: ai.st3

                /* renamed from: a  reason: collision with root package name */
                public final zt3 f9992a;

                {
                    this.f9992a = this;
                }

                @Override // ai.ut3
                public final void a(Display display) {
                    this.f9992a.l(display);
                }
            });
        }
    }

    public final void c() {
        this.f13173d = true;
        m();
        o(false);
    }

    public final void d(Surface surface) {
        if (true == (surface instanceof lt3)) {
            surface = null;
        }
        if (this.f13174e == surface) {
            return;
        }
        p();
        this.f13174e = surface;
        o(true);
    }

    public final void e() {
        m();
    }

    public final void f(float f10) {
        this.f13178i = f10;
        m();
        o(false);
    }

    public final void g(float f10) {
        this.f13175f = f10;
        this.f13170a.a();
        n();
    }

    public final void h(long j10) {
        long j11 = this.f13183n;
        if (j11 != -1) {
            this.f13185p = j11;
            this.f13186q = this.f13184o;
        }
        this.f13182m++;
        this.f13170a.b(j10 * 1000);
        n();
    }

    public final void i() {
        this.f13173d = false;
        p();
    }

    public final void j() {
        vt3 vt3Var = this.f13171b;
        if (vt3Var != null) {
            vt3Var.zzb();
            yt3 yt3Var = this.f13172c;
            Objects.requireNonNull(yt3Var);
            yt3Var.c();
        }
    }

    public final long k(long j10) {
        long j11;
        if (this.f13185p != -1 && this.f13170a.c()) {
            long f10 = this.f13186q + (((float) (this.f13170a.f() * (this.f13182m - this.f13185p))) / this.f13178i);
            if (Math.abs(j10 - f10) <= 20000000) {
                j10 = f10;
            } else {
                m();
            }
        }
        this.f13183n = this.f13182m;
        this.f13184o = j10;
        yt3 yt3Var = this.f13172c;
        if (yt3Var == null || this.f13180k == C.TIME_UNSET) {
            return j10;
        }
        long j12 = yt3Var.f12729w;
        if (j12 == C.TIME_UNSET) {
            return j10;
        }
        long j13 = this.f13180k;
        long j14 = j12 + (((j10 - j12) / j13) * j13);
        if (j10 <= j14) {
            j11 = j14 - j13;
        } else {
            j14 = j13 + j14;
            j11 = j14;
        }
        if (j14 - j10 >= j10 - j11) {
            j14 = j11;
        }
        return j14 - this.f13181l;
    }

    public final /* bridge */ /* synthetic */ void l(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f13180k = refreshRate;
            this.f13181l = (refreshRate * 80) / 100;
            return;
        }
        Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f13180k = C.TIME_UNSET;
        this.f13181l = C.TIME_UNSET;
    }

    public final void m() {
        this.f13182m = 0L;
        this.f13185p = -1L;
        this.f13183n = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r9.f13176g) >= r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r9.f13170a.d() >= 30) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r5 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r9 = this;
            int r0 = ai.sb.f9778a
            r1 = 30
            if (r0 < r1) goto L6d
            android.view.Surface r0 = r9.f13174e
            if (r0 != 0) goto Lb
            goto L6d
        Lb:
            ai.nt3 r0 = r9.f13170a
            boolean r0 = r0.c()
            if (r0 == 0) goto L1a
            ai.nt3 r0 = r9.f13170a
            float r0 = r0.g()
            goto L1c
        L1a:
            float r0 = r9.f13175f
        L1c:
            float r2 = r9.f13176g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L23
            return
        L23:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L58
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L58
            ai.nt3 r1 = r9.f13170a
            boolean r1 = r1.c()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L4b
            ai.nt3 r1 = r9.f13170a
            long r3 = r1.e()
            r7 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 < 0) goto L4b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L4b:
            float r1 = r9.f13176g
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L63
            goto L64
        L58:
            if (r4 != 0) goto L68
            ai.nt3 r2 = r9.f13170a
            int r2 = r2.d()
            if (r2 < r1) goto L63
            goto L64
        L63:
            r5 = r6
        L64:
            if (r5 == 0) goto L67
            goto L68
        L67:
            return
        L68:
            r9.f13176g = r0
            r9.o(r6)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.zt3.n():void");
    }

    public final void o(boolean z10) {
        Surface surface;
        if (sb.f9778a < 30 || (surface = this.f13174e) == null || this.f13179j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.f13173d) {
            float f11 = this.f13176g;
            if (f11 != -1.0f) {
                f10 = this.f13178i * f11;
            }
        }
        if (z10 || this.f13177h != f10) {
            this.f13177h = f10;
            tt3.a(surface, f10);
        }
    }

    public final void p() {
        Surface surface;
        if (sb.f9778a < 30 || (surface = this.f13174e) == null || this.f13179j == Integer.MIN_VALUE || this.f13177h == 0.0f) {
            return;
        }
        this.f13177h = 0.0f;
        tt3.a(surface, 0.0f);
    }
}
