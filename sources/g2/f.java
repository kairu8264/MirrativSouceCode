package g2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.l;
import java.util.List;
import y1.a;
import y1.d0;
import y1.p;
import y1.v;

/* loaded from: classes.dex */
public final class f {
    public static final y1.k a(String str, d0 d0Var, List<a.b<v>> list, List<a.b<p>> list2, m2.d dVar, l.b bVar) {
        jo.p.h(str, "text");
        jo.p.h(d0Var, TtmlNode.TAG_STYLE);
        jo.p.h(list, "spanStyles");
        jo.p.h(list2, "placeholders");
        jo.p.h(dVar, "density");
        jo.p.h(bVar, "fontFamilyResolver");
        return new e(str, d0Var, list, list2, bVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r6 == 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(j2.g r6, f2.f r7) {
        /*
            if (r6 == 0) goto L7
            int r6 = r6.l()
            goto Ld
        L7:
            j2.g$a r6 = j2.g.f37088b
            int r6 = r6.a()
        Ld:
            j2.g$a r0 = j2.g.f37088b
            int r1 = r0.b()
            boolean r1 = j2.g.i(r6, r1)
            r2 = 1
            r3 = 0
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L1f
        L1d:
            r2 = r5
            goto L6b
        L1f:
            int r1 = r0.c()
            boolean r1 = j2.g.i(r6, r1)
            if (r1 == 0) goto L2b
        L29:
            r2 = r4
            goto L6b
        L2b:
            int r1 = r0.d()
            boolean r1 = j2.g.i(r6, r1)
            if (r1 == 0) goto L37
            r2 = r3
            goto L6b
        L37:
            int r1 = r0.e()
            boolean r1 = j2.g.i(r6, r1)
            if (r1 == 0) goto L42
            goto L6b
        L42:
            int r0 = r0.a()
            boolean r6 = j2.g.i(r6, r0)
            if (r6 == 0) goto L6c
            if (r7 == 0) goto L5e
            f2.e r6 = r7.f(r3)
            f2.g r6 = r6.a()
            f2.a r6 = (f2.a) r6
            java.util.Locale r6 = r6.b()
            if (r6 != 0) goto L62
        L5e:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L62:
            int r6 = m3.g.b(r6)
            if (r6 == 0) goto L1d
            if (r6 == r2) goto L29
            goto L1d
        L6b:
            return r2
        L6c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.f.b(j2.g, f2.f):int");
    }
}
