package tc;

import ae.o7;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;

/* loaded from: classes2.dex */
public final class y0 extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f53586c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f53587d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final o7 f53588a;

    /* renamed from: b  reason: collision with root package name */
    public final w0 f53589b;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y0 a(ViewGroup viewGroup, w0 w0Var) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nc.f.f41857b0, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new y0((o7) e10, w0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(o7 o7Var, w0 w0Var) {
        super(o7Var.u());
        jo.p.h(o7Var, "binding");
        this.f53588a = o7Var;
        this.f53589b = w0Var;
    }

    public static final void c(y0 y0Var, UserBasicParams userBasicParams, View view) {
        jo.p.h(y0Var, "this$0");
        jo.p.h(userBasicParams, "$item");
        w0 w0Var = y0Var.f53589b;
        if (w0Var != null) {
            w0Var.a(userBasicParams);
        }
    }

    public final void b(final UserBasicParams userBasicParams) {
        jo.p.h(userBasicParams, "item");
        this.f53588a.u().setOnClickListener(new View.OnClickListener() { // from class: tc.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y0.c(y0.this, userBasicParams, view);
            }
        });
        AppCompatImageView appCompatImageView = this.f53588a.B;
        jo.p.g(appCompatImageView, "binding.avatar");
        de.f.e(appCompatImageView, userBasicParams.getProfileImageUrl(), Integer.valueOf(nc.d.C));
        this.f53588a.C.setText(userBasicParams.getName());
    }
}
