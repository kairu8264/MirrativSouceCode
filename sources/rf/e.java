package rf;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import jo.h;
import jo.p;

/* loaded from: classes3.dex */
public final class e extends q0 {
    public static final a H = new a(null);
    public static final int I = 8;
    public final e0<String> A;
    public final e0<Integer> B;
    public final e0<Integer> C;
    public final e0<Boolean> D;
    public final LiveData<String> E;
    public final LiveData<Boolean> F;
    public InputFilter G;

    /* renamed from: y  reason: collision with root package name */
    public final e0<String> f51330y;

    /* renamed from: z  reason: collision with root package name */
    public final e0<String> f51331z;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements InputFilter {

        /* renamed from: a  reason: collision with root package name */
        public final int f51332a;

        public b(int i10) {
            this.f51332a = i10;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            p.h(charSequence, "source");
            p.h(spanned, "dest");
            int codePointCount = this.f51332a - (spanned.toString().codePointCount(0, spanned.length()) - (i13 - i12));
            if (codePointCount <= 0) {
                return "";
            }
            if (codePointCount >= i11 - i10) {
                return null;
            }
            int i14 = codePointCount + i10;
            if (Character.isHighSurrogate(charSequence.charAt(i14 - 1))) {
                return charSequence.subSequence(i10, i14 + 1);
            }
            return charSequence.subSequence(i10, i14);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements TextWatcher {

        /* renamed from: w  reason: collision with root package name */
        public final e f51333w;

        public c(e eVar) {
            p.h(eVar, "viewModel");
            this.f51333w = eVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            p.h(editable, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            p.h(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            p.h(charSequence, "s");
            this.f51333w.f51330y.m(charSequence.toString());
        }
    }

    public e() {
        e0<String> e0Var = new e0<>();
        this.f51330y = e0Var;
        this.f51331z = new e0<>();
        this.A = new e0<>();
        this.B = new e0<>();
        this.C = new e0<>();
        this.D = new e0<>();
        LiveData<String> b10 = p0.b(e0Var, new n.a() { // from class: rf.c
            @Override // n.a
            public final Object apply(Object obj) {
                String u10;
                u10 = e.u(e.this, (String) obj);
                return u10;
            }
        });
        p.g(b10, "map(mutableMessage) {\n  …geCharLimit.value}\"\n    }");
        this.E = b10;
        LiveData<Boolean> b11 = p0.b(e0Var, d.f51329a);
        p.g(b11, "map(mutableMessage) {\n  …    it.isNotEmpty()\n    }");
        this.F = b11;
    }

    public static final Boolean t(String str) {
        p.g(str, "it");
        return Boolean.valueOf(str.length() > 0);
    }

    public static final String u(e eVar, String str) {
        p.h(eVar, "this$0");
        StringBuilder sb2 = new StringBuilder();
        p.g(str, "it");
        sb2.append(str.codePointCount(0, str.length()));
        sb2.append('/');
        sb2.append(eVar.n().f());
        return sb2.toString();
    }

    public final void i() {
        this.f51330y.m("");
        this.B.m(0);
    }

    public final LiveData<Integer> j() {
        return this.B;
    }

    public final LiveData<String> k() {
        return this.A;
    }

    public final InputFilter l() {
        return this.G;
    }

    public final LiveData<String> m() {
        return this.f51330y;
    }

    public final LiveData<Integer> n() {
        return this.C;
    }

    public final LiveData<Boolean> o() {
        return this.F;
    }

    public final LiveData<String> p() {
        return this.E;
    }

    public final TextWatcher q() {
        return new c(this);
    }

    public final LiveData<String> r() {
        return this.f51331z;
    }

    public final LiveData<Boolean> s() {
        return this.D;
    }

    public final void v(int i10, String str, String str2, boolean z10) {
        p.h(str, "title");
        p.h(str2, "hint");
        this.B.m(Integer.valueOf(i10));
        this.f51331z.m(str);
        this.A.m(str2);
        this.C.m(Integer.valueOf(z10 ? 24 : 30));
        this.D.m(Boolean.valueOf(z10));
        this.f51330y.m("");
        this.G = new b(z10 ? 24 : 30);
    }

    public final boolean w() {
        return true;
    }
}
