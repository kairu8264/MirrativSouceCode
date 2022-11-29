package v0;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements Iterable<Integer>, ko.a {
    public static final a A = new a(null);
    public static final k B = new k(0, 0, 0, null);

    /* renamed from: w  reason: collision with root package name */
    public final long f56499w;

    /* renamed from: x  reason: collision with root package name */
    public final long f56500x;

    /* renamed from: y  reason: collision with root package name */
    public final int f56501y;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f56502z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k a() {
            return k.B;
        }
    }

    @co.f(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, 300, 307}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.k implements io.p<ro.i<? super Integer>, ao.d<? super wn.v>, Object> {
        public int A;
        public /* synthetic */ Object B;

        /* renamed from: x  reason: collision with root package name */
        public Object f56503x;

        /* renamed from: y  reason: collision with root package name */
        public int f56504y;

        /* renamed from: z  reason: collision with root package name */
        public int f56505z;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(ro.i<? super Integer> iVar, ao.d<? super wn.v> dVar) {
            return ((b) create(iVar, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.B = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:19:0x007b). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009b -> B:31:0x00b7). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b4 -> B:31:0x00b7). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f0 -> B:43:0x00f4). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f3 -> B:43:0x00f4). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: v0.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k(long j10, long j11, int i10, int[] iArr) {
        this.f56499w = j10;
        this.f56500x = j11;
        this.f56501y = i10;
        this.f56502z = iArr;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return ro.j.b(new b(null)).iterator();
    }

    public final k m(k kVar) {
        jo.p.h(kVar, "bits");
        k kVar2 = B;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar2;
        }
        int i10 = kVar.f56501y;
        int i11 = this.f56501y;
        if (i10 == i11) {
            int[] iArr = kVar.f56502z;
            int[] iArr2 = this.f56502z;
            if (iArr == iArr2) {
                return new k(this.f56499w & (~kVar.f56499w), this.f56500x & (~kVar.f56500x), i11, iArr2);
            }
        }
        Iterator<Integer> it = kVar.iterator();
        k kVar3 = this;
        while (it.hasNext()) {
            kVar3 = kVar3.p(it.next().intValue());
        }
        return kVar3;
    }

    public final k p(int i10) {
        int[] iArr;
        int b10;
        int i11 = this.f56501y;
        int i12 = i10 - i11;
        if (i12 >= 0 && i12 < 64) {
            long j10 = 1 << i12;
            long j11 = this.f56500x;
            if ((j11 & j10) != 0) {
                return new k(this.f56499w, j11 & (~j10), i11, this.f56502z);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j12 = 1 << (i12 - 64);
            long j13 = this.f56499w;
            if ((j13 & j12) != 0) {
                return new k(j13 & (~j12), this.f56500x, i11, this.f56502z);
            }
        } else if (i12 < 0 && (iArr = this.f56502z) != null && (b10 = l.b(iArr, i10)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new k(this.f56499w, this.f56500x, this.f56501y, null);
            }
            int[] iArr2 = new int[length];
            if (b10 > 0) {
                xn.n.g(iArr, iArr2, 0, 0, b10);
            }
            if (b10 < length) {
                xn.n.g(iArr, iArr2, b10, b10 + 1, length + 1);
            }
            return new k(this.f56499w, this.f56500x, this.f56501y, iArr2);
        }
        return this;
    }

    public final boolean r(int i10) {
        int[] iArr;
        int i11 = i10 - this.f56501y;
        if (i11 >= 0 && i11 < 64) {
            return ((1 << i11) & this.f56500x) != 0;
        } else if (i11 >= 64 && i11 < 128) {
            return ((1 << (i11 - 64)) & this.f56499w) != 0;
        } else if (i11 <= 0 && (iArr = this.f56502z) != null) {
            return l.b(iArr, i10) >= 0;
        } else {
            return false;
        }
    }

    public final int s(int i10) {
        int c10;
        int c11;
        int[] iArr = this.f56502z;
        if (iArr != null) {
            return iArr[0];
        }
        long j10 = this.f56500x;
        if (j10 != 0) {
            int i11 = this.f56501y;
            c11 = l.c(j10);
            return i11 + c11;
        }
        long j11 = this.f56499w;
        if (j11 != 0) {
            c10 = l.c(j11);
            return this.f56501y + 64 + c10;
        }
        return i10;
    }

    public final k t(k kVar) {
        jo.p.h(kVar, "bits");
        k kVar2 = B;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar;
        }
        int i10 = kVar.f56501y;
        int i11 = this.f56501y;
        if (i10 == i11) {
            int[] iArr = kVar.f56502z;
            int[] iArr2 = this.f56502z;
            if (iArr == iArr2) {
                return new k(this.f56499w | kVar.f56499w, this.f56500x | kVar.f56500x, i11, iArr2);
            }
        }
        if (this.f56502z == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                kVar = kVar.u(it.next().intValue());
            }
            return kVar;
        }
        Iterator<Integer> it2 = kVar.iterator();
        k kVar3 = this;
        while (it2.hasNext()) {
            kVar3 = kVar3.u(it2.next().intValue());
        }
        return kVar3;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(xn.t.u(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb2.append(v0.b.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }

    public final k u(int i10) {
        int i11;
        int[] iArr;
        int i12 = this.f56501y;
        int i13 = i10 - i12;
        long j10 = 0;
        if (i13 >= 0 && i13 < 64) {
            long j11 = 1 << i13;
            long j12 = this.f56500x;
            if ((j12 & j11) == 0) {
                return new k(this.f56499w, j12 | j11, i12, this.f56502z);
            }
        } else if (i13 >= 64 && i13 < 128) {
            long j13 = 1 << (i13 - 64);
            long j14 = this.f56499w;
            if ((j14 & j13) == 0) {
                return new k(j14 | j13, this.f56500x, i12, this.f56502z);
            }
        } else if (i13 >= 128) {
            if (!r(i10)) {
                long j15 = this.f56499w;
                long j16 = this.f56500x;
                int i14 = this.f56501y;
                ArrayList arrayList = null;
                int i15 = ((i10 + 1) / 64) * 64;
                long j17 = j16;
                long j18 = j15;
                while (true) {
                    if (i14 >= i15) {
                        i11 = i14;
                        break;
                    }
                    if (j17 != j10) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            int[] iArr2 = this.f56502z;
                            if (iArr2 != null) {
                                for (int i16 : iArr2) {
                                    arrayList.add(Integer.valueOf(i16));
                                }
                            }
                        }
                        for (int i17 = 0; i17 < 64; i17++) {
                            if (((1 << i17) & j17) != 0) {
                                arrayList.add(Integer.valueOf(i17 + i14));
                            }
                        }
                        j10 = 0;
                    }
                    if (j18 == j10) {
                        j17 = j10;
                        i11 = i15;
                        break;
                    }
                    i14 += 64;
                    j17 = j18;
                    j18 = j10;
                }
                if (arrayList == null || (iArr = xn.a0.A0(arrayList)) == null) {
                    iArr = this.f56502z;
                }
                return new k(j18, j17, i11, iArr).u(i10);
            }
        } else {
            int[] iArr3 = this.f56502z;
            if (iArr3 == null) {
                return new k(this.f56499w, this.f56500x, i12, new int[]{i10});
            }
            int b10 = l.b(iArr3, i10);
            if (b10 < 0) {
                int i18 = -(b10 + 1);
                int length = iArr3.length + 1;
                int[] iArr4 = new int[length];
                xn.n.g(iArr3, iArr4, 0, 0, i18);
                xn.n.g(iArr3, iArr4, i18 + 1, i18, length - 1);
                iArr4[i18] = i10;
                return new k(this.f56499w, this.f56500x, this.f56501y, iArr4);
            }
        }
        return this;
    }
}
