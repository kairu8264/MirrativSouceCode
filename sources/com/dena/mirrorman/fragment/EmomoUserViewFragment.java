package com.dena.mirrorman.fragment;

import ae.m6;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import com.dena.mirrativ.mirrativapi.closet.ClosetAccessoryAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetBackground;
import com.dena.mirrorman.fragment.EmomoUserViewFragment;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.dena.mirrorman.unity.MRUnityPlayer;
import com.dena.mirrorman.unity.UnityActionCreator;
import com.dena.mirrorman.unity.UnityManager;
import gf.z;
import java.io.File;
import jf.c;
import jo.f0;
import jo.p;
import jo.q;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.b1;
import nf.j;
import uo.q0;
import uo.r0;
import wn.v;
import xo.w;
import yd.g1;

/* loaded from: classes2.dex */
public final class EmomoUserViewFragment extends Fragment implements q0 {
    public static final a E0 = new a(null);
    public static final int F0 = 8;
    public final wn.f A0;
    public nf.j B0;
    public z C0;
    public final wn.f D0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f26065x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f26066y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f26067z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final EmomoUserViewFragment a(String str) {
            p.h(str, "userId");
            EmomoUserViewFragment emomoUserViewFragment = new EmomoUserViewFragment();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_USER_ID", str);
            emomoUserViewFragment.V2(bundle);
            return emomoUserViewFragment;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f26068w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f26068w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f26068w.L2();
            p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f26068w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f26069w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a aVar) {
            super(0);
            this.f26069w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f26069w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f26070w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26071x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26072y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f26073z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f26070w = aVar;
            this.f26071x = aVar2;
            this.f26072y = aVar3;
            this.f26073z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f26070w;
            vq.a aVar2 = this.f26071x;
            io.a aVar3 = this.f26072y;
            xq.a aVar4 = this.f26073z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(nf.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f26074w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f26074w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f26074w.invoke()).U();
            p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<uq.a> {
        public f() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(EmomoUserViewFragment.this.t3());
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.EmomoUserViewFragment$onViewCreated$2", f = "EmomoUserViewFragment.kt", l = {110}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f26076w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<jf.c> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoUserViewFragment f26078w;

            public a(EmomoUserViewFragment emomoUserViewFragment) {
                this.f26078w = emomoUserViewFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(jf.c cVar, ao.d<? super v> dVar) {
                this.f26078w.r3().loadAvatar(cVar);
                return v.f59242a;
            }
        }

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f26076w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.j jVar = EmomoUserViewFragment.this.B0;
                if (jVar == null) {
                    p.v("store");
                    jVar = null;
                }
                w<jf.c> h10 = jVar.h();
                a aVar = new a(EmomoUserViewFragment.this);
                this.f26076w = 1;
                if (h10.a(aVar, this) == c10) {
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
    public static final class h extends f8.c<File> {
        @Override // f8.j
        /* renamed from: a */
        public void e(File file, g8.b<? super File> bVar) {
            p.h(file, "resource");
            UnityManager companion = UnityManager.Companion.getInstance();
            String absolutePath = file.getAbsolutePath();
            p.g(absolutePath, "resource.absolutePath");
            companion.setBackground(absolutePath);
        }

        @Override // f8.j
        public void g(Drawable drawable) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.l<View, v> {
        public i() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            z zVar = EmomoUserViewFragment.this.C0;
            if (zVar != null) {
                zVar.C1();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<MRUnityPlayer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26080w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26081x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26082y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26080w = componentCallbacks;
            this.f26081x = aVar;
            this.f26082y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.MRUnityPlayer, java.lang.Object] */
        @Override // io.a
        public final MRUnityPlayer invoke() {
            ComponentCallbacks componentCallbacks = this.f26080w;
            return gq.a.a(componentCallbacks).c(f0.b(MRUnityPlayer.class), this.f26081x, this.f26082y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<UnityActionCreator> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26083w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26084x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26085y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26083w = componentCallbacks;
            this.f26084x = aVar;
            this.f26085y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.UnityActionCreator, java.lang.Object] */
        @Override // io.a
        public final UnityActionCreator invoke() {
            ComponentCallbacks componentCallbacks = this.f26083w;
            return gq.a.a(componentCallbacks).c(f0.b(UnityActionCreator.class), this.f26084x, this.f26085y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends q implements io.a<od.i> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26086w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26087x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26088y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26086w = componentCallbacks;
            this.f26087x = aVar;
            this.f26088y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.i, java.lang.Object] */
        @Override // io.a
        public final od.i invoke() {
            ComponentCallbacks componentCallbacks = this.f26086w;
            return gq.a.a(componentCallbacks).c(f0.b(od.i.class), this.f26087x, this.f26088y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends q implements io.a<String> {
        public m() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = EmomoUserViewFragment.this.M2().getString("EXTRA_USER_ID");
            p.e(string);
            return string;
        }
    }

    public EmomoUserViewFragment() {
        super(b1.fragment_emomo_user_view);
        this.f26065x0 = new da.j();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f26066y0 = wn.g.b(iVar, new j(this, null, null));
        this.f26067z0 = wn.g.b(iVar, new k(this, null, null));
        this.A0 = wn.g.b(iVar, new l(this, null, null));
        this.D0 = wn.g.a(new m());
    }

    public static final void u3(EmomoUserViewFragment emomoUserViewFragment, Integer num) {
        p.h(emomoUserViewFragment, "this$0");
        nf.j jVar = emomoUserViewFragment.B0;
        if (jVar == null) {
            p.v("store");
            jVar = null;
        }
        if (p.c(jVar.j().f(), Boolean.TRUE)) {
            UnityManager companion = UnityManager.Companion.getInstance();
            p.g(num, "maxContinuousRecord");
            companion.setMainichi(num.intValue());
        }
    }

    public static final void v3(m6 m6Var, EmomoUserViewFragment emomoUserViewFragment, Boolean bool) {
        p.h(emomoUserViewFragment, "this$0");
        FrameLayout frameLayout = m6Var.B;
        p.g(bool, "isDisplayTargetUserAvatar");
        frameLayout.setX(bool.booleanValue() ? 0.0f : 10000.0f);
        if (bool.booleanValue()) {
            nf.j jVar = emomoUserViewFragment.B0;
            nf.j jVar2 = null;
            if (jVar == null) {
                p.v("store");
                jVar = null;
            }
            jf.c value = jVar.g().getValue();
            if (value == null) {
                return;
            }
            GlideRequest<File> asFile = GlideApp.with(emomoUserViewFragment.N2()).asFile();
            ClosetBackground background = value.f().getBackground();
            asFile.load(background != null ? background.getUrl() : null).into((GlideRequest<File>) new h());
            UnityManager.Companion companion = UnityManager.Companion;
            UnityManager companion2 = companion.getInstance();
            ClosetAccessoryAsset companionType = value.f().getCompanionType();
            companion2.setCompanionName((companionType == null || (r3 = companionType.getName()) == null) ? "" : "");
            UnityManager companion3 = companion.getInstance();
            nf.j jVar3 = emomoUserViewFragment.B0;
            if (jVar3 == null) {
                p.v("store");
            } else {
                jVar2 = jVar3;
            }
            Integer f10 = jVar2.i().f();
            if (f10 == null) {
                f10 = 0;
            }
            companion3.setMainichi(f10.intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        f fVar = new f();
        b bVar = new b(this);
        xq.a a10 = gq.a.a(this);
        c cVar = new c(bVar);
        this.B0 = (nf.j) ((androidx.lifecycle.q0) e0.a(this, f0.b(nf.j.class), new e(cVar), new d(bVar, null, fVar, a10)).getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        this.C0 = null;
        r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        p.h(view, "view");
        super.e2(view, bundle);
        final m6 T = m6.T(view);
        a1().g().a(new r() { // from class: com.dena.mirrorman.fragment.EmomoUserViewFragment$onViewCreated$1

            /* loaded from: classes2.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f26092a;

                static {
                    int[] iArr = new int[o.b.values().length];
                    iArr[o.b.ON_START.ordinal()] = 1;
                    iArr[o.b.ON_RESUME.ordinal()] = 2;
                    iArr[o.b.ON_PAUSE.ordinal()] = 3;
                    iArr[o.b.ON_STOP.ordinal()] = 4;
                    f26092a = iArr;
                }
            }

            @Override // androidx.lifecycle.r
            public void i(u uVar, o.b bVar) {
                MRUnityPlayer s32;
                MRUnityPlayer s33;
                p.h(uVar, "source");
                p.h(bVar, "event");
                int i10 = a.f26092a[bVar.ordinal()];
                if (i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    UnityManager.Companion.getInstance().setCollabo001();
                    s33 = EmomoUserViewFragment.this.s3();
                    s33.stop();
                    return;
                }
                s32 = EmomoUserViewFragment.this.s3();
                FrameLayout frameLayout = T.B;
                p.g(frameLayout, "binding.avatarContainer");
                s32.start(frameLayout);
                UnityManager.Companion companion = UnityManager.Companion;
                companion.getInstance().setCollabo004();
                companion.getInstance().getCollabAvatarManager().stopCollabMode();
                j jVar = EmomoUserViewFragment.this.B0;
                j jVar2 = null;
                if (jVar == null) {
                    p.v("store");
                    jVar = null;
                }
                if (p.c(jVar.j().f(), Boolean.TRUE)) {
                    return;
                }
                EmomoUserViewFragment.this.r3().hideBackground();
                j jVar3 = EmomoUserViewFragment.this.B0;
                if (jVar3 == null) {
                    p.v("store");
                } else {
                    jVar2 = jVar3;
                }
                c value = jVar2.g().getValue();
                if (value != null) {
                    EmomoUserViewFragment.this.r3().loadAvatar(value);
                }
            }
        });
        nf.j jVar = null;
        uo.l.d(this, null, null, new g(null), 3, null);
        nf.j jVar2 = this.B0;
        if (jVar2 == null) {
            p.v("store");
            jVar2 = null;
        }
        jVar2.i().i(a1(), new androidx.lifecycle.f0() { // from class: gf.y
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmomoUserViewFragment.u3(EmomoUserViewFragment.this, (Integer) obj);
            }
        });
        nf.j jVar3 = this.B0;
        if (jVar3 == null) {
            p.v("store");
        } else {
            jVar = jVar3;
        }
        jVar.j().i(a1(), new androidx.lifecycle.f0() { // from class: gf.x
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmomoUserViewFragment.v3(m6.this, this, (Boolean) obj);
            }
        });
        View view2 = T.C;
        p.g(view2, "binding.touchableView");
        g1.a(view2, new i());
        q3().h(t3());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f26065x0.getCoroutineContext();
    }

    public final od.i q3() {
        return (od.i) this.A0.getValue();
    }

    public final UnityActionCreator r3() {
        return (UnityActionCreator) this.f26067z0.getValue();
    }

    public final MRUnityPlayer s3() {
        return (MRUnityPlayer) this.f26066y0.getValue();
    }

    public final String t3() {
        return (String) this.D0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.C0 = context instanceof z ? (z) context : null;
    }
}
