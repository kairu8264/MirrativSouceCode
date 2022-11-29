package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class a0 {
    public static int a(RecyclerView.b0 b0Var, x xVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.U() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(pVar.o0(view) - pVar.o0(view2)) + 1;
        }
        return Math.min(xVar.n(), xVar.d(view2) - xVar.g(view));
    }

    public static int b(RecyclerView.b0 b0Var, x xVar, View view, View view2, RecyclerView.p pVar, boolean z10, boolean z11) {
        int max;
        if (pVar.U() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(pVar.o0(view), pVar.o0(view2));
        int max2 = Math.max(pVar.o0(view), pVar.o0(view2));
        if (z11) {
            max = Math.max(0, (b0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (z10) {
            return Math.round((max * (Math.abs(xVar.d(view2) - xVar.g(view)) / (Math.abs(pVar.o0(view) - pVar.o0(view2)) + 1))) + (xVar.m() - xVar.g(view)));
        }
        return max;
    }

    public static int c(RecyclerView.b0 b0Var, x xVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.U() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return b0Var.b();
        }
        return (int) (((xVar.d(view2) - xVar.g(view)) / (Math.abs(pVar.o0(view) - pVar.o0(view2)) + 1)) * b0Var.b());
    }
}
