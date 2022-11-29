package r9;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.mirrativapi.closet.Closet;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.request.UpdateClosetNameRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kq.a;

/* loaded from: classes.dex */
public final class v extends androidx.fragment.app.e implements vb.f {
    public final AutoClearedValue N0 = nd.a.a(this);
    public vb.g O0;
    public final wn.f P0;
    public final wn.f Q0;
    public Closet R0;
    public b0 S0;
    public Closet T0;
    public final wn.f U0;
    public boolean V0;
    public static final /* synthetic */ qo.h<Object>[] X0 = {jo.f0.d(new jo.s(v.class, "binding", "getBinding()Lcom/dena/mirrativ/emomo/databinding/DialogFragmentClosetPickerBinding;", 0))};
    public static final a W0 = new a(null);
    public static final int Y0 = 8;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final v a() {
            return new v();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<Closet, wn.v> {
        public b() {
            super(1);
        }

        public final void a(Closet closet) {
            jo.p.h(closet, Referer.CLOSET);
            v.this.Z3(closet);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Closet closet) {
            a(closet);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<Closet, wn.v> {
        public c() {
            super(1);
        }

        public final void a(Closet closet) {
            jo.p.h(closet, Referer.CLOSET);
            v.this.T0 = closet;
            v.this.Q3().C.setVisibility(0);
            v.this.Q3().C.requestFocus();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Closet closet) {
            a(closet);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<Closet, wn.v> {
        public d() {
            super(1);
        }

        public final void a(Closet closet) {
            jo.p.h(closet, Referer.CLOSET);
            v.this.Z3(closet);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Closet closet) {
            a(closet);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<Closet, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s9.s f50500x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(s9.s sVar) {
            super(1);
            this.f50500x = sVar;
        }

        public final void a(Closet closet) {
            jo.p.h(closet, Referer.CLOSET);
            v.this.T0 = closet;
            v.this.Q3().C.setVisibility(0);
            this.f50500x.C.requestFocus();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Closet closet) {
            a(closet);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.a<od.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50501w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50502x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50503y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50501w = componentCallbacks;
            this.f50502x = aVar;
            this.f50503y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.e] */
        @Override // io.a
        public final od.e invoke() {
            ComponentCallbacks componentCallbacks = this.f50501w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.e.class), this.f50502x, this.f50503y);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50504w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50505x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50506y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50504w = componentCallbacks;
            this.f50505x = aVar;
            this.f50506y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f50504w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f50505x, this.f50506y);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50507w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f50507w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f50507w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f50507w.L2());
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50508w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.a aVar) {
            super(0);
            this.f50508w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f50508w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50509w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50510x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50511y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50512z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50509w = aVar;
            this.f50510x = aVar2;
            this.f50511y = aVar3;
            this.f50512z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50509w;
            vq.a aVar2 = this.f50510x;
            io.a aVar3 = this.f50511y;
            xq.a aVar4 = this.f50512z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50513w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar) {
            super(0);
            this.f50513w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f50513w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public v() {
        h hVar = new h(this);
        xq.a a10 = gq.a.a(this);
        i iVar = new i(hVar);
        this.P0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.f.class), new k(iVar), new j(hVar, null, null, a10));
        wn.i iVar2 = wn.i.SYNCHRONIZED;
        this.Q0 = wn.g.b(iVar2, new f(this, null, null));
        this.U0 = wn.g.b(iVar2, new g(this, null, null));
    }

    public static final void N3(v vVar, List list) {
        int i10;
        jo.p.h(vVar, "this$0");
        if (list != null) {
            ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
            Iterator it = list.iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Closet closet = (Closet) it.next();
                Closet f10 = vVar.S3().O().f();
                closet.setActive(f10 != null && closet.getClosetId() == f10.getClosetId());
                closet.setNameEdit(false);
                arrayList.add(wn.v.f59242a);
            }
            b0 b0Var = vVar.S0;
            wn.v vVar2 = null;
            if (b0Var != null) {
                if (b0Var != null) {
                    b0Var.f(list);
                }
                b0 b0Var2 = vVar.S0;
                if (b0Var2 != null) {
                    b0Var2.notifyDataSetChanged();
                    vVar2 = wn.v.f59242a;
                }
            }
            if (vVar2 == null) {
                vVar.S0 = new b0(list, new b(), new c());
                vVar.Q3().D.setAdapter(vVar.S0);
            }
            ArrayList arrayList2 = new ArrayList(xn.t.u(list, 10));
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    xn.s.t();
                }
                if (((Closet) obj).getActive()) {
                    vVar.c4(i10);
                }
                arrayList2.add(wn.v.f59242a);
                i10 = i11;
            }
        }
    }

    public static final void O3(v vVar, Boolean bool) {
        jo.p.h(vVar, "this$0");
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            vVar.Q3().F.setVisibility(0);
        } else {
            vVar.Q3().F.setVisibility(8);
        }
    }

    public static final void U3(v vVar, View view) {
        jo.p.h(vVar, "this$0");
        vVar.n3();
    }

    public static final boolean V3(v vVar, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(vVar, "this$0");
        if (i10 == 6) {
            vVar.P3();
            return true;
        }
        return false;
    }

    public static final void W3(v vVar, View view, boolean z10) {
        jo.p.h(vVar, "this$0");
        if (z10) {
            of.j.f45405a.d(vVar.N2(), (EditText) view, 100);
            vVar.d4();
            return;
        }
        of.j.f45405a.c(vVar.N2(), view);
        vVar.P3();
    }

    public static final void X3(v vVar, View view) {
        jo.p.h(vVar, "this$0");
        vVar.P3();
        vVar.n3();
    }

    public static final boolean Y3(v vVar, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        jo.p.h(vVar, "this$0");
        if (keyEvent.getAction() == 1 && i10 == 4) {
            vVar.n3();
            return true;
        }
        return false;
    }

    public static final void a4(v vVar) {
        jo.p.h(vVar, "this$0");
        vVar.V0 = false;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        super.I1();
    }

    public final void M3() {
        S3().K().i(this, new androidx.lifecycle.f0() { // from class: r9.t
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                v.N3(v.this, (List) obj);
            }
        });
        S3().M0().i(this, new androidx.lifecycle.f0() { // from class: r9.s
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                v.O3(v.this, (Boolean) obj);
            }
        });
    }

    public final void P3() {
        Closet closet = this.T0;
        if (closet == null) {
            return;
        }
        closet.setName(String.valueOf(Q3().C.getText()));
        closet.setNameEdit(false);
        R3().v(new UpdateClosetNameRequest(closet.getClosetId(), closet.getName()));
        this.T0 = null;
        Q3().C.clearFocus();
        Q3().C.setVisibility(8);
        Q3().H.setVisibility(8);
        MRLogger T3 = T3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_SLOT_EDIT_NAME);
        builder.setTargetId(String.valueOf(closet.getClosetId()));
        T3.sendLog(builder.build());
    }

    public final s9.s Q3() {
        return (s9.s) this.N0.b(this, X0[0]);
    }

    public final od.e R3() {
        return (od.e) this.Q0.getValue();
    }

    public final nf.f S3() {
        return (nf.f) this.P0.getValue();
    }

    @Override // vb.f
    public void T1() {
    }

    public final MRLogger T3() {
        return (MRLogger) this.U0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        M3();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z3(com.dena.mirrativ.mirrativapi.closet.Closet r7) {
        /*
            r6 = this;
            s9.s r0 = r6.Q3()
            androidx.recyclerview.widget.RecyclerView r0 = r0.D
            androidx.recyclerview.widget.RecyclerView$p r0 = r0.getLayoutManager()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r2 = 0
            if (r1 == 0) goto L12
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            goto L13
        L12:
            r0 = r2
        L13:
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L69
            int r4 = r0.e2()
            int r5 = r0.j2()
            if (r4 != r5) goto L26
            int r0 = r0.e2()
            goto L3c
        L26:
            int r4 = r0.j2()
            int r5 = r0.e2()
            int r4 = r4 - r5
            if (r4 != r3) goto L3b
            int r0 = r0.e2()
            if (r0 != 0) goto L39
            r0 = r1
            goto L3c
        L39:
            r0 = 2
            goto L3c
        L3b:
            r0 = r3
        L3c:
            nf.f r4 = r6.S3()
            androidx.lifecycle.LiveData r4 = r4.K()
            java.lang.Object r4 = r4.f()
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L65
            java.lang.String r5 = "value"
            jo.p.g(r4, r5)
            java.lang.Object r0 = xn.a0.a0(r4, r0)
            com.dena.mirrativ.mirrativapi.closet.Closet r0 = (com.dena.mirrativ.mirrativapi.closet.Closet) r0
            if (r0 == 0) goto L65
            int r0 = r0.getClosetId()
            int r4 = r7.getClosetId()
            if (r0 != r4) goto L65
            r0 = r3
            goto L66
        L65:
            r0 = r1
        L66:
            if (r0 != 0) goto L69
            return
        L69:
            boolean r0 = r6.V0
            if (r0 != 0) goto Lc7
            r6.V0 = r3
            nf.f r0 = r6.S3()
            boolean r0 = r0.Q()
            if (r0 == 0) goto L8b
            r6.R0 = r7
            r9.f$a r0 = r9.f.P0
            r9.f r0 = r9.f.a.b(r0, r1, r3, r2)
            androidx.fragment.app.FragmentManager r1 = r6.p0()
            java.lang.String r2 = "ClosetConfirmDestroyDialog"
            r0.z3(r1, r2)
            goto L99
        L8b:
            vb.g r0 = r6.O0
            if (r0 == 0) goto L96
            int r1 = r7.getClosetId()
            r0.E(r1)
        L96:
            r6.n3()
        L99:
            com.dena.mirrorman.clientlog.logs.MRLogger r0 = r6.T3()
            com.dena.mirrorman.clientlog.logs.MRLog$Companion r1 = com.dena.mirrorman.clientlog.logs.MRLog.Companion
            com.dena.mirrorman.clientlog.logs.MRLog$Builder r1 = new com.dena.mirrorman.clientlog.logs.MRLog$Builder
            java.lang.String r2 = "avatar_slot.select"
            r1.<init>(r2)
            int r7 = r7.getClosetId()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r1.setTargetId(r7)
            com.dena.mirrorman.clientlog.logs.MRLog r7 = r1.build()
            r0.sendLog(r7)
            android.os.Handler r7 = new android.os.Handler
            r7.<init>()
            r9.u r0 = new r9.u
            r0.<init>()
            r1 = 300(0x12c, double:1.48E-321)
            r7.postDelayed(r0, r1)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.v.Z3(com.dena.mirrativ.mirrativapi.closet.Closet):void");
    }

    public final void b4(s9.s sVar) {
        this.N0.a(this, X0[0], sVar);
    }

    public final void c4(int i10) {
        RecyclerView.p layoutManager = Q3().D.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            layoutManager.R1(Q3().D, null, i10);
        }
    }

    public final void d4() {
        Closet closet = this.T0;
        if (closet == null) {
            return;
        }
        Q3().C.setText(closet.getName());
        Q3().C.setVisibility(0);
        Q3().H.setVisibility(0);
        c4(closet.getClosetId() - 1);
    }

    @Override // vb.f
    public void f2() {
        vb.g gVar = this.O0;
        if (gVar != null) {
            Closet closet = this.R0;
            gVar.E(closet != null ? closet.getClosetId() : 1);
        }
        n3();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        wn.v vVar = null;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), q9.h.dialog_fragment_closet_picker, null, false);
        s9.s sVar = (s9.s) e10;
        new androidx.recyclerview.widget.s().b(sVar.D);
        RecyclerView recyclerView = sVar.D;
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        int b10 = of.t.b(N2, 17);
        Context N22 = N2();
        jo.p.g(N22, "requireContext()");
        int b11 = of.t.b(N22, 68);
        Context N23 = N2();
        jo.p.g(N23, "requireContext()");
        recyclerView.g(new p001if.c(b10, b11, 0, of.t.b(N23, 68), 0, 0));
        sVar.B.setOnClickListener(new View.OnClickListener() { // from class: r9.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.U3(v.this, view);
            }
        });
        sVar.C.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: r9.r
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean V3;
                V3 = v.V3(v.this, textView, i10, keyEvent);
                return V3;
            }
        });
        sVar.C.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: r9.q
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                v.W3(v.this, view, z10);
            }
        });
        List<Closet> f10 = S3().K().f();
        if (f10 != null) {
            jo.p.g(f10, "it");
            b0 b0Var = new b0(f10, new d(), new e(sVar));
            this.S0 = b0Var;
            sVar.D.setAdapter(b0Var);
            vVar = wn.v.f59242a;
        }
        if (vVar == null) {
            R3().k();
            R3().i();
        }
        sVar.E.setOnClickListener(new View.OnClickListener() { // from class: r9.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.X3(v.this, view);
            }
        });
        jo.p.g(e10, "inflate<DialogFragmentCl…)\n            }\n        }");
        b4(sVar);
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(Q3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: r9.n
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                boolean Y3;
                Y3 = v.Y3(v.this, dialogInterface, i10, keyEvent);
                return Y3;
            }
        });
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.O0 = context instanceof vb.g ? (vb.g) context : null;
    }
}
