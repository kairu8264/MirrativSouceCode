package pi;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import hi.id;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class p5 implements Callable<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f48122a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f48123b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u5 f48124c;

    public p5(u5 u5Var, u uVar, String str) {
        this.f48124c = u5Var;
        this.f48122a = uVar;
        this.f48123b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ byte[] call() throws Exception {
        ba baVar;
        ba baVar2;
        byte[] bArr;
        ba baVar3;
        ga gaVar;
        g5 g5Var;
        hi.p4 p4Var;
        String str;
        Bundle bundle;
        hi.r4 r4Var;
        byte[] bArr2;
        q c10;
        long j10;
        baVar = this.f48124c.f48261w;
        baVar.d();
        baVar2 = this.f48124c.f48261w;
        n7 c02 = baVar2.c0();
        u uVar = this.f48122a;
        String str2 = this.f48123b;
        c02.f();
        b5.s();
        rh.p.i(uVar);
        rh.p.e(str2);
        if (!c02.f48285a.y().A(str2, c3.W)) {
            c02.f48285a.r().o().b("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if (!"_iap".equals(uVar.f48250w) && !"_iapx".equals(uVar.f48250w)) {
            c02.f48285a.r().o().c("Generating a payload for this event is not available. package_name, event_name", str2, uVar.f48250w);
            return null;
        } else {
            hi.p4 r10 = hi.q4.r();
            c02.f48179b.V().g0();
            try {
                g5 T = c02.f48179b.V().T(str2);
                if (T == null) {
                    c02.f48285a.r().o().b("Log and bundle not available. package_name", str2);
                    bArr = new byte[0];
                    baVar3 = c02.f48179b;
                } else if (!T.K()) {
                    c02.f48285a.r().o().b("Log and bundle disabled. package_name", str2);
                    bArr = new byte[0];
                    baVar3 = c02.f48179b;
                } else {
                    hi.r4 J1 = hi.s4.J1();
                    J1.R(1);
                    J1.L("android");
                    if (!TextUtils.isEmpty(T.e0())) {
                        J1.o(T.e0());
                    }
                    if (!TextUtils.isEmpty(T.g0())) {
                        J1.r((String) rh.p.i(T.g0()));
                    }
                    if (!TextUtils.isEmpty(T.h0())) {
                        J1.s((String) rh.p.i(T.h0()));
                    }
                    if (T.M() != -2147483648L) {
                        J1.t((int) T.M());
                    }
                    J1.H(T.X());
                    J1.B(T.V());
                    String k02 = T.k0();
                    String c03 = T.c0();
                    id.b();
                    if (c02.f48285a.y().A(T.e0(), c3.f47697e0)) {
                        String j02 = T.j0();
                        if (!TextUtils.isEmpty(k02)) {
                            J1.G(k02);
                        } else if (!TextUtils.isEmpty(j02)) {
                            J1.F(j02);
                        } else if (!TextUtils.isEmpty(c03)) {
                            J1.R0(c03);
                        }
                    } else if (!TextUtils.isEmpty(k02)) {
                        J1.G(k02);
                    } else if (!TextUtils.isEmpty(c03)) {
                        J1.R0(c03);
                    }
                    h U = c02.f48179b.U(str2);
                    J1.y(T.U());
                    if (c02.f48285a.m() && c02.f48285a.y().B(J1.e0()) && U.j() && !TextUtils.isEmpty(null)) {
                        J1.A(null);
                    }
                    J1.x(U.i());
                    if (U.j()) {
                        Pair<String, Boolean> l10 = c02.f48179b.d0().l(T.e0(), U);
                        if (T.J() && !TextUtils.isEmpty((CharSequence) l10.first)) {
                            try {
                                J1.T(n7.d((String) l10.first, Long.toString(uVar.f48253z)));
                                Object obj = l10.second;
                                if (obj != null) {
                                    J1.J(((Boolean) obj).booleanValue());
                                }
                            } catch (SecurityException e10) {
                                c02.f48285a.r().o().b("Resettable device id encryption failed", e10.getMessage());
                                bArr = new byte[0];
                                baVar3 = c02.f48179b;
                            }
                        }
                    }
                    c02.f48285a.z().i();
                    J1.z(Build.MODEL);
                    c02.f48285a.z().i();
                    J1.K(Build.VERSION.RELEASE);
                    J1.Y((int) c02.f48285a.z().n());
                    J1.c0(c02.f48285a.z().o());
                    try {
                        if (U.k() && T.f0() != null) {
                            J1.q(n7.d((String) rh.p.i(T.f0()), Long.toString(uVar.f48253z)));
                        }
                        if (!TextUtils.isEmpty(T.i0())) {
                            J1.E((String) rh.p.i(T.i0()));
                        }
                        String e02 = T.e0();
                        List<ga> e03 = c02.f48179b.V().e0(e02);
                        Iterator<ga> it = e03.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                gaVar = null;
                                break;
                            }
                            gaVar = it.next();
                            if ("_lte".equals(gaVar.f47881c)) {
                                break;
                            }
                        }
                        if (gaVar == null || gaVar.f47883e == null) {
                            ga gaVar2 = new ga(e02, TtmlNode.TEXT_EMPHASIS_AUTO, "_lte", c02.f48285a.c().currentTimeMillis(), 0L);
                            e03.add(gaVar2);
                            c02.f48179b.V().y(gaVar2);
                        }
                        da f02 = c02.f48179b.f0();
                        f02.f48285a.r().u().a("Checking account type status for ad personalization signals");
                        if (f02.f48285a.z().q()) {
                            String e04 = T.e0();
                            rh.p.i(e04);
                            if (T.J() && f02.f48179b.Z().s(e04)) {
                                f02.f48285a.r().o().a("Turning off ad personalization due to account type");
                                Iterator<ga> it2 = e03.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(it2.next().f47881c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                e03.add(new ga(e04, TtmlNode.TEXT_EMPHASIS_AUTO, "_npa", f02.f48285a.c().currentTimeMillis(), 1L));
                            }
                        }
                        hi.c5[] c5VarArr = new hi.c5[e03.size()];
                        for (int i10 = 0; i10 < e03.size(); i10++) {
                            hi.b5 u10 = hi.c5.u();
                            u10.u(e03.get(i10).f47881c);
                            u10.v(e03.get(i10).f47882d);
                            c02.f48179b.f0().M(u10, e03.get(i10).f47883e);
                            c5VarArr[i10] = u10.h();
                        }
                        J1.w0(Arrays.asList(c5VarArr));
                        r3 b10 = r3.b(uVar);
                        c02.f48285a.N().x(b10.f48188d, c02.f48179b.V().S(str2));
                        c02.f48285a.N().y(b10, c02.f48285a.y().l(str2));
                        Bundle bundle2 = b10.f48188d;
                        bundle2.putLong("_c", 1L);
                        c02.f48285a.r().o().a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", uVar.f48252y);
                        if (c02.f48285a.N().S(J1.e0())) {
                            c02.f48285a.N().A(bundle2, "_dbg", 1L);
                            c02.f48285a.N().A(bundle2, "_r", 1L);
                        }
                        q X = c02.f48179b.V().X(str2, uVar.f48250w);
                        if (X == null) {
                            r4Var = J1;
                            g5Var = T;
                            p4Var = r10;
                            str = str2;
                            bundle = bundle2;
                            bArr2 = null;
                            c10 = new q(str2, uVar.f48250w, 0L, 0L, 0L, uVar.f48253z, 0L, null, null, null, null);
                            j10 = 0;
                        } else {
                            g5Var = T;
                            p4Var = r10;
                            str = str2;
                            bundle = bundle2;
                            r4Var = J1;
                            bArr2 = null;
                            long j11 = X.f48146f;
                            c10 = X.c(uVar.f48253z);
                            j10 = j11;
                        }
                        c02.f48179b.V().p(c10);
                        p pVar = new p(c02.f48285a, uVar.f48252y, str, uVar.f48250w, uVar.f48253z, j10, bundle);
                        hi.h4 v10 = hi.i4.v();
                        v10.B(pVar.f48113d);
                        v10.x(pVar.f48111b);
                        v10.A(pVar.f48114e);
                        r rVar = new r(pVar.f48115f);
                        while (rVar.hasNext()) {
                            String next = rVar.next();
                            hi.l4 v11 = hi.m4.v();
                            v11.y(next);
                            Object r02 = pVar.f48115f.r0(next);
                            if (r02 != null) {
                                c02.f48179b.f0().L(v11, r02);
                                v10.t(v11);
                            }
                        }
                        hi.r4 r4Var2 = r4Var;
                        r4Var2.y0(v10);
                        hi.t4 r11 = hi.w4.r();
                        hi.j4 r12 = hi.k4.r();
                        r12.o(c10.f48143c);
                        r12.q(uVar.f48250w);
                        r11.o(r12);
                        r4Var2.M(r11);
                        r4Var2.o0(c02.f48179b.S().k(g5Var.e0(), Collections.emptyList(), r4Var2.i0(), Long.valueOf(v10.r()), Long.valueOf(v10.r())));
                        if (v10.F()) {
                            r4Var2.X(v10.r());
                            r4Var2.C(v10.r());
                        }
                        long Y = g5Var.Y();
                        int i11 = (Y > 0L ? 1 : (Y == 0L ? 0 : -1));
                        if (i11 != 0) {
                            r4Var2.N(Y);
                        }
                        long a02 = g5Var.a0();
                        if (a02 != 0) {
                            r4Var2.O(a02);
                        } else if (i11 != 0) {
                            r4Var2.O(Y);
                        }
                        g5Var.e();
                        r4Var2.u((int) g5Var.Z());
                        c02.f48285a.y().o();
                        r4Var2.a0(46000L);
                        r4Var2.Z(c02.f48285a.c().currentTimeMillis());
                        r4Var2.W(true);
                        hi.p4 p4Var2 = p4Var;
                        p4Var2.o(r4Var2);
                        g5 g5Var2 = g5Var;
                        g5Var2.E(r4Var2.m0());
                        g5Var2.C(r4Var2.l0());
                        c02.f48179b.V().o(g5Var2);
                        c02.f48179b.V().n();
                        try {
                            return c02.f48179b.f0().Q(p4Var2.h().e());
                        } catch (IOException e11) {
                            c02.f48285a.r().p().c("Data loss. Failed to bundle and serialize. appId", q3.y(str), e11);
                            return bArr2;
                        }
                    } catch (SecurityException e12) {
                        c02.f48285a.r().o().b("app instance id encryption failed", e12.getMessage());
                        bArr = new byte[0];
                        baVar3 = c02.f48179b;
                    }
                }
                baVar3.V().i0();
                return bArr;
            } finally {
                c02.f48179b.V().i0();
            }
        }
    }
}
