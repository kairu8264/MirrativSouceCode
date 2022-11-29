package gc;

import ac.f4;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import oq.a;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class l0 extends RecyclerView.e0 implements oq.a {

    /* renamed from: y  reason: collision with root package name */
    public static final a f32993y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f32994z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final f4 f32995w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f32996x;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.item_floating_setting_thumbnail, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new l0((f4) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32997w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32998x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32999y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32997w = aVar;
            this.f32998x = aVar2;
            this.f32999y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            xq.a b10;
            oq.a aVar = this.f32997w;
            vq.a aVar2 = this.f32998x;
            io.a<? extends uq.a> aVar3 = this.f32999y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.x.class), aVar2, aVar3);
        }
    }

    public l0(f4 f4Var) {
        super(f4Var.u());
        this.f32995w = f4Var;
        this.f32996x = wn.g.b(cr.a.f28611a.b(), new b(this, null, null));
    }

    public /* synthetic */ l0(f4 f4Var, jo.h hVar) {
        this(f4Var);
    }

    public final void a(c cVar, String str) {
        jo.p.h(cVar, "floatSettingData");
        dq.c.c().p(this);
        boolean isEmpty = TextUtils.isEmpty(str);
        f4 f4Var = this.f32995w;
        f4Var.u().setId(cVar.a());
        f4Var.E.setText(cVar.c());
        if (!isEmpty && str != null) {
            f(str);
        } else {
            d();
        }
    }

    public final f4 b() {
        return this.f32995w;
    }

    public final kf.x c() {
        return (kf.x) this.f32996x.getValue();
    }

    public final void d() {
        f4 f4Var = this.f32995w;
        f4Var.D.setVisibility(0);
        f4Var.C.setVisibility(4);
        f4Var.E.setTextColor(c3.a.d(f4Var.u().getContext(), xb.l.f59939i));
    }

    public final void f(String str) {
        f4 f4Var = this.f32995w;
        f4Var.D.setVisibility(4);
        f4Var.C.setVisibility(0);
        AppCompatImageView appCompatImageView = f4Var.C;
        jo.p.g(appCompatImageView, "btnThumbnailImage");
        td.a.m(appCompatImageView, str);
        f4Var.E.setTextColor(c3.a.d(f4Var.u().getContext(), xb.l.f59943n));
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(nd.l lVar) {
        jo.p.h(lVar, "event");
        String H3 = c().H3();
        if (TextUtils.isEmpty(H3)) {
            d();
        } else {
            f(H3);
        }
    }

    @dq.l
    public final void onEvent(nd.i iVar) {
        jo.p.h(iVar, "event");
        dq.c.c().r(this);
    }
}
