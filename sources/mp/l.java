package mp;

import jo.p;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final a f41398c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public int f41399a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f41400b = new int[10];

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public final int a(int i10) {
        return this.f41400b[i10];
    }

    public final int b() {
        if ((this.f41399a & 2) != 0) {
            return this.f41400b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f41399a & 128) != 0) {
            return this.f41400b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f41399a & 16) != 0) {
            return this.f41400b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i10) {
        return (this.f41399a & 32) != 0 ? this.f41400b[5] : i10;
    }

    public final boolean f(int i10) {
        return ((1 << i10) & this.f41399a) != 0;
    }

    public final void g(l lVar) {
        p.h(lVar, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (lVar.f(i10)) {
                h(i10, lVar.a(i10));
            }
        }
    }

    public final l h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f41400b;
            if (i10 < iArr.length) {
                this.f41399a = (1 << i10) | this.f41399a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f41399a);
    }
}
