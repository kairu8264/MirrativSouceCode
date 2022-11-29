package ai;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class m44 {

    /* renamed from: a  reason: collision with root package name */
    public long f6786a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6787b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6788c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6789d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6790e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6791f;

    /* renamed from: g  reason: collision with root package name */
    public final long f6792g;

    /* renamed from: h  reason: collision with root package name */
    public final List<p34> f6793h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m44(java.lang.String r14, ai.h34 r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f4731b
            long r3 = r15.f4732c
            long r5 = r15.f4733d
            long r7 = r15.f4734e
            long r9 = r15.f4735f
            java.util.List<ai.p34> r0 = r15.f4737h
            if (r0 == 0) goto L10
        Le:
            r11 = r0
            goto L44
        L10:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.f4736g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L23:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            ai.p34 r11 = new ai.p34
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L23
        L44:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.m44.<init>(java.lang.String, ai.h34):void");
    }

    public static m44 a(n44 n44Var) throws IOException {
        List arrayList;
        if (p44.h(n44Var) == 538247942) {
            String l10 = p44.l(n44Var);
            String l11 = p44.l(n44Var);
            long j10 = p44.j(n44Var);
            long j11 = p44.j(n44Var);
            long j12 = p44.j(n44Var);
            long j13 = p44.j(n44Var);
            int h10 = p44.h(n44Var);
            if (h10 >= 0) {
                if (h10 == 0) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                }
                List list = arrayList;
                for (int i10 = 0; i10 < h10; i10++) {
                    list.add(new p34(p44.l(n44Var).intern(), p44.l(n44Var).intern()));
                }
                return new m44(l10, l11, j10, j11, j12, j13, list);
            }
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("readHeaderList size=");
            sb2.append(h10);
            throw new IOException(sb2.toString());
        }
        throw new IOException();
    }

    public m44(String str, String str2, long j10, long j11, long j12, long j13, List<p34> list) {
        this.f6787b = str;
        this.f6788c = true == "".equals(str2) ? null : str2;
        this.f6789d = j10;
        this.f6790e = j11;
        this.f6791f = j12;
        this.f6792g = j13;
        this.f6793h = list;
    }
}
