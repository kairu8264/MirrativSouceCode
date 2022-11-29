package qf;

import ae.cg;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes3.dex */
public final class h1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49195b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49196c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final cg f49197a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_live_game_invited, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new h1((cg) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<ud.a3, wn.v> f49198w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.a3 f49199x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super ud.a3, wn.v> lVar, ud.a3 a3Var) {
            super(1);
            this.f49198w = lVar;
            this.f49199x = a3Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49198w.invoke(this.f49199x);
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
        public final /* synthetic */ io.l<ud.a3, wn.v> f49200w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.a3 f49201x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.l<? super ud.a3, wn.v> lVar, ud.a3 a3Var) {
            super(1);
            this.f49200w = lVar;
            this.f49201x = a3Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49200w.invoke(this.f49201x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public h1(cg cgVar) {
        super(cgVar.u());
        this.f49197a = cgVar;
    }

    public /* synthetic */ h1(cg cgVar, jo.h hVar) {
        this(cgVar);
    }

    public final void a(ud.a3 a3Var, io.l<? super ud.a3, wn.v> lVar, io.l<? super ud.a3, wn.v> lVar2) {
        jo.p.h(a3Var, "bindModel");
        jo.p.h(lVar, "joinListener");
        jo.p.h(lVar2, "cancelListener");
        this.f49197a.E.setText(a3Var.a());
        ProfileImageView profileImageView = this.f49197a.F;
        jo.p.g(profileImageView, "binding.profileImageView");
        ProfileImageView.b(profileImageView, a3Var.i(), a3Var.b(), null, null, 12, null);
        this.f49197a.G.setText(a3Var.c());
        AppCompatImageView appCompatImageView = this.f49197a.D;
        jo.p.g(appCompatImageView, "binding.joinImageView");
        yd.g1.a(appCompatImageView, new b(lVar, a3Var));
        RoundedButtonView roundedButtonView = this.f49197a.B;
        jo.p.g(roundedButtonView, "binding.cancelButtonView");
        yd.g1.a(roundedButtonView, new c(lVar2, a3Var));
        this.f49197a.o();
    }
}
