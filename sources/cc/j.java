package cc;

import ac.h6;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import oq.a;
import uo.d2;
import uo.g1;

/* loaded from: classes2.dex */
public final class j extends RecyclerView.e0 implements oq.a {

    /* renamed from: y  reason: collision with root package name */
    public static final a f19063y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f19064z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final h6 f19065w;

    /* renamed from: x  reason: collision with root package name */
    public d2 f19066x;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_gift_ranking_current_user_rank, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new j((h6) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ CharSequence f19068x;

        public b(CharSequence charSequence) {
            this.f19068x = charSequence;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            d2 d10;
            jo.p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            j jVar = j.this;
            d10 = uo.l.d(uo.r0.a(g1.c()), null, null, new c(this.f19068x, null), 3, null);
            jVar.f19066x = d10;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.GiftRankingCurrentUserRankViewHolder$attach$1$1", f = "GiftRankingCurrentUserRankViewHolder.kt", l = {56, 64}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public int A;
        public final /* synthetic */ CharSequence C;

        /* renamed from: w  reason: collision with root package name */
        public int f19069w;

        /* renamed from: x  reason: collision with root package name */
        public int f19070x;

        /* renamed from: y  reason: collision with root package name */
        public Object f19071y;

        /* renamed from: z  reason: collision with root package name */
        public Object f19072z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CharSequence charSequence, ao.d<? super c> dVar) {
            super(2, dVar);
            this.C = charSequence;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00d1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00cf -> B:19:0x00d2). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 225
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cc.j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j(h6 h6Var) {
        super(h6Var.u());
        this.f19065w = h6Var;
    }

    public /* synthetic */ j(h6 h6Var, jo.h hVar) {
        this(h6Var);
    }

    public final void c() {
        d2 d10;
        d2 d2Var = this.f19066x;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        CharSequence text = this.f19065w.O.getText();
        ConstraintLayout constraintLayout = this.f19065w.N;
        jo.p.g(constraintLayout, "binding.titleContainer");
        if (o3.c0.V(constraintLayout) && !constraintLayout.isLayoutRequested()) {
            d10 = uo.l.d(uo.r0.a(g1.c()), null, null, new c(text, null), 3, null);
            this.f19066x = d10;
        } else {
            constraintLayout.addOnLayoutChangeListener(new b(text));
        }
        float desiredWidth = Layout.getDesiredWidth(text, this.f19065w.O.getPaint());
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(this.f19065w.N);
        cVar.m(this.f19065w.O.getId(), ((int) desiredWidth) + de.m.a(this, 100));
        cVar.c(this.f19065w.N);
    }

    public final void d(t0 t0Var) {
        jo.p.h(t0Var, "bindModel");
        this.f19065w.T(t0Var);
        if (t0Var.h()) {
            AppCompatImageView appCompatImageView = this.f19065w.C;
            jo.p.g(appCompatImageView, "binding.focusedEventImageView");
            td.a.x(appCompatImageView, Integer.valueOf(xb.n.K0));
        }
        this.f19065w.o();
    }

    public final void f() {
        d2 d2Var = this.f19066x;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
    }

    public final void g() {
        this.f19065w.M.r();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
