package com.dena.mirrorman.feature.event;

import ae.uj;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jo.h;
import jo.p;
import nd.b1;
import rd.f0;
import ud.n1;
import ud.o1;
import xn.s;

/* loaded from: classes2.dex */
public final class LandingPageDescriptionListView extends ConstraintLayout {
    public final uj U;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LandingPageDescriptionListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ LandingPageDescriptionListView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void w(o1 o1Var) {
        p.h(o1Var, "listBindModel");
        this.U.T(o1Var);
        RecyclerView.h adapter = this.U.C.getAdapter();
        f0 f0Var = adapter instanceof f0 ? (f0) adapter : null;
        if (f0Var == null) {
            return;
        }
        List<n1> f10 = o1Var.c().f();
        if (f10 == null) {
            f10 = s.k();
        }
        f0Var.b(f10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandingPageDescriptionListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        uj ujVar = (uj) f.e(LayoutInflater.from(context), b1.view_landing_page_description_list, this, true);
        this.U = ujVar;
        ujVar.C.setLayoutManager(new LinearLayoutManager(context) { // from class: com.dena.mirrorman.feature.event.LandingPageDescriptionListView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return false;
            }
        });
        ujVar.C.setAdapter(new f0());
    }
}
