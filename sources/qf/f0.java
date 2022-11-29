package qf;

import ae.q9;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class f0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49136b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49137c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final q9 f49138a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            q9 T = q9.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new f0(T, null);
        }
    }

    public f0(q9 q9Var) {
        super(q9Var.u());
        this.f49138a = q9Var;
    }

    public /* synthetic */ f0(q9 q9Var, jo.h hVar) {
        this(q9Var);
    }

    public final void a(String str, boolean z10) {
        AppCompatImageView appCompatImageView = this.f49138a.B;
        jo.p.g(appCompatImageView, "binding.poseImageView");
        de.f.e(appCompatImageView, str, null);
        this.f49138a.C.setVisibility(z10 ? 0 : 8);
    }

    public final q9 b() {
        return this.f49138a;
    }
}
