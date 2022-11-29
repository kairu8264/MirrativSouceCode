package va;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import jo.p;
import sa.q;

/* loaded from: classes2.dex */
public final class b extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f57205b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f57206c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final q f57207a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), qa.p.view_holder_notice_follower, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new b((q) e10, null);
        }
    }

    public b(q qVar) {
        super(qVar.u());
        this.f57207a = qVar;
    }

    public /* synthetic */ b(q qVar, jo.h hVar) {
        this(qVar);
    }

    public final void a(String str) {
        p.h(str, "imageUrl");
        AppCompatImageView appCompatImageView = this.f57207a.B;
        p.g(appCompatImageView, "binding.imageView");
        td.a.i(appCompatImageView, str);
    }
}
