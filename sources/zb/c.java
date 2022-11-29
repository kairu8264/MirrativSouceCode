package zb;

import ac.n5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import io.l;
import jo.p;
import jo.q;
import wn.v;
import yd.g1;

/* loaded from: classes2.dex */
public final class c extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f62966b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f62967c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final n5 f62968a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_collab_candidate_viewer, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new c((n5) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l<String, v> f62969w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ zb.b f62970x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super String, v> lVar, zb.b bVar) {
            super(1);
            this.f62969w = lVar;
            this.f62970x = bVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            this.f62969w.invoke(this.f62970x.e());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    public c(n5 n5Var) {
        super(n5Var.u());
        this.f62968a = n5Var;
    }

    public /* synthetic */ c(n5 n5Var, jo.h hVar) {
        this(n5Var);
    }

    public final void a(u uVar, zb.b bVar, l<? super String, v> lVar) {
        p.h(uVar, "viewLifeCycleOwner");
        p.h(bVar, "bindModel");
        p.h(lVar, "onClickInvite");
        this.f62968a.M(uVar);
        this.f62968a.T(bVar);
        this.f62968a.G.a(bVar.h(), Integer.valueOf(bVar.g()));
        RoundedButtonView roundedButtonView = this.f62968a.C;
        p.g(roundedButtonView, "binding.inviteButtonView");
        g1.a(roundedButtonView, new b(lVar, bVar));
    }
}
