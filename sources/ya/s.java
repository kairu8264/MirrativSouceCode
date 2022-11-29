package ya;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import rd.b1;

/* loaded from: classes2.dex */
public final class s extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61567b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f61568c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final db.w f61569a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), wa.f.view_holder_campaign_detail_footer, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new s((db.w) e10, null);
        }
    }

    public s(db.w wVar) {
        super(wVar.u());
        this.f61569a = wVar;
        wVar.M.g(new p001if.c(de.m.a(this, 8), 0, de.m.a(this, 16), 0, 0, 0, 32, null));
        wVar.H.g(new p001if.c(de.m.a(this, 8), 0, de.m.a(this, 16), 0, 0, 0, 32, null));
        wVar.G.g(new p001if.c(de.m.a(this, 8), 0, de.m.a(this, 28), 0, de.m.a(this, 100), 0, 32, null));
    }

    public /* synthetic */ s(db.w wVar, jo.h hVar) {
        this(wVar);
    }

    public static final void i(t tVar, View view) {
        if (tVar != null) {
            tVar.e();
        }
    }

    public static final void j(t tVar, View view) {
        if (tVar != null) {
            tVar.a();
        }
    }

    public static final void k(t tVar, View view) {
        if (tVar != null) {
            tVar.d();
        }
    }

    public static final void l(t tVar, View view) {
        if (tVar != null) {
            tVar.c();
        }
    }

    public static final void m(t tVar, View view) {
        if (tVar != null) {
            tVar.b();
        }
    }

    public final void g(m mVar, t tVar) {
        jo.p.h(mVar, "bindModel");
        this.f61569a.T(mVar);
        db.w wVar = this.f61569a;
        wVar.M.setLayoutManager(new LinearLayoutManager(wVar.u().getContext()));
        db.w wVar2 = this.f61569a;
        wVar2.H.setLayoutManager(new LinearLayoutManager(wVar2.u().getContext()));
        db.w wVar3 = this.f61569a;
        wVar3.G.setLayoutManager(new LinearLayoutManager(wVar3.u().getContext()));
        WebSettings settings = this.f61569a.Q.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        RecyclerView recyclerView = this.f61569a.M;
        b1 b1Var = new b1(11.0f);
        b1Var.c(mVar.g());
        recyclerView.setAdapter(b1Var);
        RecyclerView recyclerView2 = this.f61569a.H;
        b1 b1Var2 = new b1(11.0f);
        b1Var2.c(mVar.e());
        recyclerView2.setAdapter(b1Var2);
        RecyclerView recyclerView3 = this.f61569a.G;
        b1 b1Var3 = new b1(11.0f);
        b1Var3.c(mVar.d());
        recyclerView3.setAdapter(b1Var3);
        if (mVar.j().length() > 0) {
            this.f61569a.Q.loadData("\n                <html>\n                    <body>\n                        <iframe width=\"" + de.m.a(this, 360) + "\" height=\"" + de.m.a(this, 180) + "\" src=\"" + mVar.j() + "\" frameborder=\"0\" autoplay;allowfullscreen/>\n                    </body>\n                </html>\"\n                ", "text/html", "utf-8");
            this.f61569a.Q.setBackgroundColor(0);
        }
        h(tVar);
    }

    public final void h(final t tVar) {
        this.f61569a.J.setOnClickListener(new View.OnClickListener() { // from class: ya.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.i(t.this, view);
            }
        });
        this.f61569a.P.setOnClickListener(new View.OnClickListener() { // from class: ya.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.j(t.this, view);
            }
        });
        this.f61569a.O.setOnClickListener(new View.OnClickListener() { // from class: ya.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.k(t.this, view);
            }
        });
        this.f61569a.B.setOnClickListener(new View.OnClickListener() { // from class: ya.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.l(t.this, view);
            }
        });
        this.f61569a.C.setOnClickListener(new View.OnClickListener() { // from class: ya.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.m(t.this, view);
            }
        });
    }
}
