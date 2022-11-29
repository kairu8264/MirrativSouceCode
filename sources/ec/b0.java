package ec;

import ac.f6;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.CollabType;
import ud.m4;

/* loaded from: classes2.dex */
public final class b0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30400b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f30401c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final f6 f30402a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_floating_one_line_comment_collab_request, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new b0((f6) e10, null);
        }
    }

    public b0(f6 f6Var) {
        super(f6Var.u());
        this.f30402a = f6Var;
    }

    public /* synthetic */ b0(f6 f6Var, jo.h hVar) {
        this(f6Var);
    }

    public final void a(m4 m4Var) {
        int i10;
        jo.p.h(m4Var, "bindModel");
        this.f30402a.B.setText(m4Var.a());
        AppCompatImageView appCompatImageView = this.f30402a.C;
        if (m4Var.i() == CollabType.LIVE) {
            i10 = xb.n.ic_collab_live_comment;
        } else {
            i10 = xb.n.ic_collab_talk_comment;
        }
        appCompatImageView.setImageResource(i10);
        this.f30402a.o();
    }
}
