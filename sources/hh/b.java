package hh;

import ai.uj0;
import ai.yv;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import rg.c;
import rg.g;

/* loaded from: classes3.dex */
public final class b extends ViewGroup {
    @NotOnlyInitialized

    /* renamed from: w  reason: collision with root package name */
    public final yv f35630w;

    @RecentlyNonNull
    public c getAdListener() {
        return this.f35630w.e();
    }

    @RecentlyNullable
    public g getAdSize() {
        return this.f35630w.f();
    }

    @RecentlyNonNull
    public String getAdUnitId() {
        return this.f35630w.h();
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
        this.f35630w.m(cVar);
    }

    public void setAdSize(@RecentlyNonNull g gVar) {
        this.f35630w.o(gVar);
    }

    public void setAdUnitId(@RecentlyNonNull String str) {
        this.f35630w.q(str);
    }
}
