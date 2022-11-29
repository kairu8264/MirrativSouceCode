package com.dena.mirrativ.player.gifting.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.player.gifting.panel.GiftPanelView;
import com.google.android.material.tabs.TabLayout;
import de.n;
import hb.u1;
import hb.v1;
import hb.x1;
import io.l;
import io.p;
import java.util.List;
import jf.q;
import jf.s;
import kb.j0;
import nb.h;
import nb.i;
import nb.j;
import ud.y0;
import wn.v;
import xn.r;
import xn.t;
import yd.g1;

/* loaded from: classes2.dex */
public final class GiftPanelView extends FrameLayout {
    public static final a L = new a(null);
    public static final int M = 8;
    public int A;
    public List<? extends List<? extends ud.a>> B;
    public l<? super y0, v> C;
    public p<? super PlayerGiftPagerCell, ? super q, v> D;
    public l<? super q, v> E;
    public l<? super q, v> F;
    public io.a<v> G;
    public l<? super s, v> H;
    public l<? super String, v> I;
    public AppCompatImageView J;
    public int K;

    /* renamed from: w  reason: collision with root package name */
    public final j0 f22684w;

    /* renamed from: x  reason: collision with root package name */
    public final GridLayoutManager f22685x;

    /* renamed from: y  reason: collision with root package name */
    public final h f22686y;

    /* renamed from: z  reason: collision with root package name */
    public final j f22687z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.j {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            s d10 = GiftPanelView.this.f22684w.E.d();
            if (d10 != null) {
                GiftPanelView giftPanelView = GiftPanelView.this;
                if (ve.a.Companion.a(d10.j()) == ve.a.HISTORY) {
                    giftPanelView.f22685x.G1(0);
                    giftPanelView.f22687z.m(0);
                }
            }
            GiftPanelView.this.f22686y.unregisterAdapterDataObserver(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.u {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            int i22;
            int i23;
            jo.p.h(recyclerView, "recyclerView");
            if (i10 != 0 || GiftPanelView.this.A == (i23 = (i22 = GiftPanelView.this.f22685x.i2()) / (GiftPanelView.this.getGiftPanelRowItemCount() * GiftPanelView.this.getGiftPanelColumnItemCount()))) {
                return;
            }
            GiftPanelView.this.o(i23);
            List list = GiftPanelView.this.B;
            if (list == null) {
                return;
            }
            GiftPanelView giftPanelView = GiftPanelView.this;
            int i11 = 0;
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i11 + 1;
                if (i11 < 0) {
                    xn.s.t();
                }
                List list2 = (List) obj;
                boolean z10 = true;
                if ((i12 > i22 || i22 > (list2.size() + i12) - 1) ? false : false) {
                    giftPanelView.f22684w.E.c(i11);
                    giftPanelView.f22685x.J2(i22, 0);
                    giftPanelView.f22687z.m(i22);
                }
                i12 += list2.size();
                i11 = i13;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements l<TabLayout, v> {
        public d() {
            super(1);
        }

        public final void a(TabLayout tabLayout) {
            jo.p.h(tabLayout, "tabLayout");
            AppCompatImageView appCompatImageView = GiftPanelView.this.J;
            if (appCompatImageView != null) {
                GiftPanelView giftPanelView = GiftPanelView.this;
                androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                View u10 = giftPanelView.f22684w.u();
                ConstraintLayout constraintLayout = u10 instanceof ConstraintLayout ? (ConstraintLayout) u10 : null;
                if (constraintLayout != null) {
                    cVar.g(constraintLayout);
                    cVar.j(appCompatImageView.getId(), 6, 0, 6, giftPanelView.K - tabLayout.getScrollX());
                    cVar.c(constraintLayout);
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(TabLayout tabLayout) {
            a(tabLayout);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.q<int[], Integer, Integer, v> {
        public e() {
            super(3);
        }

        public final void a(int[] iArr, int i10, int i11) {
            jo.p.h(iArr, "position");
            if (GiftPanelView.this.J == null) {
                AppCompatImageView appCompatImageView = new AppCompatImageView(GiftPanelView.this.getContext());
                appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(n.b(GiftPanelView.this, 40), n.b(GiftPanelView.this, 30)));
                appCompatImageView.setId(View.generateViewId());
                td.a.x(appCompatImageView, Integer.valueOf(v1.player_ranking_focused_event_feature));
                androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                View u10 = GiftPanelView.this.f22684w.u();
                ConstraintLayout constraintLayout = u10 instanceof ConstraintLayout ? (ConstraintLayout) u10 : null;
                if (constraintLayout != null) {
                    GiftPanelView giftPanelView = GiftPanelView.this;
                    constraintLayout.addView(appCompatImageView);
                    int b10 = ((iArr[0] + i10) - n.b(constraintLayout, 40)) + n.b(constraintLayout, 10);
                    giftPanelView.K = b10;
                    cVar.g(constraintLayout);
                    cVar.j(appCompatImageView.getId(), 6, 0, 6, b10);
                    cVar.j(appCompatImageView.getId(), 3, giftPanelView.f22684w.D.getId(), 3, n.b(constraintLayout, 4));
                    cVar.c(constraintLayout);
                }
                GiftPanelView.this.J = appCompatImageView;
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(int[] iArr, Integer num, Integer num2) {
            a(iArr, num.intValue(), num2.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements l<s, v> {

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements l<View, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ GiftPanelView f22693w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ s f22694x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GiftPanelView giftPanelView, s sVar) {
                super(1);
                this.f22693w = giftPanelView;
                this.f22694x = sVar;
            }

            public final void a(View view) {
                jo.p.h(view, "it");
                l<String, v> onLiveGameGiftHelpClickedListener = this.f22693w.getOnLiveGameGiftHelpClickedListener();
                if (onLiveGameGiftHelpClickedListener != null) {
                    onLiveGameGiftHelpClickedListener.invoke(this.f22694x.g());
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(View view) {
                a(view);
                return v.f59242a;
            }
        }

        public f() {
            super(1);
        }

        public final void a(s sVar) {
            jo.p.h(sVar, "giftPanel");
            AppCompatImageView appCompatImageView = GiftPanelView.this.f22684w.C;
            jo.p.g(appCompatImageView, "binding.liveGameHelpImageView");
            appCompatImageView.setVisibility(sVar.o() ? 0 : 8);
            AppCompatImageView appCompatImageView2 = GiftPanelView.this.f22684w.C;
            jo.p.g(appCompatImageView2, "binding.liveGameHelpImageView");
            g1.a(appCompatImageView2, new a(GiftPanelView.this, sVar));
            l<s, v> onTabSelectedListener = GiftPanelView.this.getOnTabSelectedListener();
            if (onTabSelectedListener != null) {
                onTabSelectedListener.invoke(sVar);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(s sVar) {
            a(sVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements l<Integer, v> {
        public g() {
            super(1);
        }

        public final void a(int i10) {
            List list = GiftPanelView.this.B;
            if (list != null) {
                GiftPanelView giftPanelView = GiftPanelView.this;
                int i11 = 0;
                int i12 = 0;
                for (Object obj : list) {
                    int i13 = i11 + 1;
                    if (i11 < 0) {
                        xn.s.t();
                    }
                    List list2 = (List) obj;
                    if (i11 == i10) {
                        giftPanelView.f22685x.J2(i12, 0);
                        giftPanelView.f22687z.m(i12);
                        giftPanelView.o(i12 / (giftPanelView.getGiftPanelRowItemCount() * giftPanelView.getGiftPanelColumnItemCount()));
                    } else {
                        i12 += list2.size();
                    }
                    i11 = i13;
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        jo.p.h(context, "context");
        jo.p.h(attributeSet, "attrs");
        j0 j0Var = (j0) androidx.databinding.f.e(LayoutInflater.from(getContext()), x1.view_gift_panel, this, true);
        this.f22684w = j0Var;
        this.f22685x = new GridLayoutManager(j0Var.u().getContext(), getGiftPanelRowItemCount(), 0, false);
        this.f22686y = new h();
        this.f22687z = new j(getGiftPanelRowItemCount() * getGiftPanelColumnItemCount());
        s();
        r();
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getGiftPanelColumnItemCount() {
        int i10 = getResources().getConfiguration().orientation;
        return (i10 == 1 || i10 != 2) ? 4 : 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getGiftPanelRowItemCount() {
        int i10 = getResources().getConfiguration().orientation;
        return (i10 == 1 || i10 != 2) ? 2 : 1;
    }

    public static final void q(GiftPanelView giftPanelView, List list) {
        jo.p.h(giftPanelView, "this$0");
        jo.p.h(list, "$panels");
        giftPanelView.f22684w.E.setPanels(list);
    }

    public final l<y0, v> getOnBannerClickedListener() {
        return this.C;
    }

    public final p<PlayerGiftPagerCell, q, v> getOnCellClickedListener() {
        return this.D;
    }

    public final l<q, v> getOnGachaTicketClickedListener() {
        return this.E;
    }

    public final l<String, v> getOnLiveGameGiftHelpClickedListener() {
        return this.I;
    }

    public final io.a<v> getOnPageChangedListener() {
        return this.G;
    }

    public final l<q, v> getOnProgressAnimationEndListener() {
        return this.F;
    }

    public final l<s, v> getOnTabSelectedListener() {
        return this.H;
    }

    public final void o(int i10) {
        this.f22684w.D.setCurrentPosition(i10);
        io.a<v> aVar = this.G;
        if (aVar != null) {
            aVar.invoke();
        }
        p();
        this.A = i10;
    }

    public final void p() {
        h hVar = this.f22686y;
        hVar.notifyItemRangeChanged(0, hVar.a().size(), r.d(1));
    }

    public final void r() {
        this.f22684w.D.setIndicatorResource(v1.indicator_gift_panel);
        this.f22684w.D.setMarginHorizontal(getResources().getDimensionPixelOffset(u1.profile_pager_indicator_margin));
    }

    public final void s() {
        this.f22684w.B.setLayoutManager(this.f22685x);
        this.f22684w.B.setAdapter(this.f22686y);
        this.f22684w.B.setItemAnimator(null);
        this.f22684w.B.t();
        this.f22684w.B.k(new c());
        this.f22687z.b(this.f22684w.B);
    }

    public final void setGiftPanels(final List<s> list) {
        jo.p.h(list, "panels");
        List<List<ud.a>> a10 = new i(getGiftPanelRowItemCount(), getGiftPanelColumnItemCount()).a(list);
        this.B = a10;
        List v10 = t.v(a10);
        int size = v10.size() / (getGiftPanelRowItemCount() * getGiftPanelColumnItemCount());
        if (this.f22684w.B.getItemDecorationCount() > 0) {
            this.f22684w.B.d1(0);
        }
        this.f22684w.B.g(new nb.e(a10, getGiftPanelRowItemCount(), getGiftPanelColumnItemCount()));
        if (this.f22684w.D.getCount() != size) {
            this.f22684w.D.setCount(size);
        }
        this.f22686y.f(v10, new Runnable() { // from class: nb.o
            @Override // java.lang.Runnable
            public final void run() {
                GiftPanelView.q(GiftPanelView.this, list);
            }
        });
        this.f22686y.registerAdapterDataObserver(new b());
    }

    public final void setOnBannerClickedListener(l<? super y0, v> lVar) {
        this.C = lVar;
        this.f22686y.g(lVar);
    }

    public final void setOnCellClickedListener(p<? super PlayerGiftPagerCell, ? super q, v> pVar) {
        this.D = pVar;
        this.f22686y.h(pVar);
    }

    public final void setOnGachaTicketClickedListener(l<? super q, v> lVar) {
        this.E = lVar;
        this.f22686y.i(lVar);
    }

    public final void setOnLiveGameGiftHelpClickedListener(l<? super String, v> lVar) {
        this.I = lVar;
    }

    public final void setOnPageChangedListener(io.a<v> aVar) {
        this.G = aVar;
    }

    public final void setOnProgressAnimationEndListener(l<? super q, v> lVar) {
        this.F = lVar;
        this.f22686y.j(lVar);
    }

    public final void setOnTabSelectedListener(l<? super s, v> lVar) {
        this.H = lVar;
    }

    public final void t() {
        this.f22684w.E.setOnPanelTabScrollChange(new d());
        this.f22684w.E.setOnPanelTabViewLayout(new e());
        this.f22684w.E.setOnPanelSelectedListener(new f());
        this.f22684w.E.setOnPanelClickedListener(new g());
    }
}
