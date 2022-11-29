package ai;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.IOException;

@TargetApi(16)
/* loaded from: classes3.dex */
public final class oo0 extends fo0 implements tl0 {
    public String A;
    public boolean B;
    public boolean C;
    public wn0 D;
    public long E;
    public long F;

    /* renamed from: z  reason: collision with root package name */
    public ul0 f7869z;

    public oo0(em0 em0Var, dm0 dm0Var) {
        super(em0Var);
        ul0 mn0Var;
        Context context = em0Var.getContext();
        if (dm0Var.f3347m) {
            mn0Var = new hp0(context, dm0Var, this.f4144y.get());
        } else {
            mn0Var = new mn0(context, dm0Var, this.f4144y.get());
        }
        this.f7869z = mn0Var;
        mn0Var.U(this);
    }

    public static String A(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + length + String.valueOf(message).length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(canonicalName);
        sb2.append(":");
        sb2.append(message);
        return sb2.toString();
    }

    public static final String w(String str) {
        String valueOf = String.valueOf(nj0.d(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    @Override // ai.tl0
    public final void a(int i10) {
    }

    @Override // ai.tl0
    public final void b(final boolean z10, final long j10) {
        final em0 em0Var = this.f4144y.get();
        if (em0Var != null) {
            hk0.f4882e.execute(new Runnable(em0Var, z10, j10) { // from class: ai.mo0

                /* renamed from: w  reason: collision with root package name */
                public final em0 f6988w;

                /* renamed from: x  reason: collision with root package name */
                public final boolean f6989x;

                /* renamed from: y  reason: collision with root package name */
                public final long f6990y;

                {
                    this.f6988w = em0Var;
                    this.f6989x = z10;
                    this.f6990y = j10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f6988w.y0(this.f6989x, this.f6990y);
                }
            });
        }
    }

    @Override // ai.tl0
    public final void c(String str, Exception exc) {
        uj0.g("Precache exception", exc);
        wg.t.h().l(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // ai.tl0
    public final void d(int i10, int i11) {
    }

    @Override // ai.tl0
    public final void e(String str, Exception exc) {
        uj0.g("Precache error", exc);
        wg.t.h().l(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // ai.fo0
    public final boolean f(String str) {
        return g(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v1, types: [ai.fo0] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // ai.fo0
    public final boolean g(String str, String[] strArr) {
        String str2;
        String str3;
        oo0 oo0Var;
        long j10;
        long j11;
        long j12;
        ?? r12;
        long j13;
        String str4;
        long j14;
        long j15;
        oo0 oo0Var2 = this;
        String str5 = str;
        oo0Var2.A = str5;
        String w10 = w(str);
        String str6 = MRLog.PAYLOAD_KEY_ERROR;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            oo0Var2.f7869z.S(uriArr, oo0Var2.f4143x);
            em0 em0Var = oo0Var2.f4144y.get();
            if (em0Var != null) {
                em0Var.o(w10, oo0Var2);
            }
            vh.f k10 = wg.t.k();
            long currentTimeMillis = k10.currentTimeMillis();
            long longValue = ((Long) ft.c().c(ox.f8092t)).longValue();
            long longValue2 = ((Long) ft.c().c(ox.f8084s)).longValue() * 1000;
            long intValue = ((Integer) ft.c().c(ox.f8076r)).intValue();
            boolean booleanValue = ((Boolean) ft.c().c(ox.f8030l1)).booleanValue();
            long j16 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (k10.currentTimeMillis() - currentTimeMillis <= longValue2) {
                            if (!oo0Var2.B) {
                                if (oo0Var2.C) {
                                    break;
                                } else if (oo0Var2.f7869z.B()) {
                                    long I = oo0Var2.f7869z.I();
                                    if (I > 0) {
                                        long O = oo0Var2.f7869z.O();
                                        if (O != j16) {
                                            try {
                                                j10 = intValue;
                                                long j17 = I;
                                                j11 = longValue2;
                                                j13 = longValue;
                                                str4 = w10;
                                                try {
                                                    o(str, w10, O, j17, O > 0, booleanValue ? oo0Var2.f7869z.J() : -1L, booleanValue ? oo0Var2.f7869z.K() : -1L, booleanValue ? oo0Var2.f7869z.L() : -1L, ul0.Q(), ul0.R());
                                                    j15 = O;
                                                    j14 = I;
                                                    str2 = j17;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    oo0Var = this;
                                                    str2 = str;
                                                    str3 = str4;
                                                    try {
                                                        throw th;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        String str7 = str6;
                                                        String message = e.getMessage();
                                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                                                        sb2.append("Failed to preload url ");
                                                        sb2.append(str2);
                                                        sb2.append(" Exception: ");
                                                        sb2.append(message);
                                                        uj0.f(sb2.toString());
                                                        wg.t.h().l(e, "VideoStreamExoPlayerCache.preload");
                                                        release();
                                                        oo0Var.s(str2, str3, str7, A(str7, e));
                                                        return false;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                oo0Var = this;
                                                str2 = str;
                                                str3 = w10;
                                            }
                                        } else {
                                            j10 = intValue;
                                            j11 = longValue2;
                                            j13 = longValue;
                                            str4 = w10;
                                            j14 = I;
                                            j15 = j16;
                                            str2 = intValue;
                                        }
                                        oo0Var = (O > j14 ? 1 : (O == j14 ? 0 : -1));
                                        if (oo0Var >= 0) {
                                            r(str, str4, j14);
                                        } else {
                                            try {
                                                oo0 oo0Var3 = this;
                                                str2 = str;
                                                str3 = str4;
                                                if (oo0Var3.f7869z.P() < j10 || O <= 0) {
                                                    j12 = j13;
                                                    r12 = j15;
                                                    oo0Var = oo0Var3;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                throw th;
                                            }
                                        }
                                    } else {
                                        j10 = intValue;
                                        j11 = longValue2;
                                        str2 = str5;
                                        str3 = w10;
                                        oo0Var = oo0Var2;
                                        j12 = longValue;
                                        r12 = j16;
                                    }
                                    try {
                                        try {
                                            oo0Var.wait(j12);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            str6 = r12;
                                            throw th;
                                        }
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } else {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                            } else {
                                throw new IOException("Abort requested before buffering finished. ");
                            }
                        } else {
                            long j18 = longValue2;
                            StringBuilder sb3 = new StringBuilder(47);
                            sb3.append("Timeout reached. Limit: ");
                            sb3.append(j18);
                            sb3.append(" ms");
                            throw new IOException(sb3.toString());
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        str2 = str5;
                        str3 = w10;
                        oo0Var = oo0Var2;
                    }
                }
                longValue = j12;
                oo0Var2 = oo0Var;
                str5 = str2;
                w10 = str3;
                intValue = j10;
                longValue2 = j11;
                j16 = r12;
            }
            return true;
        } catch (Exception e11) {
            e = e11;
            str2 = str5;
            str3 = w10;
            oo0Var = oo0Var2;
        }
    }

    @Override // ai.fo0
    public final boolean h(String str, String[] strArr, wn0 wn0Var) {
        this.A = str;
        this.D = wn0Var;
        String w10 = w(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.f7869z.S(uriArr, this.f4143x);
            em0 em0Var = this.f4144y.get();
            if (em0Var != null) {
                em0Var.o(w10, this);
            }
            this.E = wg.t.k().currentTimeMillis();
            this.F = -1L;
            z(0L);
            return true;
        } catch (Exception e10) {
            String message = e10.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb2.append("Failed to preload url ");
            sb2.append(str);
            sb2.append(" Exception: ");
            sb2.append(message);
            uj0.f(sb2.toString());
            wg.t.h().l(e10, "VideoStreamExoPlayerCache.preload");
            release();
            s(str, w10, MRLog.PAYLOAD_KEY_ERROR, A(MRLog.PAYLOAD_KEY_ERROR, e10));
            return false;
        }
    }

    @Override // ai.fo0
    public final void i(int i10) {
        this.f7869z.H(i10);
    }

    @Override // ai.fo0
    public final void j(int i10) {
        this.f7869z.G(i10);
    }

    @Override // ai.fo0
    public final void k(int i10) {
        this.f7869z.a0(i10);
    }

    @Override // ai.fo0
    public final void l(int i10) {
        this.f7869z.b0(i10);
    }

    @Override // ai.fo0
    public final void m() {
        synchronized (this) {
            this.B = true;
            notify();
            release();
        }
        String str = this.A;
        if (str != null) {
            s(this.A, w(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // ai.fo0, oh.c
    public final void release() {
        ul0 ul0Var = this.f7869z;
        if (ul0Var != null) {
            ul0Var.U(null);
            this.f7869z.V();
        }
    }

    public final ul0 u() {
        synchronized (this) {
            this.C = true;
            notify();
        }
        this.f7869z.U(null);
        ul0 ul0Var = this.f7869z;
        this.f7869z = null;
        return ul0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [ai.fo0, ai.oo0] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [ai.oo0] */
    /* JADX WARN: Type inference failed for: r2v31 */
    public final /* synthetic */ void v() {
        String str;
        oo0 oo0Var;
        oo0 oo0Var2;
        mx c10;
        long longValue;
        long intValue;
        oo0 oo0Var3;
        long j10;
        long j11;
        String str2;
        long j12;
        String w10 = w(this.A);
        String str3 = MRLog.PAYLOAD_KEY_ERROR;
        try {
            gx<Long> gxVar = ox.f8084s;
            c10 = ft.c();
            longValue = ((Long) c10.c(gxVar)).longValue() * 1000;
            intValue = ((Integer) ft.c().c(ox.f8076r)).intValue();
            oo0Var = ((Boolean) ft.c().c(ox.f8030l1)).booleanValue();
            try {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
            str = w10;
            oo0Var = this;
        }
        synchronized (this) {
            try {
                long currentTimeMillis = wg.t.k().currentTimeMillis();
                long j13 = this.E;
                if (currentTimeMillis - j13 <= longValue) {
                    try {
                        if (!this.B) {
                            if (!this.C) {
                                if (this.f7869z.B()) {
                                    long I = this.f7869z.I();
                                    if (I > 0) {
                                        long O = this.f7869z.O();
                                        if (O != this.F) {
                                            try {
                                                j11 = intValue;
                                                str2 = w10;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                oo0Var = this;
                                                str = w10;
                                            }
                                            try {
                                                o(this.A, w10, O, I, O > 0, oo0Var != 0 ? this.f7869z.J() : -1L, oo0Var != 0 ? this.f7869z.K() : -1L, oo0Var != 0 ? this.f7869z.L() : -1L, ul0.Q(), ul0.R());
                                                oo0Var = this;
                                                j10 = O;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                oo0Var = this;
                                                str = str2;
                                                throw th;
                                            }
                                            try {
                                                oo0Var.F = j10;
                                                j12 = I;
                                                oo0Var = oo0Var;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                str = str2;
                                                throw th;
                                            }
                                        } else {
                                            j10 = O;
                                            j11 = intValue;
                                            str2 = w10;
                                            oo0Var = this;
                                            j12 = I;
                                        }
                                        if (j10 >= j12) {
                                            oo0Var.r(oo0Var.A, str2, j12);
                                            oo0Var2 = oo0Var;
                                        } else {
                                            int i10 = (oo0Var.f7869z.P() > j11 ? 1 : (oo0Var.f7869z.P() == j11 ? 0 : -1));
                                            oo0Var3 = oo0Var;
                                            if (i10 >= 0) {
                                                oo0Var3 = oo0Var;
                                                if (j10 > 0) {
                                                    oo0Var2 = oo0Var;
                                                }
                                            }
                                        }
                                    } else {
                                        oo0Var3 = this;
                                    }
                                    oo0Var3.z(((Long) ft.c().c(ox.f8092t)).longValue());
                                    return;
                                }
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            oo0Var2 = this;
                            wg.t.z().j(oo0Var2.D);
                        }
                        throw new IOException("Abort requested before buffering finished. ");
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = c10;
                        str = j13;
                    }
                } else {
                    str = w10;
                    oo0Var = this;
                    try {
                        StringBuilder sb2 = new StringBuilder(47);
                        sb2.append("Timeout reached. Limit: ");
                        sb2.append(longValue);
                        sb2.append(" ms");
                        throw new IOException(sb2.toString());
                    } catch (Throwable th7) {
                        th = th7;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                str = w10;
                oo0Var = this;
            }
            try {
                throw th;
            } catch (Exception e11) {
                e = e11;
                String str4 = str3;
                String str5 = oo0Var.A;
                String message = e.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 34 + String.valueOf(message).length());
                sb3.append("Failed to preload url ");
                sb3.append(str5);
                sb3.append(" Exception: ");
                sb3.append(message);
                uj0.f(sb3.toString());
                wg.t.h().l(e, "VideoStreamExoPlayerCache.preload");
                release();
                oo0Var.s(oo0Var.A, str, str4, A(str4, e));
                oo0Var2 = oo0Var;
                wg.t.z().j(oo0Var2.D);
            }
        }
    }

    @Override // ai.tl0
    public final void x() {
        uj0.f("Precache onRenderedFirstFrame");
    }

    public final void z(long j10) {
        yg.d2.f61866i.postDelayed(new Runnable(this) { // from class: ai.no0

            /* renamed from: w  reason: collision with root package name */
            public final oo0 f7425w;

            {
                this.f7425w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7425w.v();
            }
        }, j10);
    }
}
