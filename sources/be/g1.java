package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.g1;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarPartsResponse;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.unity.CameraDolly;
import com.dena.mirrorman.unity.UnityManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kq.a;

/* loaded from: classes2.dex */
public final class g1 extends androidx.fragment.app.e implements uo.q0 {
    public final /* synthetic */ da.j N0;
    public final AutoClearedValue O0;
    public i1 P0;
    public final wn.f Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public static final /* synthetic */ qo.h<Object>[] V0 = {jo.f0.d(new jo.s(g1.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentEmomoPoseBinding;", 0))};
    public static final a U0 = new a(null);
    public static final int W0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g1 a(boolean z10, boolean z11) {
            g1 g1Var = new g1();
            Bundle bundle = new Bundle();
            bundle.putBoolean("showCloseButton", z10);
            bundle.putBoolean("showRetakeButton", z11);
            g1Var.V2(bundle);
            return g1Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(g1.this.M2().getBoolean("showCloseButton"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<Boolean> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(g1.this.M2().getBoolean("showRetakeButton"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends Dialog {
        public d(Context context) {
            super(context, 16973913);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (g1.this.O3()) {
                i1 i1Var = g1.this.P0;
                if (i1Var != null) {
                    i1Var.J2();
                }
                g1.this.n3();
            } else if (g1.this.P3()) {
                i1 i1Var2 = g1.this.P0;
                if (i1Var2 != null) {
                    i1Var2.u();
                }
                g1.this.n3();
            }
            super.onBackPressed();
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.EmomoPoseDialog$onResume$1", f = "EmomoPoseDialog.kt", l = {131}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17828w;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            List<ClosetAvatarSimpleValue> poses;
            ClosetAvatarSimpleValue closetAvatarSimpleValue;
            Object c10 = bo.c.c();
            int i10 = this.f17828w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f17828w = 1;
                if (uo.b1.a(1000L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            RecyclerView.h adapter = g1.this.L3().E.getAdapter();
            rd.k kVar = adapter instanceof rd.k ? (rd.k) adapter : null;
            if (kVar != null) {
                int h10 = kVar.h();
                ClosetAvatarPartsResponse f10 = g1.this.N3().J().f();
                if (f10 != null && (poses = f10.getPoses()) != null && (closetAvatarSimpleValue = (ClosetAvatarSimpleValue) xn.a0.a0(poses, h10)) != null) {
                    i1 i1Var = g1.this.P0;
                    if (i1Var != null) {
                        i1Var.U0(closetAvatarSimpleValue);
                    }
                    return wn.v.f59242a;
                }
                return wn.v.f59242a;
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17830a;

        public f(int i10) {
            this.f17830a = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            jo.p.h(rect, "outRect");
            jo.p.h(view, "view");
            jo.p.h(recyclerView, "parent");
            jo.p.h(b0Var, "state");
            if (recyclerView.f0(view) == 0) {
                rect.left = this.f17830a;
            }
            rect.right = this.f17830a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<ClosetAvatarSimpleValue> f17831w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ rd.k f17832x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ jo.a0 f17833y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ g1 f17834z;

        /* loaded from: classes2.dex */
        public static final class a implements View.OnLayoutChangeListener {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g1 f17835w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f17836x;

            public a(g1 g1Var, int i10) {
                this.f17835w = g1Var;
                this.f17836x = i10;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                jo.p.h(view, "view");
                view.removeOnLayoutChangeListener(this);
                RecyclerView.p layoutManager = this.f17835w.L3().E.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.J2(this.f17836x, (this.f17835w.L3().E.getWidth() / 2) - (this.f17835w.O0().getDimensionPixelSize(nd.x0.emomo_pose_item_size) / 2));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<ClosetAvatarSimpleValue> list, rd.k kVar, jo.a0 a0Var, g1 g1Var) {
            super(1);
            this.f17831w = list;
            this.f17832x = kVar;
            this.f17833y = a0Var;
            this.f17834z = g1Var;
        }

        public static final void c(jo.a0 a0Var, List list, g1 g1Var, int i10) {
            jo.p.h(a0Var, "$isFirstCommit");
            jo.p.h(list, "$poses");
            jo.p.h(g1Var, "this$0");
            if (a0Var.f38125w && (!list.isEmpty())) {
                RecyclerView recyclerView = g1Var.L3().E;
                jo.p.g(recyclerView, "binding.recyclerView");
                if (o3.c0.V(recyclerView) && !recyclerView.isLayoutRequested()) {
                    RecyclerView.p layoutManager = g1Var.L3().E.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.J2(i10, (g1Var.L3().E.getWidth() / 2) - (g1Var.O0().getDimensionPixelSize(nd.x0.emomo_pose_item_size) / 2));
                    }
                } else {
                    recyclerView.addOnLayoutChangeListener(new a(g1Var, i10));
                }
                a0Var.f38125w = false;
            }
            i1 i1Var = g1Var.P0;
            if (i1Var != null) {
                i1Var.U0((ClosetAvatarSimpleValue) list.get(i10));
            }
            g1Var.M3().D((ClosetAvatarSimpleValue) list.get(i10));
        }

        public final void b(final int i10) {
            List<ClosetAvatarSimpleValue> list = this.f17831w;
            ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    xn.s.t();
                }
                arrayList.add(wn.q.a((ClosetAvatarSimpleValue) obj, Boolean.valueOf(i11 == i10)));
                i11 = i12;
            }
            rd.k kVar = this.f17832x;
            final jo.a0 a0Var = this.f17833y;
            final List<ClosetAvatarSimpleValue> list2 = this.f17831w;
            final g1 g1Var = this.f17834z;
            kVar.f(arrayList, new Runnable() { // from class: be.h1
                @Override // java.lang.Runnable
                public final void run() {
                    g1.g.c(jo.a0.this, list2, g1Var, i10);
                }
            });
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            b(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<od.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17837w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17838x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17839y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17837w = componentCallbacks;
            this.f17838x = aVar;
            this.f17839y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.e] */
        @Override // io.a
        public final od.e invoke() {
            ComponentCallbacks componentCallbacks = this.f17837w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.e.class), this.f17838x, this.f17839y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f17840w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f17840w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f17840w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f17840w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17841w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar) {
            super(0);
            this.f17841w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f17841w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17842w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17843x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17844y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f17845z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f17842w = aVar;
            this.f17843x = aVar2;
            this.f17844y = aVar3;
            this.f17845z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f17842w;
            vq.a aVar2 = this.f17843x;
            io.a aVar3 = this.f17844y;
            xq.a aVar4 = this.f17845z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17846w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar) {
            super(0);
            this.f17846w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f17846w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public g1() {
        super(nd.b1.dialog_fragment_emomo_pose);
        this.N0 = new da.j();
        this.O0 = nd.a.a(this);
        i iVar = new i(this);
        xq.a a10 = gq.a.a(this);
        j jVar = new j(iVar);
        this.Q0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.f.class), new l(jVar), new k(iVar, null, null, a10));
        this.R0 = wn.g.b(wn.i.SYNCHRONIZED, new h(this, null, null));
        this.S0 = wn.g.a(new b());
        this.T0 = wn.g.a(new c());
    }

    public static final void Q3(g1 g1Var, View view) {
        jo.p.h(g1Var, "this$0");
        UnityManager.Companion.getInstance().restoreCameraDolly();
        i1 i1Var = g1Var.P0;
        if (i1Var != null) {
            i1Var.J2();
        }
    }

    public static final void R3(g1 g1Var, View view) {
        jo.p.h(g1Var, "this$0");
        UnityManager.Companion.getInstance().restoreCameraDolly();
        i1 i1Var = g1Var.P0;
        if (i1Var != null) {
            i1Var.u();
        }
    }

    public static final void S3(g1 g1Var, View view) {
        jo.p.h(g1Var, "this$0");
        i1 i1Var = g1Var.P0;
        if (i1Var != null) {
            i1Var.Y1();
        }
    }

    public static final void T3(g1 g1Var, ClosetAvatarPartsResponse closetAvatarPartsResponse) {
        jo.p.h(g1Var, "this$0");
        List<ClosetAvatarSimpleValue> poses = closetAvatarPartsResponse.getPoses();
        ClosetAvatar f10 = g1Var.N3().w0().f();
        g1Var.V3(poses, f10 != null ? f10.getPose() : null);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.P0 = null;
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    public final ae.r2 L3() {
        return (ae.r2) this.O0.b(this, V0[0]);
    }

    public final od.e M3() {
        return (od.e) this.R0.getValue();
    }

    public final nf.f N3() {
        return (nf.f) this.Q0.getValue();
    }

    public final boolean O3() {
        return ((Boolean) this.S0.getValue()).booleanValue();
    }

    public final boolean P3() {
        return ((Boolean) this.T0.getValue()).booleanValue();
    }

    public final void U3(ae.r2 r2Var) {
        this.O0.a(this, V0[0], r2Var);
    }

    public final void V3(List<ClosetAvatarSimpleValue> list, ClosetAvatarSimpleValue closetAvatarSimpleValue) {
        jo.a0 a0Var = new jo.a0();
        a0Var.f38125w = true;
        RecyclerView recyclerView = L3().E;
        rd.k kVar = new rd.k();
        kVar.l(new g(list, kVar, a0Var, this));
        Iterator<ClosetAvatarSimpleValue> it = list.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (jo.p.c(it.next().getValue(), closetAvatarSimpleValue != null ? closetAvatarSimpleValue.getValue() : null)) {
                break;
            }
            i10++;
        }
        kVar.m(Math.max(i10, 0));
        recyclerView.setAdapter(kVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        uo.l.d(this, null, null, new e(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        UnityManager.Companion.getInstance().setCameraDolly(CameraDolly.DEFAULT);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        ae.r2 T = ae.r2.T(view);
        T.C.setVisibility(O3() ? 0 : 8);
        T.D.setVisibility(P3() ? 0 : 8);
        T.C.setOnClickListener(new View.OnClickListener() { // from class: be.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g1.Q3(g1.this, view2);
            }
        });
        T.D.setOnClickListener(new View.OnClickListener() { // from class: be.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g1.R3(g1.this, view2);
            }
        });
        T.B.setOnClickListener(new View.OnClickListener() { // from class: be.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g1.S3(g1.this, view2);
            }
        });
        T.E.setItemAnimator(null);
        T.E.setLayoutManager(new LinearLayoutManager(q0(), 0, false));
        T.E.g(new f(O0().getDimensionPixelSize(nd.x0.emomo_pose_item_horizontal_margin)));
        jo.p.g(T, "bind(view).apply {\n     …}\n            )\n        }");
        U3(T);
        N3().J().i(a1(), new androidx.lifecycle.f0() { // from class: be.f1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                g1.T3(g1.this, (ClosetAvatarPartsResponse) obj);
            }
        });
        if (N3().J().f() == null) {
            M3().i();
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        d dVar = new d(N2());
        w3(false);
        return dVar;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.P0 = context instanceof i1 ? (i1) context : null;
    }
}
