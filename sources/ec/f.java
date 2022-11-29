package ec;

import ac.t5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.api.response.CollabType;
import ud.m4;
import yd.g1;

/* loaded from: classes2.dex */
public final class f extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30414b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f30415c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t5 f30416a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_floating_comment_collab_request, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new f((t5) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30417a;

        static {
            int[] iArr = new int[CollabType.values().length];
            iArr[CollabType.LIVE.ordinal()] = 1;
            f30417a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ m4 f30418w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m4 m4Var) {
            super(1);
            this.f30418w = m4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            dq.c c10 = dq.c.c();
            String e10 = this.f30418w.e();
            CollabType i10 = this.f30418w.i();
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

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ m4 f30419w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m4 m4Var) {
            super(1);
            this.f30419w = m4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            dq.c.c().l(new ce.r(this.f30419w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public f(t5 t5Var) {
        super(t5Var.u());
        this.f30416a = t5Var;
    }

    public /* synthetic */ f(t5 t5Var, jo.h hVar) {
        this(t5Var);
    }

    public final void a(m4 m4Var) {
        jo.p.h(m4Var, "bindModel");
        CollabType i10 = m4Var.i();
        if ((i10 == null ? -1 : b.f30417a[i10.ordinal()]) == 1) {
            this.f30416a.F.setVisibility(0);
            this.f30416a.C.setVisibility(0);
            this.f30416a.F.setIcon(xb.n.f59956d0);
            t5 t5Var = this.f30416a;
            t5Var.F.setTitle(t5Var.u().getResources().getString(xb.r.P));
        } else {
            this.f30416a.F.setVisibility(0);
            this.f30416a.C.setVisibility(0);
            this.f30416a.F.setIcon(xb.n.f59965s0);
            t5 t5Var2 = this.f30416a;
            t5Var2.F.setTitle(t5Var2.u().getResources().getString(xb.r.Q));
        }
        RoundedButtonView roundedButtonView = this.f30416a.F;
        jo.p.g(roundedButtonView, "binding.startCollobButtonView");
        g1.a(roundedButtonView, new c(m4Var));
        RoundedButtonView roundedButtonView2 = this.f30416a.C;
        jo.p.g(roundedButtonView2, "binding.cancelCollobButtonView");
        g1.a(roundedButtonView2, new d(m4Var));
        AppCompatImageView appCompatImageView = this.f30416a.D.F;
        jo.p.g(appCompatImageView, "binding.commentNotSelectable.profileImage");
        td.a.i(appCompatImageView, m4Var.f());
        AppCompatImageView appCompatImageView2 = this.f30416a.D.B;
        jo.p.g(appCompatImageView2, "binding.commentNotSelectable.badgeImage");
        td.a.f(appCompatImageView2, m4Var.g());
        this.f30416a.D.D.setText(m4Var.a());
        this.f30416a.o();
    }
}
