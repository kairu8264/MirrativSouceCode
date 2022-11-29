package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class c0 extends RecyclerView.s {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f16059a;

    /* renamed from: b  reason: collision with root package name */
    public Scroller f16060b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView.u f16061c = new a();

    /* loaded from: classes.dex */
    public class a extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        public boolean f16062a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f16062a) {
                this.f16062a = false;
                c0.this.l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f16062a = true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends r {
        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.a0
        public void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            c0 c0Var = c0.this;
            RecyclerView recyclerView = c0Var.f16059a;
            if (recyclerView == null) {
                return;
            }
            int[] c10 = c0Var.c(recyclerView.getLayoutManager(), view);
            int i10 = c10[0];
            int i11 = c10[1];
            int w10 = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (w10 > 0) {
                aVar.d(i10, i11, w10, this.f16327j);
            }
        }

        @Override // androidx.recyclerview.widget.r
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i10, int i11) {
        RecyclerView.p layoutManager = this.f16059a.getLayoutManager();
        if (layoutManager == null || this.f16059a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f16059a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && k(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f16059a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            g();
        }
        this.f16059a = recyclerView;
        if (recyclerView != null) {
            j();
            this.f16060b = new Scroller(this.f16059a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    public int[] d(int i10, int i11) {
        this.f16060b.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f16060b.getFinalX(), this.f16060b.getFinalY()};
    }

    public RecyclerView.a0 e(RecyclerView.p pVar) {
        return f(pVar);
    }

    @Deprecated
    public r f(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.a0.b) {
            return new b(this.f16059a.getContext());
        }
        return null;
    }

    public final void g() {
        this.f16059a.g1(this.f16061c);
        this.f16059a.setOnFlingListener(null);
    }

    public abstract View h(RecyclerView.p pVar);

    public abstract int i(RecyclerView.p pVar, int i10, int i11);

    public final void j() throws IllegalStateException {
        if (this.f16059a.getOnFlingListener() == null) {
            this.f16059a.k(this.f16061c);
            this.f16059a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    public final boolean k(RecyclerView.p pVar, int i10, int i11) {
        RecyclerView.a0 e10;
        int i12;
        if (!(pVar instanceof RecyclerView.a0.b) || (e10 = e(pVar)) == null || (i12 = i(pVar, i10, i11)) == -1) {
            return false;
        }
        e10.p(i12);
        pVar.S1(e10);
        return true;
    }

    public void l() {
        RecyclerView.p layoutManager;
        View h10;
        RecyclerView recyclerView = this.f16059a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (h10 = h(layoutManager)) == null) {
            return;
        }
        int[] c10 = c(layoutManager, h10);
        if (c10[0] == 0 && c10[1] == 0) {
            return;
        }
        this.f16059a.t1(c10[0], c10[1]);
    }
}
