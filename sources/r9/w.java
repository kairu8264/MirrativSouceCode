package r9;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.mirrativapi.closet.Closet;
import com.dena.mirrorman.net.api.Referer;
import java.util.List;
import kq.a;

/* loaded from: classes.dex */
public final class w extends androidx.fragment.app.e implements j {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public final wn.f N0;
    public vb.p O0;
    public vb.h P0;
    public int Q0;

    /* loaded from: classes.dex */
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

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            w.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
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
            int closetId = closet.getClosetId();
            if (!closet.isUsed()) {
                vb.h hVar = w.this.P0;
                if (hVar != null) {
                    hVar.O1(closet.getClosetId());
                }
                w.this.n3();
                return;
            }
            w.this.Q0 = closetId;
            w wVar = w.this;
            String V0 = wVar.V0(q9.i.text_emomo_notice_existing_data, wVar.V0(q9.i.I, String.valueOf(closetId)));
            jo.p.g(V0, "getString(R.string.text_…tedClosetId).toString()))");
            i.P0.a(V0).z3(w.this.p0(), "ClosetConfirmOverrideDialog");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Closet closet) {
            a(closet);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50522w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f50522w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f50522w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f50522w.L2());
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50523w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f50523w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f50523w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50524w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50525x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50526y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50527z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50524w = aVar;
            this.f50525x = aVar2;
            this.f50526y = aVar3;
            this.f50527z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50524w;
            vq.a aVar2 = this.f50525x;
            io.a aVar3 = this.f50526y;
            xq.a aVar4 = this.f50527z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50528w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar) {
            super(0);
            this.f50528w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f50528w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public w() {
        super(q9.h.dialog_fragment_closet_save_slot_picker);
        d dVar = new d(this);
        xq.a a10 = gq.a.a(this);
        e eVar = new e(dVar);
        this.N0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.f.class), new g(eVar), new f(dVar, null, null, a10));
    }

    public final nf.f D3() {
        return (nf.f) this.N0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        this.P0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        s9.u T = s9.u.T(view);
        View view2 = T.B;
        jo.p.g(view2, "binding.closeButton");
        yd.g1.a(view2, new b());
        T.C.setLayoutManager(new LinearLayoutManager(N2()));
        T.C.g(new p001if.c(de.e.b(this, 6), 0, 0, 0, 0, 0, 32, null));
        List<Closet> f10 = D3().K().f();
        if (f10 != null) {
            RecyclerView recyclerView = T.C;
            rd.f fVar = new rd.f();
            fVar.d(f10);
            fVar.j(new c());
            recyclerView.setAdapter(fVar);
        }
    }

    @Override // r9.j
    public void k() {
        vb.h hVar = this.P0;
        if (hVar != null) {
            hVar.O1(this.Q0);
        }
        n3();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), q9.j.f48844a);
        w3(false);
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.O0 = context instanceof vb.p ? (vb.p) context : null;
        this.P0 = context instanceof vb.h ? (vb.h) context : null;
    }
}
