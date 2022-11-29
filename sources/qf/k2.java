package qf;

import ae.kh;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.ProfileImageView;
import oq.a;

/* loaded from: classes3.dex */
public final class k2 extends RecyclerView.e0 implements oq.a {

    /* renamed from: y  reason: collision with root package name */
    public static final a f49264y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f49265z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final kh f49266w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f49267x;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_player_comment, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new k2((kh) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f49268w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.t2 f49269x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super String, wn.v> lVar, ud.t2 t2Var) {
            super(1);
            this.f49268w = lVar;
            this.f49269x = t2Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<String, wn.v> lVar = this.f49268w;
            if (lVar != null) {
                lVar.invoke(this.f49269x.e());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends jo.q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f49270w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f49271x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f49272y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f49270w = aVar;
            this.f49271x = aVar2;
            this.f49272y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            xq.a b10;
            oq.a aVar = this.f49270w;
            vq.a aVar2 = this.f49271x;
            io.a<? extends uq.a> aVar3 = this.f49272y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(hf.v0.class), aVar2, aVar3);
        }
    }

    public k2(kh khVar) {
        super(khVar.u());
        this.f49266w = khVar;
        this.f49267x = wn.g.b(cr.a.f28611a.b(), new c(this, null, null));
    }

    public /* synthetic */ k2(kh khVar, jo.h hVar) {
        this(khVar);
    }

    public final void a(ud.t2 t2Var, io.l<? super String, wn.v> lVar) {
        int i10;
        jo.p.h(t2Var, "bindModel");
        this.f49266w.B.setText(t2Var.a());
        ProfileImageView profileImageView = this.f49266w.C;
        jo.p.g(profileImageView, "binding.profileImageView");
        ProfileImageView.b(profileImageView, t2Var.h(), t2Var.b(), null, null, 12, null);
        this.f49266w.E.a(t2Var.j(), Integer.valueOf(t2Var.i()));
        View u10 = this.f49266w.u();
        if (t2Var.k()) {
            if (b().i(t2Var.e())) {
                i10 = nd.y0.rectangle_corner12_cheerleader_border_tealish;
            } else {
                i10 = nd.y0.rectangle_corner12_cheerleader;
            }
        } else if (b().i(t2Var.e())) {
            i10 = nd.y0.rectangle_corner12_whitethree80_border_tealish;
        } else {
            i10 = nd.y0.rectangle_corner12_whitethree80;
        }
        u10.setBackgroundResource(i10);
        if (t2Var.k()) {
            Drawable f10 = c3.a.f(this.f49266w.u().getContext(), nd.y0.H1);
            if (f10 == null) {
                return;
            }
            f10.setBounds(0, 0, de.m.a(this, 12), de.m.a(this, 12));
            this.f49266w.D.setCompoundDrawables(f10, null, null, null);
            kh khVar = this.f49266w;
            khVar.D.setTextColor(c3.a.d(khVar.u().getContext(), nd.w0.f42241s0));
        } else if (t2Var.l()) {
            Drawable f11 = c3.a.f(this.f49266w.u().getContext(), nd.y0.ic_moderator);
            if (f11 == null) {
                return;
            }
            f11.setBounds(0, 0, de.m.a(this, 12), de.m.a(this, 12));
            this.f49266w.D.setCompoundDrawables(f11, null, null, null);
            kh khVar2 = this.f49266w;
            khVar2.D.setTextColor(c3.a.d(khVar2.u().getContext(), nd.w0.moderator));
        } else {
            this.f49266w.D.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            kh khVar3 = this.f49266w;
            khVar3.D.setTextColor(c3.a.d(khVar3.u().getContext(), nd.w0.M0));
        }
        this.f49266w.D.setText(t2Var.c());
        View u11 = this.f49266w.u();
        jo.p.g(u11, "binding.root");
        yd.g1.a(u11, new b(lVar, t2Var));
        this.f49266w.o();
    }

    public final hf.v0 b() {
        return (hf.v0) this.f49267x.getValue();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
