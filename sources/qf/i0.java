package qf;

import ae.wd;
import android.graphics.Outline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.MultipleStarView;

/* loaded from: classes3.dex */
public final class i0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49213b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49214c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final wd f49215a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_emomo_run_ranking_reward, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new i0((wd) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            jo.p.h(view, "view");
            jo.p.h(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) ((i0.this.b().G.getLayoutParams().width * 0.81d) / 2.0d));
        }
    }

    public i0(wd wdVar) {
        super(wdVar.u());
        this.f49215a = wdVar;
    }

    public /* synthetic */ i0(wd wdVar, jo.h hVar) {
        this(wdVar);
    }

    public final void a(ud.d0 d0Var) {
        jo.p.h(d0Var, "bindModel");
        this.f49215a.T(d0Var);
        ViewGroup.LayoutParams layoutParams = this.f49215a.G.getLayoutParams();
        Integer f10 = d0Var.f().f();
        layoutParams.width = f10 == null ? 0 : f10.intValue();
        ViewGroup.LayoutParams layoutParams2 = this.f49215a.G.getLayoutParams();
        Integer f11 = d0Var.e().f();
        layoutParams2.height = f11 == null ? 0 : f11.intValue();
        MultipleStarView multipleStarView = this.f49215a.C;
        Integer f12 = d0Var.k().f();
        if (f12 == null) {
            f12 = 0;
        }
        multipleStarView.setStarCountAndApply(f12.intValue());
        b bVar = new b();
        this.f49215a.D.setOutlineProvider(bVar);
        this.f49215a.D.setClipToOutline(true);
        this.f49215a.H.setAlpha(jo.p.c(d0Var.h().f(), Boolean.TRUE) ? 0.3f : 1.0f);
        this.f49215a.H.setOutlineProvider(bVar);
        this.f49215a.H.setClipToOutline(true);
        this.f49215a.o();
    }

    public final wd b() {
        return this.f49215a;
    }
}
