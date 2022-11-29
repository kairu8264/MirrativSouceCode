package qf;

import ae.wg;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class u1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49398b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49399c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final wg f49400a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_mutual_followee, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new u1((wg) e10, null);
        }
    }

    public u1(wg wgVar) {
        super(wgVar.u());
        this.f49400a = wgVar;
    }

    public /* synthetic */ u1(wg wgVar, jo.h hVar) {
        this(wgVar);
    }

    public final void a(String str) {
        jo.p.h(str, "viewerProfileImageUrl");
        AppCompatImageView appCompatImageView = this.f49400a.B;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        td.a.a(appCompatImageView, str);
    }
}
