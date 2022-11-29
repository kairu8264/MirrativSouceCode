package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class y extends c0 {

    /* renamed from: d  reason: collision with root package name */
    public x f16350d;

    /* renamed from: e  reason: collision with root package name */
    public x f16351e;

    /* loaded from: classes.dex */
    public class a extends r {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.a0
        public void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            y yVar = y.this;
            int[] c10 = yVar.c(yVar.f16059a.getLayoutManager(), view);
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

        @Override // androidx.recyclerview.widget.r
        public int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.v()) {
            iArr[0] = m(view, o(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.w()) {
            iArr[1] = m(view, q(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.c0
    public RecyclerView.a0 e(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.a0.b) {
            return new a(this.f16059a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.c0
    public View h(RecyclerView.p pVar) {
        if (pVar.w()) {
            return n(pVar, q(pVar));
        }
        if (pVar.v()) {
            return n(pVar, o(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.c0
    public int i(RecyclerView.p pVar, int i10, int i11) {
        x p10;
        int j02 = pVar.j0();
        if (j02 == 0 || (p10 = p(pVar)) == null) {
            return -1;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int U = pVar.U();
        View view = null;
        View view2 = null;
        for (int i14 = 0; i14 < U; i14++) {
            View T = pVar.T(i14);
            if (T != null) {
                int m10 = m(T, p10);
                if (m10 <= 0 && m10 > i12) {
                    view2 = T;
                    i12 = m10;
                }
                if (m10 >= 0 && m10 < i13) {
                    view = T;
                    i13 = m10;
                }
            }
        }
        boolean r10 = r(pVar, i10, i11);
        if (!r10 || view == null) {
            if (r10 || view2 == null) {
                if (r10) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int o02 = pVar.o0(view) + (s(pVar) == r10 ? -1 : 1);
                if (o02 < 0 || o02 >= j02) {
                    return -1;
                }
                return o02;
            }
            return pVar.o0(view2);
        }
        return pVar.o0(view);
    }

    public final int m(View view, x xVar) {
        return (xVar.g(view) + (xVar.e(view) / 2)) - (xVar.m() + (xVar.n() / 2));
    }

    public final View n(RecyclerView.p pVar, x xVar) {
        int U = pVar.U();
        View view = null;
        if (U == 0) {
            return null;
        }
        int m10 = xVar.m() + (xVar.n() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < U; i11++) {
            View T = pVar.T(i11);
            int abs = Math.abs((xVar.g(T) + (xVar.e(T) / 2)) - m10);
            if (abs < i10) {
                view = T;
                i10 = abs;
            }
        }
        return view;
    }

    public final x o(RecyclerView.p pVar) {
        x xVar = this.f16351e;
        if (xVar == null || xVar.f16347a != pVar) {
            this.f16351e = x.a(pVar);
        }
        return this.f16351e;
    }

    public final x p(RecyclerView.p pVar) {
        if (pVar.w()) {
            return q(pVar);
        }
        if (pVar.v()) {
            return o(pVar);
        }
        return null;
    }

    public final x q(RecyclerView.p pVar) {
        x xVar = this.f16350d;
        if (xVar == null || xVar.f16347a != pVar) {
            this.f16350d = x.c(pVar);
        }
        return this.f16350d;
    }

    public final boolean r(RecyclerView.p pVar, int i10, int i11) {
        return pVar.v() ? i10 > 0 : i11 > 0;
    }

    public final boolean s(RecyclerView.p pVar) {
        PointF a10;
        int j02 = pVar.j0();
        if (!(pVar instanceof RecyclerView.a0.b) || (a10 = ((RecyclerView.a0.b) pVar).a(j02 - 1)) == null) {
            return false;
        }
        return a10.x < 0.0f || a10.y < 0.0f;
    }
}
