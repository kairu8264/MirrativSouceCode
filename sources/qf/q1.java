package qf;

import ae.og;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class q1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49348b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49349c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final og f49350a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_live_request_user, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new q1((og) e10, null);
        }
    }

    public q1(og ogVar) {
        super(ogVar.u());
        this.f49350a = ogVar;
    }

    public /* synthetic */ q1(og ogVar, jo.h hVar) {
        this(ogVar);
    }

    public final void a(String str) {
        jo.p.h(str, "viewerProfileImageUrl");
        AppCompatImageView appCompatImageView = this.f49350a.B;
        jo.p.g(appCompatImageView, "binding.imageView");
        td.a.c(appCompatImageView, str);
    }
}
