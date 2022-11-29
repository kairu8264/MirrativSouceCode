package cd;

import ad.u0;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.p0;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: k  reason: collision with root package name */
    public static final a f19176k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f19177l = 8;

    /* renamed from: a  reason: collision with root package name */
    public final u0 f19178a;

    /* renamed from: b  reason: collision with root package name */
    public final bd.e f19179b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f19180c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19181d;

    /* renamed from: e  reason: collision with root package name */
    public final String f19182e;

    /* renamed from: f  reason: collision with root package name */
    public final LiveData<d> f19183f;

    /* renamed from: g  reason: collision with root package name */
    public final LiveData<c> f19184g;

    /* renamed from: h  reason: collision with root package name */
    public final LiveData<b> f19185h;

    /* renamed from: i  reason: collision with root package name */
    public final LiveData<Boolean> f19186i;

    /* renamed from: j  reason: collision with root package name */
    public final LiveData<Integer> f19187j;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b0 a(Resources resources, u0 u0Var, c0 c0Var) {
            jo.p.h(resources, "resources");
            jo.p.h(u0Var, "confirmViewBindModel");
            jo.p.h(c0Var, "type");
            bd.e eVar = new bd.e(new e0(u0Var.e()), new e0(u0Var.i()), new e0(u0Var.f()), new e0(u0Var.j()), new e0(Integer.valueOf(u0Var.c())), new e0(u0Var.k()), new e0(u0Var.b()));
            c0 c0Var2 = c0.REGISTER;
            boolean z10 = c0Var == c0Var2;
            String string = resources.getString(c0Var == c0Var2 ? nc.i.text_menu_register_identification_title : nc.i.text_menu_edit_identification_title);
            jo.p.g(string, "getString(if (type == Ed…dit_identification_title)");
            return new b0(u0Var, eVar, c0Var, z10, string);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e<T> implements f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f19195a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f19196b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f19197c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LiveData f19198d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ LiveData f19199e;

        public e(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2, LiveData liveData3, LiveData liveData4) {
            this.f19195a = c0Var;
            this.f19196b = liveData;
            this.f19197c = liveData2;
            this.f19198d = liveData3;
            this.f19199e = liveData4;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f19195a.f();
            Object f11 = this.f19196b.f();
            Object f12 = this.f19197c.f();
            Object f13 = this.f19198d.f();
            Object f14 = this.f19199e.f();
            if (f10 == null || f11 == null || f12 == null || f13 == null || f14 == null) {
                return;
            }
            String str = (String) f12;
            String str2 = (String) f11;
            d dVar = (d) f10;
            this.f19195a.p(new d(str2, str, (String) f13, (String) f14));
        }
    }

    /* loaded from: classes2.dex */
    public static final class f<T> implements f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f19200a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f19201b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f19202c;

        public f(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f19200a = c0Var;
            this.f19201b = liveData;
            this.f19202c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f19200a.f();
            Object f11 = this.f19201b.f();
            Object f12 = this.f19202c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            b bVar = (b) f10;
            this.f19200a.p(new b((String) f11, (String) f12));
        }
    }

    /* loaded from: classes2.dex */
    public static final class g<T> implements f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f19203a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f19204b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f19205c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LiveData f19206d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ LiveData f19207e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b0 f19208f;

        public g(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2, LiveData liveData3, LiveData liveData4, b0 b0Var) {
            this.f19203a = c0Var;
            this.f19204b = liveData;
            this.f19205c = liveData2;
            this.f19206d = liveData3;
            this.f19207e = liveData4;
            this.f19208f = b0Var;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f19203a.f();
            Object f11 = this.f19204b.f();
            Object f12 = this.f19205c.f();
            Object f13 = this.f19206d.f();
            Object f14 = this.f19207e.f();
            if (f10 == null || f11 == null || f12 == null || f13 == null || f14 == null) {
                return;
            }
            androidx.lifecycle.c0 c0Var = this.f19203a;
            boolean booleanValue = ((Boolean) f14).booleanValue();
            b bVar = (b) f13;
            d dVar = (d) f11;
            ((Boolean) f10).booleanValue();
            c0Var.p(Boolean.valueOf((!jo.p.c(this.f19208f.d(), this.f19208f.d().a(dVar.a(), dVar.c(), dVar.b(), dVar.d(), bVar.b(), ((c) f12).a(), bVar.a()))) & booleanValue));
        }
    }

    /* loaded from: classes2.dex */
    public static final class h<I, O> implements n.a {
        @Override // n.a
        public final c apply(Integer num) {
            Integer num2 = num;
            jo.p.g(num2, "it");
            return new c(num2.intValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class i<I, O> implements n.a {
        @Override // n.a
        public final Integer apply(Boolean bool) {
            return Integer.valueOf(bool.booleanValue() ? nc.d.f41811m : nc.d.btn_bg_contract_confirm_not_enabled);
        }
    }

    public b0(u0 u0Var, bd.e eVar, c0 c0Var, boolean z10, String str) {
        jo.p.h(u0Var, "initialConfirmViewBindModelState");
        jo.p.h(eVar, "editContainerViewBindModel");
        jo.p.h(c0Var, "editType");
        jo.p.h(str, "titleText");
        this.f19178a = u0Var;
        this.f19179b = eVar;
        this.f19180c = c0Var;
        this.f19181d = z10;
        this.f19182e = str;
        d dVar = new d(null, null, null, null, 15, null);
        e0<String> k10 = eVar.k();
        e0<String> i10 = eVar.i();
        e0<String> j10 = eVar.j();
        e0<String> h10 = eVar.h();
        androidx.lifecycle.c0 c0Var2 = new androidx.lifecycle.c0();
        c0Var2.p(dVar);
        int i11 = 3;
        for (LiveData liveData : xn.s.m(k10, i10, j10, h10)) {
            c0Var2.q(liveData, new e(c0Var2, k10, i10, j10, h10));
            i11 = i11;
        }
        int i12 = i11;
        LiveData<d> a10 = p0.a(c0Var2);
        jo.p.g(a10, "distinctUntilChanged(this)");
        this.f19183f = a10;
        LiveData<c> b10 = p0.b(this.f19179b.f(), new h());
        jo.p.g(b10, "crossinline transform: (…p(this) { transform(it) }");
        this.f19184g = b10;
        b bVar = new b(null, null, i12, null);
        e0<String> e10 = this.f19179b.e();
        e0<String> l10 = this.f19179b.l();
        androidx.lifecycle.c0 c0Var3 = new androidx.lifecycle.c0();
        c0Var3.p(bVar);
        for (LiveData liveData2 : xn.s.m(e10, l10)) {
            c0Var3.q(liveData2, new f(c0Var3, e10, l10));
        }
        LiveData<b> a11 = p0.a(c0Var3);
        jo.p.g(a11, "distinctUntilChanged(this)");
        this.f19185h = a11;
        Boolean bool = Boolean.FALSE;
        LiveData<d> liveData3 = this.f19183f;
        LiveData<c> liveData4 = this.f19184g;
        LiveData<Boolean> m10 = this.f19179b.m();
        androidx.lifecycle.c0 c0Var4 = new androidx.lifecycle.c0();
        c0Var4.p(bool);
        LiveData[] liveDataArr = new LiveData[4];
        liveDataArr[0] = liveData3;
        liveDataArr[1] = liveData4;
        liveDataArr[2] = a11;
        liveDataArr[i12] = m10;
        for (LiveData liveData5 : xn.s.m(liveDataArr)) {
            LiveData<d> liveData6 = liveData3;
            androidx.lifecycle.c0 c0Var5 = c0Var4;
            c0Var5.q(liveData5, new g(c0Var4, liveData3, liveData4, a11, m10, this));
            a11 = a11;
            c0Var4 = c0Var5;
            liveData3 = liveData6;
        }
        LiveData<Boolean> a12 = p0.a(c0Var4);
        jo.p.g(a12, "distinctUntilChanged(this)");
        this.f19186i = a12;
        LiveData<Integer> b11 = p0.b(a12, new i());
        jo.p.g(b11, "crossinline transform: (…p(this) { transform(it) }");
        this.f19187j = b11;
    }

    public final LiveData<Integer> a() {
        return this.f19187j;
    }

    public final bd.e b() {
        return this.f19179b;
    }

    public final c0 c() {
        return this.f19180c;
    }

    public final u0 d() {
        return this.f19178a;
    }

    public final String e() {
        return this.f19182e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            return jo.p.c(this.f19178a, b0Var.f19178a) && jo.p.c(this.f19179b, b0Var.f19179b) && this.f19180c == b0Var.f19180c && this.f19181d == b0Var.f19181d && jo.p.c(this.f19182e, b0Var.f19182e);
        }
        return false;
    }

    public final LiveData<Boolean> f() {
        return this.f19186i;
    }

    public final boolean g() {
        Integer f10;
        if (!jo.p.c(this.f19178a, u0.D.a(this.f19179b))) {
            String f11 = this.f19179b.k().f();
            if (f11 == null) {
                f11 = "";
            }
            if (f11.length() > 0) {
                return true;
            }
            String f12 = this.f19179b.i().f();
            if (f12 == null) {
                f12 = "";
            }
            if (f12.length() > 0) {
                return true;
            }
            String f13 = this.f19179b.j().f();
            if (f13 == null) {
                f13 = "";
            }
            if (f13.length() > 0) {
                return true;
            }
            String f14 = this.f19179b.h().f();
            if (f14 == null) {
                f14 = "";
            }
            if (f14.length() > 0) {
                return true;
            }
            if (this.f19179b.f().f() != null && ((f10 = this.f19179b.f().f()) == null || f10.intValue() != 0)) {
                return true;
            }
            String f15 = this.f19179b.l().f();
            if (f15 == null) {
                f15 = "";
            }
            if (f15.length() > 0) {
                return true;
            }
            String f16 = this.f19179b.e().f();
            if ((f16 != null ? f16 : "").length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f19178a.hashCode() * 31) + this.f19179b.hashCode()) * 31) + this.f19180c.hashCode()) * 31;
        boolean z10 = this.f19181d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + this.f19182e.hashCode();
    }

    public String toString() {
        return "EditIdentificationBindModel(initialConfirmViewBindModelState=" + this.f19178a + ", editContainerViewBindModel=" + this.f19179b + ", editType=" + this.f19180c + ", isVisibleStepView=" + this.f19181d + ", titleText=" + this.f19182e + ')';
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f19190a;

        public c() {
            this(0, 1, null);
        }

        public c(int i10) {
            this.f19190a = i10;
        }

        public final int a() {
            return this.f19190a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f19190a == ((c) obj).f19190a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f19190a);
        }

        public String toString() {
            return "EditBirthDay(birthDay=" + this.f19190a + ')';
        }

        public /* synthetic */ c(int i10, int i11, jo.h hVar) {
            this((i11 & 1) != 0 ? 0 : i10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f19188a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19189b;

        public b() {
            this(null, null, 3, null);
        }

        public b(String str, String str2) {
            jo.p.h(str, "address");
            jo.p.h(str2, "postCode");
            this.f19188a = str;
            this.f19189b = str2;
        }

        public final String a() {
            return this.f19188a;
        }

        public final String b() {
            return this.f19189b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(this.f19188a, bVar.f19188a) && jo.p.c(this.f19189b, bVar.f19189b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f19188a.hashCode() * 31) + this.f19189b.hashCode();
        }

        public String toString() {
            return "EditAddress(address=" + this.f19188a + ", postCode=" + this.f19189b + ')';
        }

        public /* synthetic */ b(String str, String str2, int i10, jo.h hVar) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f19191a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19192b;

        /* renamed from: c  reason: collision with root package name */
        public final String f19193c;

        /* renamed from: d  reason: collision with root package name */
        public final String f19194d;

        public d() {
            this(null, null, null, null, 15, null);
        }

        public d(String str, String str2, String str3, String str4) {
            jo.p.h(str, "familyName");
            jo.p.h(str2, "givenName");
            jo.p.h(str3, "familyNameKana");
            jo.p.h(str4, "givenNameKana");
            this.f19191a = str;
            this.f19192b = str2;
            this.f19193c = str3;
            this.f19194d = str4;
        }

        public final String a() {
            return this.f19191a;
        }

        public final String b() {
            return this.f19193c;
        }

        public final String c() {
            return this.f19192b;
        }

        public final String d() {
            return this.f19194d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return jo.p.c(this.f19191a, dVar.f19191a) && jo.p.c(this.f19192b, dVar.f19192b) && jo.p.c(this.f19193c, dVar.f19193c) && jo.p.c(this.f19194d, dVar.f19194d);
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f19191a.hashCode() * 31) + this.f19192b.hashCode()) * 31) + this.f19193c.hashCode()) * 31) + this.f19194d.hashCode();
        }

        public String toString() {
            return "EditName(familyName=" + this.f19191a + ", givenName=" + this.f19192b + ", familyNameKana=" + this.f19193c + ", givenNameKana=" + this.f19194d + ')';
        }

        public /* synthetic */ d(String str, String str2, String str3, String str4, int i10, jo.h hVar) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
        }
    }
}
