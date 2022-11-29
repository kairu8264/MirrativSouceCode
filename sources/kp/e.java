package kp;

import ep.d0;
import ep.m;
import ep.u;
import ep.v;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import rp.f;
import so.n;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final rp.f f38916a;

    /* renamed from: b  reason: collision with root package name */
    public static final rp.f f38917b;

    static {
        f.a aVar = rp.f.f51677z;
        f38916a = aVar.d("\"\\");
        f38917b = aVar.d("\t ,=");
    }

    public static final List<ep.h> a(u uVar, String str) {
        p.h(uVar, "$this$parseChallenges");
        p.h(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (n.q(str, uVar.g(i10), true)) {
                try {
                    c(new rp.c().a0(uVar.m(i10)), arrayList);
                } catch (EOFException e10) {
                    np.h.f43761c.g().j("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(d0 d0Var) {
        p.h(d0Var, "$this$promisesBody");
        if (p.c(d0Var.G().g(), "HEAD")) {
            return false;
        }
        int h10 = d0Var.h();
        return (((h10 >= 100 && h10 < 200) || h10 == 204 || h10 == 304) && fp.b.s(d0Var) == -1 && !n.q("chunked", d0.o(d0Var, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0085, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0085, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(rp.c r7, java.util.List<ep.h> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            g(r7)
            java.lang.String r1 = e(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = g(r7)
            java.lang.String r3 = e(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.a1()
            if (r7 != 0) goto L1f
            return
        L1f:
            ep.h r7 = new ep.h
            java.util.Map r0 = xn.n0.e()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            byte r4 = (byte) r4
            int r5 = fp.b.H(r7, r4)
            boolean r6 = g(r7)
            if (r2 != 0) goto L68
            if (r6 != 0) goto L41
            boolean r2 = r7.a1()
            if (r2 == 0) goto L68
        L41:
            ep.h r2 = new ep.h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = so.n.u(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "Collections.singletonMap…ek + \"=\".repeat(eqCount))"
            jo.p.g(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L68:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = fp.b.H(r7, r4)
            int r5 = r5 + r6
        L72:
            if (r3 != 0) goto L83
            java.lang.String r3 = e(r7)
            boolean r5 = g(r7)
            if (r5 == 0) goto L7f
            goto L85
        L7f:
            int r5 = fp.b.H(r7, r4)
        L83:
            if (r5 != 0) goto L90
        L85:
            ep.h r4 = new ep.h
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L90:
            r6 = 1
            if (r5 <= r6) goto L94
            return
        L94:
            boolean r6 = g(r7)
            if (r6 == 0) goto L9b
            return
        L9b:
            r6 = 34
            byte r6 = (byte) r6
            boolean r6 = h(r7, r6)
            if (r6 == 0) goto La9
            java.lang.String r6 = d(r7)
            goto Lad
        La9:
            java.lang.String r6 = e(r7)
        Lad:
            if (r6 == 0) goto Lc7
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb8
            return
        Lb8:
            boolean r3 = g(r7)
            if (r3 != 0) goto Lc5
            boolean r3 = r7.a1()
            if (r3 != 0) goto Lc5
            return
        Lc5:
            r3 = r0
            goto L72
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.e.c(rp.c, java.util.List):void");
    }

    public static final String d(rp.c cVar) throws EOFException {
        byte b10 = (byte) 34;
        if (cVar.readByte() == b10) {
            rp.c cVar2 = new rp.c();
            while (true) {
                long w12 = cVar.w1(f38916a);
                if (w12 == -1) {
                    return null;
                }
                if (cVar.n(w12) == b10) {
                    cVar2.O0(cVar, w12);
                    cVar.readByte();
                    return cVar2.N();
                } else if (cVar.X() == w12 + 1) {
                    return null;
                } else {
                    cVar2.O0(cVar, w12);
                    cVar.readByte();
                    cVar2.O0(cVar, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public static final String e(rp.c cVar) {
        long w12 = cVar.w1(f38917b);
        if (w12 == -1) {
            w12 = cVar.X();
        }
        if (w12 != 0) {
            return cVar.P0(w12);
        }
        return null;
    }

    public static final void f(ep.n nVar, v vVar, u uVar) {
        p.h(nVar, "$this$receiveHeaders");
        p.h(vVar, "url");
        p.h(uVar, "headers");
        if (nVar == ep.n.f30982a) {
            return;
        }
        List<m> e10 = m.f30963n.e(vVar, uVar);
        if (e10.isEmpty()) {
            return;
        }
        nVar.saveFromResponse(vVar, e10);
    }

    public static final boolean g(rp.c cVar) {
        boolean z10 = false;
        while (!cVar.a1()) {
            byte n10 = cVar.n(0L);
            if (n10 == 9 || n10 == 32) {
                cVar.readByte();
            } else if (n10 != 44) {
                break;
            } else {
                cVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    public static final boolean h(rp.c cVar, byte b10) {
        return !cVar.a1() && cVar.n(0L) == b10;
    }
}
