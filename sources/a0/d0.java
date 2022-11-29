package a0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final r f31a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<a> f32b;

    /* renamed from: c  reason: collision with root package name */
    public int f33c;

    /* renamed from: d  reason: collision with root package name */
    public int f34d;

    /* renamed from: e  reason: collision with root package name */
    public int f35e;

    /* renamed from: f  reason: collision with root package name */
    public int f36f;

    /* renamed from: g  reason: collision with root package name */
    public final List<Integer> f37g;

    /* renamed from: h  reason: collision with root package name */
    public List<a0.c> f38h;

    /* renamed from: i  reason: collision with root package name */
    public int f39i;

    /* loaded from: classes.dex */
    public static final class b implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final b f42a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static int f43b;

        /* renamed from: c  reason: collision with root package name */
        public static int f44c;

        @Override // a0.q
        public int a() {
            return f44c;
        }

        public void b(int i10) {
            f43b = i10;
        }

        public void c(int i10) {
            f44c = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f45a;

        /* renamed from: b  reason: collision with root package name */
        public final List<a0.c> f46b;

        public c(int i10, List<a0.c> list) {
            jo.p.h(list, "spans");
            this.f45a = i10;
            this.f46b = list;
        }

        public final int a() {
            return this.f45a;
        }

        public final List<a0.c> b() {
            return this.f46b;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<a, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f47w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10) {
            super(1);
            this.f47w = i10;
        }

        @Override // io.l
        /* renamed from: a */
        public final Integer invoke(a aVar) {
            jo.p.h(aVar, "it");
            return Integer.valueOf(aVar.a() - this.f47w);
        }
    }

    public d0(r rVar) {
        jo.p.h(rVar, "itemsSnapshot");
        this.f31a = rVar;
        ArrayList<a> arrayList = new ArrayList<>();
        arrayList.add(new a(0, 0, 2, null));
        this.f32b = arrayList;
        this.f36f = -1;
        this.f37g = new ArrayList();
        this.f38h = xn.s.k();
    }

    public final int a() {
        return ((int) Math.sqrt((e() * 1.0d) / this.f39i)) + 1;
    }

    public final List<a0.c> b(int i10) {
        if (i10 == this.f38h.size()) {
            return this.f38h;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(a0.c.a(c0.a(1)));
        }
        this.f38h = arrayList;
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae A[LOOP:0: B:35:0x00ae->B:84:0x00ae, LOOP_START, PHI: r2 r4 r5 
      PHI: (r2v10 int) = (r2v9 int), (r2v14 int) binds: [B:34:0x00ac, B:84:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v6 int) = (r4v5 int), (r4v7 int) binds: [B:34:0x00ac, B:84:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v6 int) = (r5v5 int), (r5v14 int) binds: [B:34:0x00ac, B:84:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a0.d0.c c(int r12) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.d0.c(int):a0.d0$c");
    }

    public final int d(int i10) {
        if (e() <= 0) {
            return l0.b(0);
        }
        if (i10 < e()) {
            if (!this.f31a.c()) {
                return l0.b(i10 / this.f39i);
            }
            int i11 = xn.s.i(this.f32b, 0, 0, new d(i10), 3, null);
            if (i11 < 0) {
                i11 = (-i11) - 2;
            }
            int a10 = a() * i11;
            int a11 = this.f32b.get(i11).a();
            if (a11 <= i10) {
                int i12 = 0;
                while (a11 < i10) {
                    int i13 = a11 + 1;
                    int h10 = h(a11, this.f39i - i12);
                    i12 += h10;
                    int i14 = this.f39i;
                    if (i12 >= i14) {
                        if (i12 == i14) {
                            a10++;
                            i12 = 0;
                        } else {
                            a10++;
                            i12 = h10;
                        }
                    }
                    if (a10 % a() == 0 && a10 / a() >= this.f32b.size()) {
                        this.f32b.add(new a(i13 - (i12 > 0 ? 1 : 0), 0, 2, null));
                    }
                    a11 = i13;
                }
                if (i12 + h(i10, this.f39i - i12) > this.f39i) {
                    a10++;
                }
                return l0.b(a10);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final int e() {
        return this.f31a.d();
    }

    public final void f() {
        this.f32b.clear();
        this.f32b.add(new a(0, 0, 2, null));
        this.f33c = 0;
        this.f34d = 0;
        this.f36f = -1;
        this.f37g.clear();
    }

    public final void g(int i10) {
        if (i10 != this.f39i) {
            this.f39i = i10;
            f();
        }
    }

    public final int h(int i10, int i11) {
        r rVar = this.f31a;
        b bVar = b.f42a;
        bVar.b(i11);
        bVar.c(this.f39i);
        return po.n.m(a0.c.d(rVar.g(bVar, i10)), 1, this.f39i);
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f40a;

        /* renamed from: b  reason: collision with root package name */
        public final int f41b;

        public a(int i10, int i11) {
            this.f40a = i10;
            this.f41b = i11;
        }

        public final int a() {
            return this.f40a;
        }

        public final int b() {
            return this.f41b;
        }

        public /* synthetic */ a(int i10, int i11, int i12, jo.h hVar) {
            this(i10, (i12 & 2) != 0 ? 0 : i11);
        }
    }
}
