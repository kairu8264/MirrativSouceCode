package qf;

import ae.kc;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.ProfileImageView;

/* loaded from: classes3.dex */
public final class e extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49113b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49114c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final kc f49115a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_collab_live_gift, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new e((kc) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f49116w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.x2 f49117x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super String, wn.v> lVar, ud.x2 x2Var) {
            super(1);
            this.f49116w = lVar;
            this.f49117x = x2Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<String, wn.v> lVar = this.f49116w;
            if (lVar != null) {
                lVar.invoke(this.f49117x.e());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public e(kc kcVar) {
        super(kcVar.u());
        this.f49115a = kcVar;
    }

    public /* synthetic */ e(kc kcVar, jo.h hVar) {
        this(kcVar);
    }

    public final void a(ud.x2 x2Var, io.l<? super String, wn.v> lVar) {
        jo.p.h(x2Var, "bindModel");
        this.f49115a.B.setText(x2Var.a());
        ProfileImageView profileImageView = this.f49115a.C;
        jo.p.g(profileImageView, "binding.profileImageView");
        ProfileImageView.b(profileImageView, x2Var.g(), x2Var.b(), null, null, 12, null);
        if (x2Var.i()) {
            this.f49115a.D.setCompoundDrawablesWithIntrinsicBounds(nd.y0.ic_moderator, 0, 0, 0);
        } else {
            this.f49115a.D.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        this.f49115a.D.setText(x2Var.h());
        View u10 = this.f49115a.u();
        jo.p.g(u10, "binding.root");
        yd.g1.a(u10, new b(lVar, x2Var));
        this.f49115a.o();
    }
}
