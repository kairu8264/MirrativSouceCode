package hd;

import android.content.Context;
import androidx.compose.ui.platform.z;
import com.dena.mirrorman.base.WebViewActivity;
import ha.a;
import java.util.List;
import jo.q;
import l0.c0;
import l0.c2;
import l0.l1;
import l0.u1;
import uo.q0;
import wn.v;

/* loaded from: classes2.dex */
public final class i {

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.contract_member.ContractMemberPassBookPageKt$ContractMemberPassBookPage$1", f = "ContractMemberPassBookPage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35392w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ hd.e f35393x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hd.e eVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f35393x = eVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f35393x, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f35392w == 0) {
                wn.m.b(obj);
                g9.a.f32826a.i("ContractMemberPassBookPage create");
                this.f35393x.f("");
                this.f35393x.d("");
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Context f35394w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ nf.k f35395x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, nf.k kVar) {
            super(0);
            this.f35394w = context;
            this.f35395x = kVar;
        }

        public final void a() {
            Context context = this.f35394w;
            WebViewActivity.a aVar = WebViewActivity.X;
            String f10 = this.f35395x.q().f();
            if (f10 == null) {
                f10 = "";
            }
            context.startActivity(WebViewActivity.a.b(aVar, context, f10, false, false, 12, null));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Context f35396w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c2<id.a> f35397x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, c2<id.a> c2Var) {
            super(0);
            this.f35396w = context;
            this.f35397x = c2Var;
        }

        public final void a() {
            Context context = this.f35396w;
            WebViewActivity.a aVar = WebViewActivity.X;
            id.a b10 = i.b(this.f35397x);
            String a10 = b10 != null ? b10.a() : null;
            if (a10 == null) {
                a10 = "";
            }
            context.startActivity(WebViewActivity.a.b(aVar, context, a10, false, false, 12, null));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Context f35398w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.f35398w = context;
        }

        public final void a() {
            o a10 = o.N0.a();
            Context context = this.f35398w;
            jo.p.f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            a10.z3(((e.b) context).a3(), "HelpWithholdingTaxDialogFragment");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Context f35399w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.f35399w = context;
        }

        public final void a() {
            Context context = this.f35399w;
            jo.p.f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            ((e.b) context).onBackPressed();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ hd.e f35400w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(hd.e eVar) {
            super(0);
            this.f35400w = eVar;
        }

        public final void a() {
            this.f35400w.f("");
            this.f35400w.d("");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ hd.e f35401w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(hd.e eVar) {
            super(0);
            this.f35401w = eVar;
        }

        public final void a() {
            this.f35401w.c();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<v> {
        public final /* synthetic */ c2<List<gd.j>> A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l f35402w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ hd.e f35403x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c2<ha.a> f35404y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c2<id.a> f35405z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(l lVar, hd.e eVar, c2<? extends ha.a> c2Var, c2<id.a> c2Var2, c2<? extends List<gd.j>> c2Var3) {
            super(0);
            this.f35402w = lVar;
            this.f35403x = eVar;
            this.f35404y = c2Var;
            this.f35405z = c2Var2;
            this.A = c2Var3;
        }

        public final void a() {
            if (!jo.p.c(i.d(this.f35404y), a.d.f34697b) || i.b(this.f35405z) == null) {
                return;
            }
            if (!i.c(this.A).isEmpty()) {
                if (this.f35402w.k().length() > 0) {
                    this.f35403x.e(this.f35402w.k(), "");
                }
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* renamed from: hd.i$i  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0449i extends q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ hd.e f35406w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l f35407x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ nf.k f35408y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f35409z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0449i(hd.e eVar, l lVar, nf.k kVar, int i10) {
            super(2);
            this.f35406w = eVar;
            this.f35407x = lVar;
            this.f35408y = kVar;
            this.f35409z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            i.a(this.f35406w, this.f35407x, this.f35408y, iVar, this.f35409z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(hd.e eVar, l lVar, nf.k kVar, l0.i iVar, int i10) {
        jo.p.h(eVar, "actionCreator");
        jo.p.h(lVar, "store");
        jo.p.h(kVar, "featureStore");
        l0.i h10 = iVar.h(1948200792);
        Context context = (Context) h10.G(z.g());
        c0.c(v.f59242a, new a(eVar, null), h10, 64);
        c2<id.a> j10 = lVar.j();
        c2<List<gd.j>> h11 = lVar.h();
        c2 a10 = u1.a(androidx.lifecycle.l.a(lVar.m()), a.d.f34697b, null, h10, 72, 2);
        m.a(d(a10), b(j10), lVar.h().getValue(), new b(context, kVar), new c(context, j10), new d(context), new e(context), new f(eVar), new g(eVar), new h(lVar, eVar, a10, j10, h11), h10, ha.a.f34693a | 576);
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new C0449i(eVar, lVar, kVar, i10));
    }

    public static final id.a b(c2<id.a> c2Var) {
        return c2Var.getValue();
    }

    public static final List<gd.j> c(c2<? extends List<gd.j>> c2Var) {
        return c2Var.getValue();
    }

    public static final ha.a d(c2<? extends ha.a> c2Var) {
        return c2Var.getValue();
    }
}
