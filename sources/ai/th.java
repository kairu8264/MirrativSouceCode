package ai;

/* loaded from: classes3.dex */
public final class th {

    /* renamed from: i  reason: collision with root package name */
    public int f10298i;

    /* renamed from: j  reason: collision with root package name */
    public int f10299j;

    /* renamed from: k  reason: collision with root package name */
    public int f10300k;

    /* renamed from: l  reason: collision with root package name */
    public int f10301l;

    /* renamed from: q  reason: collision with root package name */
    public oc f10306q;

    /* renamed from: a  reason: collision with root package name */
    public int f10290a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public int[] f10291b = new int[1000];

    /* renamed from: c  reason: collision with root package name */
    public long[] f10292c = new long[1000];

    /* renamed from: f  reason: collision with root package name */
    public long[] f10295f = new long[1000];

    /* renamed from: e  reason: collision with root package name */
    public int[] f10294e = new int[1000];

    /* renamed from: d  reason: collision with root package name */
    public int[] f10293d = new int[1000];

    /* renamed from: g  reason: collision with root package name */
    public ue[] f10296g = new ue[1000];

    /* renamed from: h  reason: collision with root package name */
    public oc[] f10297h = new oc[1000];

    /* renamed from: m  reason: collision with root package name */
    public long f10302m = Long.MIN_VALUE;

    /* renamed from: n  reason: collision with root package name */
    public long f10303n = Long.MIN_VALUE;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10305p = true;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10304o = true;

    public final void a() {
        this.f10299j = 0;
        this.f10300k = 0;
        this.f10301l = 0;
        this.f10298i = 0;
        this.f10304o = true;
    }

    public final void b() {
        this.f10302m = Long.MIN_VALUE;
        this.f10303n = Long.MIN_VALUE;
    }

    public final int c() {
        return this.f10299j + this.f10298i;
    }

    public final synchronized boolean d() {
        return this.f10298i != 0;
    }

    public final synchronized oc e() {
        if (this.f10305p) {
            return null;
        }
        return this.f10306q;
    }

    public final synchronized long f() {
        return Math.max(this.f10302m, this.f10303n);
    }

    public final synchronized int g(pc pcVar, ee eeVar, boolean z10, boolean z11, oc ocVar, sh shVar) {
        if (!d()) {
            if (z11) {
                eeVar.e(4);
                return -4;
            }
            oc ocVar2 = this.f10306q;
            if (ocVar2 == null || (!z10 && ocVar2 == ocVar)) {
                return -3;
            }
            pcVar.f8372a = ocVar2;
            return -5;
        }
        if (!z10) {
            oc[] ocVarArr = this.f10297h;
            int i10 = this.f10300k;
            if (ocVarArr[i10] == ocVar) {
                if (eeVar.f3616c != null) {
                    eeVar.f3617d = this.f10295f[i10];
                    eeVar.e(this.f10294e[i10]);
                    int[] iArr = this.f10293d;
                    int i11 = this.f10300k;
                    shVar.f9831a = iArr[i11];
                    shVar.f9832b = this.f10292c[i11];
                    shVar.f9834d = this.f10296g[i11];
                    this.f10302m = Math.max(this.f10302m, eeVar.f3617d);
                    int i12 = this.f10298i - 1;
                    this.f10298i = i12;
                    int i13 = this.f10300k + 1;
                    this.f10300k = i13;
                    this.f10299j++;
                    if (i13 == this.f10290a) {
                        this.f10300k = 0;
                        i13 = 0;
                    }
                    shVar.f9833c = i12 > 0 ? this.f10292c[i13] : shVar.f9832b + shVar.f9831a;
                    return -4;
                }
                return -3;
            }
        }
        pcVar.f8372a = this.f10297h[this.f10300k];
        return -5;
    }

    public final synchronized long h() {
        if (d()) {
            int i10 = this.f10300k;
            int i11 = this.f10298i;
            int i12 = i10 + i11;
            int i13 = this.f10290a;
            int i14 = (i12 - 1) % i13;
            this.f10300k = i12 % i13;
            this.f10299j += i11;
            this.f10298i = 0;
            return this.f10292c[i14] + this.f10293d[i14];
        }
        return -1L;
    }

    public final synchronized long i(long j10, boolean z10) {
        if (d()) {
            long[] jArr = this.f10295f;
            int i10 = this.f10300k;
            if (j10 >= jArr[i10]) {
                int i11 = 0;
                if (j10 <= this.f10303n || z10) {
                    int i12 = -1;
                    while (i10 != this.f10301l && this.f10295f[i10] <= j10) {
                        if (1 == (this.f10294e[i10] & 1)) {
                            i12 = i11;
                        }
                        i10 = (i10 + 1) % this.f10290a;
                        i11++;
                    }
                    if (i12 == -1) {
                        return -1L;
                    }
                    int i13 = (this.f10300k + i12) % this.f10290a;
                    this.f10300k = i13;
                    this.f10299j += i12;
                    this.f10298i -= i12;
                    return this.f10292c[i13];
                }
                return -1L;
            }
        }
        return -1L;
    }

    public final synchronized boolean j(oc ocVar) {
        if (ocVar == null) {
            this.f10305p = true;
            return false;
        }
        this.f10305p = false;
        if (vj.a(ocVar, this.f10306q)) {
            return false;
        }
        this.f10306q = ocVar;
        return true;
    }

    public final synchronized void k(long j10, int i10, long j11, int i11, ue ueVar) {
        if (this.f10304o) {
            if ((i10 & 1) == 0) {
                return;
            }
            this.f10304o = false;
        }
        fj.d(!this.f10305p);
        l(j10);
        long[] jArr = this.f10295f;
        int i12 = this.f10301l;
        jArr[i12] = j10;
        long[] jArr2 = this.f10292c;
        jArr2[i12] = j11;
        this.f10293d[i12] = i11;
        this.f10294e[i12] = i10;
        this.f10296g[i12] = ueVar;
        this.f10297h[i12] = this.f10306q;
        this.f10291b[i12] = 0;
        int i13 = this.f10298i + 1;
        this.f10298i = i13;
        int i14 = this.f10290a;
        if (i13 != i14) {
            int i15 = i12 + 1;
            this.f10301l = i15;
            if (i15 == i14) {
                this.f10301l = 0;
                return;
            }
            return;
        }
        int i16 = i14 + 1000;
        int[] iArr = new int[i16];
        long[] jArr3 = new long[i16];
        long[] jArr4 = new long[i16];
        int[] iArr2 = new int[i16];
        int[] iArr3 = new int[i16];
        ue[] ueVarArr = new ue[i16];
        oc[] ocVarArr = new oc[i16];
        int i17 = this.f10300k;
        int i18 = i14 - i17;
        System.arraycopy(jArr2, i17, jArr3, 0, i18);
        System.arraycopy(this.f10295f, this.f10300k, jArr4, 0, i18);
        System.arraycopy(this.f10294e, this.f10300k, iArr2, 0, i18);
        System.arraycopy(this.f10293d, this.f10300k, iArr3, 0, i18);
        System.arraycopy(this.f10296g, this.f10300k, ueVarArr, 0, i18);
        System.arraycopy(this.f10297h, this.f10300k, ocVarArr, 0, i18);
        System.arraycopy(this.f10291b, this.f10300k, iArr, 0, i18);
        int i19 = this.f10300k;
        System.arraycopy(this.f10292c, 0, jArr3, i18, i19);
        System.arraycopy(this.f10295f, 0, jArr4, i18, i19);
        System.arraycopy(this.f10294e, 0, iArr2, i18, i19);
        System.arraycopy(this.f10293d, 0, iArr3, i18, i19);
        System.arraycopy(this.f10296g, 0, ueVarArr, i18, i19);
        System.arraycopy(this.f10297h, 0, ocVarArr, i18, i19);
        System.arraycopy(this.f10291b, 0, iArr, i18, i19);
        this.f10292c = jArr3;
        this.f10295f = jArr4;
        this.f10294e = iArr2;
        this.f10293d = iArr3;
        this.f10296g = ueVarArr;
        this.f10297h = ocVarArr;
        this.f10291b = iArr;
        this.f10300k = 0;
        int i20 = this.f10290a;
        this.f10301l = i20;
        this.f10298i = i20;
        this.f10290a = i16;
    }

    public final synchronized void l(long j10) {
        this.f10303n = Math.max(this.f10303n, j10);
    }
}
