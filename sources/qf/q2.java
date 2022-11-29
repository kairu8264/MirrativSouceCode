package qf;

import ae.gi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.customview.ShooterVictoryCountView;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import j6.i;
import ud.l3;
import ud.y3;

/* loaded from: classes3.dex */
public final class q2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49351b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49352c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final gi f49353a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_shooter_candidate_viewer, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new q2((gi) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f49354w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l3 f49355x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super String, wn.v> lVar, l3 l3Var) {
            super(1);
            this.f49354w = lVar;
            this.f49355x = l3Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49354w.invoke(this.f49355x.o());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public q2(gi giVar) {
        super(giVar.u());
        this.f49353a = giVar;
    }

    public /* synthetic */ q2(gi giVar, jo.h hVar) {
        this(giVar);
    }

    public final void a(androidx.lifecycle.u uVar, l3 l3Var, io.l<? super String, wn.v> lVar) {
        jo.p.h(uVar, "viewLifeCycleOwner");
        jo.p.h(l3Var, "bindModel");
        jo.p.h(lVar, "onClickInvite");
        this.f49353a.M(uVar);
        this.f49353a.T(l3Var);
        RoundedButtonView roundedButtonView = this.f49353a.C;
        roundedButtonView.setTitle(roundedButtonView.getContext().getString(l3Var.e()));
        roundedButtonView.setTitleColor(l3Var.f());
        roundedButtonView.setRoundedButtonViewBackgroundColor(l3Var.d());
        roundedButtonView.setBorderColor(l3Var.d());
        jo.p.g(roundedButtonView, "");
        yd.g1.a(roundedButtonView, new b(lVar, l3Var));
        gi giVar = this.f49353a;
        ShooterVictoryCountView shooterVictoryCountView = giVar.R;
        y3.a aVar = y3.f55762e;
        Context context = giVar.u().getContext();
        jo.p.g(context, "binding.root.context");
        shooterVictoryCountView.a(aVar.a(context, l3Var.r(), l3Var.q()));
        GlideRequest<Drawable> load = GlideApp.with(this.f49353a.H).load(l3Var.h());
        View u10 = this.f49353a.u();
        jo.p.g(u10, "binding.root");
        load.apply((e8.a<?>) e8.h.bitmapTransform(new xd.a(de.n.b(u10, 1), c3.a.d(this.f49353a.u().getContext(), nd.w0.R0)))).into(this.f49353a.H);
        AppCompatTextView appCompatTextView = this.f49353a.K;
        SpannableString spannableString = new SpannableString(this.f49353a.u().getResources().getString(nd.f1.text_shooter_select_users_next_reward_score, l3Var.j()));
        String spannableString2 = spannableString.toString();
        jo.p.g(spannableString2, "it.toString()");
        int U = so.o.U(spannableString2, l3Var.j(), 0, false, 6, null);
        spannableString.setSpan(new ForegroundColorSpan(c3.a.d(this.f49353a.u().getContext(), nd.w0.f42242u0)), U, l3Var.j().length() + U + 2, 33);
        appCompatTextView.setText(spannableString);
        AppCompatImageView appCompatImageView = this.f49353a.E;
        jo.p.g(appCompatImageView, "binding.matchingViewerLabelImageView");
        x5.a.a(appCompatImageView.getContext()).c(new i.a(appCompatImageView.getContext()).b(Integer.valueOf(nd.y0.shooter_matching_enter)).l(appCompatImageView).a());
    }
}
