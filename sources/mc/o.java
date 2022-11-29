package mc;

import ac.l5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.GiftResultItem;
import com.dena.mirrorman.net.glide.GlideApp;
import hf.v0;
import java.util.Arrays;
import java.util.List;
import jo.f0;
import oq.a;
import yd.g1;

/* loaded from: classes2.dex */
public final class o extends RecyclerView.e0 implements oq.a {

    /* renamed from: y  reason: collision with root package name */
    public static final a f40818y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f40819z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final l5 f40820w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f40821x;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            l5 T = l5.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new o(T);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n f40822w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n nVar) {
            super(1);
            this.f40822w = nVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            dq.c.c().l(new x(this.f40822w));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n f40823w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f40824x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f40825y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(n nVar, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2) {
            super(1);
            this.f40823w = nVar;
            this.f40824x = lVar;
            this.f40825y = lVar2;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (this.f40823w.e()) {
                io.l<String, wn.v> lVar = this.f40824x;
                if (lVar != null) {
                    lVar.invoke(this.f40823w.l());
                    return;
                }
                return;
            }
            io.l<String, wn.v> lVar2 = this.f40825y;
            if (lVar2 != null) {
                lVar2.invoke(this.f40823w.l());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n f40826w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<String, Integer, wn.v> f40827x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(n nVar, io.p<? super String, ? super Integer, wn.v> pVar) {
            super(1);
            this.f40826w = nVar;
            this.f40827x = pVar;
        }

        public final void a(View view) {
            io.p<String, Integer, wn.v> pVar;
            jo.p.h(view, "it");
            if (this.f40826w.k() == 1 && (pVar = this.f40827x) != null) {
                pVar.invoke(this.f40826w.l(), Integer.valueOf(this.f40826w.j()));
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f40828w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40829x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40830y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f40828w = aVar;
            this.f40829x = aVar2;
            this.f40830y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            xq.a b10;
            oq.a aVar = this.f40828w;
            vq.a aVar2 = this.f40829x;
            io.a<? extends uq.a> aVar3 = this.f40830y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(v0.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l5 l5Var) {
        super(l5Var.u());
        jo.p.h(l5Var, "binding");
        this.f40820w = l5Var;
        this.f40821x = wn.g.b(cr.a.f28611a.b(), new e(this, null, null));
    }

    public final v0 a() {
        return (v0) this.f40821x.getValue();
    }

    public final void b(n nVar, boolean z10, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.p<? super String, ? super Integer, wn.v> pVar) {
        jo.p.h(nVar, "broadcastUserData");
        View u10 = this.f40820w.u();
        jo.p.g(u10, "binding.root");
        g1.a(u10, new b(nVar));
        this.f40820w.L.a(nVar.o(), Integer.valueOf(nVar.n()));
        AppCompatImageView appCompatImageView = this.f40820w.D;
        jo.p.g(appCompatImageView, "binding.followStatus");
        g1.a(appCompatImageView, new c(nVar, lVar2, lVar));
        AppCompatImageView appCompatImageView2 = this.f40820w.J;
        jo.p.g(appCompatImageView2, "binding.thanksStatus");
        g1.a(appCompatImageView2, new d(nVar, pVar));
        this.f40820w.K.setText(nVar.m());
        this.f40820w.H.setVisibility(nVar.p() ? 0 : 8);
        GlideApp.with(this.f40820w.u().getContext()).load(nVar.g()).apply((e8.a<?>) e8.h.circleCropTransform().placeholder(xb.n.f59961g0)).into(this.f40820w.I);
        GlideApp.with(this.f40820w.u().getContext()).load(nVar.c()).into(this.f40820w.B);
        if (a().i(nVar.l())) {
            this.f40820w.D.setVisibility(8);
        } else {
            this.f40820w.D.setVisibility(0);
            if (nVar.e()) {
                this.f40820w.D.setImageResource(xb.n.ic_followed);
            } else {
                this.f40820w.D.setImageResource(xb.n.ic_bg_follow_notyet);
            }
            if (nVar.h()) {
                this.f40820w.D.setEnabled(false);
                this.f40820w.D.setAlpha(0.6f);
            } else {
                this.f40820w.D.setEnabled(true);
                this.f40820w.D.setAlpha(1.0f);
            }
        }
        if (!a().i(nVar.l()) && z10) {
            int k10 = nVar.k();
            if (k10 == 1) {
                this.f40820w.J.setVisibility(0);
                this.f40820w.J.setImageResource(xb.n.ic_bg_thanks_send_button);
            } else if (k10 != 2) {
                this.f40820w.J.setVisibility(8);
            } else {
                this.f40820w.J.setVisibility(0);
                this.f40820w.J.setImageResource(xb.n.ic_bg_thanks_send_button_done);
            }
        } else {
            this.f40820w.J.setVisibility(8);
        }
        if (nVar.d() > 0) {
            this.f40820w.C.setVisibility(0);
            this.f40820w.C.setText(String.valueOf(nVar.d()));
        } else {
            this.f40820w.C.setVisibility(8);
        }
        List<GiftResultItem> i10 = nVar.i();
        this.f40820w.E.removeAllViews();
        int size = i10.size();
        for (int i11 = 0; i11 < size; i11++) {
            Context context = this.f40820w.u().getContext();
            jo.p.g(context, "binding.root.context");
            ve.c cVar = new ve.c(context, null, 0, 6, null);
            cVar.setGift(i10.get(i11));
            this.f40820w.E.addView(cVar);
        }
        if (this.f40820w.E.getChildCount() == 0) {
            this.f40820w.E.setVisibility(8);
        } else {
            this.f40820w.E.setVisibility(0);
        }
        if (nVar.f() > 0) {
            this.f40820w.F.setVisibility(0);
            AppCompatTextView appCompatTextView = this.f40820w.G;
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(nVar.f())}, 1));
            jo.p.g(format, "format(this, *args)");
            appCompatTextView.setText(format);
            return;
        }
        this.f40820w.F.setVisibility(8);
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
