package yd;

import ae.cn;
import android.view.View;
import android.widget.RadioButton;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.SwitchableEventBannerIconView;

/* loaded from: classes2.dex */
public final class q1 extends RecyclerView.u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwitchableEventBannerIconView f61783a;

    public q1(SwitchableEventBannerIconView switchableEventBannerIconView) {
        this.f61783a = switchableEventBannerIconView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(RecyclerView recyclerView, int i10) {
        cn cnVar;
        cn cnVar2;
        s1 s1Var;
        jo.p.h(recyclerView, "recyclerView");
        if (i10 == 0) {
            androidx.recyclerview.widget.s snapHelper = this.f61783a.getSnapHelper();
            cnVar = this.f61783a.f25613w;
            View h10 = snapHelper.h(cnVar.C.getLayoutManager());
            if (h10 == null) {
                return;
            }
            cnVar2 = this.f61783a.f25613w;
            int g02 = cnVar2.C.g0(h10);
            s1Var = this.f61783a.f25615y;
            if (s1Var != null) {
                s1Var.b(g02);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void b(RecyclerView recyclerView, int i10, int i11) {
        cn cnVar;
        cn cnVar2;
        cn cnVar3;
        jo.p.h(recyclerView, "recyclerView");
        super.b(recyclerView, i10, i11);
        androidx.recyclerview.widget.s snapHelper = this.f61783a.getSnapHelper();
        cnVar = this.f61783a.f25613w;
        View h10 = snapHelper.h(cnVar.C.getLayoutManager());
        if (h10 == null) {
            return;
        }
        cnVar2 = this.f61783a.f25613w;
        int g02 = cnVar2.C.g0(h10);
        cnVar3 = this.f61783a.f25613w;
        View childAt = cnVar3.B.getChildAt(g02);
        RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
        if (radioButton == null) {
            return;
        }
        radioButton.setChecked(true);
    }
}
