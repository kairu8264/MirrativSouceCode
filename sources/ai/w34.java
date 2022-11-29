package ai;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzwl;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class w34<T> implements Comparable<w34<T>> {
    public final Object A;
    public final a44 B;
    public Integer C;
    public z34 D;
    public boolean E;
    public h34 F;
    public v34 G;
    public final l34 H;

    /* renamed from: w  reason: collision with root package name */
    public final e44 f11480w;

    /* renamed from: x  reason: collision with root package name */
    public final int f11481x;

    /* renamed from: y  reason: collision with root package name */
    public final String f11482y;

    /* renamed from: z  reason: collision with root package name */
    public final int f11483z;

    public w34(int i10, String str, a44 a44Var) {
        Uri parse;
        String host;
        this.f11480w = e44.f3535c ? new e44() : null;
        this.A = new Object();
        int i11 = 0;
        this.E = false;
        this.F = null;
        this.f11481x = i10;
        this.f11482y = str;
        this.B = a44Var;
        this.H = new l34();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i11 = host.hashCode();
        }
        this.f11483z = i11;
    }

    public final void A(zzwl zzwlVar) {
        a44 a44Var;
        synchronized (this.A) {
            a44Var = this.B;
        }
        if (a44Var != null) {
            a44Var.a(zzwlVar);
        }
    }

    public final void B(v34 v34Var) {
        synchronized (this.A) {
            this.G = v34Var;
        }
    }

    public final void C(c44<?> c44Var) {
        v34 v34Var;
        synchronized (this.A) {
            v34Var = this.G;
        }
        if (v34Var != null) {
            v34Var.b(this, c44Var);
        }
    }

    public final void D() {
        v34 v34Var;
        synchronized (this.A) {
            v34Var = this.G;
        }
        if (v34Var != null) {
            v34Var.a(this);
        }
    }

    public final l34 E() {
        return this.H;
    }

    public final int c() {
        return this.f11481x;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.C.intValue() - ((w34) obj).C.intValue();
    }

    public final int e() {
        return this.f11483z;
    }

    public final void h(String str) {
        if (e44.f3535c) {
            this.f11480w.a(str, Thread.currentThread().getId());
        }
    }

    public final void i(String str) {
        z34 z34Var = this.D;
        if (z34Var != null) {
            z34Var.c(this);
        }
        if (e44.f3535c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new u34(this, str, id2));
                return;
            }
            this.f11480w.a(str, id2);
            this.f11480w.b(toString());
        }
    }

    public final void l(int i10) {
        z34 z34Var = this.D;
        if (z34Var != null) {
            z34Var.d(this, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w34<?> m(z34 z34Var) {
        this.D = z34Var;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w34<?> n(int i10) {
        this.C = Integer.valueOf(i10);
        return this;
    }

    public final String o() {
        return this.f11482y;
    }

    public final String p() {
        String str = this.f11482y;
        if (this.f11481x != 0) {
            String num = Integer.toString(1);
            StringBuilder sb2 = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
            sb2.append(num);
            sb2.append('-');
            sb2.append(str);
            return sb2.toString();
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w34<?> q(h34 h34Var) {
        this.F = h34Var;
        return this;
    }

    public final h34 r() {
        return this.F;
    }

    public final boolean s() {
        synchronized (this.A) {
        }
        return false;
    }

    public Map<String, String> t() throws zzvk {
        return Collections.emptyMap();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f11483z));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        s();
        String str = this.f11482y;
        String valueOf2 = String.valueOf(this.C);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(concat).length() + 6 + valueOf2.length());
        sb2.append("[ ] ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(concat);
        sb2.append(" NORMAL ");
        sb2.append(valueOf2);
        return sb2.toString();
    }

    public byte[] u() throws zzvk {
        return null;
    }

    public final int v() {
        return this.H.a();
    }

    public final void w() {
        synchronized (this.A) {
            this.E = true;
        }
    }

    public final boolean x() {
        boolean z10;
        synchronized (this.A) {
            z10 = this.E;
        }
        return z10;
    }

    public abstract c44<T> y(s34 s34Var);

    public abstract void z(T t10);
}
