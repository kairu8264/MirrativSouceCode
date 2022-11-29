package jf;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String f37958a;

    /* renamed from: b  reason: collision with root package name */
    public final int f37959b;

    /* renamed from: c  reason: collision with root package name */
    public final int f37960c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.e0<CharSequence> f37961d;

    /* renamed from: e  reason: collision with root package name */
    public final int f37962e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.lifecycle.c0<String> f37963f;

    public p() {
        this(null, 0, 0, null, 0, 31, null);
    }

    public p(String str, int i10, int i11, androidx.lifecycle.e0<CharSequence> e0Var, int i12) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(e0Var, "partText");
        this.f37958a = str;
        this.f37959b = i10;
        this.f37960c = i11;
        this.f37961d = e0Var;
        this.f37962e = i12;
        final androidx.lifecycle.c0<String> c0Var = new androidx.lifecycle.c0<>();
        c0Var.q(e0Var, new androidx.lifecycle.f0() { // from class: jf.o
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                p.i(androidx.lifecycle.c0.this, this, (CharSequence) obj);
            }
        });
        this.f37963f = c0Var;
    }

    public static final void i(androidx.lifecycle.c0 c0Var, p pVar, CharSequence charSequence) {
        jo.p.h(c0Var, "$this_apply");
        jo.p.h(pVar, "this$0");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(de.l.a(charSequence.toString()));
        sb2.append('/');
        sb2.append(pVar.f37962e);
        c0Var.p(sb2.toString());
    }

    public final int b() {
        return this.f37960c;
    }

    public final int c() {
        return this.f37959b;
    }

    public final String d() {
        return this.f37958a;
    }

    public final int e() {
        return this.f37962e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return jo.p.c(this.f37958a, pVar.f37958a) && this.f37959b == pVar.f37959b && this.f37960c == pVar.f37960c && jo.p.c(this.f37961d, pVar.f37961d) && this.f37962e == pVar.f37962e;
        }
        return false;
    }

    public final androidx.lifecycle.e0<CharSequence> f() {
        return this.f37961d;
    }

    public final androidx.lifecycle.c0<String> g() {
        return this.f37963f;
    }

    public final boolean h() {
        return this.f37959b != 0;
    }

    public int hashCode() {
        return (((((((this.f37958a.hashCode() * 31) + Integer.hashCode(this.f37959b)) * 31) + Integer.hashCode(this.f37960c)) * 31) + this.f37961d.hashCode()) * 31) + Integer.hashCode(this.f37962e);
    }

    public String toString() {
        return "EditPartTextBindModel(id=" + this.f37958a + ", iconResourceId=" + this.f37959b + ", hintStringResourceId=" + this.f37960c + ", partText=" + this.f37961d + ", maxLength=" + this.f37962e + ')';
    }

    public /* synthetic */ p(String str, int i10, int i11, androidx.lifecycle.e0 e0Var, int i12, int i13, jo.h hVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) == 0 ? i11 : 0, (i13 & 8) != 0 ? new androidx.lifecycle.e0("") : e0Var, (i13 & 16) != 0 ? 50 : i12);
    }
}
