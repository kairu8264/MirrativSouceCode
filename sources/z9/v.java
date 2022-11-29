package z9;

import android.graphics.Outline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import s9.u0;

/* loaded from: classes.dex */
public final class v extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f62905c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f62906d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final u0 f62907a;

    /* renamed from: b  reason: collision with root package name */
    public final b f62908b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final v a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), q9.h.view_holder_gift_ranking_reward, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new v((u0) e10, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            jo.p.h(view, "view");
            jo.p.h(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), view.getWidth() / 2.0f);
        }
    }

    public v(u0 u0Var) {
        super(u0Var.u());
        this.f62907a = u0Var;
        b bVar = new b();
        this.f62908b = bVar;
        u0Var.C.setOutlineProvider(bVar);
        u0Var.C.setClipToOutline(true);
    }

    public /* synthetic */ v(u0 u0Var, jo.h hVar) {
        this(u0Var);
    }

    public final void a(u uVar) {
        jo.p.h(uVar, "bindModel");
        this.f62907a.T(uVar);
        this.f62907a.F.setAlpha(jo.p.c(uVar.g().f(), Boolean.TRUE) ? 0.1f : 1.0f);
        ViewGroup.LayoutParams layoutParams = this.f62907a.E.getLayoutParams();
        Integer f10 = uVar.e().f();
        layoutParams.width = f10 == null ? 0 : f10.intValue();
        ViewGroup.LayoutParams layoutParams2 = this.f62907a.E.getLayoutParams();
        Integer f11 = uVar.d().f();
        layoutParams2.height = f11 != null ? f11.intValue() : 0;
        u0 u0Var = this.f62907a;
        u0Var.D.setTextSize((u0Var.E.getLayoutParams().width * 8.0f) / de.m.a(this, 84));
    }
}
