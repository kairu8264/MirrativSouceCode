package hc;

import ac.f3;
import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.response.GroupShotViewer;
import com.dena.mirrorman.unity.UnityManager;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kq.a;
import sf.i;

/* loaded from: classes2.dex */
public final class x0 extends Fragment implements uo.q0 {
    public final wn.f A0;
    public final wn.f B0;
    public nf.h0 C0;
    public final wn.f D0;
    public y0 E0;
    public String F0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f35289x0 = uo.r0.b();

    /* renamed from: y0  reason: collision with root package name */
    public final AutoClearedValue f35290y0 = nd.a.a(this);

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f35291z0;
    public static final /* synthetic */ qo.h<Object>[] H0 = {jo.f0.d(new jo.s(x0.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/FragmentGroupShotSnapBinding;", 0))};
    public static final a G0 = new a(null);
    public static final int I0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final x0 a(String str) {
            jo.p.h(str, "referer");
            x0 x0Var = new x0();
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_KEY_REFERER", str);
            x0Var.V2(bundle);
            return x0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f35292w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f35292w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f35292w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f35292w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35293w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a aVar) {
            super(0);
            this.f35293w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f35293w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35294w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35295x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35296y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f35297z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f35294w = aVar;
            this.f35295x = aVar2;
            this.f35296y = aVar3;
            this.f35297z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f35294w;
            vq.a aVar2 = this.f35295x;
            io.a aVar3 = this.f35296y;
            xq.a aVar4 = this.f35297z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.h0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35298w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f35298w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f35298w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<RecyclerView.e0, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ androidx.recyclerview.widget.n f35299w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.recyclerview.widget.n nVar) {
            super(1);
            this.f35299w = nVar;
        }

        public final void a(RecyclerView.e0 e0Var) {
            jo.p.h(e0Var, "it");
            this.f35299w.H(e0Var);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(RecyclerView.e0 e0Var) {
            a(e0Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends n.i {
        public g(int i10) {
            super(i10, 0);
        }

        @Override // androidx.recyclerview.widget.n.f
        public void A(RecyclerView.e0 e0Var, int i10) {
            super.A(e0Var, i10);
            if (i10 == 2) {
                View view = e0Var != null ? e0Var.itemView : null;
                if (view == null) {
                    return;
                }
                view.setAlpha(0.5f);
            }
        }

        @Override // androidx.recyclerview.widget.n.f
        public void B(RecyclerView.e0 e0Var, int i10) {
            jo.p.h(e0Var, "viewHolder");
        }

        @Override // androidx.recyclerview.widget.n.f
        public void c(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            jo.p.h(recyclerView, "recyclerView");
            jo.p.h(e0Var, "viewHolder");
            super.c(recyclerView, e0Var);
            e0Var.itemView.setAlpha(1.0f);
        }

        @Override // androidx.recyclerview.widget.n.f
        public boolean y(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            jo.p.h(recyclerView, "recyclerView");
            jo.p.h(e0Var, "viewHolder");
            jo.p.h(e0Var2, "target");
            RecyclerView.h adapter = x0.this.r3().K.getAdapter();
            jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.streaming.groupshot.GroupShotViewerAdapter");
            b1 b1Var = (b1) adapter;
            b1Var.c(e0Var.getAdapterPosition(), e0Var2.getAdapterPosition());
            y0 y0Var = x0.this.E0;
            if (y0Var != null) {
                List<c1> b10 = b1Var.b();
                ArrayList arrayList = new ArrayList(xn.t.u(b10, 10));
                for (c1 c1Var : b10) {
                    arrayList.add(Integer.valueOf(c1Var.a()));
                }
                y0Var.f0(xn.a0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35301w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35302x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35303y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35301w = componentCallbacks;
            this.f35302x = aVar;
            this.f35303y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f35301w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f35302x, this.f35303y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35304w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35305x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35306y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35304w = componentCallbacks;
            this.f35305x = aVar;
            this.f35306y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f35304w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f35305x, this.f35306y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35307w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35308x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35309y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35307w = componentCallbacks;
            this.f35308x = aVar;
            this.f35309y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f35307w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f35308x, this.f35309y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f35310w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f35310w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f35310w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f35310w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35311w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar) {
            super(0);
            this.f35311w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f35311w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35312w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35313x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35314y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f35315z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f35312w = aVar;
            this.f35313x = aVar2;
            this.f35314y = aVar3;
            this.f35315z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f35312w;
            vq.a aVar2 = this.f35313x;
            io.a aVar3 = this.f35314y;
            xq.a aVar4 = this.f35315z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35316w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar) {
            super(0);
            this.f35316w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f35316w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o implements sf.i {

        @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotSnapFragment$startCountDown$1$onAnimationStart$1", f = "GroupShotSnapFragment.kt", l = {179}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f35318w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ x0 f35319x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x0 x0Var, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f35319x = x0Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f35319x, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                ClosetAvatarSimpleValue pose;
                String value;
                Object c10 = bo.c.c();
                int i10 = this.f35318w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f35318w = 1;
                    if (uo.b1.a(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                ClosetAvatar R = this.f35319x.s3().R();
                int i11 = 0;
                nf.h0 h0Var = null;
                if (R != null && (pose = R.getPose()) != null && (value = pose.getValue()) != null) {
                    UnityManager.setAnimationTrigger$default(UnityManager.Companion.getInstance(), value, 0, 2, null);
                }
                nf.h0 h0Var2 = this.f35319x.C0;
                if (h0Var2 == null) {
                    jo.p.v("store");
                } else {
                    h0Var = h0Var2;
                }
                List<GroupShotViewer> G = h0Var.G();
                if (G != null) {
                    for (Object obj2 : G) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            xn.s.t();
                        }
                        ClosetAvatarSimpleValue pose2 = ((GroupShotViewer) obj2).getAvatar().getPose();
                        if (pose2 != null) {
                            UnityManager.Companion.getInstance().setAnimationTrigger(pose2.getValue(), i12);
                        }
                        i11 = i12;
                    }
                }
                return wn.v.f59242a;
            }
        }

        public o() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            y0 y0Var = x0.this.E0;
            if (y0Var != null) {
                y0Var.e2();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            i.a.c(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            x0 x0Var = x0.this;
            uo.l.d(x0Var, null, null, new a(x0Var, null), 3, null);
        }
    }

    public x0() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f35291z0 = wn.g.b(iVar, new h(this, null, null));
        this.A0 = wn.g.b(iVar, new i(this, null, null));
        this.B0 = wn.g.b(iVar, new j(this, null, null));
        k kVar = new k(this);
        xq.a a10 = gq.a.a(this);
        l lVar = new l(kVar);
        this.D0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.f.class), new n(lVar), new m(kVar, null, null, a10));
    }

    public static final void w3(x0 x0Var, View view) {
        jo.p.h(x0Var, "this$0");
        y0 y0Var = x0Var.E0;
        if (y0Var != null) {
            y0Var.B0();
        }
    }

    public static final void x3(x0 x0Var, View view) {
        jo.p.h(x0Var, "this$0");
        x0Var.B3();
    }

    public static final void y3(x0 x0Var, View view) {
        jo.p.h(x0Var, "this$0");
        x0Var.r3().J.setVisibility(8);
        x0Var.r3().I.setVisibility(8);
        x0Var.r3().F.setVisibility(0);
    }

    public static final void z3(x0 x0Var, View view) {
        jo.p.h(x0Var, "this$0");
        x0Var.r3().J.setVisibility(0);
        x0Var.r3().I.setVisibility(0);
        x0Var.r3().F.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        b bVar = new b(this);
        xq.a a10 = gq.a.a(this);
        c cVar = new c(bVar);
        this.C0 = (nf.h0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(nf.h0.class), new e(cVar), new d(bVar, null, null, a10)).getValue());
    }

    public final void A3(f3 f3Var) {
        this.f35290y0.a(this, H0[0], f3Var);
    }

    public final void B3() {
        r3().B.setVisibility(8);
        r3().C.setVisibility(8);
        r3().J.setVisibility(8);
        r3().I.setVisibility(8);
        r3().F.setVisibility(8);
        r3().E.setVisibility(0);
        r3().E.e(new o());
        r3().E.r();
        MRLogger u32 = u3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GROUPSHOT_POSE_SELECT);
        builder.setTargetId(this.F0);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, t3().b())));
        u32.sendLog(builder.build());
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ViewDataBinding e10 = androidx.databinding.f.e(layoutInflater, xb.p.fragment_group_shot_snap, viewGroup, false);
        jo.p.g(e10, "inflate(\n            inf…          false\n        )");
        A3((f3) e10);
        View u10 = r3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        this.E0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Collection k10;
        Drawable f10;
        jo.p.h(view, "view");
        r3().B.setOnClickListener(new View.OnClickListener() { // from class: hc.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x0.w3(x0.this, view2);
            }
        });
        r3().C.setOnClickListener(new View.OnClickListener() { // from class: hc.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x0.x3(x0.this, view2);
            }
        });
        r3().I.setOnClickListener(new View.OnClickListener() { // from class: hc.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x0.y3(x0.this, view2);
            }
        });
        r3().F.setOnClickListener(new View.OnClickListener() { // from class: hc.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                x0.z3(x0.this, view2);
            }
        });
        r3().K.setLayoutManager(new LinearLayoutManager(N2()));
        r3().K.g(new p001if.c(de.e.b(this, 12), 0, de.e.b(this, 10), de.e.b(this, 16), de.e.b(this, 16), 0, 32, null));
        androidx.recyclerview.widget.n nVar = new androidx.recyclerview.widget.n(new g(3));
        nVar.m(r3().K);
        nf.h0 h0Var = this.C0;
        if (h0Var == null) {
            jo.p.v("store");
            h0Var = null;
        }
        List<GroupShotViewer> G = h0Var.G();
        if (G != null) {
            k10 = new ArrayList(xn.t.u(G, 10));
            int i10 = 0;
            for (Object obj : G) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    xn.s.t();
                }
                k10.add(c1.f35073e.a(((GroupShotViewer) obj).getUser(), i11));
                i10 = i11;
            }
        } else {
            k10 = xn.s.k();
        }
        RecyclerView recyclerView = r3().K;
        b1 b1Var = new b1();
        b1Var.h(xn.a0.o0(xn.r.d(new c1(v3().T4(), v3().u2(), v3().t4(), 0)), k10));
        b1Var.i(new f(nVar));
        recyclerView.setAdapter(b1Var);
        r3().K.g(new p001if.c(0, de.e.b(this, 16), 0, de.e.b(this, 16), 0, 0, 32, null));
        RecyclerView recyclerView2 = r3().K;
        androidx.recyclerview.widget.k kVar = new androidx.recyclerview.widget.k(N2(), 1);
        Context q02 = q0();
        if (q02 != null && (f10 = c3.a.f(q02, xb.n.divider_group_shot_member)) != null) {
            jo.p.g(f10, "context?.let { ContextCo…member) } ?: return@apply");
            kVar.n(f10);
        }
        recyclerView2.g(kVar);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f35289x0.getCoroutineContext();
    }

    public final f3 r3() {
        return (f3) this.f35290y0.b(this, H0[0]);
    }

    public final nf.f s3() {
        return (nf.f) this.D0.getValue();
    }

    public final kf.m t3() {
        return (kf.m) this.A0.getValue();
    }

    public final MRLogger u3() {
        return (MRLogger) this.B0.getValue();
    }

    public final kf.x v3() {
        return (kf.x) this.f35291z0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.E0 = context instanceof y0 ? (y0) context : null;
    }
}
