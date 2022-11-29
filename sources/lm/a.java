package lm;

import java.util.Locale;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f40409c;

    /* renamed from: a  reason: collision with root package name */
    public final c f40410a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f40411b;

    public a(c cVar) {
        this.f40411b = false;
        this.f40410a = cVar == null ? c.c() : cVar;
    }

    public static a e() {
        if (f40409c == null) {
            synchronized (a.class) {
                if (f40409c == null) {
                    f40409c = new a();
                }
            }
        }
        return f40409c;
    }

    public void a(String str) {
        if (this.f40411b) {
            this.f40410a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f40411b) {
            this.f40410a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f40411b) {
            this.f40410a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f40411b) {
            this.f40410a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f40411b) {
            this.f40410a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f40411b) {
            this.f40410a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f40411b;
    }

    public void i(boolean z10) {
        this.f40411b = z10;
    }

    public void j(String str) {
        if (this.f40411b) {
            this.f40410a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f40411b) {
            this.f40410a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public a() {
        this(null);
    }
}
