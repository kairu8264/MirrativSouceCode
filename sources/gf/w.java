package gf;

import ae.k6;
import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetBackground;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.dena.mirrorman.unity.MRUnityPlayer;
import com.dena.mirrorman.unity.UnityAnimation;
import com.dena.mirrorman.unity.UnityManager;
import java.io.File;
import kq.a;
import nd.b1;

/* loaded from: classes2.dex */
public final class w extends Fragment {
    public static final a B0 = new a(null);
    public static final int C0 = 8;
    public final wn.f A0;

    /* renamed from: x0  reason: collision with root package name */
    public k6 f33488x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f33489y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f33490z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w a() {
            return new w();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends f8.c<File> {
        public b() {
        }

        @Override // f8.j
        /* renamed from: a */
        public void e(File file, g8.b<? super File> bVar) {
            jo.p.h(file, "resource");
            w.this.r3().f().p(file);
        }

        @Override // f8.j
        public void g(Drawable drawable) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<MRUnityPlayer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33492w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33493x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33494y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33492w = componentCallbacks;
            this.f33493x = aVar;
            this.f33494y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.MRUnityPlayer, java.lang.Object] */
        @Override // io.a
        public final MRUnityPlayer invoke() {
            ComponentCallbacks componentCallbacks = this.f33492w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRUnityPlayer.class), this.f33493x, this.f33494y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f33495w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f33495w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f33495w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f33495w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33496w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f33496w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f33496w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33497w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33498x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33499y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f33500z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f33497w = aVar;
            this.f33498x = aVar2;
            this.f33499y = aVar3;
            this.f33500z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f33497w;
            vq.a aVar2 = this.f33498x;
            io.a aVar3 = this.f33499y;
            xq.a aVar4 = this.f33500z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33501w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar) {
            super(0);
            this.f33501w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f33501w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f33502w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f33502w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f33502w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f33502w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33503w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.a aVar) {
            super(0);
            this.f33503w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f33503w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33504w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33505x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33506y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f33507z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f33504w = aVar;
            this.f33505x = aVar2;
            this.f33506y = aVar3;
            this.f33507z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f33504w;
            vq.a aVar2 = this.f33505x;
            io.a aVar3 = this.f33506y;
            xq.a aVar4 = this.f33507z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(je.e.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33508w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar) {
            super(0);
            this.f33508w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f33508w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public w() {
        super(b1.fragment_emomo_stream_view);
        this.f33489y0 = wn.g.b(wn.i.SYNCHRONIZED, new c(this, null, null));
        d dVar = new d(this);
        xq.a a10 = gq.a.a(this);
        e eVar = new e(dVar);
        this.f33490z0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.f.class), new g(eVar), new f(dVar, null, null, a10));
        h hVar = new h(this);
        xq.a a11 = gq.a.a(this);
        i iVar = new i(hVar);
        this.A0 = androidx.fragment.app.e0.a(this, jo.f0.b(je.e.class), new k(iVar), new j(hVar, null, null, a11));
    }

    public static final void n3(w wVar, jf.c cVar) {
        jo.p.h(wVar, "this$0");
        jf.c q32 = wVar.q3(cVar);
        if (q32 == null) {
            return;
        }
        q32.g("AVATAR_KEY");
        if (wVar.r3().f().f() == null) {
            ClosetBackground background = q32.f().getBackground();
            GlideApp.with(wVar).asFile().load(background != null ? background.getUrl() : null).into((GlideRequest<File>) new b());
        }
        UnityManager.Companion.getInstance().loadAvatarModel(q32, 0);
    }

    public static final void t3(File file) {
        if (file == null) {
            return;
        }
        UnityManager companion = UnityManager.Companion.getInstance();
        String absolutePath = file.getAbsolutePath();
        jo.p.g(absolutePath, "it.absolutePath");
        companion.setBackground(absolutePath);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        this.f33488x0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void S1() {
        super.S1();
        p3().I().o(a1());
        r3().f().p(null);
        UnityManager.Companion companion = UnityManager.Companion;
        companion.getInstance().setTranslucentBackground();
        UnityManager.setAnimation$default(companion.getInstance(), UnityAnimation.POSE_RESET, 0, 2, null);
        UnityManager.setCameraDolly$default(companion.getInstance(), null, 1, null);
        s3().stop();
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        MRUnityPlayer s32 = s3();
        FrameLayout frameLayout = o3().B;
        jo.p.g(frameLayout, "binding.avatarContainer");
        s32.start(frameLayout);
        m3();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        this.f33488x0 = k6.T(view);
        try {
            r3().f().i(a1(), v.f33487a);
        } catch (Throwable th2) {
            g9.a.c(th2);
        }
        UnityManager.Companion.getInstance().unloadAvatarModel(0);
    }

    public final void m3() {
        p3().I().i(a1(), new androidx.lifecycle.f0() { // from class: gf.u
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                w.n3(w.this, (jf.c) obj);
            }
        });
    }

    public final k6 o3() {
        k6 k6Var = this.f33488x0;
        jo.p.e(k6Var);
        return k6Var;
    }

    public final nf.f p3() {
        return (nf.f) this.f33490z0.getValue();
    }

    public final jf.c q3(jf.c cVar) {
        ClosetAvatar R;
        return (!p3().Q() || (R = p3().R()) == null) ? cVar : jf.c.f37906y.a(R.clone());
    }

    public final je.e r3() {
        return (je.e) this.A0.getValue();
    }

    public final MRUnityPlayer s3() {
        return (MRUnityPlayer) this.f33489y0.getValue();
    }

    public final void u3() {
        if (this.f33488x0 == null) {
            return;
        }
        MRUnityPlayer s32 = s3();
        FrameLayout frameLayout = o3().B;
        jo.p.g(frameLayout, "binding.avatarContainer");
        s32.start(frameLayout);
    }

    public final void v3() {
        s3().stop();
    }
}
