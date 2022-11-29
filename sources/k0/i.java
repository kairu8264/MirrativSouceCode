package k0;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import xn.s;
import xn.x;

/* loaded from: classes.dex */
public final class i extends ViewGroup {
    public int A;

    /* renamed from: w  reason: collision with root package name */
    public final int f38327w;

    /* renamed from: x  reason: collision with root package name */
    public final List<l> f38328x;

    /* renamed from: y  reason: collision with root package name */
    public final List<l> f38329y;

    /* renamed from: z  reason: collision with root package name */
    public final j f38330z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        jo.p.h(context, "context");
        this.f38327w = 5;
        ArrayList arrayList = new ArrayList();
        this.f38328x = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f38329y = arrayList2;
        this.f38330z = new j();
        setClipChildren(false);
        l lVar = new l(context);
        addView(lVar);
        arrayList.add(lVar);
        arrayList2.add(lVar);
        this.A = 1;
        setTag(x0.h.J, Boolean.TRUE);
    }

    public final void a(a aVar) {
        jo.p.h(aVar, "<this>");
        aVar.n();
        l b10 = this.f38330z.b(aVar);
        if (b10 != null) {
            b10.d();
            this.f38330z.c(aVar);
            this.f38329y.add(b10);
        }
    }

    public final l b(a aVar) {
        jo.p.h(aVar, "<this>");
        l b10 = this.f38330z.b(aVar);
        if (b10 != null) {
            return b10;
        }
        l lVar = (l) x.E(this.f38329y);
        if (lVar == null) {
            if (this.A > s.l(this.f38328x)) {
                Context context = getContext();
                jo.p.g(context, "context");
                lVar = new l(context);
                addView(lVar);
                this.f38328x.add(lVar);
            } else {
                lVar = this.f38328x.get(this.A);
                a a10 = this.f38330z.a(lVar);
                if (a10 != null) {
                    a10.n();
                    this.f38330z.c(a10);
                    lVar.d();
                }
            }
            int i10 = this.A;
            if (i10 < this.f38327w - 1) {
                this.A = i10 + 1;
            } else {
                this.A = 0;
            }
        }
        this.f38330z.d(aVar, lVar);
        return lVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }
}
