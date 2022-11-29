package s1;

import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final k f51930a;

    /* renamed from: b  reason: collision with root package name */
    public final b f51931b;

    /* renamed from: c  reason: collision with root package name */
    public final List<k> f51932c;

    public q(k kVar, b bVar, List<k> list) {
        jo.p.h(kVar, "root");
        jo.p.h(bVar, "relayoutNodes");
        jo.p.h(list, "postponedMeasureRequests");
        this.f51930a = kVar;
        this.f51931b = bVar;
        this.f51932c = list;
    }

    public static final void e(q qVar, StringBuilder sb2, k kVar, int i10) {
        String f10 = qVar.f(kVar);
        if (f10.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(f10);
            jo.p.g(sb2, "append(value)");
            sb2.append('\n');
            jo.p.g(sb2, "append('\\n')");
            i10++;
        }
        List<k> W = kVar.W();
        int size = W.size();
        for (int i12 = 0; i12 < size; i12++) {
            e(qVar, sb2, W.get(i12), i10);
        }
    }

    public final void a() {
        if (!c(this.f51930a)) {
            System.out.println((Object) d());
            throw new IllegalStateException("Inconsistency found!");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if ((r0 != null && r0.g()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(s1.k r6) {
        /*
            r5 = this;
            s1.k r0 = r6.u0()
            boolean r1 = r6.g()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L22
            int r1 = r6.v0()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r4) goto L8c
            if (r0 == 0) goto L1f
            boolean r1 = r0.g()
            if (r1 != r3) goto L1f
            r1 = r3
            goto L20
        L1f:
            r1 = r2
        L20:
            if (r1 == 0) goto L8c
        L22:
            boolean r1 = r6.i0()
            if (r1 == 0) goto L31
            java.util.List<s1.k> r1 = r5.f51932c
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L31
            return r3
        L31:
            if (r0 == 0) goto L38
            s1.k$g r1 = r0.g0()
            goto L39
        L38:
            r1 = 0
        L39:
            boolean r4 = r6.i0()
            if (r4 == 0) goto L5a
            s1.b r4 = r5.f51931b
            boolean r6 = r4.b(r6)
            if (r6 != 0) goto L58
            if (r0 == 0) goto L51
            boolean r6 = r0.i0()
            if (r6 != r3) goto L51
            r6 = r3
            goto L52
        L51:
            r6 = r2
        L52:
            if (r6 != 0) goto L58
            s1.k$g r6 = s1.k.g.Measuring
            if (r1 != r6) goto L59
        L58:
            r2 = r3
        L59:
            return r2
        L5a:
            boolean r4 = r6.f0()
            if (r4 == 0) goto L8c
            s1.b r4 = r5.f51931b
            boolean r6 = r4.b(r6)
            if (r6 != 0) goto L8a
            if (r0 == 0) goto L72
            boolean r6 = r0.i0()
            if (r6 != r3) goto L72
            r6 = r3
            goto L73
        L72:
            r6 = r2
        L73:
            if (r6 != 0) goto L8a
            if (r0 == 0) goto L7f
            boolean r6 = r0.f0()
            if (r6 != r3) goto L7f
            r6 = r3
            goto L80
        L7f:
            r6 = r2
        L80:
            if (r6 != 0) goto L8a
            s1.k$g r6 = s1.k.g.Measuring
            if (r1 == r6) goto L8a
            s1.k$g r6 = s1.k.g.LayingOut
            if (r1 != r6) goto L8b
        L8a:
            r2 = r3
        L8b:
            return r2
        L8c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.q.b(s1.k):boolean");
    }

    public final boolean c(k kVar) {
        if (b(kVar)) {
            List<k> W = kVar.W();
            int size = W.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!c(W.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        jo.p.g(sb2, "append(value)");
        sb2.append('\n');
        jo.p.g(sb2, "append('\\n')");
        e(this, sb2, this.f51930a, 0);
        String sb3 = sb2.toString();
        jo.p.g(sb3, "stringBuilder.toString()");
        return sb3;
    }

    public final String f(k kVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kVar);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(kVar.g0());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!kVar.g()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + kVar.l0() + ']');
        if (!b(kVar)) {
            sb2.append("[INCONSISTENT]");
        }
        String sb4 = sb2.toString();
        jo.p.g(sb4, "with(StringBuilder()) {\n…     toString()\n        }");
        return sb4;
    }
}
