package nb;

import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import hb.b2;
import hb.t1;
import hb.x1;
import jo.p;
import jo.q;
import kb.n0;
import ud.y0;
import uo.d2;
import uo.g1;
import uo.q0;
import uo.r0;
import wn.v;

/* loaded from: classes2.dex */
public final class c extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final b f41729c = new b(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f41730d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final n0 f41731a;

    /* renamed from: b  reason: collision with root package name */
    public d2 f41732b;

    /* loaded from: classes2.dex */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        public static final void b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (view != null) {
                view.removeCallbacks(nb.b.f41728w);
            }
            d2 d2Var = c.this.f41732b;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }

        public final c a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), x1.view_holder_giftpanel_banner, viewGroup, false);
            p.g(e10, "inflate(\n               …  false\n                )");
            return new c((n0) e10);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.gifting.panel.GiftPanelBannerViewHolder$bind$1", f = "GiftPanelBannerViewHolder.kt", l = {79}, m = "invokeSuspend")
    /* renamed from: nb.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0628c extends co.l implements io.p<q0, ao.d<? super v>, Object> {
        public int A;
        public final /* synthetic */ y0 C;

        /* renamed from: w  reason: collision with root package name */
        public int f41734w;

        /* renamed from: x  reason: collision with root package name */
        public int f41735x;

        /* renamed from: y  reason: collision with root package name */
        public Object f41736y;

        /* renamed from: z  reason: collision with root package name */
        public Object f41737z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0628c(y0 y0Var, ao.d<? super C0628c> dVar) {
            super(2, dVar);
            this.C = y0Var;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0628c(this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0628c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0046 -> B:13:0x0049). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.A
                r2 = 1
                if (r1 == 0) goto L24
                if (r1 != r2) goto L1c
                int r1 = r8.f41735x
                int r3 = r8.f41734w
                java.lang.Object r4 = r8.f41737z
                ud.y0 r4 = (ud.y0) r4
                java.lang.Object r5 = r8.f41736y
                nb.c r5 = (nb.c) r5
                wn.m.b(r9)
                r9 = r8
                goto L49
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                wn.m.b(r9)
                r9 = 2147483647(0x7fffffff, float:NaN)
                nb.c r1 = nb.c.this
                ud.y0 r3 = r8.C
                r4 = 0
                r5 = r1
                r1 = r4
                r4 = r3
                r3 = r9
                r9 = r8
            L34:
                if (r1 >= r3) goto L4e
                r6 = 1000(0x3e8, double:4.94E-321)
                r9.f41736y = r5
                r9.f41737z = r4
                r9.f41734w = r3
                r9.f41735x = r1
                r9.A = r2
                java.lang.Object r6 = uo.b1.a(r6, r9)
                if (r6 != r0) goto L49
                return r0
            L49:
                nb.c.b(r5, r4)
                int r1 = r1 + r2
                goto L34
            L4e:
                wn.v r9 = wn.v.f59242a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: nb.c.C0628c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<y0, v> f41738w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ y0 f41739x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(io.l<? super y0, v> lVar, y0 y0Var) {
            super(1);
            this.f41738w = lVar;
            this.f41739x = y0Var;
        }

        public final void a(View view) {
            p.h(view, "it");
            io.l<y0, v> lVar = this.f41738w;
            if (lVar != null) {
                lVar.invoke(this.f41739x);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n0 n0Var) {
        super(n0Var.u());
        p.h(n0Var, "binding");
        this.f41731a = n0Var;
        this.itemView.addOnAttachStateChangeListener(new a());
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, long j10, String str) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) String.valueOf(j10));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(1.25f), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) str);
    }

    public final void d(y0 y0Var, io.l<? super y0, v> lVar) {
        d2 d10;
        p.h(y0Var, "bindModel");
        d2 d2Var = this.f41732b;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.f41731a.T(y0Var);
        AppCompatImageView appCompatImageView = this.f41731a.E;
        p.g(appCompatImageView, "binding.iconImageView");
        td.a.t(appCompatImageView, y0Var.f(), 4, 1, Integer.valueOf(t1.f34965c));
        this.f41731a.B.setText(y0Var.b());
        n0 n0Var = this.f41731a;
        n0Var.D.setTextColor(c3.a.d(n0Var.u().getContext(), y0Var.c()));
        if (y0Var.j()) {
            f(y0Var);
            d10 = uo.l.d(r0.a(g1.c()), null, null, new C0628c(y0Var, null), 3, null);
            this.f41732b = d10;
        }
        View u10 = this.f41731a.u();
        p.g(u10, "binding.root");
        yd.g1.a(u10, new d(lVar, y0Var));
        this.f41731a.o();
    }

    public final void f(y0 y0Var) {
        d2 d2Var;
        long max = Math.max((y0Var.d() * 1000) - System.currentTimeMillis(), 0L);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (max >= 86400000) {
            String string = this.f41731a.u().getContext().getString(b2.text_gift_panel_renewal_unit_day);
            p.g(string, "binding.root.context.get…t_panel_renewal_unit_day)");
            c(spannableStringBuilder, max / 86400000, string);
            String string2 = this.f41731a.u().getContext().getString(b2.text_gift_panel_renewal_unit_hour);
            p.g(string2, "binding.root.context.get…_panel_renewal_unit_hour)");
            c(spannableStringBuilder, (max % 86400000) / 3600000, string2);
        } else if (max >= 3600000) {
            long j10 = (max % 3600000) / DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS;
            String string3 = this.f41731a.u().getContext().getString(b2.text_gift_panel_renewal_unit_hour);
            p.g(string3, "binding.root.context.get…_panel_renewal_unit_hour)");
            c(spannableStringBuilder, max / 3600000, string3);
            String string4 = this.f41731a.u().getContext().getString(b2.text_gift_panel_renewal_unit_minute);
            p.g(string4, "binding.root.context.get…anel_renewal_unit_minute)");
            c(spannableStringBuilder, j10, string4);
        } else {
            long j11 = max / DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS;
            long j12 = (max % DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS) / 1000;
            if (j11 > 0) {
                String string5 = this.f41731a.u().getContext().getString(b2.text_gift_panel_renewal_unit_minute);
                p.g(string5, "binding.root.context.get…anel_renewal_unit_minute)");
                c(spannableStringBuilder, j11, string5);
            }
            String string6 = this.f41731a.u().getContext().getString(b2.text_gift_panel_renewal_unit_second);
            p.g(string6, "binding.root.context.get…anel_renewal_unit_second)");
            c(spannableStringBuilder, j12, string6);
        }
        this.f41731a.D.setText(spannableStringBuilder);
        if (max > 0 || (d2Var = this.f41732b) == null) {
            return;
        }
        d2.a.a(d2Var, null, 1, null);
    }
}
