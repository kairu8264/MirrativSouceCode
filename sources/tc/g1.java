package tc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import java.util.LinkedHashSet;
import java.util.Set;
import oq.a;
import tc.g1;

/* loaded from: classes2.dex */
public final class g1<U extends UserBasicParams> extends ArrayAdapter<U> implements oq.a {
    public final Set<String> A;
    public final wn.f B;
    public final wn.f C;

    /* renamed from: w  reason: collision with root package name */
    public final c<U> f53500w;

    /* renamed from: x  reason: collision with root package name */
    public final a<U> f53501x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f53502y;

    /* renamed from: z  reason: collision with root package name */
    public b<U> f53503z;

    /* loaded from: classes2.dex */
    public interface a<U extends UserBasicParams> {
        void a(U u10);

        void b(U u10);
    }

    /* loaded from: classes2.dex */
    public interface b<U extends UserBasicParams> {
        void a(U u10);
    }

    /* loaded from: classes2.dex */
    public interface c<U extends UserBasicParams> {
        void a(U u10);
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final hf.v0 f53504a;

        /* renamed from: b  reason: collision with root package name */
        public final hf.r f53505b;

        /* renamed from: c  reason: collision with root package name */
        public final TextView f53506c;

        /* renamed from: d  reason: collision with root package name */
        public final View f53507d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f53508e;

        /* renamed from: f  reason: collision with root package name */
        public final ImageView f53509f;

        /* renamed from: g  reason: collision with root package name */
        public final TextView f53510g;

        /* renamed from: h  reason: collision with root package name */
        public final ImageView f53511h;

        /* renamed from: i  reason: collision with root package name */
        public final ImageView f53512i;

        public d(View view, hf.v0 v0Var, hf.r rVar) {
            jo.p.h(view, "itemView");
            jo.p.h(v0Var, "userHelper");
            jo.p.h(rVar, "featureHelper");
            this.f53504a = v0Var;
            this.f53505b = rVar;
            View findViewById = view.findViewById(nc.e.D1);
            jo.p.g(findViewById, "itemView.findViewById(R.id.description)");
            this.f53506c = (TextView) findViewById;
            View findViewById2 = view.findViewById(nc.e.user);
            jo.p.g(findViewById2, "itemView.findViewById(R.id.user)");
            this.f53507d = findViewById2;
            View findViewById3 = view.findViewById(nc.e.Y2);
            jo.p.g(findViewById3, "itemView.findViewById(R.id.image)");
            this.f53508e = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(nc.e.J);
            jo.p.g(findViewById4, "itemView.findViewById(R.id.badge_image)");
            this.f53509f = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(nc.e.S6);
            jo.p.g(findViewById5, "itemView.findViewById(R.id.username)");
            this.f53510g = (TextView) findViewById5;
            View findViewById6 = view.findViewById(nc.e.delete);
            jo.p.g(findViewById6, "itemView.findViewById(R.id.delete)");
            this.f53511h = (ImageView) findViewById6;
            View findViewById7 = view.findViewById(nc.e.status);
            jo.p.g(findViewById7, "itemView.findViewById(R.id.status)");
            this.f53512i = (ImageView) findViewById7;
        }

        public static final void f(g1 g1Var, UserBasicParams userBasicParams, View view) {
            jo.p.h(g1Var, "$adapter");
            g1Var.f53500w.a(userBasicParams);
        }

        public static final void g(g1 g1Var, UserBasicParams userBasicParams, View view) {
            jo.p.h(g1Var, "$adapter");
            g1Var.f53500w.a(userBasicParams);
        }

        public static final void h(boolean z10, g1 g1Var, UserBasicParams userBasicParams, View view) {
            jo.p.h(g1Var, "$adapter");
            if (z10) {
                g1Var.f53501x.b(userBasicParams);
            } else {
                g1Var.f53501x.a(userBasicParams);
            }
        }

        public static final void i(g1 g1Var, UserBasicParams userBasicParams, View view) {
            jo.p.h(g1Var, "$adapter");
            b bVar = g1Var.f53503z;
            jo.p.e(bVar);
            bVar.a(userBasicParams);
        }

        public final <U extends UserBasicParams> void e(final U u10, final g1<U> g1Var) {
            jo.p.h(g1Var, "adapter");
            if (u10 == null) {
                Context context = g1Var.getContext();
                jo.p.g(context, "adapter.context");
                this.f53506c.setText(context.getString(nc.i.text_chat_makeroom_note, String.valueOf(this.f53505b.f() - 1)));
                this.f53506c.setVisibility(0);
                this.f53507d.setVisibility(8);
                return;
            }
            this.f53507d.setVisibility(0);
            this.f53506c.setVisibility(8);
            this.f53510g.setText(u10.getName());
            this.f53510g.setOnClickListener(new View.OnClickListener() { // from class: tc.i1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g1.d.f(g1.this, u10, view);
                }
            });
            de.f.e(this.f53508e, u10.getProfileImageUrl(), Integer.valueOf(nc.d.C));
            this.f53508e.setOnClickListener(new View.OnClickListener() { // from class: tc.h1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g1.d.g(g1.this, u10, view);
                }
            });
            if (of.b.a(u10.getBadges())) {
                this.f53509f.setVisibility(8);
            } else {
                of.f fVar = of.f.f45394a;
                Context context2 = g1Var.getContext();
                jo.p.g(context2, "adapter.context");
                fVar.c(context2, u10.getBadges().get(0).getImageUrl(), this.f53509f);
                this.f53509f.setVisibility(0);
            }
            j(1.0f);
            if (g1Var.f53503z == null) {
                this.f53511h.setVisibility(8);
                if (g1Var.f53501x != null) {
                    final boolean contains = g1Var.A.contains(u10.getUserId());
                    this.f53512i.setOnClickListener(new View.OnClickListener() { // from class: tc.k1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            g1.d.h(contains, g1Var, u10, view);
                        }
                    });
                    this.f53512i.setVisibility(0);
                    if (contains) {
                        this.f53512i.setImageResource(nc.h.f41868b);
                        return;
                    }
                    this.f53512i.setImageResource(nc.h.f41867a);
                    if (g1Var.f53502y) {
                        return;
                    }
                    j(0.3f);
                    return;
                }
                this.f53512i.setVisibility(8);
                return;
            }
            this.f53512i.setVisibility(8);
            if (this.f53504a.i(u10.getUserId())) {
                this.f53511h.setVisibility(8);
                return;
            }
            this.f53511h.setOnClickListener(new View.OnClickListener() { // from class: tc.j1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g1.d.i(g1.this, u10, view);
                }
            });
            this.f53511h.setVisibility(0);
        }

        public final void j(float f10) {
            this.f53508e.setAlpha(f10);
            this.f53509f.setAlpha(f10);
            this.f53510g.setAlpha(f10);
            this.f53511h.setAlpha(f10);
            this.f53512i.setAlpha(f10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f53513w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f53514x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f53515y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f53513w = aVar;
            this.f53514x = aVar2;
            this.f53515y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            xq.a b10;
            oq.a aVar = this.f53513w;
            vq.a aVar2 = this.f53514x;
            io.a<? extends uq.a> aVar3 = this.f53515y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(hf.v0.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<hf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f53516w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f53517x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f53518y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f53516w = aVar;
            this.f53517x = aVar2;
            this.f53518y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final hf.r invoke() {
            xq.a b10;
            oq.a aVar = this.f53516w;
            vq.a aVar2 = this.f53517x;
            io.a<? extends uq.a> aVar3 = this.f53518y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(hf.r.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(Context context, c<U> cVar, a<U> aVar) {
        super(context, nc.f.item_group_user);
        jo.p.h(context, "context");
        jo.p.h(cVar, "userClickListener");
        this.f53500w = cVar;
        this.f53501x = aVar;
        this.f53502y = true;
        this.A = new LinkedHashSet();
        cr.a aVar2 = cr.a.f28611a;
        this.B = wn.g.b(aVar2.b(), new e(this, null, null));
        this.C = wn.g.b(aVar2.b(), new f(this, null, null));
    }

    public final void g() {
        add(null);
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        d dVar;
        jo.p.h(viewGroup, "parent");
        Context context = viewGroup.getContext();
        if (view != null) {
            Object tag = view.getTag();
            jo.p.f(tag, "null cannot be cast to non-null type com.dena.mirrativ.user.mypage.chat.GroupUsersAdapter.ViewHolder");
            dVar = (d) tag;
        } else {
            view = LayoutInflater.from(context).inflate(nc.f.item_group_user, viewGroup, false);
            jo.p.e(view);
            d dVar2 = new d(view, j(), i());
            view.setTag(dVar2);
            dVar = dVar2;
        }
        dVar.e((UserBasicParams) getItem(i10), this);
        return view;
    }

    public final void h(String str) {
        jo.p.h(str, "userId");
        this.A.add(str);
    }

    public final hf.r i() {
        return (hf.r) this.C.getValue();
    }

    public final hf.v0 j() {
        return (hf.v0) this.B.getValue();
    }

    public final boolean k(String str) {
        jo.p.h(str, "userId");
        return this.A.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.ArrayAdapter
    /* renamed from: l */
    public void remove(U u10) {
        a<U> aVar;
        int count = getCount();
        for (int i10 = 0; i10 < count; i10++) {
            UserBasicParams userBasicParams = (UserBasicParams) getItem(i10);
            if (userBasicParams != null) {
                String userId = userBasicParams.getUserId();
                jo.p.e(u10);
                if (jo.p.c(userId, u10.getUserId())) {
                    super.remove(userBasicParams);
                    if (!this.A.contains(userBasicParams.getUserId()) || (aVar = this.f53501x) == 0) {
                        return;
                    }
                    aVar.b(userBasicParams);
                    return;
                }
            }
        }
    }

    public final void m(boolean z10) {
        if (z10 != this.f53502y) {
            this.f53502y = z10;
            notifyDataSetChanged();
        }
    }

    public final void n(b<U> bVar) {
        this.f53503z = bVar;
    }

    public final void o(String str) {
        jo.p.h(str, "userId");
        this.A.remove(str);
    }
}
