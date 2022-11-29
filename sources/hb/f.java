package hb;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import com.dena.mirrorman.unity.MRUnityPlayer;
import com.dena.mirrorman.unity.UnityManager;
import kotlin.KotlinNothingValueException;
import kq.a;

/* loaded from: classes2.dex */
public final class f extends Fragment implements uo.q0 {
    public static final a C0 = new a(null);
    public static final int D0 = 8;
    public final wn.f A0;
    public final wn.f B0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f34762x0;

    /* renamed from: y0  reason: collision with root package name */
    public kb.n f34763y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f34764z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f a() {
            return new f();
        }
    }

    @co.f(c = "com.dena.mirrativ.player.EmomoWipeViewFragment$onViewCreated$2", f = "EmomoWipeViewFragment.kt", l = {49}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34765w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ f f34767w;

            public a(f fVar) {
                this.f34767w = fVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                this.f34767w.n3().c(str);
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
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34765w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<String> i11 = f.this.o3().i();
                a aVar = new a(f.this);
                this.f34765w = 1;
                if (i11.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<MRUnityPlayer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f34768w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f34769x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f34770y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f34768w = componentCallbacks;
            this.f34769x = aVar;
            this.f34770y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.MRUnityPlayer, java.lang.Object] */
        @Override // io.a
        public final MRUnityPlayer invoke() {
            ComponentCallbacks componentCallbacks = this.f34768w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRUnityPlayer.class), this.f34769x, this.f34770y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<hb.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f34771w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f34772x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f34773y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f34771w = componentCallbacks;
            this.f34772x = aVar;
            this.f34773y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hb.b] */
        @Override // io.a
        public final hb.b invoke() {
            ComponentCallbacks componentCallbacks = this.f34771w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hb.b.class), this.f34772x, this.f34773y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f34774w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f34774w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f34774w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* renamed from: hb.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0440f extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f34775w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0440f(io.a aVar) {
            super(0);
            this.f34775w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f34775w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f34776w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f34777x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f34778y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f34779z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f34776w = aVar;
            this.f34777x = aVar2;
            this.f34778y = aVar3;
            this.f34779z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f34776w;
            vq.a aVar2 = this.f34777x;
            io.a aVar3 = this.f34778y;
            xq.a aVar4 = this.f34779z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(hb.d.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f34780w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar) {
            super(0);
            this.f34780w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f34780w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public f() {
        super(x1.fragment_emomo_wipe_view);
        this.f34762x0 = uo.r0.b();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f34764z0 = wn.g.b(iVar, new c(this, null, null));
        this.A0 = wn.g.b(iVar, new d(this, null, null));
        e eVar = new e(this);
        xq.a a10 = gq.a.a(this);
        C0440f c0440f = new C0440f(eVar);
        this.B0 = androidx.fragment.app.e0.a(this, jo.f0.b(hb.d.class), new h(c0440f), new g(eVar, null, null, a10));
    }

    public static final void q3(f fVar, wn.k kVar) {
        jo.p.h(fVar, "this$0");
        boolean booleanValue = ((Boolean) kVar.a()).booleanValue();
        jf.c cVar = (jf.c) kVar.b();
        if (booleanValue) {
            fVar.m3().B.setVisibility(0);
            UnityManager.Companion.getInstance().loadAvatarModel(cVar, 0);
            return;
        }
        fVar.m3().B.setVisibility(8);
        UnityManager.Companion.getInstance().unloadAvatarModel(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        this.f34763y0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void S1() {
        super.S1();
        p3().stop();
        UnityManager.Companion.getInstance().setCollabo001();
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        MRUnityPlayer p32 = p3();
        FrameLayout frameLayout = m3().B;
        jo.p.g(frameLayout, "binding.avatarContainer");
        p32.startWithAlpha(frameLayout);
        UnityManager.Companion companion = UnityManager.Companion;
        companion.getInstance().setTranslucentBackground();
        companion.getInstance().setCollabo003();
        companion.getInstance().initCloset(false);
        if (jo.p.c(o3().j().f(), Boolean.TRUE)) {
            companion.getInstance().unloadAvatarModel(0);
            jf.c f10 = o3().h().f();
            if (f10 != null) {
                companion.getInstance().loadAvatarModel(f10, 0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        this.f34763y0 = kb.n.T(view);
        UnityManager.Companion.getInstance().unloadAvatarModel(0);
        nd.t0.a(o3().j(), o3().h()).i(a1(), new androidx.lifecycle.f0() { // from class: hb.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                f.q3(f.this, (wn.k) obj);
            }
        });
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f34762x0.getCoroutineContext();
    }

    public final kb.n m3() {
        kb.n nVar = this.f34763y0;
        jo.p.e(nVar);
        return nVar;
    }

    public final hb.b n3() {
        return (hb.b) this.A0.getValue();
    }

    public final hb.d o3() {
        return (hb.d) this.B0.getValue();
    }

    public final MRUnityPlayer p3() {
        return (MRUnityPlayer) this.f34764z0.getValue();
    }
}
