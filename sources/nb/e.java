package nb;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jo.p;
import ud.a1;
import ud.b1;
import ud.y0;
import ud.z0;
import wn.q;
import xn.a0;

/* loaded from: classes2.dex */
public final class e extends RecyclerView.o {

    /* renamed from: a  reason: collision with root package name */
    public final List<List<ud.a>> f41745a;

    /* renamed from: b  reason: collision with root package name */
    public final int f41746b;

    /* renamed from: c  reason: collision with root package name */
    public final int f41747c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(List<? extends List<? extends ud.a>> list, int i10, int i11) {
        p.h(list, "bindModels");
        this.f41745a = list;
        this.f41746b = i10;
        this.f41747c = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        boolean z10;
        p.h(rect, "outRect");
        p.h(view, "view");
        p.h(recyclerView, "parent");
        p.h(b0Var, "state");
        super.g(rect, view, recyclerView, b0Var);
        int g02 = recyclerView.g0(view);
        int measuredWidth = recyclerView.getMeasuredWidth() / this.f41747c;
        wn.k<List<ud.a>, Integer> l10 = l(this.f41745a, g02);
        if (l10 == null) {
            return;
        }
        List<ud.a> a10 = l10.a();
        int intValue = l10.b().intValue();
        if (!(a10 instanceof Collection) || !a10.isEmpty()) {
            for (ud.a aVar : a10) {
                if (aVar instanceof y0) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        RecyclerView.e0 h02 = recyclerView.h0(view);
        if (h02 instanceof k) {
            Object a02 = a0.a0(a10, intValue);
            z0 z0Var = a02 instanceof z0 ? (z0) a02 : null;
            if ((z0Var == null || !z0Var.a()) ? false : false) {
                view.getLayoutParams().width = measuredWidth;
                return;
            } else {
                view.getLayoutParams().width = 0;
                return;
            }
        }
        if (h02 instanceof g ? true : h02 instanceof d) {
            boolean m10 = m(a10);
            view.getLayoutParams().width = measuredWidth;
            view.getLayoutParams().height = (z10 && m10) ? recyclerView.getMeasuredHeight() : recyclerView.getMeasuredHeight() / this.f41746b;
        } else if (h02 instanceof c) {
            int i10 = measuredWidth * (this.f41747c / 2);
            view.getLayoutParams().height = recyclerView.getMeasuredHeight();
            view.getLayoutParams().width = i10;
        }
    }

    public final wn.k<List<ud.a>, Integer> l(List<? extends List<? extends ud.a>> list, int i10) {
        int i11 = 0;
        for (List<? extends ud.a> list2 : list) {
            int size = list2.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (i11 == i10) {
                    return q.a(list2, Integer.valueOf(i12));
                }
                i11++;
            }
        }
        return null;
    }

    public final boolean m(List<? extends ud.a> list) {
        Iterator<T> it = list.iterator();
        int i10 = 0;
        while (true) {
            int i11 = 1;
            if (!it.hasNext()) {
                break;
            }
            ud.a aVar = (ud.a) it.next();
            if (aVar instanceof y0) {
                i11 = this.f41747c / 2;
            } else if (!(aVar instanceof b1) && !(aVar instanceof a1)) {
                i11 = 0;
            }
            i10 += i11;
        }
        return i10 <= (this.f41746b * this.f41747c) / 2;
    }
}
