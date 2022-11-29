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
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.customview.FollowTextView;
import com.dena.mirrorman.customview.LiveRequestCountView;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.net.api.Referer;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import hb.v1;
import hb.x1;
import ia.a;
import kq.a;
import uo.b1;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class r extends Fragment implements q0 {
    public uo.b0 A0;
    public final wn.f B0;
    public e0 C0;
    public final wn.f D0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f36684x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final AutoClearedValue f36685y0 = nd.a.a(this);

    /* renamed from: z0  reason: collision with root package name */
    public boolean f36686z0;
    public static final /* synthetic */ qo.h<Object>[] F0 = {jo.f0.d(new jo.s(r.class, "binding", "getBinding()Lcom/dena/mirrativ/player/databinding/FragmentLiveRequestFollowedUserBinding;", 0))};
    public static final a E0 = new a(null);
    public static final int G0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final r a(oe.a aVar) {
            jo.p.h(aVar, "liveRequest");
            r rVar = new r();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_LIVE_REQUEST", aVar);
            rVar.V2(bundle);
            return rVar;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestFollowedUserFragment$observeStoreValues$1$1", f = "LiveRequestFollowedUserFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f36687w;

        @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestFollowedUserFragment$observeStoreValues$1$1$1", f = "LiveRequestFollowedUserFragment.kt", l = {150}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f36689w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ r f36690x;

            /* renamed from: ib.r$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0477a implements ia.a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ r f36691a;

                public C0477a(r rVar) {
                    this.f36691a = rVar;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    this.f36691a.w3().K.setVisibility(8);
                    this.f36691a.f36686z0 = true;
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
            public a(r rVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f36690x = rVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f36690x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f36689w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f36689w = 1;
                    if (b1.a(500L, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.f36690x.w3().K.setVisibility(0);
                LiveRequestCountView liveRequestCountView = this.f36690x.w3().K;
                AnimationSet c11 = of.p.f45416a.c();
                c11.setAnimationListener(new C0477a(this.f36690x));
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
            if (this.f36687w == 0) {
                wn.m.b(obj);
                uo.l.d(r0.a(g1.c().plus(r.this.A0)), null, null, new a(r.this, null), 3, null);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestFollowedUserFragment$observeStoreValues$2", f = "LiveRequestFollowedUserFragment.kt", l = {215}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f36692w;

        /* renamed from: x  reason: collision with root package name */
        public Object f36693x;

        /* renamed from: y  reason: collision with root package name */
        public Object f36694y;

        /* renamed from: z  reason: collision with root package name */
        public int f36695z;

        /* loaded from: classes2.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ r f36696a;

            @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestFollowedUserFragment$observeStoreValues$2$1$1$onAnimationEnd$1", f = "LiveRequestFollowedUserFragment.kt", l = {184}, m = "invokeSuspend")
            /* renamed from: ib.r$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0478a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f36697w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ r f36698x;

                /* renamed from: ib.r$c$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0479a implements ia.a {

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ r f36699a;

                    public C0479a(r rVar) {
                        this.f36699a = rVar;
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        this.f36699a.w3().K.setVisibility(8);
                        this.f36699a.f36686z0 = true;
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
                public C0478a(r rVar, ao.d<? super C0478a> dVar) {
                    super(2, dVar);
                    this.f36698x = rVar;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    return new C0478a(this.f36698x, dVar);
                }

                @Override // io.p
                public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((C0478a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f36697w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        this.f36697w = 1;
                        if (b1.a(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    LiveRequestCountView liveRequestCountView = this.f36698x.w3().K;
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    r rVar = this.f36698x;
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setAnimationListener(new C0479a(rVar));
                    liveRequestCountView.startAnimation(alphaAnimation);
                    return wn.v.f59242a;
                }
            }

            public a(r rVar) {
                this.f36696a = rVar;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                uo.l.d(r0.a(g1.c().plus(this.f36696a.A0)), null, null, new C0478a(this.f36696a, null), 3, null);
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
            throw new UnsupportedOperationException("Method not decompiled: ib.r.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f36700w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f36700w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f36700w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36701w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f36701w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f36701w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36702w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36703x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36704y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f36705z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f36702w = aVar;
            this.f36703x = aVar2;
            this.f36704y = aVar3;
            this.f36705z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f36702w;
            vq.a aVar2 = this.f36703x;
            io.a aVar3 = this.f36704y;
            xq.a aVar4 = this.f36705z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(e0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36706w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar) {
            super(0);
            this.f36706w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f36706w.invoke()).U();
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
            Parcelable parcelable = r.this.M2().getParcelable("EXTRA_LIVE_REQUEST");
            jo.p.e(parcelable);
            return uq.b.b(parcelable);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<ib.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f36708w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36709x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36710y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f36708w = componentCallbacks;
            this.f36709x = aVar;
            this.f36710y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ib.e, java.lang.Object] */
        @Override // io.a
        public final ib.e invoke() {
            ComponentCallbacks componentCallbacks = this.f36708w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ib.e.class), this.f36709x, this.f36710y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f36711w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36712x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36713y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f36711w = componentCallbacks;
            this.f36712x = aVar;
            this.f36713y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f36711w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f36712x, this.f36713y);
        }
    }

    public r() {
        uo.b0 b10;
        b10 = i2.b(null, 1, null);
        this.A0 = b10;
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.B0 = wn.g.b(iVar, new i(this, null, null));
        this.D0 = wn.g.b(iVar, new j(this, null, null));
    }

    public static final void B3(r rVar, View view) {
        jo.p.h(rVar, "this$0");
        rVar.w3().I.c();
        ib.e v32 = rVar.v3();
        e0 e0Var = rVar.C0;
        e0 e0Var2 = null;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        String G = e0Var.G();
        e0 e0Var3 = rVar.C0;
        if (e0Var3 == null) {
            jo.p.v("store");
            e0Var3 = null;
        }
        long x10 = e0Var3.x() + 1;
        e0 e0Var4 = rVar.C0;
        if (e0Var4 == null) {
            jo.p.v("store");
        } else {
            e0Var2 = e0Var4;
        }
        Long f10 = e0Var2.v().f();
        if (f10 == null) {
            f10 = 0L;
        }
        v32.n(Referer.LiveView.FINISHED_DIALOG, G, x10, 1 + f10.longValue());
    }

    public static final void C3(r rVar, View view) {
        String k10;
        jo.p.h(rVar, "this$0");
        e0 e0Var = rVar.C0;
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
        Context q02 = rVar.q0();
        of.n.r(q02, "https://twitter.com/" + k10);
    }

    public static final void D3(r rVar, View view) {
        jo.p.h(rVar, "this$0");
        tb.c x32 = rVar.x3();
        Context N2 = rVar.N2();
        jo.p.g(N2, "requireContext()");
        e0 e0Var = rVar.C0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        rVar.f3(x32.s(N2, e0Var.G(), Referer.LiveView.FINISHED_DIALOG));
    }

    public static final void E3(r rVar, View view) {
        jo.p.h(rVar, "this$0");
        tb.c x32 = rVar.x3();
        Context N2 = rVar.N2();
        jo.p.g(N2, "requireContext()");
        e0 e0Var = rVar.C0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        rVar.f3(x32.s(N2, e0Var.G(), Referer.LiveView.FINISHED_DIALOG));
    }

    public static final void F3(r rVar, View view) {
        jo.p.h(rVar, "this$0");
        tb.c x32 = rVar.x3();
        Context N2 = rVar.N2();
        jo.p.g(N2, "requireContext()");
        e0 e0Var = rVar.C0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        rVar.f3(x32.I(N2, e0Var.G(), 0));
    }

    public static final void G3(r rVar, View view) {
        jo.p.h(rVar, "this$0");
        tb.c x32 = rVar.x3();
        Context N2 = rVar.N2();
        jo.p.g(N2, "requireContext()");
        e0 e0Var = rVar.C0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        rVar.f3(x32.I(N2, e0Var.G(), 1));
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
        this.C0 = (e0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(P2, jo.f0.b(e0.class), new g(eVar), new f(dVar, null, hVar, a10)).getValue());
    }

    public final void A3() {
        w3().I.setOnClickListener(new View.OnClickListener() { // from class: ib.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.B3(r.this, view);
            }
        });
        w3().P.setOnClickListener(new View.OnClickListener() { // from class: ib.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.C3(r.this, view);
            }
        });
        w3().L.setOnClickListener(new View.OnClickListener() { // from class: ib.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.D3(r.this, view);
            }
        });
        w3().S.setOnClickListener(new View.OnClickListener() { // from class: ib.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.E3(r.this, view);
            }
        });
        w3().F.setOnClickListener(new View.OnClickListener() { // from class: ib.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.F3(r.this, view);
            }
        });
        w3().E.setOnClickListener(new View.OnClickListener() { // from class: ib.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.G3(r.this, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), x1.fragment_live_request_followed_user, viewGroup, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        z3((kb.p) e10);
        View u10 = w3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        d2.a.a(this.A0, null, 1, null);
        r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        A3();
        y3();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f36684x0.getCoroutineContext();
    }

    public final ib.e v3() {
        return (ib.e) this.B0.getValue();
    }

    public final kb.p w3() {
        return (kb.p) this.f36685y0.b(this, F0[0]);
    }

    public final tb.c x3() {
        return (tb.c) this.D0.getValue();
    }

    public final void y3() {
        AppCompatTextView appCompatTextView = w3().R;
        jo.p.g(appCompatTextView, "binding.userIdTextView");
        e0 e0Var = this.C0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        td.b.k(appCompatTextView, e0Var.G());
        e0 e0Var2 = this.C0;
        if (e0Var2 == null) {
            jo.p.v("store");
            e0Var2 = null;
        }
        oe.b D = e0Var2.D();
        if (D != null) {
            AppCompatImageView appCompatImageView = w3().B;
            jo.p.g(appCompatImageView, "binding.avatarImageView");
            td.a.f(appCompatImageView, D.b());
            AppCompatImageView appCompatImageView2 = w3().C;
            jo.p.g(appCompatImageView2, "binding.backgroundImageView");
            td.a.G(appCompatImageView2, D.a(), c3.a.f(N2(), v1.f34985e0), Boolean.TRUE);
            ProfileImageView profileImageView = w3().L;
            jo.p.g(profileImageView, "binding.profileImageView");
            ProfileImageView.b(profileImageView, D.h(), D.c(), Integer.valueOf(de.e.b(this, 1)), null, 8, null);
            w3().S.setText(D.g());
            w3().P.setVisibility(TextUtils.isEmpty(D.k()) ? 8 : 0);
            w3().Q.setVisibility(D.l() ? 0 : 8);
            AppCompatImageView appCompatImageView3 = w3().N;
            jo.p.g(appCompatImageView3, "binding.ribbonImageView");
            td.a.f(appCompatImageView3, D.i());
            w3().N.setVisibility(D.i() != null ? 0 : 8);
            FollowTextView followTextView = w3().F;
            jo.p.g(followTextView, "binding.followingFollowTextView");
            yd.k.a(followTextView, Integer.valueOf(D.e()));
            FollowTextView followTextView2 = w3().E;
            jo.p.g(followTextView2, "binding.followerFollowTextView");
            yd.k.a(followTextView2, Integer.valueOf(D.d()));
            w3().K.setRequestCount(D.f());
            uo.l.d(this, null, null, new b(null), 3, null);
        }
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    public final void z3(kb.p pVar) {
        this.f36685y0.a(this, F0[0], pVar);
    }
}
