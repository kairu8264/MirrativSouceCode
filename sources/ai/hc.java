package ai;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzamy;
import com.google.android.gms.internal.ads.zzano;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class hc implements ec {

    /* renamed from: a  reason: collision with root package name */
    public final rc[] f4799a;

    /* renamed from: b  reason: collision with root package name */
    public final pi f4800b;

    /* renamed from: c  reason: collision with root package name */
    public final ni f4801c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f4802d;

    /* renamed from: e  reason: collision with root package name */
    public final mc f4803e;

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArraySet<ac> f4804f;

    /* renamed from: g  reason: collision with root package name */
    public final wc f4805g;

    /* renamed from: h  reason: collision with root package name */
    public final vc f4806h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4807i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4808j;

    /* renamed from: k  reason: collision with root package name */
    public int f4809k;

    /* renamed from: l  reason: collision with root package name */
    public int f4810l;

    /* renamed from: m  reason: collision with root package name */
    public int f4811m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4812n;

    /* renamed from: o  reason: collision with root package name */
    public xc f4813o;

    /* renamed from: p  reason: collision with root package name */
    public Object f4814p;

    /* renamed from: q  reason: collision with root package name */
    public ci f4815q;

    /* renamed from: r  reason: collision with root package name */
    public ni f4816r;

    /* renamed from: s  reason: collision with root package name */
    public qc f4817s;

    /* renamed from: t  reason: collision with root package name */
    public jc f4818t;

    /* renamed from: u  reason: collision with root package name */
    public long f4819u;

    @SuppressLint({"HandlerLeak"})
    public hc(rc[] rcVarArr, pi piVar, bn0 bn0Var, byte[] bArr) {
        String str = vj.f11104e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26);
        sb2.append("Init ExoPlayerLib/2.4.2 [");
        sb2.append(str);
        sb2.append("]");
        Log.i("ExoPlayerImpl", sb2.toString());
        this.f4799a = rcVarArr;
        Objects.requireNonNull(piVar);
        this.f4800b = piVar;
        this.f4808j = false;
        this.f4809k = 1;
        this.f4804f = new CopyOnWriteArraySet<>();
        ni niVar = new ni(new fi[2], null);
        this.f4801c = niVar;
        this.f4813o = xc.f11907a;
        this.f4805g = new wc();
        this.f4806h = new vc();
        this.f4815q = ci.f2834d;
        this.f4816r = niVar;
        this.f4817s = qc.f8867d;
        gc gcVar = new gc(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f4802d = gcVar;
        jc jcVar = new jc(0, 0L);
        this.f4818t = jcVar;
        this.f4803e = new mc(rcVarArr, piVar, bn0Var, this.f4808j, 0, gcVar, jcVar, this, null);
    }

    @Override // ai.ec
    public final boolean a() {
        return this.f4808j;
    }

    @Override // ai.ec
    public final int b() {
        return this.f4809k;
    }

    public final int c() {
        if (!this.f4813o.f() && this.f4810l <= 0) {
            this.f4813o.d(this.f4818t.f5687a, this.f4806h, false);
        }
        return 0;
    }

    public final void d(Message message) {
        switch (message.what) {
            case 0:
                this.f4811m--;
                return;
            case 1:
                this.f4809k = message.arg1;
                Iterator<ac> it = this.f4804f.iterator();
                while (it.hasNext()) {
                    it.next().j(this.f4808j, this.f4809k);
                }
                return;
            case 2:
                this.f4812n = message.arg1 != 0;
                Iterator<ac> it2 = this.f4804f.iterator();
                while (it2.hasNext()) {
                    it2.next().b(this.f4812n);
                }
                return;
            case 3:
                if (this.f4811m == 0) {
                    qi qiVar = (qi) message.obj;
                    this.f4807i = true;
                    this.f4815q = qiVar.f8962a;
                    this.f4816r = qiVar.f8963b;
                    this.f4800b.b(qiVar.f8964c);
                    Iterator<ac> it3 = this.f4804f.iterator();
                    while (it3.hasNext()) {
                        it3.next().o(this.f4815q, this.f4816r);
                    }
                    return;
                }
                return;
            case 4:
                int i10 = this.f4810l - 1;
                this.f4810l = i10;
                if (i10 == 0) {
                    this.f4818t = (jc) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<ac> it4 = this.f4804f.iterator();
                        while (it4.hasNext()) {
                            it4.next().a();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f4810l == 0) {
                    this.f4818t = (jc) message.obj;
                    Iterator<ac> it5 = this.f4804f.iterator();
                    while (it5.hasNext()) {
                        it5.next().a();
                    }
                    return;
                }
                return;
            case 6:
                lc lcVar = (lc) message.obj;
                this.f4810l -= lcVar.f6515d;
                if (this.f4811m == 0) {
                    this.f4813o = lcVar.f6512a;
                    this.f4814p = lcVar.f6513b;
                    this.f4818t = lcVar.f6514c;
                    Iterator<ac> it6 = this.f4804f.iterator();
                    while (it6.hasNext()) {
                        it6.next().A(this.f4813o, this.f4814p);
                    }
                    return;
                }
                return;
            case 7:
                qc qcVar = (qc) message.obj;
                if (this.f4817s.equals(qcVar)) {
                    return;
                }
                this.f4817s = qcVar;
                Iterator<ac> it7 = this.f4804f.iterator();
                while (it7.hasNext()) {
                    it7.next().v(qcVar);
                }
                return;
            case 8:
                zzamy zzamyVar = (zzamy) message.obj;
                Iterator<ac> it8 = this.f4804f.iterator();
                while (it8.hasNext()) {
                    it8.next().f(zzamyVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // ai.ec
    public final void e() {
        this.f4803e.v();
    }

    @Override // ai.ec
    public final void h() {
        this.f4803e.y();
        this.f4802d.removeCallbacksAndMessages(null);
    }

    @Override // ai.ec
    public final long j() {
        if (this.f4813o.f()) {
            return C.TIME_UNSET;
        }
        xc xcVar = this.f4813o;
        c();
        return zb.a(xcVar.g(0, this.f4805g, false).f11544a);
    }

    @Override // ai.ec
    public final long k() {
        if (!this.f4813o.f() && this.f4810l <= 0) {
            this.f4813o.d(this.f4818t.f5687a, this.f4806h, false);
            return zb.a(0L) + zb.a(this.f4818t.f5689c);
        }
        return this.f4819u;
    }

    @Override // ai.ec
    public final void k0(boolean z10) {
        if (this.f4808j != z10) {
            this.f4808j = z10;
            this.f4803e.t(z10);
            Iterator<ac> it = this.f4804f.iterator();
            while (it.hasNext()) {
                it.next().j(z10, this.f4809k);
            }
        }
    }

    @Override // ai.ec
    public final void l0(int i10) {
        this.f4803e.z(i10);
    }

    @Override // ai.ec
    public final void m0(ac acVar) {
        this.f4804f.add(acVar);
    }

    @Override // ai.ec
    public final long n() {
        if (!this.f4813o.f() && this.f4810l <= 0) {
            this.f4813o.d(this.f4818t.f5687a, this.f4806h, false);
            return zb.a(0L) + zb.a(this.f4818t.f5690d);
        }
        return this.f4819u;
    }

    @Override // ai.ec
    public final void n0(dc... dcVarArr) {
        this.f4803e.w(dcVarArr);
    }

    @Override // ai.ec
    public final void o() {
        this.f4803e.r();
    }

    @Override // ai.ec
    public final void o0(ac acVar) {
        this.f4804f.remove(acVar);
    }

    @Override // ai.ec
    public final void p0(dc... dcVarArr) {
        this.f4803e.x(dcVarArr);
    }

    @Override // ai.ec
    public final void q0(long j10) {
        c();
        if (!this.f4813o.f() && this.f4813o.a() <= 0) {
            throw new zzano(this.f4813o, 0, j10);
        }
        this.f4810l++;
        if (!this.f4813o.f()) {
            this.f4813o.g(0, this.f4805g, false);
            long b10 = zb.b(j10);
            long j11 = this.f4813o.d(0, this.f4806h, false).f11019c;
            if (j11 != C.TIME_UNSET) {
                int i10 = (b10 > j11 ? 1 : (b10 == j11 ? 0 : -1));
            }
        }
        this.f4819u = j10;
        this.f4803e.u(this.f4813o, 0, zb.b(j10));
        Iterator<ac> it = this.f4804f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // ai.ec
    public final void r0(oh ohVar) {
        if (!this.f4813o.f() || this.f4814p != null) {
            this.f4813o = xc.f11907a;
            this.f4814p = null;
            Iterator<ac> it = this.f4804f.iterator();
            while (it.hasNext()) {
                it.next().A(this.f4813o, this.f4814p);
            }
        }
        if (this.f4807i) {
            this.f4807i = false;
            this.f4815q = ci.f2834d;
            this.f4816r = this.f4801c;
            this.f4800b.b(null);
            Iterator<ac> it2 = this.f4804f.iterator();
            while (it2.hasNext()) {
                it2.next().o(this.f4815q, this.f4816r);
            }
        }
        this.f4811m++;
        this.f4803e.s(ohVar, true);
    }

    @Override // ai.ec
    public final void s0(int i10) {
        this.f4803e.A(i10);
    }
}
