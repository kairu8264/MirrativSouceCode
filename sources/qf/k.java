package qf;

import ae.sc;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import ud.o4;

/* loaded from: classes3.dex */
public final class k extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49255b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49256c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final sc f49257a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_comment_event_banner, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new k((sc) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<EventBannerResponse, wn.v> f49258w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.y2 f49259x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super EventBannerResponse, wn.v> lVar, ud.y2 y2Var) {
            super(0);
            this.f49258w = lVar;
            this.f49259x = y2Var;
        }

        public final void a() {
            this.f49258w.invoke(this.f49259x.g());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public k(sc scVar) {
        super(scVar.u());
        this.f49257a = scVar;
    }

    public /* synthetic */ k(sc scVar, jo.h hVar) {
        this(scVar);
    }

    public final void a(ud.y2 y2Var, io.l<? super EventBannerResponse, wn.v> lVar) {
        jo.p.h(y2Var, "bindModel");
        jo.p.h(lVar, "onClickEventCheckTextListener");
        this.f49257a.B.w(new ud.w(y2Var.h(), y2Var.j(), y2Var.f(), y2Var.b(), true), new b(lVar, y2Var));
        this.f49257a.o();
    }

    public final void b(o4 o4Var) {
        jo.p.h(o4Var, "bindModel");
        this.f49257a.B.w(new ud.w(o4Var.l(), o4Var.m(), o4Var.j(), o4Var.i(), false), null);
        this.f49257a.o();
    }
}
