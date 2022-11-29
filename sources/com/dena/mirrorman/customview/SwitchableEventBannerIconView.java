package com.dena.mirrorman.customview;

import ae.cn;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.databinding.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.t;
import c3.a;
import com.dena.mirrorman.customview.SwitchableEventBannerIconView;
import de.n;
import java.util.Iterator;
import java.util.List;
import jo.p;
import nd.b1;
import nd.y0;
import p001if.c;
import wn.k;
import yd.o1;
import yd.p1;
import yd.q1;
import yd.r1;
import yd.s1;

/* loaded from: classes2.dex */
public final class SwitchableEventBannerIconView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final cn f25613w;

    /* renamed from: x  reason: collision with root package name */
    public List<k<String, Boolean>> f25614x;

    /* renamed from: y  reason: collision with root package name */
    public s1 f25615y;

    /* renamed from: z  reason: collision with root package name */
    public final s f25616z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchableEventBannerIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        cn cnVar = (cn) f.e(LayoutInflater.from(getContext()), b1.view_switchable_event_banner_icon, this, true);
        this.f25613w = cnVar;
        this.f25614x = xn.s.k();
        r1 r1Var = new r1();
        this.f25616z = r1Var;
        r1Var.b(cnVar.C);
        cnVar.C.setAdapter(new o1(this, new p1()));
        cnVar.C.g(new c(n.b(this, 4), n.b(this, 2), 0, n.b(this, 2), 0, 0));
        cnVar.C.k(new q1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setEventBannerImageUrls$lambda-2  reason: not valid java name */
    public static final void m18setEventBannerImageUrls$lambda2(SwitchableEventBannerIconView switchableEventBannerIconView) {
        p.h(switchableEventBannerIconView, "this$0");
        if (switchableEventBannerIconView.f25613w.B.getChildCount() > 0) {
            View childAt = switchableEventBannerIconView.f25613w.B.getChildAt(0);
            RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
            if (radioButton != null) {
                radioButton.setChecked(true);
            }
        }
        RecyclerView.p layoutManager = switchableEventBannerIconView.f25613w.C.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.J2(0, 0);
        }
    }

    public final void e() {
        Object obj;
        View h10;
        Iterator<T> it = this.f25614x.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Boolean) ((k) obj).d()).booleanValue()) {
                break;
            }
        }
        if (obj == null && (h10 = this.f25616z.h(this.f25613w.C.getLayoutManager())) != null) {
            int g02 = this.f25613w.C.g0(h10);
            if (this.f25613w.C.getAdapter() == null) {
                return;
            }
            int i10 = g02 + 1;
            if (i10 < this.f25614x.size()) {
                this.f25613w.C.x1(i10);
            } else {
                this.f25613w.C.x1(0);
            }
        }
    }

    public final s getSnapHelper() {
        return this.f25616z;
    }

    public final void setEventBannerImageUrls(List<k<String, Boolean>> list) {
        p.h(list, "imageUrls");
        if (list.isEmpty()) {
            this.f25613w.u().setVisibility(8);
            return;
        }
        this.f25613w.u().setVisibility(0);
        this.f25614x = list;
        if (this.f25613w.B.getChildCount() != list.size()) {
            this.f25613w.B.removeAllViews();
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                RadioButton radioButton = new RadioButton(getContext());
                radioButton.setButtonDrawable(a.f(radioButton.getContext(), y0.E0));
                i10++;
                radioButton.setId(i10);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(n.b(this, 4), 0, n.b(this, 4), 0);
                radioButton.setLayoutParams(layoutParams);
                this.f25613w.B.addView(radioButton);
            }
        }
        RadioGroup radioGroup = this.f25613w.B;
        radioGroup.setVisibility(radioGroup.getChildCount() != 1 ? 0 : 8);
        RecyclerView.h adapter = this.f25613w.C.getAdapter();
        t tVar = adapter instanceof t ? (t) adapter : null;
        if (tVar != null) {
            tVar.f(list, new Runnable() { // from class: yd.n1
                @Override // java.lang.Runnable
                public final void run() {
                    SwitchableEventBannerIconView.m18setEventBannerImageUrls$lambda2(SwitchableEventBannerIconView.this);
                }
            });
        }
    }

    public final void setOnSingleTapUpListener(s1 s1Var) {
        p.h(s1Var, "listener");
        this.f25615y = s1Var;
    }
}
