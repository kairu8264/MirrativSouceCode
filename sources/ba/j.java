package ba;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import be.k1;
import be.x1;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUser;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUserBasic;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffectType;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGiftGachaResult;
import com.dena.mirrorman.customview.GiftGachaOpenResultView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.api.response.GiftGachaStockType;
import java.util.ArrayList;
import java.util.List;
import jo.f0;
import kq.a;
import s9.e0;
import ud.u0;
import ud.v0;
import xn.a0;
import xn.x;
import yd.g1;
import yd.u;

/* loaded from: classes.dex */
public final class j extends androidx.fragment.app.e {
    public static final a S0 = new a(null);
    public static final int T0 = 8;
    public vb.q N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(List<EmomoRunGiftGachaResult> list, String str, boolean z10, int i10) {
            jo.p.h(list, "giftGachaResults");
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("EXTRA_GIFT_GACHA_RESULTS", new ArrayList<>(list));
            bundle.putString("EXTRA_DUPLICATED_EXPLAIN_IMAGE_URL", str);
            bundle.putBoolean("EXTRA_IS_VISIBLE_DUPLICATED_POINT_GAUGE", z10);
            bundle.putInt("EXTRA_FOOTER_BUTTON_COLOR_RES_INT", i10);
            jVar.V2(bundle);
            return jVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return j.this.M2().getString("EXTRA_DUPLICATED_EXPLAIN_IMAGE_URL");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<Integer> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(j.this.M2().getInt("EXTRA_FOOTER_BUTTON_COLOR_RES_INT"));
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<List<? extends EmomoRunGiftGachaResult>> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final List<EmomoRunGiftGachaResult> invoke() {
            ArrayList parcelableArrayList = j.this.M2().getParcelableArrayList("EXTRA_GIFT_GACHA_RESULTS");
            jo.p.f(parcelableArrayList, "null cannot be cast to non-null type kotlin.collections.List<com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGiftGachaResult>");
            return parcelableArrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f17154w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a<wn.v> aVar) {
            super(1);
            this.f17154w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f17154w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<View, wn.v> {
        public f() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            vb.q qVar = j.this.N0;
            if (qVar != null) {
                qVar.q0();
            }
            j.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<EmomoRunGiftGachaResult> f17156w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ j f17157x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e0 f17158y;

        /* loaded from: classes.dex */
        public static final class a implements yd.u {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ j f17159a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ EmomoRunGiftGachaResult f17160b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ e0 f17161c;

            /* renamed from: ba.j$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0105a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f17162a;

                static {
                    int[] iArr = new int[GiftItemEffectType.values().length];
                    iArr[GiftItemEffectType.EMOMO_QUEST.ordinal()] = 1;
                    f17162a = iArr;
                }
            }

            public a(j jVar, EmomoRunGiftGachaResult emomoRunGiftGachaResult, e0 e0Var) {
                this.f17159a = jVar;
                this.f17160b = emomoRunGiftGachaResult;
                this.f17161c = e0Var;
            }

            @Override // yd.u
            public void a(int i10) {
                Parcelable a10;
                x1.a aVar = x1.O0;
                List<GiftGachaItem> items = this.f17160b.getStreamer().getItems();
                j jVar = this.f17159a;
                EmomoRunGiftGachaResult emomoRunGiftGachaResult = this.f17160b;
                ArrayList arrayList = new ArrayList(xn.t.u(items, 10));
                for (GiftGachaItem giftGachaItem : items) {
                    GiftItemEffect effect = giftGachaItem.getEffect();
                    GiftItemEffectType type = effect != null ? effect.getType() : null;
                    if ((type == null ? -1 : C0105a.f17162a[type.ordinal()]) == 1) {
                        v0.a aVar2 = v0.K;
                        Context N2 = jVar.N2();
                        jo.p.g(N2, "requireContext()");
                        a10 = aVar2.a(N2, giftGachaItem, emomoRunGiftGachaResult.getSpecialEffectSpan());
                    } else {
                        u0.a aVar3 = u0.I;
                        Context N22 = jVar.N2();
                        jo.p.g(N22, "requireContext()");
                        a10 = aVar3.a(N22, giftGachaItem);
                    }
                    arrayList.add(a10);
                }
                aVar.a(new ArrayList<>(arrayList), i10).z3(this.f17159a.p0(), "GiftItemDetailDialogFragment");
            }

            @Override // yd.u
            public void b(int i10) {
                u.a.a(this, i10);
            }

            @Override // yd.u
            public void c(String str) {
                jo.p.h(str, "url");
                k1.R0.a(str).z3(this.f17159a.p0(), "EmomoRunGiftInfoDialog");
            }

            @Override // yd.u
            public void d(int i10) {
                Parcelable a10;
                x1.a aVar = x1.O0;
                List<GiftGachaItem> items = this.f17160b.getViewer().getItems();
                j jVar = this.f17159a;
                EmomoRunGiftGachaResult emomoRunGiftGachaResult = this.f17160b;
                ArrayList arrayList = new ArrayList(xn.t.u(items, 10));
                for (GiftGachaItem giftGachaItem : items) {
                    GiftItemEffect effect = giftGachaItem.getEffect();
                    GiftItemEffectType type = effect != null ? effect.getType() : null;
                    if ((type == null ? -1 : C0105a.f17162a[type.ordinal()]) == 1) {
                        v0.a aVar2 = v0.K;
                        Context N2 = jVar.N2();
                        jo.p.g(N2, "requireContext()");
                        a10 = aVar2.a(N2, giftGachaItem, emomoRunGiftGachaResult.getSpecialEffectSpan());
                    } else {
                        u0.a aVar3 = u0.I;
                        Context N22 = jVar.N2();
                        jo.p.g(N22, "requireContext()");
                        a10 = aVar3.a(N22, giftGachaItem);
                    }
                    arrayList.add(a10);
                }
                aVar.a(new ArrayList<>(arrayList), i10).z3(this.f17159a.p0(), "GiftItemDetailDialogFragment");
            }

            @Override // yd.u
            public void e() {
                this.f17161c.B.setAlpha(1.0f);
                ConstraintLayout constraintLayout = this.f17161c.B;
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(200L);
                constraintLayout.startAnimation(alphaAnimation);
                this.f17161c.F.setVisibility(8);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<EmomoRunGiftGachaResult> list, j jVar, e0 e0Var) {
            super(0);
            this.f17156w = list;
            this.f17157x = jVar;
            this.f17158y = e0Var;
        }

        public final void a() {
            EmomoRunGiftGachaResult emomoRunGiftGachaResult = (EmomoRunGiftGachaResult) x.E(this.f17156w);
            if (emomoRunGiftGachaResult == null) {
                vb.q qVar = this.f17157x.N0;
                if (qVar != null) {
                    qVar.q0();
                }
                this.f17157x.n3();
                return;
            }
            this.f17158y.E.setTitle(this.f17157x.V0(q9.i.text_emomo_run_gift_gacha_remaining_gacha_count, String.valueOf(this.f17156w.size())));
            if (this.f17156w.isEmpty()) {
                this.f17158y.C.setVisibility(0);
                this.f17158y.E.setVisibility(8);
            } else {
                this.f17158y.C.setVisibility(8);
                this.f17158y.E.setVisibility(0);
            }
            this.f17158y.B.setAlpha(0.0f);
            GiftGachaOpenResultView giftGachaOpenResultView = this.f17158y.D;
            androidx.lifecycle.u a12 = this.f17157x.a1();
            GiftGachaUser streamer = emomoRunGiftGachaResult.getStreamer();
            GiftGachaUser viewer = emomoRunGiftGachaResult.getViewer();
            List<GiftGachaUserBasic> k10 = xn.s.k();
            String headlineImageUrl = emomoRunGiftGachaResult.getHeadlineImageUrl();
            String elementImageUrl = emomoRunGiftGachaResult.getElementImageUrl();
            GiftGachaStockType giftGachaStockType = GiftGachaStockType.NORMAL;
            String D3 = this.f17157x.D3();
            boolean z10 = this.f17157x.M2().getBoolean("EXTRA_IS_VISIBLE_DUPLICATED_POINT_GAUGE");
            jo.p.g(a12, "viewLifecycleOwner");
            giftGachaOpenResultView.f(a12, streamer, viewer, null, k10, elementImageUrl, headlineImageUrl, giftGachaStockType, D3, z10);
            e0 e0Var = this.f17158y;
            e0Var.D.setListener(new a(this.f17157x, emomoRunGiftGachaResult, e0Var));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f17163w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f17163w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f17163w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17164w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.a aVar) {
            super(0);
            this.f17164w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f17164w.invoke()).b();
        }
    }

    /* renamed from: ba.j$j  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0106j extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17165w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17166x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17167y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f17168z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0106j(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f17165w = aVar;
            this.f17166x = aVar2;
            this.f17167y = aVar3;
            this.f17168z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f17165w;
            vq.a aVar2 = this.f17166x;
            io.a aVar3 = this.f17167y;
            xq.a aVar4 = this.f17168z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(ba.a.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17169w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar) {
            super(0);
            this.f17169w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f17169w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public j() {
        super(q9.h.dialog_fragment_emomo_run_gift_gacha_open_dialog);
        this.O0 = wn.g.a(new d());
        this.P0 = wn.g.a(new b());
        this.Q0 = wn.g.a(new c());
        h hVar = new h(this);
        xq.a a10 = gq.a.a(this);
        i iVar = new i(hVar);
        this.R0 = androidx.fragment.app.e0.a(this, f0.b(ba.a.class), new k(iVar), new C0106j(hVar, null, null, a10));
    }

    public final String D3() {
        return (String) this.P0.getValue();
    }

    public final ba.a E3() {
        return (ba.a) this.R0.getValue();
    }

    public final int F3() {
        return ((Number) this.Q0.getValue()).intValue();
    }

    public final List<EmomoRunGiftGachaResult> G3() {
        return (List) this.O0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        this.N0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        e0 T = e0.T(view);
        List D0 = a0.D0(G3());
        T.E.setTitle(V0(q9.i.text_emomo_run_gift_gacha_remaining_gacha_count, String.valueOf(D0.size())));
        T.E.setRoundedButtonViewBackgroundColor(F3());
        T.C.setRoundedButtonViewBackgroundColor(F3());
        if (D0.isEmpty()) {
            T.C.setVisibility(0);
            T.E.setVisibility(8);
        } else {
            T.C.setVisibility(8);
            T.E.setVisibility(0);
        }
        g gVar = new g(D0, this, T);
        RoundedButtonView roundedButtonView = T.E;
        jo.p.g(roundedButtonView, "binding.nextButtonView");
        g1.a(roundedButtonView, new e(gVar));
        RoundedButtonView roundedButtonView2 = T.C;
        jo.p.g(roundedButtonView2, "binding.closeButtonView");
        g1.a(roundedButtonView2, new f());
        gVar.invoke();
        E3().r();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), q9.j.f48844a);
        w3(false);
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.N0 = context instanceof vb.q ? (vb.q) context : null;
    }
}
