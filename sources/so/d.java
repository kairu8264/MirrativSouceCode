package so;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class d implements ro.g<po.i> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f52780a;

    /* renamed from: b  reason: collision with root package name */
    public final int f52781b;

    /* renamed from: c  reason: collision with root package name */
    public final int f52782c;

    /* renamed from: d  reason: collision with root package name */
    public final io.p<CharSequence, Integer, wn.k<Integer, Integer>> f52783d;

    /* loaded from: classes4.dex */
    public static final class a implements Iterator<po.i>, ko.a {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public int f52784w = -1;

        /* renamed from: x  reason: collision with root package name */
        public int f52785x;

        /* renamed from: y  reason: collision with root package name */
        public int f52786y;

        /* renamed from: z  reason: collision with root package name */
        public po.i f52787z;

        public a() {
            int m10 = po.n.m(d.this.f52781b, 0, d.this.f52780a.length());
            this.f52785x = m10;
            this.f52786y = m10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.B.f52782c) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b() {
            /*
                r6 = this;
                int r0 = r6.f52786y
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f52784w = r1
                r0 = 0
                r6.f52787z = r0
                goto L9e
            Lc:
                so.d r0 = so.d.this
                int r0 = so.d.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.A
                int r0 = r0 + r3
                r6.A = r0
                so.d r4 = so.d.this
                int r4 = so.d.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f52786y
                so.d r4 = so.d.this
                java.lang.CharSequence r4 = so.d.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                po.i r0 = new po.i
                int r1 = r6.f52785x
                so.d r4 = so.d.this
                java.lang.CharSequence r4 = so.d.c(r4)
                int r4 = so.o.O(r4)
                r0.<init>(r1, r4)
                r6.f52787z = r0
                r6.f52786y = r2
                goto L9c
            L47:
                so.d r0 = so.d.this
                io.p r0 = so.d.b(r0)
                so.d r4 = so.d.this
                java.lang.CharSequence r4 = so.d.c(r4)
                int r5 = r6.f52786y
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                wn.k r0 = (wn.k) r0
                if (r0 != 0) goto L77
                po.i r0 = new po.i
                int r1 = r6.f52785x
                so.d r4 = so.d.this
                java.lang.CharSequence r4 = so.d.c(r4)
                int r4 = so.o.O(r4)
                r0.<init>(r1, r4)
                r6.f52787z = r0
                r6.f52786y = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f52785x
                po.i r4 = po.n.t(r4, r2)
                r6.f52787z = r4
                int r2 = r2 + r0
                r6.f52785x = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f52786y = r2
            L9c:
                r6.f52784w = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: so.d.a.b():void");
        }

        @Override // java.util.Iterator
        /* renamed from: d */
        public po.i next() {
            if (this.f52784w == -1) {
                b();
            }
            if (this.f52784w != 0) {
                po.i iVar = this.f52787z;
                jo.p.f(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f52787z = null;
                this.f52784w = -1;
                return iVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52784w == -1) {
                b();
            }
            return this.f52784w == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(CharSequence charSequence, int i10, int i11, io.p<? super CharSequence, ? super Integer, wn.k<Integer, Integer>> pVar) {
        jo.p.h(charSequence, "input");
        jo.p.h(pVar, "getNextMatch");
        this.f52780a = charSequence;
        this.f52781b = i10;
        this.f52782c = i11;
        this.f52783d = pVar;
    }

    @Override // ro.g
    public Iterator<po.i> iterator() {
        return new a();
    }
}
