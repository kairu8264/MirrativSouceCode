package nb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import hb.t1;
import hb.x1;
import jo.p;
import jo.q;
import kb.q0;
import ud.a1;
import wn.v;
import yd.g1;

/* loaded from: classes2.dex */
public final class d extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f41740b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f41741c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final q0 f41742a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), x1.view_holder_giftpanel_gacha_ticket, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new d((q0) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<jf.q, v> f41743w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a1 f41744x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super jf.q, v> lVar, a1 a1Var) {
            super(1);
            this.f41743w = lVar;
            this.f41744x = a1Var;
        }

        public final void a(View view) {
            p.h(view, "it");
            io.l<jf.q, v> lVar = this.f41743w;
            if (lVar != null) {
                lVar.invoke(this.f41744x.a());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    public d(q0 q0Var) {
        super(q0Var.u());
        this.f41742a = q0Var;
    }

    public /* synthetic */ d(q0 q0Var, jo.h hVar) {
        this(q0Var);
    }

    public final void a(a1 a1Var, io.l<? super jf.q, v> lVar) {
        p.h(a1Var, "bindModel");
        String j10 = a1Var.a().j();
        if (j10 == null || j10.length() == 0) {
            this.f41742a.G.setVisibility(8);
            this.f41742a.H.setVisibility(8);
        } else {
            this.f41742a.G.setVisibility(0);
            this.f41742a.H.setVisibility(0);
        }
        ImageView imageView = this.f41742a.E;
        p.g(imageView, "binding.giftImageView");
        td.a.f(imageView, a1Var.a().o());
        q0 q0Var = this.f41742a;
        q0Var.D.setTextColor(c3.a.d(q0Var.u().getContext(), t1.gift_panel_free_coins_text_color));
        this.f41742a.D.setText(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        View u10 = this.f41742a.u();
        p.g(u10, "binding.root");
        g1.a(u10, new b(lVar, a1Var));
    }
}
