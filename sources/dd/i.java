package dd;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import ed.b;
import jo.p;
import pc.e3;

/* loaded from: classes2.dex */
public final class i extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f29570b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f29571c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final e3 f29572a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            e3 T = e3.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            p.g(T, "inflate(\n               …      false\n            )");
            return new i(T);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e3 e3Var) {
        super(e3Var.u());
        p.h(e3Var, "binding");
        this.f29572a = e3Var;
    }

    public final void a(ed.b bVar) {
        p.h(bVar, "bindModel");
        if (bVar instanceof b.a) {
            AppCompatTextView appCompatTextView = this.f29572a.B;
            p.g(appCompatTextView, "binding.firstText");
            appCompatTextView.setVisibility(8);
            e3 e3Var = this.f29572a;
            e3Var.C.setText(e3Var.u().getContext().getString(nc.i.text_ranking_prize_received_in_coin));
            e3 e3Var2 = this.f29572a;
            e3Var2.D.setText(e3Var2.u().getContext().getString(nc.i.text_ranking_prize_received_in_cash));
        } else if (bVar instanceof b.C0303b) {
            AppCompatTextView appCompatTextView2 = this.f29572a.B;
            p.g(appCompatTextView2, "binding.firstText");
            appCompatTextView2.setVisibility(0);
            e3 e3Var3 = this.f29572a;
            b.C0303b c0303b = (b.C0303b) bVar;
            e3Var3.B.setText(e3Var3.u().getContext().getString(c0303b.c().w()));
            e3 e3Var4 = this.f29572a;
            e3Var4.B.setTextColor(c3.a.d(e3Var4.u().getContext(), c0303b.c().c()));
            this.f29572a.C.setText(c0303b.b());
            this.f29572a.D.setText(c0303b.a());
        }
    }
}
