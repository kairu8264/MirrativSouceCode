package ud;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54978a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.e0<Drawable> f54979b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f54980c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.e0<String> f54981d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f54982e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f54983f;

    /* renamed from: g  reason: collision with root package name */
    public final androidx.lifecycle.e0<SpannableString> f54984g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f54985h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.lifecycle.e0<SpannableStringBuilder> f54986i;

    public h() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public h(androidx.lifecycle.e0<String> e0Var, androidx.lifecycle.e0<Drawable> e0Var2, androidx.lifecycle.e0<Integer> e0Var3, androidx.lifecycle.e0<String> e0Var4, androidx.lifecycle.e0<Boolean> e0Var5, androidx.lifecycle.e0<Boolean> e0Var6, androidx.lifecycle.e0<SpannableString> e0Var7, androidx.lifecycle.e0<Integer> e0Var8, androidx.lifecycle.e0<SpannableStringBuilder> e0Var9) {
        jo.p.h(e0Var, "addUserIdText");
        jo.p.h(e0Var2, "addUserIdTextBackground");
        jo.p.h(e0Var3, "addUserIdTextTextColor");
        jo.p.h(e0Var4, "editUserIdText");
        jo.p.h(e0Var5, "isVisibleAddUserId");
        jo.p.h(e0Var6, "isVisibleEditUserId");
        jo.p.h(e0Var7, "descriptionSpannableString");
        jo.p.h(e0Var8, "addUserIdAppealVisibility");
        jo.p.h(e0Var9, "addUserIdAppealText");
        this.f54978a = e0Var;
        this.f54979b = e0Var2;
        this.f54980c = e0Var3;
        this.f54981d = e0Var4;
        this.f54982e = e0Var5;
        this.f54983f = e0Var6;
        this.f54984g = e0Var7;
        this.f54985h = e0Var8;
        this.f54986i = e0Var9;
    }

    public final androidx.lifecycle.e0<SpannableStringBuilder> a() {
        return this.f54986i;
    }

    public final androidx.lifecycle.e0<Integer> b() {
        return this.f54985h;
    }

    public final androidx.lifecycle.e0<String> c() {
        return this.f54978a;
    }

    public final androidx.lifecycle.e0<Drawable> d() {
        return this.f54979b;
    }

    public final androidx.lifecycle.e0<Integer> e() {
        return this.f54980c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return jo.p.c(this.f54978a, hVar.f54978a) && jo.p.c(this.f54979b, hVar.f54979b) && jo.p.c(this.f54980c, hVar.f54980c) && jo.p.c(this.f54981d, hVar.f54981d) && jo.p.c(this.f54982e, hVar.f54982e) && jo.p.c(this.f54983f, hVar.f54983f) && jo.p.c(this.f54984g, hVar.f54984g) && jo.p.c(this.f54985h, hVar.f54985h) && jo.p.c(this.f54986i, hVar.f54986i);
        }
        return false;
    }

    public final androidx.lifecycle.e0<SpannableString> f() {
        return this.f54984g;
    }

    public final androidx.lifecycle.e0<String> g() {
        return this.f54981d;
    }

    public final androidx.lifecycle.e0<Boolean> h() {
        return this.f54982e;
    }

    public int hashCode() {
        return (((((((((((((((this.f54978a.hashCode() * 31) + this.f54979b.hashCode()) * 31) + this.f54980c.hashCode()) * 31) + this.f54981d.hashCode()) * 31) + this.f54982e.hashCode()) * 31) + this.f54983f.hashCode()) * 31) + this.f54984g.hashCode()) * 31) + this.f54985h.hashCode()) * 31) + this.f54986i.hashCode();
    }

    public final androidx.lifecycle.e0<Boolean> i() {
        return this.f54983f;
    }

    public String toString() {
        return "AppSettingsBindModel(addUserIdText=" + this.f54978a + ", addUserIdTextBackground=" + this.f54979b + ", addUserIdTextTextColor=" + this.f54980c + ", editUserIdText=" + this.f54981d + ", isVisibleAddUserId=" + this.f54982e + ", isVisibleEditUserId=" + this.f54983f + ", descriptionSpannableString=" + this.f54984g + ", addUserIdAppealVisibility=" + this.f54985h + ", addUserIdAppealText=" + this.f54986i + ')';
    }

    public /* synthetic */ h(androidx.lifecycle.e0 e0Var, androidx.lifecycle.e0 e0Var2, androidx.lifecycle.e0 e0Var3, androidx.lifecycle.e0 e0Var4, androidx.lifecycle.e0 e0Var5, androidx.lifecycle.e0 e0Var6, androidx.lifecycle.e0 e0Var7, androidx.lifecycle.e0 e0Var8, androidx.lifecycle.e0 e0Var9, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? new androidx.lifecycle.e0(null) : e0Var, (i10 & 2) != 0 ? new androidx.lifecycle.e0(null) : e0Var2, (i10 & 4) != 0 ? new androidx.lifecycle.e0(0) : e0Var3, (i10 & 8) != 0 ? new androidx.lifecycle.e0(null) : e0Var4, (i10 & 16) != 0 ? new androidx.lifecycle.e0(Boolean.FALSE) : e0Var5, (i10 & 32) != 0 ? new androidx.lifecycle.e0(Boolean.FALSE) : e0Var6, (i10 & 64) != 0 ? new androidx.lifecycle.e0(null) : e0Var7, (i10 & 128) != 0 ? new androidx.lifecycle.e0(8) : e0Var8, (i10 & 256) != 0 ? new androidx.lifecycle.e0(null) : e0Var9);
    }
}
