package fc;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.t;
import hf.c;
import jo.p;
import wn.v;

/* loaded from: classes2.dex */
public final class d extends t<c.a, e> {

    /* renamed from: c  reason: collision with root package name */
    public String f31923c;

    /* renamed from: d  reason: collision with root package name */
    public io.l<? super c.a, v> f31924d;

    /* renamed from: e  reason: collision with root package name */
    public int f31925e;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<c.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f31926a = new a();

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(c.a aVar, c.a aVar2) {
            p.h(aVar, "oldItem");
            p.h(aVar2, "newItem");
            return p.c(aVar.d(), aVar2.d());
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(c.a aVar, c.a aVar2) {
            p.h(aVar, "oldItem");
            p.h(aVar2, "newItem");
            return p.c(aVar, aVar2);
        }
    }

    public d() {
        super(a.f31926a);
        this.f31923c = "";
        this.f31925e = -1;
    }

    public static final void i(d dVar, c.a aVar, e eVar, View view) {
        p.h(dVar, "this$0");
        p.h(aVar, "$item");
        p.h(eVar, "$holder");
        dVar.notifyItemChanged(dVar.f31925e);
        dVar.f31923c = aVar.d();
        int adapterPosition = eVar.getAdapterPosition();
        dVar.f31925e = adapterPosition;
        dVar.notifyItemChanged(adapterPosition);
        io.l<? super c.a, v> lVar = dVar.f31924d;
        if (lVar != null) {
            lVar.invoke(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h */
    public void onBindViewHolder(final e eVar, int i10) {
        p.h(eVar, "holder");
        final c.a b10 = b(i10);
        if (b10 == null) {
            return;
        }
        eVar.a(b10);
        if (p.c(this.f31923c, b10.d())) {
            eVar.itemView.setSelected(true);
            this.f31925e = i10;
        } else {
            eVar.itemView.setSelected(false);
        }
        eVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: fc.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.i(d.this, b10, eVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: j */
    public e onCreateViewHolder(ViewGroup viewGroup, int i10) {
        p.h(viewGroup, "parent");
        return e.f31927b.a(viewGroup);
    }

    public final void k(io.l<? super c.a, v> lVar) {
        this.f31924d = lVar;
    }

    public final void l(String str) {
        p.h(str, "<set-?>");
        this.f31923c = str;
    }
}
