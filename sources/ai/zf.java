package ai;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzanp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* loaded from: classes3.dex */
public final class zf implements me, te {

    /* renamed from: p  reason: collision with root package name */
    public static final oe f12955p = new xf();

    /* renamed from: q  reason: collision with root package name */
    public static final int f12956q = vj.l("qt  ");

    /* renamed from: e  reason: collision with root package name */
    public int f12961e;

    /* renamed from: f  reason: collision with root package name */
    public int f12962f;

    /* renamed from: g  reason: collision with root package name */
    public long f12963g;

    /* renamed from: h  reason: collision with root package name */
    public int f12964h;

    /* renamed from: i  reason: collision with root package name */
    public nj f12965i;

    /* renamed from: j  reason: collision with root package name */
    public int f12966j;

    /* renamed from: k  reason: collision with root package name */
    public int f12967k;

    /* renamed from: l  reason: collision with root package name */
    public ne f12968l;

    /* renamed from: m  reason: collision with root package name */
    public yf[] f12969m;

    /* renamed from: n  reason: collision with root package name */
    public long f12970n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12971o;

    /* renamed from: c  reason: collision with root package name */
    public final nj f12959c = new nj(16);

    /* renamed from: d  reason: collision with root package name */
    public final Stack<hf> f12960d = new Stack<>();

    /* renamed from: a  reason: collision with root package name */
    public final nj f12957a = new nj(lj.f6576a);

    /* renamed from: b  reason: collision with root package name */
    public final nj f12958b = new nj(4);

    @Override // ai.te
    public final long a(long j10) {
        long j11 = Long.MAX_VALUE;
        for (yf yfVar : this.f12969m) {
            eg egVar = yfVar.f12575b;
            int a10 = egVar.a(j10);
            if (a10 == -1) {
                a10 = egVar.b(j10);
            }
            long j12 = egVar.f3653b[a10];
            if (j12 < j11) {
                j11 = j12;
            }
        }
        return j11;
    }

    public final void b() {
        this.f12961e = 0;
        this.f12964h = 0;
    }

    public final void c(long j10) throws zzanp {
        rg rgVar;
        qe qeVar;
        rg rgVar2;
        bg a10;
        while (!this.f12960d.isEmpty() && this.f12960d.peek().P0 == j10) {
            hf pop = this.f12960d.pop();
            if (pop.f5764a == jf.C) {
                ArrayList arrayList = new ArrayList();
                qe qeVar2 = new qe();
                Cif f10 = pop.f(jf.A0);
                if (f10 != null) {
                    rgVar = qf.c(f10, this.f12971o);
                    if (rgVar != null) {
                        qeVar2.a(rgVar);
                    }
                } else {
                    rgVar = null;
                }
                long j11 = C.TIME_UNSET;
                long j12 = Long.MAX_VALUE;
                int i10 = 0;
                while (i10 < pop.R0.size()) {
                    hf hfVar = pop.R0.get(i10);
                    if (hfVar.f5764a == jf.E && (a10 = qf.a(hfVar, pop.f(jf.D), C.TIME_UNSET, null, this.f12971o)) != null) {
                        eg b10 = qf.b(a10, hfVar.g(jf.F).g(jf.G).g(jf.H), qeVar2);
                        if (b10.f3652a != 0) {
                            yf yfVar = new yf(a10, b10, this.f12968l.b(i10, a10.f2328b));
                            oc g10 = a10.f2332f.g(b10.f3655d + 30);
                            if (a10.f2328b == 1) {
                                if (qeVar2.b()) {
                                    g10 = g10.h(qeVar2.f8907a, qeVar2.f8908b);
                                }
                                if (rgVar != null) {
                                    g10 = g10.j(rgVar);
                                }
                            }
                            yfVar.f12576c.a(g10);
                            qeVar = qeVar2;
                            rgVar2 = rgVar;
                            long max = Math.max(j11, a10.f2331e);
                            arrayList.add(yfVar);
                            long j13 = b10.f3653b[0];
                            if (j13 < j12) {
                                j11 = max;
                                j12 = j13;
                            } else {
                                j11 = max;
                            }
                            i10++;
                            qeVar2 = qeVar;
                            rgVar = rgVar2;
                        }
                    }
                    qeVar = qeVar2;
                    rgVar2 = rgVar;
                    i10++;
                    qeVar2 = qeVar;
                    rgVar = rgVar2;
                }
                this.f12970n = j11;
                this.f12969m = (yf[]) arrayList.toArray(new yf[arrayList.size()]);
                this.f12968l.m();
                this.f12968l.g(this);
                this.f12960d.clear();
                this.f12961e = 2;
            } else if (!this.f12960d.isEmpty()) {
                this.f12960d.peek().e(pop);
            }
        }
        if (this.f12961e != 2) {
            b();
        }
    }

    @Override // ai.me
    public final void g(long j10, long j11) {
        this.f12960d.clear();
        this.f12964h = 0;
        this.f12966j = 0;
        this.f12967k = 0;
        if (j10 == 0) {
            b();
            return;
        }
        yf[] yfVarArr = this.f12969m;
        if (yfVarArr != null) {
            for (yf yfVar : yfVarArr) {
                eg egVar = yfVar.f12575b;
                int a10 = egVar.a(j11);
                if (a10 == -1) {
                    a10 = egVar.b(j11);
                }
                yfVar.f12577d = a10;
            }
        }
    }

    @Override // ai.me
    public final boolean h(le leVar) throws IOException, InterruptedException {
        return ag.b(leVar);
    }

    @Override // ai.me
    public final void i(ne neVar) {
        this.f12968l = neVar;
    }

    @Override // ai.me
    public final int j(le leVar, re reVar) throws IOException, InterruptedException {
        yf[] yfVarArr;
        boolean z10;
        boolean z11;
        while (true) {
            int i10 = this.f12961e;
            if (i10 == 0) {
                if (this.f12964h == 0) {
                    if (!leVar.b(this.f12959c.f7359a, 0, 8, true)) {
                        return -1;
                    }
                    this.f12964h = 8;
                    this.f12959c.i(0);
                    this.f12963g = this.f12959c.p();
                    this.f12962f = this.f12959c.r();
                }
                if (this.f12963g == 1) {
                    leVar.b(this.f12959c.f7359a, 8, 8, false);
                    this.f12964h += 8;
                    this.f12963g = this.f12959c.v();
                }
                int i11 = this.f12962f;
                if (i11 != jf.C && i11 != jf.E && i11 != jf.F && i11 != jf.G && i11 != jf.H && i11 != jf.Q) {
                    if (i11 != jf.S && i11 != jf.D && i11 != jf.T && i11 != jf.U && i11 != jf.f5737m0 && i11 != jf.f5739n0 && i11 != jf.f5741o0 && i11 != jf.R && i11 != jf.f5743p0 && i11 != jf.f5745q0 && i11 != jf.f5747r0 && i11 != jf.f5749s0 && i11 != jf.f5751t0 && i11 != jf.P && i11 != jf.f5714b && i11 != jf.A0) {
                        this.f12965i = null;
                    } else {
                        fj.d(this.f12964h == 8);
                        fj.d(this.f12963g <= 2147483647L);
                        nj njVar = new nj((int) this.f12963g);
                        this.f12965i = njVar;
                        System.arraycopy(this.f12959c.f7359a, 0, njVar.f7359a, 0, 8);
                    }
                    this.f12961e = 1;
                } else {
                    long h10 = (leVar.h() + this.f12963g) - this.f12964h;
                    this.f12960d.add(new hf(this.f12962f, h10));
                    if (this.f12963g == this.f12964h) {
                        c(h10);
                    } else {
                        b();
                    }
                }
            } else if (i10 != 1) {
                long j10 = Long.MAX_VALUE;
                int i12 = -1;
                int i13 = 0;
                while (true) {
                    yfVarArr = this.f12969m;
                    if (i13 >= yfVarArr.length) {
                        break;
                    }
                    yf yfVar = yfVarArr[i13];
                    int i14 = yfVar.f12577d;
                    eg egVar = yfVar.f12575b;
                    if (i14 != egVar.f3652a) {
                        long j11 = egVar.f3653b[i14];
                        if (j11 < j10) {
                            i12 = i13;
                            j10 = j11;
                        }
                    }
                    i13++;
                }
                if (i12 == -1) {
                    return -1;
                }
                yf yfVar2 = yfVarArr[i12];
                ve veVar = yfVar2.f12576c;
                int i15 = yfVar2.f12577d;
                eg egVar2 = yfVar2.f12575b;
                long j12 = egVar2.f3653b[i15];
                int i16 = egVar2.f3654c[i15];
                if (yfVar2.f12574a.f2333g == 1) {
                    j12 += 8;
                    i16 -= 8;
                }
                long h11 = (j12 - leVar.h()) + this.f12966j;
                if (h11 >= 0 && h11 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    int i17 = (int) h11;
                    boolean z12 = false;
                    leVar.d(i17, false);
                    int i18 = yfVar2.f12574a.f2337k;
                    if (i18 == 0) {
                        while (true) {
                            int i19 = this.f12966j;
                            if (i19 >= i16) {
                                break;
                            }
                            int d10 = veVar.d(leVar, i16 - i19, false);
                            this.f12966j += d10;
                            this.f12967k -= d10;
                        }
                    } else {
                        byte[] bArr = this.f12958b.f7359a;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i20 = 4 - i18;
                        while (this.f12966j < i16) {
                            int i21 = this.f12967k;
                            if (i21 == 0) {
                                leVar.b(this.f12958b.f7359a, i20, i18, z12);
                                this.f12958b.i(z12 ? 1 : 0);
                                this.f12967k = this.f12958b.u();
                                this.f12957a.i(z12 ? 1 : 0);
                                veVar.c(this.f12957a, 4);
                                this.f12966j += 4;
                                i16 += i20;
                            } else {
                                int d11 = veVar.d(leVar, i21, z12);
                                this.f12966j += d11;
                                this.f12967k -= d11;
                                z12 = false;
                            }
                        }
                    }
                    int i22 = i16;
                    eg egVar3 = yfVar2.f12575b;
                    veVar.b(egVar3.f3656e[i15], egVar3.f3657f[i15], i22, 0, null);
                    yfVar2.f12577d++;
                    this.f12966j = 0;
                    this.f12967k = 0;
                    return 0;
                }
                reVar.f9411a = j12;
                return 1;
            } else {
                long j13 = this.f12963g - this.f12964h;
                long h12 = leVar.h() + j13;
                nj njVar2 = this.f12965i;
                if (njVar2 != null) {
                    leVar.b(njVar2.f7359a, this.f12964h, (int) j13, false);
                    if (this.f12962f == jf.f5714b) {
                        nj njVar3 = this.f12965i;
                        njVar3.i(8);
                        if (njVar3.r() == f12956q) {
                            z11 = true;
                            break;
                        }
                        njVar3.j(4);
                        while (njVar3.d() > 0) {
                            if (njVar3.r() == f12956q) {
                                z11 = true;
                                break;
                            }
                        }
                        z11 = false;
                        this.f12971o = z11;
                    } else if (!this.f12960d.isEmpty()) {
                        this.f12960d.peek().d(new Cif(this.f12962f, this.f12965i));
                    }
                } else if (j13 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    leVar.d((int) j13, false);
                } else {
                    reVar.f9411a = leVar.h() + j13;
                    z10 = true;
                    c(h12);
                    if (z10 && this.f12961e != 2) {
                        return 1;
                    }
                }
                z10 = false;
                c(h12);
                if (z10) {
                    return 1;
                }
                continue;
            }
        }
    }

    @Override // ai.te
    public final boolean zza() {
        return true;
    }

    @Override // ai.te
    public final long zzb() {
        return this.f12970n;
    }
}
