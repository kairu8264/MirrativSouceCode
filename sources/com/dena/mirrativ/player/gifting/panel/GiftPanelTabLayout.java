package com.dena.mirrativ.player.gifting.panel;

import ae.wb;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.dena.mirrativ.player.gifting.panel.GiftPanelTabLayout;
import com.google.android.material.tabs.TabLayout;
import hb.x1;
import io.l;
import io.q;
import java.util.List;
import jf.s;
import jo.h;
import jo.p;
import nb.m;
import nb.n;
import wn.v;

/* loaded from: classes2.dex */
public final class GiftPanelTabLayout extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener {
    public static final a C = new a(null);
    public static final int D = 8;
    public q<? super int[], ? super Integer, ? super Integer, v> A;
    public l<? super TabLayout, v> B;

    /* renamed from: w  reason: collision with root package name */
    public final wb f22679w;

    /* renamed from: x  reason: collision with root package name */
    public List<s> f22680x;

    /* renamed from: y  reason: collision with root package name */
    public l<? super s, v> f22681y;

    /* renamed from: z  reason: collision with root package name */
    public l<? super Integer, v> f22682z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements q<int[], Integer, Integer, v> {
        public b() {
            super(3);
        }

        public final void a(int[] iArr, int i10, int i11) {
            p.h(iArr, "position");
            q<int[], Integer, Integer, v> onPanelTabViewLayout = GiftPanelTabLayout.this.getOnPanelTabViewLayout();
            if (onPanelTabViewLayout != null) {
                onPanelTabViewLayout.s0(iArr, Integer.valueOf(i10), Integer.valueOf(i11));
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(int[] iArr, Integer num, Integer num2) {
            a(iArr, num.intValue(), num2.intValue());
            return v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftPanelTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        wb wbVar = (wb) f.e(LayoutInflater.from(getContext()), x1.f35036w, this, true);
        this.f22679w = wbVar;
        wbVar.B.getViewTreeObserver().addOnScrollChangedListener(this);
        wbVar.B.d(new m(this));
    }

    public static final void f(TabLayout.g gVar, View view) {
        p.h(gVar, "$tab");
        gVar.s("action_tab_click");
    }

    public final void c(int i10) {
        TabLayout.g x10 = this.f22679w.B.x(i10);
        if (x10 == null) {
            return;
        }
        this.f22679w.B.F(x10);
    }

    public final s d() {
        int tabCount = this.f22679w.B.getTabCount();
        if (tabCount < 0) {
            return null;
        }
        s sVar = null;
        int i10 = 0;
        while (true) {
            TabLayout.g x10 = this.f22679w.B.x(i10);
            boolean z10 = true;
            if (x10 == null || !x10.k()) {
                z10 = false;
            }
            if (z10) {
                List<s> list = this.f22680x;
                sVar = list != null ? list.get(i10) : null;
            }
            if (i10 == tabCount) {
                return sVar;
            }
            i10++;
        }
    }

    public final void e() {
        n nVar;
        boolean k10;
        List<s> list = this.f22680x;
        if (list == null) {
            return;
        }
        if (this.f22679w.B.getTabCount() != list.size()) {
            this.f22679w.B.C();
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                xn.s.t();
            }
            s sVar = (s) obj;
            final TabLayout.g x10 = this.f22679w.B.x(i10);
            if (x10 != null) {
                View e10 = x10.e();
                nVar = e10 instanceof n ? (n) e10 : null;
                if (nVar != null) {
                    nVar.setGiftPanel(sVar);
                }
                k10 = this.f22679w.B.getSelectedTabPosition() == i10;
            } else {
                n.a aVar = n.f41781z;
                TabLayout tabLayout = this.f22679w.B;
                p.g(tabLayout, "binding.tabView");
                x10 = aVar.a(tabLayout, sVar);
                x10.f27729i.setOnClickListener(new View.OnClickListener() { // from class: nb.l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GiftPanelTabLayout.f(TabLayout.g.this, view);
                    }
                });
                View e11 = x10.e();
                nVar = e11 instanceof n ? (n) e11 : null;
                if (nVar != null) {
                    nVar.setOnPanelTabViewLayout(new b());
                }
                this.f22679w.B.e(x10);
                k10 = sVar.k();
            }
            p.g(x10, "binding.tabView.getTabAt…l.isDefault\n            }");
            if (k10 && !x10.k()) {
                this.f22679w.B.F(x10);
                l<? super s, v> lVar = this.f22681y;
                if (lVar != null) {
                    lVar.invoke(sVar);
                }
                l<? super Integer, v> lVar2 = this.f22682z;
                if (lVar2 != null) {
                    lVar2.invoke(Integer.valueOf(i10));
                }
            }
            i10 = i11;
        }
    }

    public final l<Integer, v> getOnPanelClickedListener() {
        return this.f22682z;
    }

    public final l<s, v> getOnPanelSelectedListener() {
        return this.f22681y;
    }

    public final l<TabLayout, v> getOnPanelTabScrollChange() {
        return this.B;
    }

    public final q<int[], Integer, Integer, v> getOnPanelTabViewLayout() {
        return this.A;
    }

    public final List<s> getPanels() {
        return this.f22680x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22679w.B.getViewTreeObserver().removeOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        l<? super TabLayout, v> lVar = this.B;
        if (lVar != null) {
            TabLayout tabLayout = this.f22679w.B;
            p.g(tabLayout, "binding.tabView");
            lVar.invoke(tabLayout);
        }
    }

    public final void setOnPanelClickedListener(l<? super Integer, v> lVar) {
        this.f22682z = lVar;
    }

    public final void setOnPanelSelectedListener(l<? super s, v> lVar) {
        this.f22681y = lVar;
    }

    public final void setOnPanelTabScrollChange(l<? super TabLayout, v> lVar) {
        this.B = lVar;
    }

    public final void setOnPanelTabViewLayout(q<? super int[], ? super Integer, ? super Integer, v> qVar) {
        this.A = qVar;
    }

    public final void setPanels(List<s> list) {
        this.f22680x = list;
        e();
    }
}
