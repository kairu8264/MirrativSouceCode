package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m implements Runnable {
    public static final ThreadLocal<m> A = new ThreadLocal<>();
    public static Comparator<c> B = new a();

    /* renamed from: x  reason: collision with root package name */
    public long f16247x;

    /* renamed from: y  reason: collision with root package name */
    public long f16248y;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<RecyclerView> f16246w = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<c> f16249z = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f16257d;
            if ((recyclerView == null) != (cVar2.f16257d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f16254a;
            if (z10 != cVar2.f16254a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f16255b - cVar.f16255b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f16256c - cVar2.f16256c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.p.c {

        /* renamed from: a  reason: collision with root package name */
        public int f16250a;

        /* renamed from: b  reason: collision with root package name */
        public int f16251b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f16252c;

        /* renamed from: d  reason: collision with root package name */
        public int f16253d;

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 >= 0) {
                int i12 = this.f16253d * 2;
                int[] iArr = this.f16252c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f16252c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[i12 * 2];
                    this.f16252c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f16252c;
                iArr4[i12] = i10;
                iArr4[i12 + 1] = i11;
                this.f16253d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }

        public void b() {
            int[] iArr = this.f16252c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f16253d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z10) {
            this.f16253d = 0;
            int[] iArr = this.f16252c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.I;
            if (recyclerView.H == null || pVar == null || !pVar.B0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f15916z.p()) {
                    pVar.A(recyclerView.H.getItemCount(), this);
                }
            } else if (!recyclerView.q0()) {
                pVar.z(this.f16250a, this.f16251b, recyclerView.E0, this);
            }
            int i10 = this.f16253d;
            if (i10 > pVar.I) {
                pVar.I = i10;
                pVar.J = z10;
                recyclerView.f15912x.K();
            }
        }

        public boolean d(int i10) {
            if (this.f16252c != null) {
                int i11 = this.f16253d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f16252c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i10, int i11) {
            this.f16250a = i10;
            this.f16251b = i11;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f16254a;

        /* renamed from: b  reason: collision with root package name */
        public int f16255b;

        /* renamed from: c  reason: collision with root package name */
        public int f16256c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f16257d;

        /* renamed from: e  reason: collision with root package name */
        public int f16258e;

        public void a() {
            this.f16254a = false;
            this.f16255b = 0;
            this.f16256c = 0;
            this.f16257d = null;
            this.f16258e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i10) {
        int j10 = recyclerView.A.j();
        for (int i11 = 0; i11 < j10; i11++) {
            RecyclerView.e0 i02 = RecyclerView.i0(recyclerView.A.i(i11));
            if (i02.mPosition == i10 && !i02.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.f16246w.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f16246w.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f16246w.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.D0.c(recyclerView, false);
                i10 += recyclerView.D0.f16253d;
            }
        }
        this.f16249z.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f16246w.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.D0;
                int abs = Math.abs(bVar.f16250a) + Math.abs(bVar.f16251b);
                for (int i14 = 0; i14 < bVar.f16253d * 2; i14 += 2) {
                    if (i12 >= this.f16249z.size()) {
                        cVar = new c();
                        this.f16249z.add(cVar);
                    } else {
                        cVar = this.f16249z.get(i12);
                    }
                    int[] iArr = bVar.f16252c;
                    int i15 = iArr[i14 + 1];
                    cVar.f16254a = i15 <= abs;
                    cVar.f16255b = abs;
                    cVar.f16256c = i15;
                    cVar.f16257d = recyclerView2;
                    cVar.f16258e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f16249z, B);
    }

    public final void c(c cVar, long j10) {
        RecyclerView.e0 i10 = i(cVar.f16257d, cVar.f16258e, cVar.f16254a ? Long.MAX_VALUE : j10);
        if (i10 == null || i10.mNestedRecyclerView == null || !i10.isBound() || i10.isInvalid()) {
            return;
        }
        h(i10.mNestedRecyclerView.get(), j10);
    }

    public final void d(long j10) {
        for (int i10 = 0; i10 < this.f16249z.size(); i10++) {
            c cVar = this.f16249z.get(i10);
            if (cVar.f16257d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f16247x == 0) {
            this.f16247x = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.D0.e(i10, i11);
    }

    public void g(long j10) {
        b();
        d(j10);
    }

    public final void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f15891d0 && recyclerView.A.j() != 0) {
            recyclerView.a1();
        }
        b bVar = recyclerView.D0;
        bVar.c(recyclerView, true);
        if (bVar.f16253d != 0) {
            try {
                k3.j.a("RV Nested Prefetch");
                recyclerView.E0.f(recyclerView.H);
                for (int i10 = 0; i10 < bVar.f16253d * 2; i10 += 2) {
                    i(recyclerView, bVar.f16252c[i10], j10);
                }
            } finally {
                k3.j.b();
            }
        }
    }

    public final RecyclerView.e0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.f15912x;
        try {
            recyclerView.M0();
            RecyclerView.e0 I = wVar.I(i10, false, j10);
            if (I != null) {
                if (I.isBound() && !I.isInvalid()) {
                    wVar.B(I.itemView);
                } else {
                    wVar.a(I, false);
                }
            }
            return I;
        } finally {
            recyclerView.O0(false);
        }
    }

    public void j(RecyclerView recyclerView) {
        this.f16246w.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            k3.j.a("RV Prefetch");
            if (!this.f16246w.isEmpty()) {
                int size = this.f16246w.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f16246w.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f16248y);
                }
            }
        } finally {
            this.f16247x = 0L;
            k3.j.b();
        }
    }
}
