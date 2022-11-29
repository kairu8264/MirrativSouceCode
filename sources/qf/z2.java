package qf;

import ae.wi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.a4;

/* loaded from: classes3.dex */
public final class z2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49466b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49467c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final wi f49468a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_stamp_gift_text_align, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new z2((wi) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<a4, wn.v> f49469w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a4 f49470x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super a4, wn.v> lVar, a4 a4Var) {
            super(1);
            this.f49469w = lVar;
            this.f49470x = a4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<a4, wn.v> lVar = this.f49469w;
            if (lVar != null) {
                lVar.invoke(this.f49470x);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public z2(wi wiVar) {
        super(wiVar.u());
        this.f49468a = wiVar;
    }

    public /* synthetic */ z2(wi wiVar, jo.h hVar) {
        this(wiVar);
    }

    public final void a(a4 a4Var, io.l<? super a4, wn.v> lVar) {
        jo.p.h(a4Var, "bindModel");
        this.f49468a.T(a4Var);
        View u10 = this.f49468a.u();
        jo.p.g(u10, "binding.root");
        yd.g1.a(u10, new b(lVar, a4Var));
    }
}
