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
public final class w extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61583b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f61584c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final db.y f61585a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), wa.f.view_holder_campaign_detail_header, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new w((db.y) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f61586w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(1);
            this.f61586w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f61586w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f61587w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a<wn.v> aVar) {
            super(1);
            this.f61587w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f61587w.invoke();
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
        public final /* synthetic */ io.l<String, wn.v> f61588w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ v f61589x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(io.l<? super String, wn.v> lVar, v vVar) {
            super(1);
            this.f61588w = lVar;
            this.f61589x = vVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f61588w.invoke(this.f61589x.f());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public w(db.y yVar) {
        super(yVar.u());
        this.f61585a = yVar;
    }

    public /* synthetic */ w(db.y yVar, jo.h hVar) {
        this(yVar);
    }

    public final void a(v vVar, io.a<wn.v> aVar, io.a<wn.v> aVar2, io.l<? super String, wn.v> lVar) {
        jo.p.h(vVar, "bindModel");
        jo.p.h(aVar, "closeListener");
        jo.p.h(aVar2, "shareListener");
        jo.p.h(lVar, "linkListener");
        this.f61585a.T(vVar);
        AppCompatImageView appCompatImageView = this.f61585a.B;
        jo.p.g(appCompatImageView, "binding.closeButtonImageView");
        g1.a(appCompatImageView, new b(aVar));
        RoundedButtonView roundedButtonView = this.f61585a.L;
        jo.p.g(roundedButtonView, "binding.twitterShareButton");
        g1.a(roundedButtonView, new c(aVar2));
        RoundedButtonView roundedButtonView2 = this.f61585a.D;
        jo.p.g(roundedButtonView2, "binding.linkButton");
        g1.a(roundedButtonView2, new d(lVar, vVar));
    }
}
