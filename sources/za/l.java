package za;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.f0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import db.g0;
import jo.p;
import wn.v;

/* loaded from: classes2.dex */
public final class l extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f62942b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f62943c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final g0 f62944a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            g0 T = g0.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            p.g(T, "inflate(LayoutInflater.f….context), parent, false)");
            return new l(T);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g0 g0Var) {
        super(g0Var.u());
        p.h(g0Var, "binding");
        this.f62944a = g0Var;
    }

    public static final void f(l lVar, Boolean bool) {
        p.h(lVar, "this$0");
        p.g(bool, "it");
        if (bool.booleanValue()) {
            lVar.f62944a.H.setVisibility(0);
            Drawable background = lVar.f62944a.G.getBackground();
            p.f(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            ((AnimationDrawable) background).start();
            return;
        }
        lVar.f62944a.H.setVisibility(8);
        Drawable background2 = lVar.f62944a.G.getBackground();
        p.f(background2, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        ((AnimationDrawable) background2).stop();
    }

    public static final void g(l lVar, h hVar, m mVar) {
        p.h(lVar, "this$0");
        p.h(hVar, "$bindModel");
        lVar.f62944a.L.setVisibility(mVar.c());
        lVar.f62944a.M.setTitle(mVar.b());
        lVar.f62944a.M.setEnabled(mVar.d());
        if (mVar.a() && hVar.k()) {
            lVar.f62944a.E.setText(hVar.c());
            lVar.f62944a.E.setVisibility(0);
            lVar.f62944a.F.setAlpha(0.2f);
            lVar.f62944a.C.setAlpha(0.2f);
            return;
        }
        lVar.f62944a.E.setText("");
        lVar.f62944a.E.setVisibility(8);
        lVar.f62944a.F.setAlpha(1.0f);
        lVar.f62944a.C.setAlpha(1.0f);
    }

    public static final void h(h hVar, io.l lVar, View view) {
        p.h(hVar, "$bindModel");
        p.h(lVar, "$receivePrizesListener");
        if (p.c(hVar.a().f(), Boolean.TRUE)) {
            return;
        }
        lVar.invoke(Integer.valueOf(hVar.getId()));
    }

    public final void d(final h hVar, final io.l<? super Integer, v> lVar, u uVar) {
        p.h(hVar, "bindModel");
        p.h(lVar, "receivePrizesListener");
        p.h(uVar, "lifecycleOwner");
        this.f62944a.V(hVar);
        this.f62944a.I.a(hVar.e());
        this.f62944a.B.a(hVar.d());
        this.f62944a.N.setText(hVar.i());
        this.f62944a.J.setMax(hVar.g());
        this.f62944a.J.setProgress(hVar.f());
        this.f62944a.K.setText(hVar.h());
        this.f62944a.C.setVisibility(hVar.j() ? 0 : 8);
        hVar.a().i(uVar, new f0() { // from class: za.j
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                l.f(l.this, (Boolean) obj);
            }
        });
        hVar.b().i(uVar, new f0() { // from class: za.k
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                l.g(l.this, hVar, (m) obj);
            }
        });
        this.f62944a.M.setOnClickListener(new View.OnClickListener() { // from class: za.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.h(h.this, lVar, view);
            }
        });
    }
}
