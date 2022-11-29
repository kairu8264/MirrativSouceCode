package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<d> f16186a = new a();

    /* loaded from: classes.dex */
    public class a implements Comparator<d> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return dVar.f16189a - dVar2.f16189a;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean a(int i10, int i11);

        public abstract boolean b(int i10, int i11);

        public Object c(int i10, int i11) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f16187a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16188b;

        public c(int i10) {
            int[] iArr = new int[i10];
            this.f16187a = iArr;
            this.f16188b = iArr.length / 2;
        }

        public int[] a() {
            return this.f16187a;
        }

        public int b(int i10) {
            return this.f16187a[i10 + this.f16188b];
        }

        public void c(int i10, int i11) {
            this.f16187a[i10 + this.f16188b] = i11;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f16189a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16190b;

        /* renamed from: c  reason: collision with root package name */
        public final int f16191c;

        public d(int i10, int i11, int i12) {
            this.f16189a = i10;
            this.f16190b = i11;
            this.f16191c = i12;
        }

        public int a() {
            return this.f16189a + this.f16191c;
        }

        public int b() {
            return this.f16190b + this.f16191c;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final List<d> f16192a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f16193b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f16194c;

        /* renamed from: d  reason: collision with root package name */
        public final b f16195d;

        /* renamed from: e  reason: collision with root package name */
        public final int f16196e;

        /* renamed from: f  reason: collision with root package name */
        public final int f16197f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f16198g;

        public e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z10) {
            this.f16192a = list;
            this.f16193b = iArr;
            this.f16194c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f16195d = bVar;
            this.f16196e = bVar.e();
            this.f16197f = bVar.d();
            this.f16198g = z10;
            a();
            e();
        }

        public static g g(Collection<g> collection, int i10, boolean z10) {
            g gVar;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = it.next();
                if (gVar.f16199a == i10 && gVar.f16201c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g next = it.next();
                if (z10) {
                    next.f16200b--;
                } else {
                    next.f16200b++;
                }
            }
            return gVar;
        }

        public final void a() {
            d dVar = this.f16192a.isEmpty() ? null : this.f16192a.get(0);
            if (dVar == null || dVar.f16189a != 0 || dVar.f16190b != 0) {
                this.f16192a.add(0, new d(0, 0, 0));
            }
            this.f16192a.add(new d(this.f16196e, this.f16197f, 0));
        }

        public void b(u uVar) {
            androidx.recyclerview.widget.e eVar;
            int i10;
            if (uVar instanceof androidx.recyclerview.widget.e) {
                eVar = (androidx.recyclerview.widget.e) uVar;
            } else {
                eVar = new androidx.recyclerview.widget.e(uVar);
            }
            int i11 = this.f16196e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f16196e;
            int i13 = this.f16197f;
            for (int size = this.f16192a.size() - 1; size >= 0; size--) {
                d dVar = this.f16192a.get(size);
                int a10 = dVar.a();
                int b10 = dVar.b();
                while (true) {
                    if (i12 <= a10) {
                        break;
                    }
                    i12--;
                    int i14 = this.f16193b[i12];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        g g10 = g(arrayDeque, i15, false);
                        if (g10 != null) {
                            int i16 = (i11 - g10.f16200b) - 1;
                            eVar.d(i12, i16);
                            if ((i14 & 4) != 0) {
                                eVar.c(i16, 1, this.f16195d.c(i12, i15));
                            }
                        } else {
                            arrayDeque.add(new g(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        eVar.b(i12, 1);
                        i11--;
                    }
                }
                while (i13 > b10) {
                    i13--;
                    int i17 = this.f16194c[i13];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        g g11 = g(arrayDeque, i18, true);
                        if (g11 == null) {
                            arrayDeque.add(new g(i13, i11 - i12, false));
                        } else {
                            eVar.d((i11 - g11.f16200b) - 1, i12);
                            if ((i17 & 4) != 0) {
                                eVar.c(i12, 1, this.f16195d.c(i18, i13));
                            }
                        }
                    } else {
                        eVar.a(i12, 1);
                        i11++;
                    }
                }
                int i19 = dVar.f16189a;
                int i20 = dVar.f16190b;
                for (i10 = 0; i10 < dVar.f16191c; i10++) {
                    if ((this.f16193b[i19] & 15) == 2) {
                        eVar.c(i19, 1, this.f16195d.c(i19, i20));
                    }
                    i19++;
                    i20++;
                }
                i12 = dVar.f16189a;
                i13 = dVar.f16190b;
            }
            eVar.e();
        }

        public void c(RecyclerView.h hVar) {
            b(new androidx.recyclerview.widget.b(hVar));
        }

        public final void d(int i10) {
            int size = this.f16192a.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                d dVar = this.f16192a.get(i12);
                while (i11 < dVar.f16190b) {
                    if (this.f16194c[i11] == 0 && this.f16195d.b(i10, i11)) {
                        int i13 = this.f16195d.a(i10, i11) ? 8 : 4;
                        this.f16193b[i10] = (i11 << 4) | i13;
                        this.f16194c[i11] = (i10 << 4) | i13;
                        return;
                    }
                    i11++;
                }
                i11 = dVar.b();
            }
        }

        public final void e() {
            for (d dVar : this.f16192a) {
                for (int i10 = 0; i10 < dVar.f16191c; i10++) {
                    int i11 = dVar.f16189a + i10;
                    int i12 = dVar.f16190b + i10;
                    int i13 = this.f16195d.a(i11, i12) ? 1 : 2;
                    this.f16193b[i11] = (i12 << 4) | i13;
                    this.f16194c[i12] = (i11 << 4) | i13;
                }
            }
            if (this.f16198g) {
                f();
            }
        }

        public final void f() {
            int i10 = 0;
            for (d dVar : this.f16192a) {
                while (i10 < dVar.f16189a) {
                    if (this.f16193b[i10] == 0) {
                        d(i10);
                    }
                    i10++;
                }
                i10 = dVar.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f<T> {
        public abstract boolean a(T t10, T t11);

        public abstract boolean b(T t10, T t11);

        public Object c(T t10, T t11) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public int f16199a;

        /* renamed from: b  reason: collision with root package name */
        public int f16200b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f16201c;

        public g(int i10, int i11, boolean z10) {
            this.f16199a = i10;
            this.f16200b = i11;
            this.f16201c = z10;
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public int f16202a;

        /* renamed from: b  reason: collision with root package name */
        public int f16203b;

        /* renamed from: c  reason: collision with root package name */
        public int f16204c;

        /* renamed from: d  reason: collision with root package name */
        public int f16205d;

        public h() {
        }

        public int a() {
            return this.f16205d - this.f16204c;
        }

        public int b() {
            return this.f16203b - this.f16202a;
        }

        public h(int i10, int i11, int i12, int i13) {
            this.f16202a = i10;
            this.f16203b = i11;
            this.f16204c = i12;
            this.f16205d = i13;
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f16206a;

        /* renamed from: b  reason: collision with root package name */
        public int f16207b;

        /* renamed from: c  reason: collision with root package name */
        public int f16208c;

        /* renamed from: d  reason: collision with root package name */
        public int f16209d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f16210e;

        public int a() {
            return Math.min(this.f16208c - this.f16206a, this.f16209d - this.f16207b);
        }

        public boolean b() {
            return this.f16209d - this.f16207b != this.f16208c - this.f16206a;
        }

        public boolean c() {
            return this.f16209d - this.f16207b > this.f16208c - this.f16206a;
        }

        public d d() {
            if (b()) {
                if (this.f16210e) {
                    return new d(this.f16206a, this.f16207b, a());
                }
                if (c()) {
                    return new d(this.f16206a, this.f16207b + 1, a());
                }
                return new d(this.f16206a + 1, this.f16207b, a());
            }
            int i10 = this.f16206a;
            return new d(i10, this.f16207b, this.f16208c - i10);
        }
    }

    public static i a(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int b10;
        int i11;
        int i12;
        boolean z10 = (hVar.b() - hVar.a()) % 2 == 0;
        int b11 = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 != i13 && (i14 == i10 || cVar2.b(i14 + 1) >= cVar2.b(i14 - 1))) {
                b10 = cVar2.b(i14 - 1);
                i11 = b10 - 1;
            } else {
                b10 = cVar2.b(i14 + 1);
                i11 = b10;
            }
            int i15 = hVar.f16205d - ((hVar.f16203b - i11) - i14);
            int i16 = (i10 == 0 || i11 != b10) ? i15 : i15 + 1;
            while (i11 > hVar.f16202a && i15 > hVar.f16204c && bVar.b(i11 - 1, i15 - 1)) {
                i11--;
                i15--;
            }
            cVar2.c(i14, i11);
            if (z10 && (i12 = b11 - i14) >= i13 && i12 <= i10 && cVar.b(i12) >= i11) {
                i iVar = new i();
                iVar.f16206a = i11;
                iVar.f16207b = i15;
                iVar.f16208c = b10;
                iVar.f16209d = i16;
                iVar.f16210e = true;
                return iVar;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z10) {
        int e10 = bVar.e();
        int d10 = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, e10, 0, d10));
        int i10 = ((((e10 + d10) + 1) / 2) * 2) + 1;
        c cVar = new c(i10);
        c cVar2 = new c(i10);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            i e11 = e(hVar, bVar, cVar, cVar2);
            if (e11 != null) {
                if (e11.a() > 0) {
                    arrayList.add(e11.d());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f16202a = hVar.f16202a;
                hVar2.f16204c = hVar.f16204c;
                hVar2.f16203b = e11.f16206a;
                hVar2.f16205d = e11.f16207b;
                arrayList2.add(hVar2);
                hVar.f16203b = hVar.f16203b;
                hVar.f16205d = hVar.f16205d;
                hVar.f16202a = e11.f16208c;
                hVar.f16204c = e11.f16209d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f16186a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z10);
    }

    public static i d(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int b10;
        int i11;
        int i12;
        boolean z10 = Math.abs(hVar.b() - hVar.a()) % 2 == 1;
        int b11 = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 != i13 && (i14 == i10 || cVar.b(i14 + 1) <= cVar.b(i14 - 1))) {
                b10 = cVar.b(i14 - 1);
                i11 = b10 + 1;
            } else {
                b10 = cVar.b(i14 + 1);
                i11 = b10;
            }
            int i15 = (hVar.f16204c + (i11 - hVar.f16202a)) - i14;
            int i16 = (i10 == 0 || i11 != b10) ? i15 : i15 - 1;
            while (i11 < hVar.f16203b && i15 < hVar.f16205d && bVar.b(i11, i15)) {
                i11++;
                i15++;
            }
            cVar.c(i14, i11);
            if (z10 && (i12 = b11 - i14) >= i13 + 1 && i12 <= i10 - 1 && cVar2.b(i12) <= i11) {
                i iVar = new i();
                iVar.f16206a = b10;
                iVar.f16207b = i16;
                iVar.f16208c = i11;
                iVar.f16209d = i15;
                iVar.f16210e = false;
                return iVar;
            }
        }
        return null;
    }

    public static i e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int b10 = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.c(1, hVar.f16202a);
            cVar2.c(1, hVar.f16203b);
            for (int i10 = 0; i10 < b10; i10++) {
                i d10 = d(hVar, bVar, cVar, cVar2, i10);
                if (d10 != null) {
                    return d10;
                }
                i a10 = a(hVar, bVar, cVar, cVar2, i10);
                if (a10 != null) {
                    return a10;
                }
            }
        }
        return null;
    }
}
