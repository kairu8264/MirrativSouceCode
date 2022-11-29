package ib;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.customview.LiveRequestCountView;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import hb.v1;
import hb.x1;
import ia.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kq.a;
import rd.w0;
import uo.b1;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class d0 extends Fragment implements q0 {
    public uo.b0 A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public e0 E0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f36477x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final AutoClearedValue f36478y0 = nd.a.a(this);

    /* renamed from: z0  reason: collision with root package name */
    public boolean f36479z0;
    public static final /* synthetic */ qo.h<Object>[] G0 = {jo.f0.d(new jo.s(d0.class, "binding", "getBinding()Lcom/dena/mirrativ/player/databinding/FragmentLiveRequestNotFollowedUserBinding;", 0))};
    public static final a F0 = new a(null);
    public static final int H0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d0 a(oe.a aVar) {
            jo.p.h(aVar, "liveRequest");
            d0 d0Var = new d0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_LIVE_REQUEST", aVar);
            d0Var.V2(bundle);
            return d0Var;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestNotFollowedUserFragment$observeStoreValues$2$2", f = "LiveRequestNotFollowedUserFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36480w;

        @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestNotFollowedUserFragment$observeStoreValues$2$2$1", f = "LiveRequestNotFollowedUserFragment.kt", l = {238}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f36482w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ d0 f36483x;

            /* renamed from: ib.d0$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0472a implements ia.a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ d0 f36484a;

                public C0472a(d0 d0Var) {
                    this.f36484a = d0Var;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    this.f36484a.C3().M.setVisibility(8);
                    this.f36484a.f36479z0 = true;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    a.C0469a.b(this, animation);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    a.C0469a.c(this, animation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d0 d0Var, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f36483x = d0Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f36483x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f36482w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f36482w = 1;
                    if (b1.a(500L, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.f36483x.C3().M.setVisibility(0);
                LiveRequestCountView liveRequestCountView = this.f36483x.C3().M;
                AnimationSet c11 = of.p.f45416a.c();
                c11.setAnimationListener(new C0472a(this.f36483x));
                liveRequestCountView.startAnimation(c11);
                return wn.v.f59242a;
            }
        }

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f36480w == 0) {
                wn.m.b(obj);
                uo.l.d(r0.a(g1.c().plus(d0.this.A0)), null, null, new a(d0.this, null), 3, null);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestNotFollowedUserFragment$observeStoreValues$6", f = "LiveRequestNotFollowedUserFragment.kt", l = {328}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f36485w;

        /* renamed from: x  reason: collision with root package name */
        public Object f36486x;

        /* renamed from: y  reason: collision with root package name */
        public Object f36487y;

        /* renamed from: z  reason: collision with root package name */
        public int f36488z;

        /* loaded from: classes2.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d0 f36489a;

            @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestNotFollowedUserFragment$observeStoreValues$6$1$1$onAnimationEnd$1", f = "LiveRequestNotFollowedUserFragment.kt", l = {292}, m = "invokeSuspend")
            /* renamed from: ib.d0$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0473a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f36490w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ d0 f36491x;

                /* renamed from: ib.d0$c$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0474a implements ia.a {

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ d0 f36492a;

                    public C0474a(d0 d0Var) {
                        this.f36492a = d0Var;
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        this.f36492a.C3().M.setVisibility(8);
                        this.f36492a.f36479z0 = true;
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                        a.C0469a.b(this, animation);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                        a.C0469a.c(this, animation);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0473a(d0 d0Var, ao.d<? super C0473a> dVar) {
                    super(2, dVar);
                    this.f36491x = d0Var;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    return new C0473a(this.f36491x, dVar);
                }

                @Override // io.p
                public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((C0473a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f36490w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        this.f36490w = 1;
                        if (b1.a(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    LiveRequestCountView liveRequestCountView = this.f36491x.C3().M;
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    d0 d0Var = this.f36491x;
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setAnimationListener(new C0474a(d0Var));
                    liveRequestCountView.startAnimation(alphaAnimation);
                    return wn.v.f59242a;
                }
            }

            public a(d0 d0Var) {
                this.f36489a = d0Var;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                uo.l.d(r0.a(g1.c().plus(this.f36489a.A0)), null, null, new C0473a(this.f36489a, null), 3, null);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                a.C0469a.b(this, animation);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                a.C0469a.c(this, animation);
            }
        }

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:21:0x005f, B:23:0x0067, B:26:0x008c, B:28:0x00a7, B:27:0x009a), top: B:40:0x005f }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:40:0x005f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 222
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ib.d0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f36493w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f36493w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f36493w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36494w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f36494w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f36494w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36495w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36496x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36497y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f36498z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f36495w = aVar;
            this.f36496x = aVar2;
            this.f36497y = aVar3;
            this.f36498z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f36495w;
            vq.a aVar2 = this.f36496x;
            io.a aVar3 = this.f36497y;
            xq.a aVar4 = this.f36498z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(e0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36499w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar) {
            super(0);
            this.f36499w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f36499w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<uq.a> {
        public h() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            Parcelable parcelable = d0.this.M2().getParcelable("EXTRA_LIVE_REQUEST");
            jo.p.e(parcelable);
            return uq.b.b(parcelable);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends RecyclerView.u {
        public i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            e0 e0Var = null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            e0 e0Var2 = d0.this.E0;
            if (e0Var2 == null) {
                jo.p.v("store");
                e0Var2 = null;
            }
            List<App.AppParams> f10 = e0Var2.m().f();
            if (f10 == null) {
                return;
            }
            e0 e0Var3 = d0.this.E0;
            if (e0Var3 == null) {
                jo.p.v("store");
                e0Var3 = null;
            }
            String f11 = e0Var3.w().f();
            if (f11 == null) {
                return;
            }
            e0 e0Var4 = d0.this.E0;
            if (e0Var4 == null) {
                jo.p.v("store");
                e0Var4 = null;
            }
            if (jo.p.c(e0Var4.J().f(), Boolean.TRUE)) {
                return;
            }
            if ((f11.length() == 0) || f10.size() > linearLayoutManager.l2() + 10) {
                return;
            }
            ib.e B3 = d0.this.B3();
            e0 e0Var5 = d0.this.E0;
            if (e0Var5 == null) {
                jo.p.v("store");
            } else {
                e0Var = e0Var5;
            }
            B3.f(e0Var.G(), f11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<ib.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f36502w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36503x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36504y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f36502w = componentCallbacks;
            this.f36503x = aVar;
            this.f36504y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ib.e, java.lang.Object] */
        @Override // io.a
        public final ib.e invoke() {
            ComponentCallbacks componentCallbacks = this.f36502w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ib.e.class), this.f36503x, this.f36504y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f36505w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36506x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36507y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f36505w = componentCallbacks;
            this.f36506x = aVar;
            this.f36507y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f36505w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.v0.class), this.f36506x, this.f36507y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f36508w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36509x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36510y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f36508w = componentCallbacks;
            this.f36509x = aVar;
            this.f36510y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f36508w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f36509x, this.f36510y);
        }
    }

    public d0() {
        uo.b0 b10;
        b10 = i2.b(null, 1, null);
        this.A0 = b10;
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.B0 = wn.g.b(iVar, new j(this, null, null));
        this.C0 = wn.g.b(iVar, new k(this, null, null));
        this.D0 = wn.g.b(iVar, new l(this, null, null));
    }

    public static final void G3(d0 d0Var, List list) {
        jo.p.h(d0Var, "this$0");
        RecyclerView.h adapter = d0Var.C3().B.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.AppAdapter");
        rd.c cVar = (rd.c) adapter;
        jo.p.g(list, "it");
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            App.AppParams appParams = (App.AppParams) it.next();
            arrayList.add(new ud.c(appParams.getAppId(), appParams.getIconUrl(), null, 4, null));
        }
        cVar.h(arrayList);
        d0Var.C3().B.setVisibility(list.isEmpty() ? 8 : 0);
        d0Var.U3();
    }

    public static final void H3(d0 d0Var, Boolean bool) {
        jo.p.h(d0Var, "this$0");
        FollowView followView = d0Var.C3().G;
        jo.p.g(bool, "it");
        followView.setFollowing(bool.booleanValue());
    }

    public static final void I3(d0 d0Var, Boolean bool) {
        jo.p.h(d0Var, "this$0");
        d0Var.C3().G.setEnabled(!bool.booleanValue());
    }

    public static final void J3(d0 d0Var, Integer num) {
        jo.p.h(d0Var, "this$0");
        FollowTextView followTextView = d0Var.C3().I;
        jo.p.g(followTextView, "binding.followerFollowTextView");
        yd.k.a(followTextView, num);
    }

    public static final void N3(d0 d0Var, View view) {
        jo.p.h(d0Var, "this$0");
        hf.v0 E3 = d0Var.E3();
        FragmentManager p02 = d0Var.p0();
        jo.p.g(p02, "childFragmentManager");
        if (hf.v0.c(E3, p02, Referer.LiveView.FINISHED_DIALOG, false, 4, null)) {
            d0Var.C3().K.c();
            ib.e B3 = d0Var.B3();
            e0 e0Var = d0Var.E0;
            e0 e0Var2 = null;
            if (e0Var == null) {
                jo.p.v("store");
                e0Var = null;
            }
            String G = e0Var.G();
            e0 e0Var3 = d0Var.E0;
            if (e0Var3 == null) {
                jo.p.v("store");
                e0Var3 = null;
            }
            long x10 = e0Var3.x() + 1;
            e0 e0Var4 = d0Var.E0;
            if (e0Var4 == null) {
                jo.p.v("store");
            } else {
                e0Var2 = e0Var4;
            }
            Long f10 = e0Var2.v().f();
            if (f10 == null) {
                f10 = 0L;
            }
            B3.n(Referer.LiveView.FINISHED_DIALOG, G, x10, 1 + f10.longValue());
        }
    }

    public static final void O3(d0 d0Var, View view) {
        jo.p.h(d0Var, "this$0");
        hf.v0 E3 = d0Var.E3();
        FragmentManager p02 = d0Var.p0();
        jo.p.g(p02, "childFragmentManager");
        if (hf.v0.c(E3, p02, "live_view.finished_dialog.follow", false, 4, null)) {
            e0 e0Var = d0Var.E0;
            e0 e0Var2 = null;
            if (e0Var == null) {
                jo.p.v("store");
                e0Var = null;
            }
            if (jo.p.c(e0Var.H().f(), Boolean.TRUE)) {
                ib.e B3 = d0Var.B3();
                e0 e0Var3 = d0Var.E0;
                if (e0Var3 == null) {
                    jo.p.v("store");
                } else {
                    e0Var2 = e0Var3;
                }
                B3.o(Referer.LiveView.FINISHED_DIALOG, e0Var2.G());
                return;
            }
            hf.b.f35490a.h();
            FirebaseAnalytics.getInstance(d0Var.N2()).a("jdwii7", null);
            ib.e B32 = d0Var.B3();
            e0 e0Var4 = d0Var.E0;
            if (e0Var4 == null) {
                jo.p.v("store");
            } else {
                e0Var2 = e0Var4;
            }
            B32.e(Referer.LiveView.FINISHED_DIALOG, e0Var2.G());
        }
    }

    public static final void P3(d0 d0Var, View view) {
        String k10;
        jo.p.h(d0Var, "this$0");
        e0 e0Var = d0Var.E0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        oe.b D = e0Var.D();
        if (D == null || (k10 = D.k()) == null) {
            return;
        }
        if (k10.length() == 0) {
            return;
        }
        Context q02 = d0Var.q0();
        of.n.r(q02, "https://twitter.com/" + k10);
    }

    public static final void Q3(d0 d0Var, View view) {
        jo.p.h(d0Var, "this$0");
        tb.c D3 = d0Var.D3();
        Context N2 = d0Var.N2();
        jo.p.g(N2, "requireContext()");
        e0 e0Var = d0Var.E0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        d0Var.f3(D3.s(N2, e0Var.G(), Referer.LiveView.FINISHED_DIALOG));
    }

    public static final void R3(d0 d0Var, View view) {
        jo.p.h(d0Var, "this$0");
        tb.c D3 = d0Var.D3();
        Context N2 = d0Var.N2();
        jo.p.g(N2, "requireContext()");
        e0 e0Var = d0Var.E0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        d0Var.f3(D3.s(N2, e0Var.G(), Referer.LiveView.FINISHED_DIALOG));
    }

    public static final void S3(d0 d0Var, View view) {
        jo.p.h(d0Var, "this$0");
        tb.c D3 = d0Var.D3();
        Context N2 = d0Var.N2();
        jo.p.g(N2, "requireContext()");
        e0 e0Var = d0Var.E0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        d0Var.f3(D3.I(N2, e0Var.G(), 0));
    }

    public static final void T3(d0 d0Var, View view) {
        jo.p.h(d0Var, "this$0");
        tb.c D3 = d0Var.D3();
        Context N2 = d0Var.N2();
        jo.p.g(N2, "requireContext()");
        e0 e0Var = d0Var.E0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        d0Var.f3(D3.I(N2, e0Var.G(), 1));
    }

    @Override // androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        Fragment P2 = P2();
        jo.p.g(P2, "requireParentFragment()");
        h hVar = new h();
        d dVar = new d(P2);
        xq.a a10 = gq.a.a(P2);
        e eVar = new e(dVar);
        this.E0 = (e0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(P2, jo.f0.b(e0.class), new g(eVar), new f(dVar, null, hVar, a10)).getValue());
    }

    public final ib.e B3() {
        return (ib.e) this.B0.getValue();
    }

    public final kb.r C3() {
        return (kb.r) this.f36478y0.b(this, G0[0]);
    }

    public final tb.c D3() {
        return (tb.c) this.D0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), x1.fragment_live_request_not_followed_user, viewGroup, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        K3((kb.r) e10);
        View u10 = C3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final hf.v0 E3() {
        return (hf.v0) this.C0.getValue();
    }

    public final void F3() {
        AppCompatTextView appCompatTextView = C3().V;
        jo.p.g(appCompatTextView, "binding.userIdTextView");
        e0 e0Var = this.E0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        td.b.k(appCompatTextView, e0Var.G());
        e0 e0Var2 = this.E0;
        if (e0Var2 == null) {
            jo.p.v("store");
            e0Var2 = null;
        }
        e0Var2.r().i(a1(), new androidx.lifecycle.f0() { // from class: ib.c0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                d0.J3(d0.this, (Integer) obj);
            }
        });
        e0 e0Var3 = this.E0;
        if (e0Var3 == null) {
            jo.p.v("store");
            e0Var3 = null;
        }
        oe.b D = e0Var3.D();
        if (D != null) {
            AppCompatImageView appCompatImageView = C3().C;
            jo.p.g(appCompatImageView, "binding.avatarImageView");
            td.a.f(appCompatImageView, D.b());
            AppCompatImageView appCompatImageView2 = C3().D;
            jo.p.g(appCompatImageView2, "binding.backgroundImageView");
            td.a.G(appCompatImageView2, D.a(), c3.a.f(N2(), v1.f34985e0), Boolean.TRUE);
            AppCompatImageView appCompatImageView3 = C3().Q;
            jo.p.g(appCompatImageView3, "binding.ribbonImageView");
            td.a.f(appCompatImageView3, D.i());
            ProfileImageView profileImageView = C3().N;
            jo.p.g(profileImageView, "binding.profileImageView");
            ProfileImageView.b(profileImageView, D.h(), D.c(), Integer.valueOf(de.e.b(this, 1)), null, 8, null);
            C3().W.setText(D.g());
            C3().T.setVisibility(TextUtils.isEmpty(D.k()) ? 8 : 0);
            C3().U.setVisibility(D.l() ? 0 : 8);
            FollowTextView followTextView = C3().J;
            jo.p.g(followTextView, "binding.followingFollowTextView");
            yd.k.a(followTextView, Integer.valueOf(D.e()));
            RecyclerView recyclerView = C3().R;
            List<RibbonResponse> j10 = D.j();
            ArrayList arrayList = new ArrayList(xn.t.u(j10, 10));
            for (RibbonResponse ribbonResponse : j10) {
                arrayList.add(ribbonResponse.getImageUrl());
            }
            recyclerView.setAdapter(new w0(arrayList));
            C3().R.setVisibility(D.j().isEmpty() ? 8 : 0);
            U3();
            C3().M.setRequestCount(D.f());
            uo.l.d(this, null, null, new b(null), 3, null);
        }
        e0 e0Var4 = this.E0;
        if (e0Var4 == null) {
            jo.p.v("store");
            e0Var4 = null;
        }
        e0Var4.m().i(a1(), new androidx.lifecycle.f0() { // from class: ib.t
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                d0.G3(d0.this, (List) obj);
            }
        });
        e0 e0Var5 = this.E0;
        if (e0Var5 == null) {
            jo.p.v("store");
            e0Var5 = null;
        }
        e0Var5.H().i(a1(), new androidx.lifecycle.f0() { // from class: ib.a0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                d0.H3(d0.this, (Boolean) obj);
            }
        });
        e0 e0Var6 = this.E0;
        if (e0Var6 == null) {
            jo.p.v("store");
            e0Var6 = null;
        }
        e0Var6.K().i(a1(), new androidx.lifecycle.f0() { // from class: ib.b0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                d0.I3(d0.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        d2.a.a(this.A0, null, 1, null);
        r0.d(this, null, 1, null);
        super.I1();
    }

    public final void K3(kb.r rVar) {
        this.f36478y0.a(this, G0[0], rVar);
    }

    public final void L3() {
        C3().R.setLayoutManager(new LinearLayoutManager(N2(), 0, false));
        int b10 = de.e.b(this, 4);
        int b11 = de.e.b(this, 16);
        C3().R.g(new p001if.c(b10, b11, 0, b11, 0, 0));
        C3().B.setAdapter(new rd.c());
        C3().B.setLayoutManager(new LinearLayoutManager(N2(), 0, false));
        int b12 = de.e.b(this, 8);
        int b13 = de.e.b(this, 16);
        C3().B.g(new p001if.c(b12, b13, 0, b13, 0, 0));
    }

    public final void M3() {
        C3().K.setOnClickListener(new View.OnClickListener() { // from class: ib.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.N3(d0.this, view);
            }
        });
        C3().B.k(new i());
        C3().G.setOnClickListener(new View.OnClickListener() { // from class: ib.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.O3(d0.this, view);
            }
        });
        C3().T.setOnClickListener(new View.OnClickListener() { // from class: ib.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.P3(d0.this, view);
            }
        });
        C3().N.setOnClickListener(new View.OnClickListener() { // from class: ib.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.Q3(d0.this, view);
            }
        });
        C3().W.setOnClickListener(new View.OnClickListener() { // from class: ib.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.R3(d0.this, view);
            }
        });
        C3().J.setOnClickListener(new View.OnClickListener() { // from class: ib.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.S3(d0.this, view);
            }
        });
        C3().I.setOnClickListener(new View.OnClickListener() { // from class: ib.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.T3(d0.this, view);
            }
        });
    }

    public final void U3() {
        int i10 = 8;
        C3().F.setVisibility((C3().B.getVisibility() == 8 && C3().R.getVisibility() == 8) ? 0 : 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        L3();
        M3();
        F3();
        ib.e B3 = B3();
        e0 e0Var = this.E0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        B3.f(e0Var.G(), null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f36477x0.getCoroutineContext();
    }
}
