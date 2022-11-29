package bc;

import ac.r3;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.Karaoke;
import oq.a;

/* loaded from: classes2.dex */
public final class c0 extends RecyclerView.e0 implements oq.a {

    /* renamed from: y  reason: collision with root package name */
    public static final a f17278y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f17279z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final r3 f17280w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f17281x;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.item_emokara_list, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new c0((r3) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<hf.q> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f17282w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17283x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17284y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f17282w = aVar;
            this.f17283x = aVar2;
            this.f17284y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.q, java.lang.Object] */
        @Override // io.a
        public final hf.q invoke() {
            xq.a b10;
            oq.a aVar = this.f17282w;
            vq.a aVar2 = this.f17283x;
            io.a<? extends uq.a> aVar3 = this.f17284y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(hf.q.class), aVar2, aVar3);
        }
    }

    public c0(r3 r3Var) {
        super(r3Var.u());
        this.f17280w = r3Var;
        this.f17281x = wn.g.b(cr.a.f28611a.b(), new b(this, null, null));
    }

    public /* synthetic */ c0(r3 r3Var, jo.h hVar) {
        this(r3Var);
    }

    public final void a(Karaoke karaoke) {
        String sb2;
        String sb3;
        jo.p.h(karaoke, "karaoke");
        this.f17280w.H.setText(karaoke.getTitle());
        this.f17280w.G.setText(karaoke.getSingerName());
        int d10 = c().d(karaoke.getId());
        int b10 = c().b(karaoke.getId());
        if (d10 == 0) {
            this.f17280w.I.setVisibility(8);
        } else {
            this.f17280w.I.setVisibility(0);
            AppCompatTextView appCompatTextView = this.f17280w.J;
            if (d10 > 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append('+');
                sb4.append(d10);
                sb2 = sb4.toString();
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append('-');
                sb5.append(Math.abs(d10));
                sb2 = sb5.toString();
            }
            appCompatTextView.setText(sb2);
        }
        if (b10 == 0) {
            this.f17280w.C.setVisibility(8);
            return;
        }
        this.f17280w.C.setVisibility(0);
        AppCompatTextView appCompatTextView2 = this.f17280w.D;
        if (b10 > 0) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append('+');
            sb6.append(b10);
            sb3 = sb6.toString();
        } else {
            StringBuilder sb7 = new StringBuilder();
            sb7.append('-');
            sb7.append(Math.abs(b10));
            sb3 = sb7.toString();
        }
        appCompatTextView2.setText(sb3);
    }

    public final r3 b() {
        return this.f17280w;
    }

    public final hf.q c() {
        return (hf.q) this.f17281x.getValue();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
