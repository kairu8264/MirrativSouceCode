package com.dena.mirrorman.fragment;

import ae.y6;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.k;
import co.l;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrorman.fragment.PlayerCommentFragment;
import com.dena.mirrorman.net.api.response.App;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import gf.r0;
import ia.a;
import java.util.ArrayList;
import java.util.List;
import jo.f0;
import jo.p;
import jo.q;
import nd.b1;
import nd.e0;
import nf.z;
import ud.a3;
import ud.q2;
import ud.r2;
import uo.q0;
import wn.v;
import xn.a0;
import xn.o;

/* loaded from: classes2.dex */
public final class PlayerCommentFragment extends Fragment implements q0 {
    public static final a D0 = new a(null);
    public static final int E0 = 8;
    public final wn.f A0;
    public final wn.f B0;
    public r0 C0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f26093x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f26094y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f26095z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PlayerCommentFragment b(a aVar, boolean z10, boolean z11, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            if ((i10 & 4) != 0) {
                list = null;
            }
            return aVar.a(z10, z11, list);
        }

        public final PlayerCommentFragment a(boolean z10, boolean z11, List<Integer> list) {
            PlayerCommentFragment playerCommentFragment = new PlayerCommentFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_KEY_AUTO_FADE", z10);
            bundle.putBoolean("EXTRA_KEY_COMMENT_FROM_BOTTOM", z11);
            bundle.putIntArray("EXTRA_KEY_EXCLUDE_COMMENT_TYPE", list != null ? a0.A0(list) : null);
            playerCommentFragment.V2(bundle);
            return playerCommentFragment;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<int[]> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final int[] invoke() {
            return PlayerCommentFragment.this.M2().getIntArray("EXTRA_KEY_EXCLUDE_COMMENT_TYPE");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<Boolean> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(PlayerCommentFragment.this.M2().getBoolean("EXTRA_KEY_AUTO_FADE"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(PlayerCommentFragment.this.M2().getBoolean("EXTRA_KEY_COMMENT_FROM_BOTTOM"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends androidx.recyclerview.widget.i {

        /* loaded from: classes2.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RecyclerView.e0 f26100a;

            public a(RecyclerView.e0 e0Var) {
                this.f26100a = e0Var;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                RecyclerView.e0 e0Var = this.f26100a;
                View view = e0Var != null ? e0Var.itemView : null;
                if (view == null) {
                    return;
                }
                view.setEnabled(true);
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

        /* loaded from: classes2.dex */
        public static final class b implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RecyclerView.e0 f26101a;

            public b(RecyclerView.e0 e0Var) {
                this.f26101a = e0Var;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                RecyclerView.e0 e0Var = this.f26101a;
                View view = e0Var != null ? e0Var.itemView : null;
                if (view == null) {
                    return;
                }
                view.setEnabled(false);
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

        /* loaded from: classes2.dex */
        public static final class c implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ PlayerCommentFragment f26102a;

            public c(PlayerCommentFragment playerCommentFragment) {
                this.f26102a = playerCommentFragment;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                r0 r0Var = this.f26102a.C0;
                if (r0Var != null) {
                    r0Var.o1();
                }
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

        public e() {
        }

        @Override // androidx.recyclerview.widget.i, androidx.recyclerview.widget.b0
        public boolean y(RecyclerView.e0 e0Var) {
            View view;
            super.y(e0Var);
            View view2 = e0Var != null ? e0Var.itemView : null;
            if (view2 != null) {
                view2.setEnabled(false);
            }
            AnimationSet animationSet = new AnimationSet(false);
            PlayerCommentFragment playerCommentFragment = PlayerCommentFragment.this;
            animationSet.setFillAfter(true);
            animationSet.setAnimationListener(new c(playerCommentFragment));
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setStartOffset(400L);
            alphaAnimation.setDuration(1L);
            alphaAnimation.setAnimationListener(new a(e0Var));
            animationSet.addAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 1.0f);
            alphaAnimation2.setStartOffset(1400L);
            alphaAnimation2.setDuration(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
            alphaAnimation2.setAnimationListener(new b(e0Var));
            animationSet.addAnimation(alphaAnimation2);
            AlphaAnimation alphaAnimation3 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation3.setStartOffset(6400L);
            alphaAnimation3.setDuration(500L);
            animationSet.addAnimation(alphaAnimation3);
            if (e0Var != null && (view = e0Var.itemView) != null) {
                view.startAnimation(animationSet);
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinearLayoutManager f26103a;

        /* loaded from: classes2.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RecyclerView.e0 f26104a;

            public a(RecyclerView.e0 e0Var) {
                this.f26104a = e0Var;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f26104a.itemView.setEnabled(false);
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

        public f(LinearLayoutManager linearLayoutManager) {
            this.f26103a = linearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            p.h(recyclerView, "recyclerView");
            super.a(recyclerView, i10);
            if (i10 != 0) {
                if (i10 != 1) {
                    return;
                }
                int min = Math.min(this.f26103a.j0(), this.f26103a.l2() + 10);
                for (int max = Math.max(0, this.f26103a.i2() - 10); max < min; max++) {
                    RecyclerView.e0 Z = recyclerView.Z(max);
                    if (Z != null) {
                        Z.itemView.clearAnimation();
                        Z.itemView.setEnabled(true);
                        Z.itemView.setAlpha(1.0f);
                    }
                }
                return;
            }
            int min2 = Math.min(this.f26103a.j0(), this.f26103a.l2() + 10);
            for (int max2 = Math.max(0, this.f26103a.i2() - 10); max2 < min2; max2++) {
                RecyclerView.e0 Z2 = recyclerView.Z(max2);
                if (Z2 != null) {
                    Z2.itemView.clearAnimation();
                    Z2.itemView.setEnabled(true);
                    AnimationSet animationSet = new AnimationSet(false);
                    animationSet.setFillAfter(true);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                    alphaAnimation.setDuration(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                    alphaAnimation.setAnimationListener(new a(Z2));
                    animationSet.addAnimation(alphaAnimation);
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation2.setStartOffset(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                    alphaAnimation2.setDuration(300L);
                    animationSet.addAnimation(alphaAnimation2);
                    Z2.itemView.startAnimation(animationSet);
                }
            }
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.PlayerCommentFragment$onViewCreated$5", f = "PlayerCommentFragment.kt", l = {307}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ y6 B;

        /* renamed from: w  reason: collision with root package name */
        public Object f26105w;

        /* renamed from: x  reason: collision with root package name */
        public Object f26106x;

        /* renamed from: y  reason: collision with root package name */
        public Object f26107y;

        /* renamed from: z  reason: collision with root package name */
        public int f26108z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(y6 y6Var, ao.d<? super g> dVar) {
            super(2, dVar);
            this.B = y6Var;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new g(this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f26108z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f26107y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f26106x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f26105w
                ae.y6 r4 = (ae.y6) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L7a
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                com.dena.mirrorman.fragment.PlayerCommentFragment r9 = com.dena.mirrorman.fragment.PlayerCommentFragment.this
                nf.z r9 = com.dena.mirrorman.fragment.PlayerCommentFragment.l3(r9)
                wo.x r3 = r9.p0()
                ae.y6 r9 = r8.B
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7a
                r4 = r9
                r9 = r8
            L3d:
                r9.f26105w = r4     // Catch: java.lang.Throwable -> L7a
                r9.f26106x = r3     // Catch: java.lang.Throwable -> L7a
                r9.f26107y = r1     // Catch: java.lang.Throwable -> L7a
                r9.f26108z = r2     // Catch: java.lang.Throwable -> L7a
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L7a
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L77
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L77
                if (r9 == 0) goto L71
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L77
                java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L77
                int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L77
                androidx.recyclerview.widget.RecyclerView r6 = r5.B     // Catch: java.lang.Throwable -> L77
                r6.p1(r9)     // Catch: java.lang.Throwable -> L77
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L71:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L77:
                r9 = move-exception
                r3 = r4
                goto L7b
            L7a:
                r9 = move-exception
            L7b:
                throw r9     // Catch: java.lang.Throwable -> L7c
            L7c:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.fragment.PlayerCommentFragment.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends RecyclerView.j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinearLayoutManager f26109a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ y6 f26110b;

        public h(LinearLayoutManager linearLayoutManager, y6 y6Var) {
            this.f26109a = linearLayoutManager;
            this.f26110b = y6Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            super.d(i10, i11);
            if (this.f26109a.i2() == 0) {
                this.f26110b.B.p1(0);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements he.c {
        public i() {
        }

        @Override // he.c
        public void a(RecyclerView.e0 e0Var, q2 q2Var) {
            r0 r0Var;
            p.h(e0Var, "viewHolder");
            p.h(q2Var, "bindModel");
            if (!e0Var.itemView.isEnabled() || (r0Var = PlayerCommentFragment.this.C0) == null) {
                return;
            }
            r0Var.j0(q2Var.g());
        }

        @Override // he.c
        public void b(RecyclerView.e0 e0Var, String str) {
            r0 r0Var;
            p.h(e0Var, "viewHolder");
            p.h(str, "userId");
            if (!e0Var.itemView.isEnabled() || (r0Var = PlayerCommentFragment.this.C0) == null) {
                return;
            }
            r0Var.L0(str);
        }

        @Override // he.c
        public void c(RecyclerView.e0 e0Var) {
            p.h(e0Var, "viewHolder");
            if (e0Var.itemView.isEnabled()) {
                dq.c.c().l(new e0(0));
            }
        }

        @Override // he.c
        public void d(RecyclerView.e0 e0Var, EventBannerResponse eventBannerResponse) {
            p.h(e0Var, "viewHolder");
            p.h(eventBannerResponse, "eventBannerResponse");
            if (e0Var.itemView.isEnabled()) {
                dq.c.c().l(new k.a(eventBannerResponse));
            }
        }

        @Override // he.c
        public void e(RecyclerView.e0 e0Var, String str) {
            r0 r0Var;
            p.h(e0Var, "viewHolder");
            p.h(str, "url");
            if (!e0Var.itemView.isEnabled() || (r0Var = PlayerCommentFragment.this.C0) == null) {
                return;
            }
            r0Var.y0(str);
        }

        @Override // he.c
        public void f(RecyclerView.e0 e0Var, String str) {
            r0 r0Var;
            p.h(e0Var, "viewHolder");
            p.h(str, "appUserId");
            App.AppParams f10 = PlayerCommentFragment.this.o3().r0().f();
            if (f10 == null || !e0Var.itemView.isEnabled() || (r0Var = PlayerCommentFragment.this.C0) == null) {
                return;
            }
            r0Var.F(f10.getAppUserIdLabel());
        }

        @Override // he.c
        public void g(RecyclerView.e0 e0Var, a3 a3Var) {
            r0 r0Var;
            p.h(e0Var, "viewHolder");
            p.h(a3Var, "bindModel");
            if (!e0Var.itemView.isEnabled() || (r0Var = PlayerCommentFragment.this.C0) == null) {
                return;
            }
            r0Var.o(a3Var.f());
        }

        @Override // he.c
        public void h(RecyclerView.e0 e0Var, a3 a3Var) {
            r0 r0Var;
            p.h(e0Var, "viewHolder");
            p.h(a3Var, "bindModel");
            if (!e0Var.itemView.isEnabled() || (r0Var = PlayerCommentFragment.this.C0) == null) {
                return;
            }
            r0Var.I(a3Var.h());
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26112w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26113x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26114y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26112w = componentCallbacks;
            this.f26113x = aVar;
            this.f26114y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.z, java.lang.Object] */
        @Override // io.a
        public final z invoke() {
            ComponentCallbacks componentCallbacks = this.f26112w;
            return gq.a.a(componentCallbacks).c(f0.b(z.class), this.f26113x, this.f26114y);
        }
    }

    public PlayerCommentFragment() {
        super(b1.fragment_player_comment);
        this.f26093x0 = new da.j();
        this.f26094y0 = wn.g.b(wn.i.SYNCHRONIZED, new j(this, null, null));
        this.f26095z0 = wn.g.a(new c());
        this.A0 = wn.g.a(new d());
        this.B0 = wn.g.a(new b());
    }

    public static final void r3(PlayerCommentFragment playerCommentFragment, y6 y6Var, List list) {
        p.h(playerCommentFragment, "this$0");
        if (playerCommentFragment.n3() != null) {
            p.g(list, "newComments");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                int[] n32 = playerCommentFragment.n3();
                p.e(n32);
                if (!o.A(n32, ((r2) obj).d())) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        RecyclerView.h adapter = y6Var.B.getAdapter();
        p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.feature.comment.PlayerCommentAdapter");
        ((he.b) adapter).d(list);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        p.h(view, "view");
        super.e2(view, bundle);
        a1().g().a(new androidx.lifecycle.h() { // from class: com.dena.mirrorman.fragment.PlayerCommentFragment$onViewCreated$1
            @Override // androidx.lifecycle.h, androidx.lifecycle.m
            public void b(u uVar) {
                p.h(uVar, "owner");
                PlayerCommentFragment playerCommentFragment = PlayerCommentFragment.this;
                Context q02 = playerCommentFragment.q0();
                playerCommentFragment.C0 = q02 instanceof r0 ? (r0) q02 : null;
            }

            @Override // androidx.lifecycle.h, androidx.lifecycle.m
            public void g(u uVar) {
                p.h(uVar, "owner");
                PlayerCommentFragment.this.C0 = null;
                uo.r0.d(PlayerCommentFragment.this, null, 1, null);
            }
        });
        final y6 T = y6.T(view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(q0(), 1, q3());
        he.b bVar = new he.b();
        bVar.registerAdapterDataObserver(new h(linearLayoutManager, T));
        bVar.h(new i());
        T.B.setLayoutManager(linearLayoutManager);
        T.B.g(new p001if.b(de.e.b(this, 4)));
        if (!p3()) {
            T.B.setItemAnimator(new androidx.recyclerview.widget.i());
        } else {
            T.B.setItemAnimator(new e());
            T.B.k(new f(linearLayoutManager));
        }
        T.B.setAdapter(bVar);
        o3().q0().i(a1(), new androidx.lifecycle.f0() { // from class: gf.q0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerCommentFragment.r3(PlayerCommentFragment.this, T, (List) obj);
            }
        });
        uo.l.d(this, null, null, new g(T, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f26093x0.getCoroutineContext();
    }

    public final int[] n3() {
        return (int[]) this.B0.getValue();
    }

    public final z o3() {
        return (z) this.f26094y0.getValue();
    }

    public final boolean p3() {
        return ((Boolean) this.f26095z0.getValue()).booleanValue();
    }

    public final boolean q3() {
        return ((Boolean) this.A0.getValue()).booleanValue();
    }
}
