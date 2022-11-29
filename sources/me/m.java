package me;

import ae.kj;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import nd.b1;
import ud.w4;
import yd.g1;

/* loaded from: classes2.dex */
public final class m extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f41056b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f41057c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final kj f41058a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), b1.view_holder_unique_emomo_rich_gift_preset, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new m((kj) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n f41059w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ w4 f41060x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n nVar, w4 w4Var) {
            super(1);
            this.f41059w = nVar;
            this.f41060x = w4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            n nVar = this.f41059w;
            if (nVar != null) {
                nVar.a(this.f41060x.a());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public m(kj kjVar) {
        super(kjVar.u());
        this.f41058a = kjVar;
    }

    public /* synthetic */ m(kj kjVar, jo.h hVar) {
        this(kjVar);
    }

    public final void a(w4 w4Var, n nVar) {
        jo.p.h(w4Var, "bindModel");
        View u10 = this.f41058a.u();
        jo.p.g(u10, "binding.root");
        g1.a(u10, new b(nVar, w4Var));
        this.f41058a.T(w4Var);
    }
}
