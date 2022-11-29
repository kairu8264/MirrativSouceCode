package ai;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class kl {

    /* renamed from: a  reason: collision with root package name */
    public final int f6257a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6258b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6259c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6260d;

    /* renamed from: e  reason: collision with root package name */
    public final am f6261e;

    /* renamed from: f  reason: collision with root package name */
    public final im f6262f;

    /* renamed from: n  reason: collision with root package name */
    public int f6270n;

    /* renamed from: g  reason: collision with root package name */
    public final Object f6263g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<String> f6264h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<String> f6265i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<wl> f6266j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public int f6267k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f6268l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f6269m = 0;

    /* renamed from: o  reason: collision with root package name */
    public String f6271o = "";

    /* renamed from: p  reason: collision with root package name */
    public String f6272p = "";

    /* renamed from: q  reason: collision with root package name */
    public String f6273q = "";

    public kl(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.f6257a = i10;
        this.f6258b = i11;
        this.f6259c = i12;
        this.f6260d = z10;
        this.f6261e = new am(i13);
        this.f6262f = new im(i14, i15, i16);
    }

    public static final String q(ArrayList<String> arrayList, int i10) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            sb2.append(arrayList.get(i11));
            sb2.append(' ');
            i11++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String sb3 = sb2.toString();
        return sb3.length() < 100 ? sb3 : sb3.substring(0, 100);
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f6263g) {
            z10 = this.f6269m == 0;
        }
        return z10;
    }

    public final String b() {
        return this.f6271o;
    }

    public final String c() {
        return this.f6272p;
    }

    public final String d() {
        return this.f6273q;
    }

    public final void e() {
        synchronized (this.f6263g) {
            this.f6270n -= 100;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kl) {
            if (obj == this) {
                return true;
            }
            String str = ((kl) obj).f6271o;
            return str != null && str.equals(this.f6271o);
        }
        return false;
    }

    public final void f() {
        synchronized (this.f6263g) {
            this.f6269m--;
        }
    }

    public final void g() {
        synchronized (this.f6263g) {
            this.f6269m++;
        }
    }

    public final void h(String str, boolean z10, float f10, float f11, float f12, float f13) {
        p(str, z10, f10, f11, f12, f13);
        synchronized (this.f6263g) {
            if (this.f6269m < 0) {
                uj0.a("ActivityContent: negative number of WebViews.");
            }
            k();
        }
    }

    public final int hashCode() {
        return this.f6271o.hashCode();
    }

    public final void i(String str, boolean z10, float f10, float f11, float f12, float f13) {
        p(str, z10, f10, f11, f12, f13);
    }

    public final void j() {
        synchronized (this.f6263g) {
            int l10 = l(this.f6267k, this.f6268l);
            if (l10 > this.f6270n) {
                this.f6270n = l10;
            }
        }
    }

    public final void k() {
        synchronized (this.f6263g) {
            int l10 = l(this.f6267k, this.f6268l);
            if (l10 > this.f6270n) {
                this.f6270n = l10;
                if (!wg.t.h().p().d()) {
                    this.f6271o = this.f6261e.a(this.f6264h);
                    this.f6272p = this.f6261e.a(this.f6265i);
                }
                if (!wg.t.h().p().e()) {
                    this.f6273q = this.f6262f.a(this.f6265i, this.f6266j);
                }
            }
        }
    }

    public final int l(int i10, int i11) {
        return this.f6260d ? this.f6258b : (i10 * this.f6257a) + (i11 * this.f6258b);
    }

    public final int m() {
        return this.f6270n;
    }

    public final void n(int i10) {
        this.f6268l = i10;
    }

    public final int o() {
        return this.f6267k;
    }

    public final void p(String str, boolean z10, float f10, float f11, float f12, float f13) {
        if (str == null || str.length() < this.f6259c) {
            return;
        }
        synchronized (this.f6263g) {
            this.f6264h.add(str);
            this.f6267k += str.length();
            if (z10) {
                this.f6265i.add(str);
                this.f6266j.add(new wl(f10, f11, f12, f13, this.f6265i.size() - 1));
            }
        }
    }

    public final String toString() {
        int i10 = this.f6268l;
        int i11 = this.f6270n;
        int i12 = this.f6267k;
        String q10 = q(this.f6264h, 100);
        String q11 = q(this.f6265i, 100);
        String str = this.f6271o;
        String str2 = this.f6272p;
        String str3 = this.f6273q;
        int length = String.valueOf(q10).length();
        int length2 = String.valueOf(q11).length();
        int length3 = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 165 + length2 + length3 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append("ActivityContent fetchId: ");
        sb2.append(i10);
        sb2.append(" score:");
        sb2.append(i11);
        sb2.append(" total_length:");
        sb2.append(i12);
        sb2.append("\n text: ");
        sb2.append(q10);
        sb2.append("\n viewableText");
        sb2.append(q11);
        sb2.append("\n signture: ");
        sb2.append(str);
        sb2.append("\n viewableSignture: ");
        sb2.append(str2);
        sb2.append("\n viewableSignatureForVertical: ");
        sb2.append(str3);
        return sb2.toString();
    }
}
