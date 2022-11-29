package rg;

import ai.or;
import ai.uj0;
import ai.yv;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes3.dex */
public abstract class k extends ViewGroup {
    @NotOnlyInitialized

    /* renamed from: w  reason: collision with root package name */
    public final yv f51371w;

    public k(@RecentlyNonNull Context context, int i10) {
        super(context);
        this.f51371w = new yv(this, i10);
    }

    public void a() {
        this.f51371w.d();
    }

    public void b(@RecentlyNonNull f fVar) {
        this.f51371w.j(fVar.a());
    }

    public void c() {
        this.f51371w.k();
    }

    public void d() {
        this.f51371w.l();
    }

    @RecentlyNonNull
    public c getAdListener() {
        return this.f51371w.e();
    }

    @RecentlyNullable
    public g getAdSize() {
        return this.f51371w.f();
    }

    @RecentlyNonNull
    public String getAdUnitId() {
        return this.f51371w.h();
    }

    @RecentlyNullable
    public p getOnPaidEventListener() {
        return this.f51371w.v();
    }

    @RecentlyNullable
    public t getResponseInfo() {
        return this.f51371w.t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i14 = ((i12 - i10) - measuredWidth) / 2;
        int i15 = ((i13 - i11) - measuredHeight) / 2;
        childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        g gVar;
        int i12;
        int i13 = 0;
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i10, i11);
            i13 = childAt.getMeasuredWidth();
            i12 = childAt.getMeasuredHeight();
        } else {
            try {
                gVar = getAdSize();
            } catch (NullPointerException e10) {
                uj0.d("Unable to retrieve ad size.", e10);
                gVar = null;
            }
            if (gVar != null) {
                Context context = getContext();
                int d10 = gVar.d(context);
                i12 = gVar.b(context);
                i13 = d10;
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
    }

    public void setAdListener(@RecentlyNonNull c cVar) {
        this.f51371w.m(cVar);
        if (cVar == null) {
            this.f51371w.n(null);
            return;
        }
        if (cVar instanceof or) {
            this.f51371w.n((or) cVar);
        }
        if (cVar instanceof sg.c) {
            this.f51371w.r((sg.c) cVar);
        }
    }

    public void setAdSize(@RecentlyNonNull g gVar) {
        this.f51371w.o(gVar);
    }

    public void setAdUnitId(@RecentlyNonNull String str) {
        this.f51371w.q(str);
    }

    public void setOnPaidEventListener(p pVar) {
        this.f51371w.u(pVar);
    }
}
