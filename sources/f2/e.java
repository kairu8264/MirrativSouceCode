package f2;

import jo.p;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f31705b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final g f31706a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e a() {
            return new e(i.a().a().get(0));
        }
    }

    public e(g gVar) {
        p.h(gVar, "platformLocale");
        this.f31706a = gVar;
    }

    public final g a() {
        return this.f31706a;
    }

    public final String b() {
        return this.f31706a.a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof e)) {
            if (this == obj) {
                return true;
            }
            return p.c(b(), ((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String str) {
        this(i.a().b(str));
        p.h(str, "languageTag");
    }
}
