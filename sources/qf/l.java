package qf;

import ae.uc;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.p4;

/* loaded from: classes3.dex */
public final class l extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49273b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49274c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final uc f49275a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_comment_gift, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new l((uc) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f49276w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ p4 f49277x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super String, wn.v> lVar, p4 p4Var) {
            super(1);
            this.f49276w = lVar;
            this.f49277x = p4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<String, wn.v> lVar = this.f49276w;
            if (lVar != null) {
                lVar.invoke(this.f49277x.e());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f49278w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.z2 f49279x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.l<? super String, wn.v> lVar, ud.z2 z2Var) {
            super(1);
            this.f49278w = lVar;
            this.f49279x = z2Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<String, wn.v> lVar = this.f49278w;
            if (lVar != null) {
                lVar.invoke(this.f49279x.e());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public l(uc ucVar) {
        super(ucVar.u());
        this.f49275a = ucVar;
    }

    public /* synthetic */ l(uc ucVar, jo.h hVar) {
        this(ucVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(l lVar, p4 p4Var, io.l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar2 = null;
        }
        lVar.b(p4Var, lVar2);
    }

    @SuppressLint({"StringFormatInvalid"})
    public final void a(ud.z2 z2Var, io.l<? super String, wn.v> lVar) {
        jo.p.h(z2Var, "bindModel");
        this.f49275a.C.setBackgroundResource(z2Var.b());
        AppCompatImageView appCompatImageView = this.f49275a.F;
        jo.p.g(appCompatImageView, "binding.profileImage");
        de.f.e(appCompatImageView, z2Var.j(), Integer.valueOf(nd.y0.U1));
        this.f49275a.H.a(z2Var.m(), Integer.valueOf(z2Var.l()));
        uc ucVar = this.f49275a;
        ucVar.G.setText(ucVar.u().getContext().getString(nd.f1.text_gift_comment_user, z2Var.c()));
        if (TextUtils.isEmpty(z2Var.f())) {
            this.f49275a.B.setVisibility(4);
        } else {
            this.f49275a.B.setVisibility(0);
            of.f fVar = of.f.f45394a;
            Context context = this.f49275a.u().getContext();
            jo.p.g(context, "binding.root.context");
            fVar.c(context, z2Var.f(), this.f49275a.B);
        }
        this.f49275a.D.setText(z2Var.g());
        this.f49275a.D.setTextSize(2, z2Var.h());
        if (z2Var.n()) {
            this.f49275a.E.setImageResource(nd.y0.H1);
            this.f49275a.E.setVisibility(0);
        } else if (z2Var.o()) {
            this.f49275a.E.setImageResource(nd.y0.ic_moderator);
            this.f49275a.E.setVisibility(0);
        } else {
            this.f49275a.E.setVisibility(8);
        }
        View u10 = this.f49275a.u();
        jo.p.g(u10, "binding.root");
        yd.g1.a(u10, new c(lVar, z2Var));
        this.f49275a.o();
    }

    @SuppressLint({"StringFormatInvalid"})
    public final void b(p4 p4Var, io.l<? super String, wn.v> lVar) {
        jo.p.h(p4Var, "bindModel");
        this.f49275a.C.setBackgroundResource(p4Var.i());
        AppCompatImageView appCompatImageView = this.f49275a.F;
        jo.p.g(appCompatImageView, "binding.profileImage");
        de.f.e(appCompatImageView, p4Var.f(), Integer.valueOf(nd.y0.U1));
        uc ucVar = this.f49275a;
        ucVar.G.setText(ucVar.u().getContext().getString(nd.f1.text_gift_comment_user, p4Var.c()));
        if (TextUtils.isEmpty(p4Var.g())) {
            this.f49275a.B.setVisibility(4);
        } else {
            this.f49275a.B.setVisibility(0);
            of.f fVar = of.f.f45394a;
            Context context = this.f49275a.u().getContext();
            jo.p.g(context, "binding.root.context");
            fVar.c(context, p4Var.g(), this.f49275a.B);
        }
        this.f49275a.D.setText(p4Var.l());
        this.f49275a.D.setTextSize(2, p4Var.m());
        if (p4Var.p()) {
            this.f49275a.E.setImageResource(nd.y0.H1);
            this.f49275a.E.setVisibility(0);
        } else if (p4Var.q()) {
            this.f49275a.E.setImageResource(nd.y0.ic_moderator);
            this.f49275a.E.setVisibility(0);
        } else {
            this.f49275a.E.setVisibility(8);
        }
        View u10 = this.f49275a.u();
        jo.p.g(u10, "binding.root");
        yd.g1.a(u10, new b(lVar, p4Var));
        this.f49275a.o();
    }
}
