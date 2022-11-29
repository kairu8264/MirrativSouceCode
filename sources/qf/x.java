package qf;

import ae.kd;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.api.response.CollabType;
import ud.m4;

/* loaded from: classes3.dex */
public final class x extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49423b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49424c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final kd f49425a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final x a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_emomo_comment_collab_request, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new x((kd) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f49426a;

        static {
            int[] iArr = new int[CollabType.values().length];
            iArr[CollabType.LIVE.ordinal()] = 1;
            f49426a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ m4 f49427w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m4 m4Var) {
            super(1);
            this.f49427w = m4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            dq.c c10 = dq.c.c();
            String e10 = this.f49427w.e();
            CollabType i10 = this.f49427w.i();
            if (i10 == null) {
                i10 = CollabType.CALL;
            }
            c10.l(new ce.m(e10, i10));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ m4 f49428w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m4 m4Var) {
            super(1);
            this.f49428w = m4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            dq.c.c().l(new ce.r(this.f49428w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public x(kd kdVar) {
        super(kdVar.u());
        this.f49425a = kdVar;
    }

    public /* synthetic */ x(kd kdVar, jo.h hVar) {
        this(kdVar);
    }

    public final void a(m4 m4Var) {
        jo.p.h(m4Var, "bindModel");
        this.f49425a.E.setText(m4Var.a());
        AppCompatImageView appCompatImageView = this.f49425a.G;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        td.a.i(appCompatImageView, m4Var.f());
        AppCompatImageView appCompatImageView2 = this.f49425a.B;
        jo.p.g(appCompatImageView2, "binding.badgeImage");
        td.a.f(appCompatImageView2, m4Var.g());
        CollabType i10 = m4Var.i();
        if ((i10 == null ? -1 : b.f49426a[i10.ordinal()]) == 1) {
            this.f49425a.C.setVisibility(0);
            this.f49425a.H.setIcon(nd.y0.L1);
            kd kdVar = this.f49425a;
            kdVar.H.setTitle(kdVar.u().getResources().getString(nd.f1.f41969f1));
        } else {
            this.f49425a.C.setVisibility(0);
            this.f49425a.H.setIcon(nd.y0.O2);
            kd kdVar2 = this.f49425a;
            kdVar2.H.setTitle(kdVar2.u().getResources().getString(nd.f1.f41972g1));
        }
        RoundedButtonView roundedButtonView = this.f49425a.H;
        jo.p.g(roundedButtonView, "binding.startCollobButtonView");
        yd.g1.a(roundedButtonView, new c(m4Var));
        RoundedButtonView roundedButtonView2 = this.f49425a.C;
        jo.p.g(roundedButtonView2, "binding.cancelCollobButtonView");
        yd.g1.a(roundedButtonView2, new d(m4Var));
        this.f49425a.o();
    }
}
