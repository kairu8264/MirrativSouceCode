package nb;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.x;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import java.util.ArrayList;
import java.util.Iterator;
import jo.p;
import xn.i0;

/* loaded from: classes2.dex */
public final class j extends c0 {

    /* renamed from: h  reason: collision with root package name */
    public static final a f41768h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f41769i = 8;

    /* renamed from: d  reason: collision with root package name */
    public final int f41770d;

    /* renamed from: e  reason: collision with root package name */
    public int f41771e = -1;

    /* renamed from: f  reason: collision with root package name */
    public x f41772f;

    /* renamed from: g  reason: collision with root package name */
    public RecyclerView f41773g;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends r {

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.p f41775r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RecyclerView.p pVar, Context context) {
            super(context);
            this.f41775r = pVar;
        }

        @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.a0
        public void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            p.h(view, "targetView");
            p.h(b0Var, "state");
            p.h(aVar, ActionLogBase.ACTION);
            int[] c10 = j.this.c(this.f41775r, view);
            int i10 = c10[0];
            int i11 = c10[1];
            int w10 = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (w10 > 0) {
                aVar.d(i10, i11, w10, this.f16327j);
            }
        }

        @Override // androidx.recyclerview.widget.r
        public float v(DisplayMetrics displayMetrics) {
            p.h(displayMetrics, "displayMetrics");
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.r
        public int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    public j(int i10) {
        this.f41770d = i10;
    }

    @Override // androidx.recyclerview.widget.c0
    public void b(RecyclerView recyclerView) {
        super.b(recyclerView);
        this.f41773g = recyclerView;
    }

    @Override // androidx.recyclerview.widget.c0
    public int[] c(RecyclerView.p pVar, View view) {
        p.h(pVar, "layoutManager");
        p.h(view, "targetView");
        int[] iArr = {0, 0};
        if (!pVar.w()) {
            if (this.f41772f == null) {
                x a10 = x.a(pVar);
                p.g(a10, "createHorizontalHelper(layoutManager)");
                this.f41772f = a10;
            }
            x xVar = this.f41772f;
            x xVar2 = null;
            if (xVar == null) {
                p.v("orientationHelper");
                xVar = null;
            }
            int g10 = xVar.g(view);
            x xVar3 = this.f41772f;
            if (xVar3 == null) {
                p.v("orientationHelper");
            } else {
                xVar2 = xVar3;
            }
            iArr[0] = g10 - xVar2.m();
            return iArr;
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.recyclerview.widget.c0
    public RecyclerView.a0 e(RecyclerView.p pVar) {
        RecyclerView recyclerView;
        p.h(pVar, "layoutManager");
        if ((pVar instanceof RecyclerView.a0.b) && (recyclerView = this.f41773g) != null) {
            p.e(recyclerView);
            return new b(pVar, recyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.c0
    public View h(RecyclerView.p pVar) {
        Object next;
        if (pVar == null) {
            return null;
        }
        if (!pVar.w()) {
            if (this.f41772f == null) {
                x a10 = x.a(pVar);
                p.g(a10, "createHorizontalHelper(layoutManager)");
                this.f41772f = a10;
            }
            x xVar = this.f41772f;
            if (xVar == null) {
                p.v("orientationHelper");
                xVar = null;
            }
            int m10 = xVar.m();
            po.i t10 = po.n.t(0, pVar.U());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = t10.iterator();
            while (it.hasNext()) {
                View T = pVar.T(((i0) it).b());
                if (T != null) {
                    arrayList.add(T);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (pVar.o0((View) obj) % this.f41770d == 0) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    float f10 = m10;
                    float abs = Math.abs(((View) next).getX() - f10);
                    do {
                        Object next2 = it2.next();
                        float abs2 = Math.abs(((View) next2).getX() - f10);
                        if (Float.compare(abs, abs2) > 0) {
                            next = next2;
                            abs = abs2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            View view = (View) next;
            if (view != null) {
                this.f41771e = pVar.o0(view);
                return view;
            }
            return null;
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.recyclerview.widget.c0
    public int i(RecyclerView.p pVar, int i10, int i11) {
        p.h(pVar, "layoutManager");
        boolean z10 = true;
        if (!pVar.v() ? i11 <= 0 : i10 <= 0) {
            z10 = false;
        }
        if (z10) {
            return this.f41771e + this.f41770d;
        }
        return this.f41771e - this.f41770d;
    }

    public final void m(int i10) {
        this.f41771e = i10;
    }
}
