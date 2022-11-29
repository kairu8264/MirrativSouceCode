package ya;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import yd.g1;

/* loaded from: classes2.dex */
public final class c extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61401b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f61402c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final db.q f61403a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), wa.f.view_holder_campaign_detail_app_user_id_edit, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new c((db.q) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f61404w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(1);
            this.f61404w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f61404w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public c(db.q qVar) {
        super(qVar.u());
        this.f61403a = qVar;
    }

    public /* synthetic */ c(db.q qVar, jo.h hVar) {
        this(qVar);
    }

    public final void a(ya.b bVar, io.a<wn.v> aVar) {
        jo.p.h(bVar, "bindModel");
        jo.p.h(aVar, "onClickEditButtonListener");
        AppCompatImageView appCompatImageView = this.f61403a.B;
        jo.p.g(appCompatImageView, "binding.appIconImageView");
        td.a.m(appCompatImageView, bVar.b());
        this.f61403a.C.setText(bVar.d());
        this.f61403a.D.setText(bVar.c());
        RoundedButtonView roundedButtonView = this.f61403a.E;
        jo.p.g(roundedButtonView, "binding.backgroundView");
        g1.a(roundedButtonView, new b(aVar));
        this.f61403a.o();
    }
}
