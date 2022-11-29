package r9;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public int f50227a;

    /* renamed from: b  reason: collision with root package name */
    public int f50228b;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f50229c;

    /* renamed from: d  reason: collision with root package name */
    public int f50230d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f50231e;

    /* loaded from: classes.dex */
    public static final class a extends RecyclerView.u {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            jo.p.h(recyclerView, "recyclerView");
            super.a(recyclerView, i10);
            if (i10 == 0) {
                if (!k.this.f50231e) {
                    k.this.g();
                }
                k.this.f50231e = false;
            } else if (i10 != 2) {
            } else {
                k.this.g();
                k.this.f50231e = true;
            }
        }
    }

    public final void d(RecyclerView recyclerView) {
        jo.p.h(recyclerView, "recyclerView");
        this.f50229c = recyclerView;
        recyclerView.k(new a());
    }

    public final void e(int i10) {
        this.f50227a = i10;
    }

    public final void f(int i10) {
        this.f50228b = i10;
    }

    public final void g() {
        if (this.f50231e) {
            return;
        }
        RecyclerView recyclerView = this.f50229c;
        RecyclerView.p layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int i10 = this.f50227a * this.f50228b;
        if (gridLayoutManager.e2() % i10 == 0 && (gridLayoutManager.i2() == gridLayoutManager.e2() || gridLayoutManager.l2() == gridLayoutManager.j2())) {
            return;
        }
        int i22 = (gridLayoutManager.i2() / i10) * i10;
        int i11 = 0;
        if (this.f50230d > gridLayoutManager.i2() ? gridLayoutManager.e2() % i10 > i10 - 1 : gridLayoutManager.e2() % i10 > 0) {
            i11 = (i10 * 2) - 1;
        }
        int i12 = i22 + i11;
        gridLayoutManager.R1(this.f50229c, null, i12);
        this.f50230d = (i12 / i10) * i10;
    }
}
