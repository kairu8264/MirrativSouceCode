package ef;

import android.content.Context;
import jo.h;
import jo.p;
import kf.v;
import nd.i1;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0304a f30549d = new C0304a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f30550e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final v f30551a;

    /* renamed from: b  reason: collision with root package name */
    public final i1 f30552b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f30553c;

    /* renamed from: ef.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0304a {
        public C0304a() {
        }

        public /* synthetic */ C0304a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f30554a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f30555b;

        public b(int i10, boolean z10) {
            this.f30554a = i10;
            this.f30555b = z10;
        }

        public final void a() {
            a.this.i(this.f30554a, true);
        }

        public final boolean b() {
            return this.f30555b;
        }
    }

    public a(v vVar, i1 i1Var, Context context) {
        p.h(vVar, "tutorialPreference");
        p.h(i1Var, "sharedApplicationModel");
        p.h(context, "context");
        this.f30551a = vVar;
        this.f30552b = i1Var;
        this.f30553c = context;
    }

    public final char[] a() {
        String l10 = this.f30551a.l();
        int length = 22 - l10.length();
        for (int i10 = 0; i10 < length; i10++) {
            int length2 = l10.length();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(l10);
            String substring = "0000000000000000000000".substring(length2, length2 + 1);
            p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring);
            l10 = sb2.toString();
        }
        char[] charArray = l10.toCharArray();
        p.g(charArray, "this as java.lang.String).toCharArray()");
        return charArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
        if (r4.f30551a.s0() < 3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
        if (h(r5) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
        if (r4.f30551a.n1() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0064, code lost:
        if (r4.f30551a.J3() == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
        if (h(r5) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0080, code lost:
        if (of.a.a(r4.f30553c) == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ef.a.b b(int r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L82
            r2 = 2
            if (r5 == r2) goto L82
            r2 = 3
            if (r5 == r2) goto L7a
            r3 = 4
            if (r5 == r3) goto L67
            r3 = 6
            if (r5 == r3) goto L5e
            r3 = 8
            if (r5 == r3) goto L35
            r3 = 14
            if (r5 == r3) goto L83
            r3 = 21
            if (r5 == r3) goto L2e
            switch(r5) {
                case 17: goto L2e;
                case 18: goto L2e;
                case 19: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L25:
            kf.v r3 = r4.f30551a
            int r3 = r3.s0()
            if (r3 >= r2) goto L83
            goto L82
        L2e:
            boolean r2 = r4.h(r5)
            if (r2 != 0) goto L83
            goto L82
        L35:
            kf.v r2 = r4.f30551a
            int r2 = r2.A1()
            kf.v r3 = r4.f30551a
            int r3 = r3.g1()
            int r2 = r2 + r3
            if (r2 >= r1) goto L83
            kf.v r2 = r4.f30551a
            int r2 = r2.N3()
            if (r2 != 0) goto L83
            kf.v r2 = r4.f30551a
            int r2 = r2.r0()
            r3 = 5
            if (r2 >= r3) goto L83
            kf.v r2 = r4.f30551a
            boolean r2 = r2.n1()
            if (r2 != 0) goto L83
            goto L82
        L5e:
            kf.v r2 = r4.f30551a
            int r2 = r2.J3()
            if (r2 != 0) goto L83
            goto L82
        L67:
            nd.i1 r2 = r4.f30552b
            ye.a r2 = r2.a()
            boolean r2 = r2.d()
            if (r2 == 0) goto L83
            boolean r2 = r4.h(r5)
            if (r2 != 0) goto L83
            goto L82
        L7a:
            android.content.Context r2 = r4.f30553c
            boolean r2 = of.a.a(r2)
            if (r2 != 0) goto L83
        L82:
            r0 = r1
        L83:
            ef.a$b r1 = new ef.a$b
            r1.<init>(r5, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.a.b(int):ef.a$b");
    }

    public final void c() {
        v vVar = this.f30551a;
        vVar.P4(Math.max(vVar.J3() + 1, 0));
    }

    public final void d() {
        v vVar = this.f30551a;
        vVar.c0(Math.max(vVar.r0() + 1, 0));
    }

    public final void e() {
        v vVar = this.f30551a;
        vVar.N2(Math.max(vVar.N3() + 1, 0));
    }

    public final void f() {
        v vVar = this.f30551a;
        vVar.n(Math.max(vVar.A1() + 1, 0));
    }

    public final void g() {
        v vVar = this.f30551a;
        vVar.A2(Math.max(vVar.g1() + 1, 0));
    }

    public final boolean h(int i10) {
        return a()[i10] != '0';
    }

    public final void i(int i10, boolean z10) {
        char[] a10 = a();
        a10[i10] = z10 ? '1' : '0';
        this.f30551a.z5(new String(a10));
    }
}
