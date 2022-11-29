package qf;

import ae.yd;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;

/* loaded from: classes3.dex */
public final class j0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49237b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49238c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final yd f49239a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_event_banner, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new j0((yd) e10, null);
        }
    }

    public j0(yd ydVar) {
        super(ydVar.u());
        this.f49239a = ydVar;
    }

    public /* synthetic */ j0(yd ydVar, jo.h hVar) {
        this(ydVar);
    }

    public final void a(EventBannerResponse eventBannerResponse) {
        jo.p.h(eventBannerResponse, "eventBanner");
        this.f49239a.B.w(eventBannerResponse, nd.w0.f42234j);
    }
}
