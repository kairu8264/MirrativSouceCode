package com.dena.mirrativ.streaming.emokara;

import ac.x2;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.t0;
import androidx.navigation.w;
import bc.a2;
import bc.b2;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.streaming.emokara.EmokaraSongChoiceFragment;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.KaraokeLog;
import com.dena.mirrorman.widget.PagerSlidingTab;
import com.dena.mirrorman.widget.SafeViewPager;
import com.google.android.material.appbar.AppBarLayout;
import hf.d0;
import io.l;
import jo.f0;
import jo.p;
import jo.q;
import jo.s;
import of.t;
import qo.h;
import wn.f;
import wn.g;
import wn.i;
import wn.v;
import xb.m;
import xb.n;

/* loaded from: classes2.dex */
public final class EmokaraSongChoiceFragment extends Fragment {
    public static final /* synthetic */ h<Object>[] B0 = {f0.d(new s(EmokaraSongChoiceFragment.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/FragmentEmokaraSongChoiceBinding;", 0))};
    public static final int C0 = 8;

    /* renamed from: z0  reason: collision with root package name */
    public bc.s f23025z0;

    /* renamed from: x0  reason: collision with root package name */
    public final AutoClearedValue f23023x0 = nd.a.a(this);

    /* renamed from: y0  reason: collision with root package name */
    public final f f23024y0 = g.a(d.f23031w);
    public final f A0 = g.b(i.SYNCHRONIZED, new c(this, null, null));

    /* loaded from: classes2.dex */
    public static final class a extends q implements l<Boolean, v> {
        public a() {
            super(1);
        }

        public final void a(boolean z10) {
            if (z10) {
                EmokaraSongChoiceFragment.this.D3();
            } else {
                EmokaraSongChoiceFragment.this.x3();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Boolean bool) {
            a(bool.booleanValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements PagerSlidingTab.d {
        public b() {
        }

        @Override // com.dena.mirrorman.widget.PagerSlidingTab.d
        public void a(int i10) {
            Puree.d(KaraokeLog.Companion.createSelectSongListTabLog(EmokaraSongChoiceFragment.this.v3().c(), String.valueOf(i10 + 1)));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23028w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23029x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23030y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23028w = componentCallbacks;
            this.f23029x = aVar;
            this.f23030y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23028w;
            return gq.a.a(componentCallbacks).c(f0.b(d0.class), this.f23029x, this.f23030y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<rf.b> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f23031w = new d();

        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final rf.b invoke() {
            return (rf.b) new t0.d().a(rf.b.class);
        }
    }

    public static final void A3(EmokaraSongChoiceFragment emokaraSongChoiceFragment, View view) {
        p.h(emokaraSongChoiceFragment, "this$0");
        w.b(emokaraSongChoiceFragment.Q2()).r(a2.f17255a.d());
    }

    public static final void B3(EmokaraSongChoiceFragment emokaraSongChoiceFragment, AppBarLayout appBarLayout, int i10) {
        p.h(emokaraSongChoiceFragment, "this$0");
        float abs = Math.abs(i10 / appBarLayout.getTotalScrollRange());
        emokaraSongChoiceFragment.u3().I.setAlpha(1 - abs);
        emokaraSongChoiceFragment.u3().J.setAlpha(abs);
    }

    public static final void E3(EmokaraSongChoiceFragment emokaraSongChoiceFragment) {
        p.h(emokaraSongChoiceFragment, "this$0");
        emokaraSongChoiceFragment.u3().L.setVisibility(0);
    }

    public static final void t3(EmokaraSongChoiceFragment emokaraSongChoiceFragment, Boolean bool) {
        v vVar;
        p.h(emokaraSongChoiceFragment, "this$0");
        if (bool != null) {
            if (bool.booleanValue()) {
                emokaraSongChoiceFragment.D3();
            } else {
                emokaraSongChoiceFragment.x3();
            }
            vVar = v.f59242a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            emokaraSongChoiceFragment.x3();
        }
    }

    public static final void y3(EmokaraSongChoiceFragment emokaraSongChoiceFragment) {
        p.h(emokaraSongChoiceFragment, "this$0");
        emokaraSongChoiceFragment.u3().L.setVisibility(8);
    }

    public static final void z3(EmokaraSongChoiceFragment emokaraSongChoiceFragment, View view) {
        p.h(emokaraSongChoiceFragment, "this$0");
        bc.s sVar = emokaraSongChoiceFragment.f23025z0;
        if (sVar != null) {
            sVar.Q();
        }
    }

    public final void C3(x2 x2Var) {
        this.f23023x0.a(this, B0[0], x2Var);
    }

    public final void D3() {
        androidx.fragment.app.h j02 = j0();
        if (j02 != null) {
            j02.runOnUiThread(new Runnable() { // from class: bc.y1
                @Override // java.lang.Runnable
                public final void run() {
                    EmokaraSongChoiceFragment.E3(EmokaraSongChoiceFragment.this);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        x2 T = x2.T(LayoutInflater.from(q0()), viewGroup, false);
        p.g(T, "inflate(\n            Lay…          false\n        )");
        T.C.setOnClickListener(new View.OnClickListener() { // from class: bc.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmokaraSongChoiceFragment.z3(EmokaraSongChoiceFragment.this, view);
            }
        });
        SafeViewPager safeViewPager = T.P;
        FragmentManager p02 = p0();
        p.g(p02, "childFragmentManager");
        Context N2 = N2();
        p.g(N2, "requireContext()");
        safeViewPager.setAdapter(new b2(p02, N2, new a()));
        PagerSlidingTab pagerSlidingTab = T.N;
        Context context = pagerSlidingTab.getContext();
        p.g(context, "context");
        pagerSlidingTab.setIndicatorHeight(t.b(context, 0));
        pagerSlidingTab.setTextSize(pagerSlidingTab.getResources().getDimensionPixelOffset(m.f59953p));
        pagerSlidingTab.setTextColor(pagerSlidingTab.getResources().getColor(xb.l.f59947s));
        pagerSlidingTab.setAllCaps(false);
        pagerSlidingTab.setTabPaddingLeftRight(pagerSlidingTab.getResources().getDimensionPixelOffset(m.tab_margin_horizontal));
        SafeViewPager safeViewPager2 = T.P;
        p.g(safeViewPager2, "viewPager");
        pagerSlidingTab.setViewPager(safeViewPager2);
        pagerSlidingTab.setOnTabSelectedListener(new b());
        pagerSlidingTab.A(160, 28);
        pagerSlidingTab.setTabBackground(n.btn_rectangle_corner14_red_gradient);
        pagerSlidingTab.z(12, 13, 12, 14);
        T.M.setOnClickListener(new View.OnClickListener() { // from class: bc.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmokaraSongChoiceFragment.A3(EmokaraSongChoiceFragment.this, view);
            }
        });
        T.B.b(new AppBarLayout.e() { // from class: bc.x1
            @Override // com.google.android.material.appbar.AppBarLayout.c
            public final void a(AppBarLayout appBarLayout, int i10) {
                EmokaraSongChoiceFragment.B3(EmokaraSongChoiceFragment.this, appBarLayout, i10);
            }
        });
        C3(T);
        s3();
        View u10 = u3().u();
        p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        this.f23025z0 = null;
        super.I1();
    }

    public final void s3() {
        w3().l().i(a1(), new androidx.lifecycle.f0() { // from class: bc.w1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSongChoiceFragment.t3(EmokaraSongChoiceFragment.this, (Boolean) obj);
            }
        });
    }

    public final x2 u3() {
        return (x2) this.f23023x0.b(this, B0[0]);
    }

    public final d0 v3() {
        return (d0) this.A0.getValue();
    }

    public final rf.b w3() {
        return (rf.b) this.f23024y0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.f23025z0 = context instanceof bc.s ? (bc.s) context : null;
    }

    public final void x3() {
        androidx.fragment.app.h j02 = j0();
        if (j02 != null) {
            j02.runOnUiThread(new Runnable() { // from class: bc.z1
                @Override // java.lang.Runnable
                public final void run() {
                    EmokaraSongChoiceFragment.y3(EmokaraSongChoiceFragment.this);
                }
            });
        }
    }
}
