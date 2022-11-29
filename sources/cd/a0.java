package cd;

import ad.r0;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.p0;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: g  reason: collision with root package name */
    public static final a f19160g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f19161h = 8;

    /* renamed from: a  reason: collision with root package name */
    public final r0 f19162a;

    /* renamed from: b  reason: collision with root package name */
    public final bd.d f19163b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f19164c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19165d;

    /* renamed from: e  reason: collision with root package name */
    public final LiveData<Boolean> f19166e;

    /* renamed from: f  reason: collision with root package name */
    public final LiveData<Integer> f19167f;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final a0 a(r0 r0Var, c0 c0Var, Resources resources) {
            jo.p.h(r0Var, "bindModel");
            jo.p.h(c0Var, "type");
            jo.p.h(resources, "resources");
            bd.d dVar = new bd.d(new e0(r0Var.g()), new e0(r0Var.f()), new e0(r0Var.e()), new e0(""));
            String string = resources.getString(c0Var == c0.REGISTER ? nc.i.text_menu_register_bank_acount_title : nc.i.text_menu_edit_bank_account_title);
            jo.p.g(string, "resources.getString(if (…_edit_bank_account_title)");
            return new a0(r0Var, dVar, c0Var, string);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f19168a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f19169b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f19170c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LiveData f19171d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ LiveData f19172e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ LiveData f19173f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ a0 f19174g;

        public b(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2, LiveData liveData3, LiveData liveData4, LiveData liveData5, a0 a0Var) {
            this.f19168a = c0Var;
            this.f19169b = liveData;
            this.f19170c = liveData2;
            this.f19171d = liveData3;
            this.f19172e = liveData4;
            this.f19173f = liveData5;
            this.f19174g = a0Var;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f19168a.f();
            Object f11 = this.f19169b.f();
            Object f12 = this.f19170c.f();
            Object f13 = this.f19171d.f();
            Object f14 = this.f19172e.f();
            Object f15 = this.f19173f.f();
            if (f10 == null || f11 == null || f12 == null || f13 == null || f14 == null || f15 == null) {
                return;
            }
            androidx.lifecycle.c0 c0Var = this.f19168a;
            boolean booleanValue = ((Boolean) f15).booleanValue();
            String str = (String) f12;
            String str2 = (String) f11;
            ((Boolean) f10).booleanValue();
            r0 d10 = this.f19174g.d();
            c0Var.p(Boolean.valueOf((!jo.p.c(this.f19174g.d(), r0.b(d10, str, str2, (String) f13, (String) f14, null, 16, null))) & booleanValue));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<I, O> implements n.a {
        @Override // n.a
        public final Integer apply(Boolean bool) {
            return Integer.valueOf(bool.booleanValue() ? nc.d.f41811m : nc.d.btn_bg_contract_confirm_not_enabled);
        }
    }

    public a0(r0 r0Var, bd.d dVar, c0 c0Var, String str) {
        jo.p.h(r0Var, "initialConfirmViewBindModelViewState");
        jo.p.h(dVar, "editContainerViewBindModel");
        jo.p.h(c0Var, "editType");
        jo.p.h(str, "titleText");
        this.f19162a = r0Var;
        this.f19163b = dVar;
        this.f19164c = c0Var;
        this.f19165d = str;
        Boolean bool = Boolean.FALSE;
        e0<String> c10 = dVar.c();
        e0<String> d10 = dVar.d();
        e0<String> b10 = dVar.b();
        e0<String> a10 = dVar.a();
        LiveData<Boolean> f10 = dVar.f();
        androidx.lifecycle.c0 c0Var2 = new androidx.lifecycle.c0();
        c0Var2.p(bool);
        for (LiveData liveData : xn.s.m(c10, d10, b10, a10, f10)) {
            c0Var2.q(liveData, new b(c0Var2, c10, d10, b10, a10, f10, this));
            c10 = c10;
            d10 = d10;
        }
        LiveData<Boolean> a11 = p0.a(c0Var2);
        jo.p.g(a11, "distinctUntilChanged(this)");
        this.f19166e = a11;
        LiveData<Integer> b11 = p0.b(a11, new c());
        jo.p.g(b11, "crossinline transform: (…p(this) { transform(it) }");
        this.f19167f = b11;
    }

    public final LiveData<Integer> a() {
        return this.f19167f;
    }

    public final bd.d b() {
        return this.f19163b;
    }

    public final c0 c() {
        return this.f19164c;
    }

    public final r0 d() {
        return this.f19162a;
    }

    public final String e() {
        return this.f19165d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return jo.p.c(this.f19162a, a0Var.f19162a) && jo.p.c(this.f19163b, a0Var.f19163b) && this.f19164c == a0Var.f19164c && jo.p.c(this.f19165d, a0Var.f19165d);
        }
        return false;
    }

    public final LiveData<Boolean> f() {
        return this.f19166e;
    }

    public final boolean g() {
        if (!jo.p.c(this.f19162a, r0.B.a(this.f19163b, this.f19162a.c()))) {
            String f10 = this.f19163b.c().f();
            if (f10 == null) {
                f10 = "";
            }
            if (f10.length() > 0) {
                return true;
            }
            String f11 = this.f19163b.d().f();
            if (f11 == null) {
                f11 = "";
            }
            if (f11.length() > 0) {
                return true;
            }
            String f12 = this.f19163b.b().f();
            if (f12 == null) {
                f12 = "";
            }
            if (f12.length() > 0) {
                return true;
            }
            String f13 = this.f19163b.a().f();
            if ((f13 != null ? f13 : "").length() > 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f19162a.hashCode() * 31) + this.f19163b.hashCode()) * 31) + this.f19164c.hashCode()) * 31) + this.f19165d.hashCode();
    }

    public String toString() {
        return "EditBankAccountBindModel(initialConfirmViewBindModelViewState=" + this.f19162a + ", editContainerViewBindModel=" + this.f19163b + ", editType=" + this.f19164c + ", titleText=" + this.f19165d + ')';
    }
}
