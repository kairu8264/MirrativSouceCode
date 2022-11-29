package qf;

import ae.qf;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import uo.d2;

/* loaded from: classes3.dex */
public final class y0 extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f49443c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f49444d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final qf f49445a;

    /* renamed from: b  reason: collision with root package name */
    public uo.d2 f49446b;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_gift_ranking_current_user_reward, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new y0((qf) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ CharSequence f49448x;

        public b(CharSequence charSequence) {
            this.f49448x = charSequence;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            uo.d2 d10;
            jo.p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            y0 y0Var = y0.this;
            d10 = uo.l.d(uo.r0.a(uo.g1.c()), null, null, new c(this.f49448x, null), 3, null);
            y0Var.f49446b = d10;
        }
    }

    @co.f(c = "com.dena.mirrorman.viewholder.GiftRankingCurrentUserRewardViewHolder$attach$1$1", f = "GiftRankingCurrentUserRewardViewHolder.kt", l = {52, 60}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public int A;
        public final /* synthetic */ CharSequence C;

        /* renamed from: w  reason: collision with root package name */
        public int f49449w;

        /* renamed from: x  reason: collision with root package name */
        public int f49450x;

        /* renamed from: y  reason: collision with root package name */
        public Object f49451y;

        /* renamed from: z  reason: collision with root package name */
        public Object f49452z;

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
            throw new UnsupportedOperationException("Method not decompiled: qf.y0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public y0(qf qfVar) {
        super(qfVar.u());
        this.f49445a = qfVar;
    }

    public /* synthetic */ y0(qf qfVar, jo.h hVar) {
        this(qfVar);
    }

    public final void c() {
        uo.d2 d10;
        uo.d2 d2Var = this.f49446b;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        CharSequence text = this.f49445a.M.getText();
        ConstraintLayout constraintLayout = this.f49445a.L;
        jo.p.g(constraintLayout, "binding.titleContainer");
        if (o3.c0.V(constraintLayout) && !constraintLayout.isLayoutRequested()) {
            d10 = uo.l.d(uo.r0.a(uo.g1.c()), null, null, new c(text, null), 3, null);
            this.f49446b = d10;
        } else {
            constraintLayout.addOnLayoutChangeListener(new b(text));
        }
        float desiredWidth = Layout.getDesiredWidth(text, this.f49445a.M.getPaint());
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(this.f49445a.L);
        cVar.m(this.f49445a.M.getId(), ((int) desiredWidth) + de.m.a(this, 100));
        cVar.c(this.f49445a.L);
    }

    public final void d(ud.c1 c1Var) {
        jo.p.h(c1Var, "bindModel");
        this.f49445a.T(c1Var);
        this.f49445a.o();
    }

    public final void f() {
        uo.d2 d2Var = this.f49446b;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
    }
}
