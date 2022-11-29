package ai;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class ln2 implements kn2 {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<un2, jn2> f6626a;

    /* renamed from: b  reason: collision with root package name */
    public final rn2 f6627b;

    /* renamed from: c  reason: collision with root package name */
    public final nn2 f6628c = new nn2();

    public ln2(rn2 rn2Var) {
        this.f6626a = new ConcurrentHashMap<>(rn2Var.B);
        this.f6627b = rn2Var;
    }

    @Override // ai.kn2
    public final synchronized boolean a(un2 un2Var) {
        jn2 jn2Var = this.f6626a.get(un2Var);
        if (jn2Var != null) {
            return jn2Var.c() < this.f6627b.B;
        }
        return true;
    }

    @Override // ai.kn2
    public final synchronized boolean b(un2 un2Var, tn2<?, ?> tn2Var) {
        boolean a10;
        jn2 jn2Var = this.f6626a.get(un2Var);
        tn2Var.f10358d = wg.t.k().currentTimeMillis();
        if (jn2Var == null) {
            rn2 rn2Var = this.f6627b;
            jn2Var = new jn2(rn2Var.B, rn2Var.C * 1000);
            int size = this.f6626a.size();
            rn2 rn2Var2 = this.f6627b;
            if (size == rn2Var2.A) {
                int i10 = rn2Var2.I;
                int i11 = i10 - 1;
                un2 un2Var2 = null;
                if (i10 != 0) {
                    long j10 = Long.MAX_VALUE;
                    if (i11 == 0) {
                        for (Map.Entry<un2, jn2> entry : this.f6626a.entrySet()) {
                            if (entry.getValue().d() < j10) {
                                j10 = entry.getValue().d();
                                un2Var2 = entry.getKey();
                            }
                        }
                        if (un2Var2 != null) {
                            this.f6626a.remove(un2Var2);
                        }
                    } else if (i11 == 1) {
                        for (Map.Entry<un2, jn2> entry2 : this.f6626a.entrySet()) {
                            if (entry2.getValue().e() < j10) {
                                j10 = entry2.getValue().e();
                                un2Var2 = entry2.getKey();
                            }
                        }
                        if (un2Var2 != null) {
                            this.f6626a.remove(un2Var2);
                        }
                    } else if (i11 == 2) {
                        int i12 = Integer.MAX_VALUE;
                        for (Map.Entry<un2, jn2> entry3 : this.f6626a.entrySet()) {
                            if (entry3.getValue().f() < i12) {
                                i12 = entry3.getValue().f();
                                un2Var2 = entry3.getKey();
                            }
                        }
                        if (un2Var2 != null) {
                            this.f6626a.remove(un2Var2);
                        }
                    }
                    this.f6628c.d();
                } else {
                    throw null;
                }
            }
            this.f6626a.put(un2Var, jn2Var);
            this.f6628c.c();
        }
        a10 = jn2Var.a(tn2Var);
        this.f6628c.e();
        mn2 f10 = this.f6628c.f();
        ho2 h10 = jn2Var.h();
        Cdo B = jo.B();
        bo B2 = co.B();
        B2.u(2);
        ho B3 = io.B();
        B3.r(f10.f6985w);
        B3.s(f10.f6986x);
        B3.t(h10.f4912x);
        B2.t(B3);
        B.r(B2);
        tn2Var.f10355a.q().e().M(B.n());
        f();
        return a10;
    }

    @Override // ai.kn2
    public final rn2 c() {
        return this.f6627b;
    }

    @Override // ai.kn2
    @Deprecated
    public final un2 d(as asVar, String str, ls lsVar) {
        return new vn2(asVar, str, new me0(this.f6627b.f9514x).a().f7283k, this.f6627b.D, lsVar);
    }

    @Override // ai.kn2
    public final synchronized tn2<?, ?> e(un2 un2Var) {
        tn2<?, ?> tn2Var;
        jn2 jn2Var = this.f6626a.get(un2Var);
        if (jn2Var != null) {
            tn2Var = jn2Var.b();
            if (tn2Var == null) {
                this.f6628c.b();
            }
            ho2 h10 = jn2Var.h();
            if (tn2Var != null) {
                Cdo B = jo.B();
                bo B2 = co.B();
                B2.u(2);
                fo B3 = go.B();
                B3.r(h10.f4911w);
                B3.s(h10.f4912x);
                B2.s(B3);
                B.r(B2);
                tn2Var.f10355a.q().e().A(B.n());
            }
            f();
        } else {
            this.f6628c.a();
            f();
            tn2Var = null;
        }
        return tn2Var;
    }

    public final void f() {
        Parcelable.Creator<rn2> creator = rn2.CREATOR;
        if (((Boolean) ft.c().c(ox.G4)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f6627b.f9516z);
            sb2.append(" PoolCollection");
            sb2.append(this.f6628c.g());
            int i10 = 0;
            for (Map.Entry<un2, jn2> entry : this.f6626a.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(entry.getKey().hashCode());
                sb2.append("    ");
                for (int i11 = 0; i11 < entry.getValue().c(); i11++) {
                    sb2.append("[O]");
                }
                for (int c10 = entry.getValue().c(); c10 < this.f6627b.B; c10++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(entry.getValue().g());
                sb2.append("\n");
            }
            while (i10 < this.f6627b.A) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            uj0.a(sb2.toString());
        }
    }
}
