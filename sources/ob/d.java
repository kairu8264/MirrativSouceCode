package ob;

import android.animation.Animator;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.recyclerview.widget.RecyclerView;
import hb.v1;
import hb.x1;
import jo.h;
import jo.p;
import kb.e1;
import oq.a;
import sf.i;

/* loaded from: classes2.dex */
public final class d extends RecyclerView.e0 implements oq.a {

    /* renamed from: x  reason: collision with root package name */
    public static final a f44599x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f44600y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final e1 f44601w;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final d a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = f.e(LayoutInflater.from(viewGroup.getContext()), x1.view_holder_player_gift_ranking_user_rank, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new d((e1) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f44602a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f44603b;

        public b(boolean z10, d dVar) {
            this.f44602a = z10;
            this.f44603b = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f44602a) {
                this.f44603b.f44601w.C.setVisibility(0);
            }
            this.f44603b.f44601w.H.t(this);
            i.a.b(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            i.a.c(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.a.d(this, animator);
        }
    }

    public d(e1 e1Var) {
        super(e1Var.u());
        this.f44601w = e1Var;
    }

    public /* synthetic */ d(e1 e1Var, h hVar) {
        this(e1Var);
    }

    public final void b(c cVar) {
        p.h(cVar, "bindModel");
        this.f44601w.T(cVar);
        if (cVar.j()) {
            this.f44601w.C.setVisibility(0);
            AppCompatImageView appCompatImageView = this.f44601w.C;
            p.g(appCompatImageView, "binding.focusEventImageView");
            td.a.x(appCompatImageView, Integer.valueOf(v1.f34984b0));
        } else {
            this.f44601w.C.setVisibility(8);
        }
        this.f44601w.o();
    }

    public final void c() {
        AppCompatImageView appCompatImageView = this.f44601w.C;
        p.g(appCompatImageView, "binding.focusEventImageView");
        boolean z10 = appCompatImageView.getVisibility() == 0;
        if (z10) {
            this.f44601w.C.setVisibility(8);
        }
        this.f44601w.H.e(new b(z10, this));
        this.f44601w.H.r();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
