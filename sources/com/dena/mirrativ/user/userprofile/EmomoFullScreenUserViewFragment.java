package com.dena.mirrativ.user.userprofile;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import com.dena.mirrativ.user.userprofile.EmomoFullScreenUserViewFragment;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.unity.ClosetFocusType;
import com.dena.mirrorman.unity.MRUnityPlayer;
import com.dena.mirrorman.unity.UnityActionCreator;
import com.dena.mirrorman.unity.UnityManager;
import jo.f0;
import jo.p;
import jo.q;
import kq.a;
import pc.c2;
import uo.q0;
import uo.r0;
import wn.v;
import yd.g1;

/* loaded from: classes2.dex */
public final class EmomoFullScreenUserViewFragment extends Fragment implements q0 {
    public static final a E0 = new a(null);
    public static final int F0 = 8;
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public nf.j D0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f24915x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f24916y0;

    /* renamed from: z0  reason: collision with root package name */
    public md.d f24917z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final EmomoFullScreenUserViewFragment a(String str) {
            p.h(str, "userId");
            EmomoFullScreenUserViewFragment emomoFullScreenUserViewFragment = new EmomoFullScreenUserViewFragment();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_USER_ID", str);
            emomoFullScreenUserViewFragment.V2(bundle);
            return emomoFullScreenUserViewFragment;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends androidx.activity.e {
        public b() {
            super(true);
        }

        @Override // androidx.activity.e
        public void b() {
            md.d dVar = EmomoFullScreenUserViewFragment.this.f24917z0;
            if (dVar != null) {
                dVar.E2();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f24919w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f24919w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f24919w.L2();
            p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f24919w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24920w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar) {
            super(0);
            this.f24920w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f24920w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24921w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24922x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24923y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24924z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24921w = aVar;
            this.f24922x = aVar2;
            this.f24923y = aVar3;
            this.f24924z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24921w;
            vq.a aVar2 = this.f24922x;
            io.a aVar3 = this.f24923y;
            xq.a aVar4 = this.f24924z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(nf.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24925w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar) {
            super(0);
            this.f24925w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f24925w.invoke()).U();
            p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<uq.a> {
        public g() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(EmomoFullScreenUserViewFragment.this.s3());
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.l<View, v> {
        public h() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            md.d dVar = EmomoFullScreenUserViewFragment.this.f24917z0;
            if (dVar != null) {
                dVar.E2();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.l<Float, v> {
        public i() {
            super(1);
        }

        public final void a(float f10) {
            EmomoFullScreenUserViewFragment.this.q3().setClosetScale(f10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Float f10) {
            a(f10.floatValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.p<Float, Float, v> {
        public j() {
            super(2);
        }

        public final void a(float f10, float f11) {
            EmomoFullScreenUserViewFragment.this.q3().setClosetRotation(f10, f11);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(Float f10, Float f11) {
            a(f10.floatValue(), f11.floatValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<v> {
        public k() {
            super(0);
        }

        public final void a() {
            nf.j jVar = EmomoFullScreenUserViewFragment.this.D0;
            if (jVar == null) {
                p.v("emomoUserViewStore");
                jVar = null;
            }
            jf.c value = jVar.g().getValue();
            if (value != null) {
                EmomoFullScreenUserViewFragment.this.q3().playRandomMotion(value);
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends q implements io.a<UnityActionCreator> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24931w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24932x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24933y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24931w = componentCallbacks;
            this.f24932x = aVar;
            this.f24933y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.UnityActionCreator, java.lang.Object] */
        @Override // io.a
        public final UnityActionCreator invoke() {
            ComponentCallbacks componentCallbacks = this.f24931w;
            return gq.a.a(componentCallbacks).c(f0.b(UnityActionCreator.class), this.f24932x, this.f24933y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24934w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24935x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24936y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24934w = componentCallbacks;
            this.f24935x = aVar;
            this.f24936y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f24934w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f24935x, this.f24936y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends q implements io.a<MRUnityPlayer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24937w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24938x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24939y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24937w = componentCallbacks;
            this.f24938x = aVar;
            this.f24939y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.MRUnityPlayer, java.lang.Object] */
        @Override // io.a
        public final MRUnityPlayer invoke() {
            ComponentCallbacks componentCallbacks = this.f24937w;
            return gq.a.a(componentCallbacks).c(f0.b(MRUnityPlayer.class), this.f24938x, this.f24939y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends q implements io.a<String> {
        public o() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = EmomoFullScreenUserViewFragment.this.M2().getString("EXTRA_USER_ID");
            p.e(string);
            return string;
        }
    }

    public EmomoFullScreenUserViewFragment() {
        super(nc.f.fragment_emomo_full_screen_user_view);
        this.f24915x0 = new da.j();
        this.f24916y0 = wn.g.a(new o());
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.A0 = wn.g.b(iVar, new l(this, null, null));
        this.B0 = wn.g.b(iVar, new m(this, null, null));
        this.C0 = wn.g.b(iVar, new n(this, null, null));
    }

    public static final void t3(EmomoFullScreenUserViewFragment emomoFullScreenUserViewFragment, Boolean bool) {
        md.d dVar;
        p.h(emomoFullScreenUserViewFragment, "this$0");
        if (bool.booleanValue() || (dVar = emomoFullScreenUserViewFragment.f24917z0) == null) {
            return;
        }
        dVar.E2();
    }

    @Override // androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        g gVar = new g();
        c cVar = new c(this);
        xq.a a10 = gq.a.a(this);
        d dVar = new d(cVar);
        this.D0 = (nf.j) ((androidx.lifecycle.q0) e0.a(this, f0.b(nf.j.class), new f(dVar), new e(cVar, null, gVar, a10)).getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        this.f24917z0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        p.h(view, "view");
        super.e2(view, bundle);
        final c2 T = c2.T(view);
        UnityManager.Companion.getInstance().closetFocus(ClosetFocusType.MAIN, true);
        MRLogger p32 = p3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_OTHER_USER_PROFILE_EMOMO_VIEW_IMP);
        builder.setTargetId(s3());
        p32.sendLog(builder.build());
        AppCompatImageView appCompatImageView = T.C;
        p.g(appCompatImageView, "binding.closeImageView");
        g1.a(appCompatImageView, new h());
        T.D.setOnScaleListener(new i());
        T.D.setOnScrollListener(new j());
        T.D.setOnClickListener(new k());
        nf.j jVar = this.D0;
        if (jVar == null) {
            p.v("emomoUserViewStore");
            jVar = null;
        }
        jVar.j().i(a1(), new androidx.lifecycle.f0() { // from class: md.c
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmomoFullScreenUserViewFragment.t3(EmomoFullScreenUserViewFragment.this, (Boolean) obj);
            }
        });
        a1().g().a(new r() { // from class: com.dena.mirrativ.user.userprofile.EmomoFullScreenUserViewFragment$onViewCreated$7

            /* loaded from: classes2.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f24943a;

                static {
                    int[] iArr = new int[o.b.values().length];
                    iArr[o.b.ON_START.ordinal()] = 1;
                    iArr[o.b.ON_RESUME.ordinal()] = 2;
                    iArr[o.b.ON_PAUSE.ordinal()] = 3;
                    iArr[o.b.ON_STOP.ordinal()] = 4;
                    f24943a = iArr;
                }
            }

            @Override // androidx.lifecycle.r
            public void i(u uVar, o.b bVar) {
                MRUnityPlayer r32;
                MRUnityPlayer r33;
                p.h(uVar, "source");
                p.h(bVar, "event");
                int i10 = a.f24943a[bVar.ordinal()];
                if (i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    UnityManager.Companion.getInstance().initCloset(false);
                    r33 = EmomoFullScreenUserViewFragment.this.r3();
                    r33.stop();
                    return;
                }
                UnityManager.Companion.getInstance().initCloset(true);
                r32 = EmomoFullScreenUserViewFragment.this.r3();
                FrameLayout frameLayout = T.B;
                p.g(frameLayout, "binding.avatarContainer");
                r32.start(frameLayout);
            }
        });
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f24915x0.getCoroutineContext();
    }

    public final MRLogger p3() {
        return (MRLogger) this.B0.getValue();
    }

    public final UnityActionCreator q3() {
        return (UnityActionCreator) this.A0.getValue();
    }

    public final MRUnityPlayer r3() {
        return (MRUnityPlayer) this.C0.getValue();
    }

    public final String s3() {
        return (String) this.f24916y0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.f24917z0 = context instanceof md.d ? (md.d) context : null;
        L2().c1().a(this, new b());
    }
}
