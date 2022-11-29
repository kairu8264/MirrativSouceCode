package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class s extends c0 {

    /* renamed from: d  reason: collision with root package name */
    public x f16334d;

    /* renamed from: e  reason: collision with root package name */
    public x f16335e;

    @Override // androidx.recyclerview.widget.c0
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.v()) {
            iArr[0] = n(view, q(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.w()) {
            iArr[1] = n(view, r(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.c0
    public View h(RecyclerView.p pVar) {
        if (pVar.w()) {
            return p(pVar, r(pVar));
        }
        if (pVar.v()) {
            return p(pVar, q(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.c0
    public int i(RecyclerView.p pVar, int i10, int i11) {
        int j02;
        View h10;
        int o02;
        int i12;
        PointF a10;
        int i13;
        int i14;
        if (!(pVar instanceof RecyclerView.a0.b) || (j02 = pVar.j0()) == 0 || (h10 = h(pVar)) == null || (o02 = pVar.o0(h10)) == -1 || (a10 = ((RecyclerView.a0.b) pVar).a(j02 - 1)) == null) {
            return -1;
        }
        if (pVar.v()) {
            i13 = o(pVar, q(pVar), i10, 0);
            if (a10.x < 0.0f) {
                i13 = -i13;
            }
        } else {
            i13 = 0;
        }
        if (pVar.w()) {
            i14 = o(pVar, r(pVar), 0, i11);
            if (a10.y < 0.0f) {
                i14 = -i14;
            }
        } else {
            i14 = 0;
        }
        if (pVar.w()) {
            i13 = i14;
        }
        if (i13 == 0) {
            return -1;
        }
        int i15 = o02 + i13;
        int i16 = i15 >= 0 ? i15 : 0;
        return i16 >= j02 ? i12 : i16;
    }

    public final float m(RecyclerView.p pVar, x xVar) {
        int U = pVar.U();
        if (U == 0) {
            return 1.0f;
        }
        View view = null;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i12 = 0; i12 < U; i12++) {
            View T = pVar.T(i12);
            int o02 = pVar.o0(T);
            if (o02 != -1) {
                if (o02 < i11) {
                    view = T;
                    i11 = o02;
                }
                if (o02 > i10) {
                    view2 = T;
                    i10 = o02;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(xVar.d(view), xVar.d(view2)) - Math.min(xVar.g(view), xVar.g(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i10 - i11) + 1);
    }

    public final int n(View view, x xVar) {
        return (xVar.g(view) + (xVar.e(view) / 2)) - (xVar.m() + (xVar.n() / 2));
    }

    public final int o(RecyclerView.p pVar, x xVar, int i10, int i11) {
        int[] d10 = d(i10, i11);
        float m10 = m(pVar, xVar);
        if (m10 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(d10[0]) > Math.abs(d10[1]) ? d10[0] : d10[1]) / m10);
    }

    public final View p(RecyclerView.p pVar, x xVar) {
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

    public final x q(RecyclerView.p pVar) {
        x xVar = this.f16335e;
        if (xVar == null || xVar.f16347a != pVar) {
            this.f16335e = x.a(pVar);
        }
        return this.f16335e;
    }

    public final x r(RecyclerView.p pVar) {
        x xVar = this.f16334d;
        if (xVar == null || xVar.f16347a != pVar) {
            this.f16334d = x.c(pVar);
        }
        return this.f16334d;
    }
}
