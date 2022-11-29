package qf;

import ae.mi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.w3;

/* loaded from: classes3.dex */
public final class s2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49378b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49379c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final mi f49380a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_shooter_ranking_expand, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new s2((mi) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49381w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(1);
            this.f49381w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.a<wn.v> aVar = this.f49381w;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public s2(mi miVar) {
        super(miVar.u());
        this.f49380a = miVar;
    }

    public /* synthetic */ s2(mi miVar, jo.h hVar) {
        this(miVar);
    }

    public final void a(w3 w3Var, io.a<wn.v> aVar) {
        jo.p.h(w3Var, "bindModel");
        this.f49380a.T(w3Var);
        AppCompatTextView appCompatTextView = this.f49380a.B;
        jo.p.g(appCompatTextView, "binding.rankingExpandTextView");
        yd.g1.a(appCompatTextView, new b(aVar));
    }
}
