package y;

import x0.a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f60773a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final d f60774b = new j();

    /* renamed from: c  reason: collision with root package name */
    public static final d f60775c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final l f60776d = new k();

    /* renamed from: e  reason: collision with root package name */
    public static final l f60777e = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final e f60778f = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final e f60779g = new h();

    /* renamed from: h  reason: collision with root package name */
    public static final e f60780h = new g();

    /* renamed from: i  reason: collision with root package name */
    public static final e f60781i = new C1029f();

    /* loaded from: classes.dex */
    public static final class a implements l {
        @Override // y.f.l
        public void c(m2.d dVar, int i10, int[] iArr, int[] iArr2) {
            jo.p.h(dVar, "<this>");
            jo.p.h(iArr, "sizes");
            jo.p.h(iArr2, "outPositions");
            f.f60773a.j(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public final float f60782a = m2.g.l(0);

        @Override // y.f.d, y.f.l
        public float a() {
            return this.f60782a;
        }

        @Override // y.f.d
        public void b(m2.d dVar, int i10, int[] iArr, m2.q qVar, int[] iArr2) {
            jo.p.h(dVar, "<this>");
            jo.p.h(iArr, "sizes");
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(iArr2, "outPositions");
            if (qVar == m2.q.Ltr) {
                f.f60773a.h(i10, iArr, iArr2, false);
            } else {
                f.f60773a.h(i10, iArr, iArr2, true);
            }
        }

        @Override // y.f.l
        public void c(m2.d dVar, int i10, int[] iArr, int[] iArr2) {
            jo.p.h(dVar, "<this>");
            jo.p.h(iArr, "sizes");
            jo.p.h(iArr2, "outPositions");
            f.f60773a.h(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements d {
        @Override // y.f.d
        public void b(m2.d dVar, int i10, int[] iArr, m2.q qVar, int[] iArr2) {
            jo.p.h(dVar, "<this>");
            jo.p.h(iArr, "sizes");
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(iArr2, "outPositions");
            if (qVar == m2.q.Ltr) {
                f.f60773a.j(i10, iArr, iArr2, false);
            } else {
                f.f60773a.i(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        default float a() {
            return m2.g.l(0);
        }

        void b(m2.d dVar, int i10, int[] iArr, m2.q qVar, int[] iArr2);
    }

    /* loaded from: classes.dex */
    public interface e extends d, l {
    }

    /* renamed from: y.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1029f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final float f60783a = m2.g.l(0);

        @Override // y.f.d, y.f.l
        public float a() {
            return this.f60783a;
        }

        @Override // y.f.d
        public void b(m2.d dVar, int i10, int[] iArr, m2.q qVar, int[] iArr2) {
            jo.p.h(dVar, "<this>");
            jo.p.h(iArr, "sizes");
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(iArr2, "outPositions");
            if (qVar == m2.q.Ltr) {
                f.f60773a.k(i10, iArr, iArr2, false);
            } else {
                f.f60773a.k(i10, iArr, iArr2, true);
            }
        }

        @Override // y.f.l
        public void c(m2.d dVar, int i10, int[] iArr, int[] iArr2) {
            jo.p.h(dVar, "<this>");
            jo.p.h(iArr, "sizes");
            jo.p.h(iArr2, "outPositions");
            f.f60773a.k(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements e {

        /* renamed from: a  reason: collision with root package name */
        public final float f60784a = m2.g.l(0);

        @Override // y.f.d, y.f.l
        public float a() {
            return this.f60784a;
        }

        @Override // y.f.d
        public void b(m2.d dVar, int i10, int[] iArr, m2.q qVar, int[] iArr2) {
            jo.p.h(dVar, "<this>");
            jo.p.h(iArr, "sizes");
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(iArr2, "outPositions");
            if (qVar == m2.q.Ltr) {
                f.f60773a.l(i10, iArr, iArr2, false);
            } else {
                f.f60773a.l(i10, iArr, iArr2, true);
            }
        }

        @Override // y.f.l
        public void c(m2.d dVar, int i10, int[] iArr, int[] iArr2) {
            jo.p.h(dVar, "<this>");
            jo.p.h(iArr, "sizes");
            jo.p.h(iArr2, "outPositions");
            f.f60773a.l(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements e {

        /* renamed from: a  reason: collision with root package name */
        public final float f60785a = m2.g.l(0);

        @Override // y.f.d, y.f.l
        public float a() {
            return this.f60785a;
        }

        @Override // y.f.d
        public void b(m2.d dVar, int i10, int[] iArr, m2.q qVar, int[] iArr2) {
            jo.p.h(dVar, "<this>");
            jo.p.h(iArr, "sizes");
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(iArr2, "outPositions");
            if (qVar == m2.q.Ltr) {
                f.f60773a.m(i10, iArr, iArr2, false);
            } else {
                f.f60773a.m(i10, iArr, iArr2, true);
            }
        }

        @Override // y.f.l
        public void c(m2.d dVar, int i10, int[] iArr, int[] iArr2) {
            jo.p.h(dVar, "<this>");
            jo.p.h(iArr, "sizes");
            jo.p.h(iArr2, "outPositions");
            f.f60773a.m(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements e {

        /* renamed from: a  reason: collision with root package name */
        public final float f60786a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f60787b;

        /* renamed from: c  reason: collision with root package name */
        public final io.p<Integer, m2.q, Integer> f60788c;

        /* renamed from: d  reason: collision with root package name */
        public final float f60789d;

        /* JADX WARN: Multi-variable type inference failed */
        public i(float f10, boolean z10, io.p<? super Integer, ? super m2.q, Integer> pVar) {
            this.f60786a = f10;
            this.f60787b = z10;
            this.f60788c = pVar;
            this.f60789d = f10;
        }

        public /* synthetic */ i(float f10, boolean z10, io.p pVar, jo.h hVar) {
            this(f10, z10, pVar);
        }

        @Override // y.f.d, y.f.l
        public float a() {
            return this.f60789d;
        }

        @Override // y.f.d
        public void b(m2.d dVar, int i10, int[] iArr, m2.q qVar, int[] iArr2) {
            int i11;
            int i12;
            jo.p.h(dVar, "<this>");
            jo.p.h(iArr, "sizes");
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(iArr2, "outPositions");
            if (iArr.length == 0) {
                return;
            }
            int X = dVar.X(this.f60786a);
            boolean z10 = this.f60787b && qVar == m2.q.Rtl;
            f fVar = f.f60773a;
            if (!z10) {
                int length = iArr.length;
                int i13 = 0;
                i11 = 0;
                i12 = 0;
                int i14 = 0;
                while (i13 < length) {
                    int i15 = iArr[i13];
                    iArr2[i14] = Math.min(i11, i10 - i15);
                    int min = Math.min(X, (i10 - iArr2[i14]) - i15);
                    int i16 = iArr2[i14] + i15 + min;
                    i13++;
                    i14++;
                    i12 = min;
                    i11 = i16;
                }
            } else {
                i11 = 0;
                i12 = 0;
                for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                    int i17 = iArr[length2];
                    iArr2[length2] = Math.min(i11, i10 - i17);
                    i12 = Math.min(X, (i10 - iArr2[length2]) - i17);
                    i11 = iArr2[length2] + i17 + i12;
                }
            }
            int i18 = i11 - i12;
            io.p<Integer, m2.q, Integer> pVar = this.f60788c;
            if (pVar == null || i18 >= i10) {
                return;
            }
            int intValue = pVar.invoke(Integer.valueOf(i10 - i18), qVar).intValue();
            int length3 = iArr2.length;
            for (int i19 = 0; i19 < length3; i19++) {
                iArr2[i19] = iArr2[i19] + intValue;
            }
        }

        @Override // y.f.l
        public void c(m2.d dVar, int i10, int[] iArr, int[] iArr2) {
            jo.p.h(dVar, "<this>");
            jo.p.h(iArr, "sizes");
            jo.p.h(iArr2, "outPositions");
            b(dVar, i10, iArr, m2.q.Ltr, iArr2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return m2.g.n(this.f60786a, iVar.f60786a) && this.f60787b == iVar.f60787b && jo.p.c(this.f60788c, iVar.f60788c);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int o10 = m2.g.o(this.f60786a) * 31;
            boolean z10 = this.f60787b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (o10 + i10) * 31;
            io.p<Integer, m2.q, Integer> pVar = this.f60788c;
            return i11 + (pVar == null ? 0 : pVar.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f60787b ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append((Object) m2.g.p(this.f60786a));
            sb2.append(", ");
            sb2.append(this.f60788c);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements d {
        @Override // y.f.d
        public void b(m2.d dVar, int i10, int[] iArr, m2.q qVar, int[] iArr2) {
            jo.p.h(dVar, "<this>");
            jo.p.h(iArr, "sizes");
            jo.p.h(qVar, "layoutDirection");
            jo.p.h(iArr2, "outPositions");
            if (qVar == m2.q.Ltr) {
                f.f60773a.i(iArr, iArr2, false);
            } else {
                f.f60773a.j(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* loaded from: classes.dex */
    public static final class k implements l {
        @Override // y.f.l
        public void c(m2.d dVar, int i10, int[] iArr, int[] iArr2) {
            jo.p.h(dVar, "<this>");
            jo.p.h(iArr, "sizes");
            jo.p.h(iArr2, "outPositions");
            f.f60773a.i(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        default float a() {
            return m2.g.l(0);
        }

        void c(m2.d dVar, int i10, int[] iArr, int[] iArr2);
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.p<Integer, m2.q, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public static final m f60790w = new m();

        public m() {
            super(2);
        }

        public final Integer a(int i10, m2.q qVar) {
            jo.p.h(qVar, "layoutDirection");
            return Integer.valueOf(x0.a.f59327a.k().a(0, i10, qVar));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, m2.q qVar) {
            return a(num.intValue(), qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.p<Integer, m2.q, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a.b f60791w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(a.b bVar) {
            super(2);
            this.f60791w = bVar;
        }

        public final Integer a(int i10, m2.q qVar) {
            jo.p.h(qVar, "layoutDirection");
            return Integer.valueOf(this.f60791w.a(0, i10, qVar));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, m2.q qVar) {
            return a(num.intValue(), qVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.p<Integer, m2.q, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a.c f60792w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(a.c cVar) {
            super(2);
            this.f60792w = cVar;
        }

        public final Integer a(int i10, m2.q qVar) {
            jo.p.h(qVar, "<anonymous parameter 1>");
            return Integer.valueOf(this.f60792w.a(0, i10));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, m2.q qVar) {
            return a(num.intValue(), qVar);
        }
    }

    public final l a() {
        return f60777e;
    }

    public final e b() {
        return f60778f;
    }

    public final d c() {
        return f60775c;
    }

    public final e d() {
        return f60780h;
    }

    public final e e() {
        return f60779g;
    }

    public final d f() {
        return f60774b;
    }

    public final l g() {
        return f60776d;
    }

    public final void h(int i10, int[] iArr, int[] iArr2, boolean z10) {
        jo.p.h(iArr, "size");
        jo.p.h(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = (i10 - i12) / 2;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = lo.c.c(f10);
                f10 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = iArr[length2];
            iArr2[length2] = lo.c.c(f10);
            f10 += i16;
        }
    }

    public final void i(int[] iArr, int[] iArr2, boolean z10) {
        jo.p.h(iArr, "size");
        jo.p.h(iArr2, "outPosition");
        int i10 = 0;
        if (!z10) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = iArr[length2];
            iArr2[length2] = i10;
            i10 += i14;
        }
    }

    public final void j(int i10, int[] iArr, int[] iArr2, boolean z10) {
        jo.p.h(iArr, "size");
        jo.p.h(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z10) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = i14;
            i14 += i17;
        }
    }

    public final void k(int i10, int[] iArr, int[] iArr2, boolean z10) {
        jo.p.h(iArr, "size");
        jo.p.h(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (iArr.length == 0) ^ true ? (i10 - i12) / iArr.length : 0.0f;
        float f10 = length / 2;
        if (!z10) {
            int length2 = iArr.length;
            int i14 = 0;
            while (i11 < length2) {
                int i15 = iArr[i11];
                iArr2[i14] = lo.c.c(f10);
                f10 += i15 + length;
                i11++;
                i14++;
            }
            return;
        }
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i16 = iArr[length3];
            iArr2[length3] = lo.c.c(f10);
            f10 += i16 + length;
        }
    }

    public final void l(int i10, int[] iArr, int[] iArr2, boolean z10) {
        jo.p.h(iArr, "size");
        jo.p.h(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = 0.0f;
        float length = iArr.length > 1 ? (i10 - i12) / (iArr.length - 1) : 0.0f;
        if (!z10) {
            int length2 = iArr.length;
            int i14 = 0;
            while (i11 < length2) {
                int i15 = iArr[i11];
                iArr2[i14] = lo.c.c(f10);
                f10 += i15 + length;
                i11++;
                i14++;
            }
            return;
        }
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i16 = iArr[length3];
            iArr2[length3] = lo.c.c(f10);
            f10 += i16 + length;
        }
    }

    public final void m(int i10, int[] iArr, int[] iArr2, boolean z10) {
        jo.p.h(iArr, "size");
        jo.p.h(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (!z10) {
            int length2 = iArr.length;
            float f10 = length;
            int i14 = 0;
            while (i11 < length2) {
                int i15 = iArr[i11];
                iArr2[i14] = lo.c.c(f10);
                f10 += i15 + length;
                i11++;
                i14++;
            }
            return;
        }
        float f11 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i16 = iArr[length3];
            iArr2[length3] = lo.c.c(f11);
            f11 += i16 + length;
        }
    }

    public final e n(float f10) {
        return new i(f10, true, m.f60790w, null);
    }

    public final d o(float f10, a.b bVar) {
        jo.p.h(bVar, "alignment");
        return new i(f10, true, new n(bVar), null);
    }

    public final l p(float f10, a.c cVar) {
        jo.p.h(cVar, "alignment");
        return new i(f10, false, new o(cVar), null);
    }
}
