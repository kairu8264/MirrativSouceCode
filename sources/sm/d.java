package sm;

import android.os.Bundle;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final lm.a f52750b = lm.a.e();

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f52751a;

    public d() {
        this(new Bundle());
    }

    public boolean a(String str) {
        return str != null && this.f52751a.containsKey(str);
    }

    public e<Boolean> b(String str) {
        if (!a(str)) {
            return e.a();
        }
        try {
            return e.b((Boolean) this.f52751a.get(str));
        } catch (ClassCastException e10) {
            f52750b.b("Metadata key %s contains type other than boolean: %s", str, e10.getMessage());
            return e.a();
        }
    }

    public e<Float> c(String str) {
        if (!a(str)) {
            return e.a();
        }
        try {
            return e.b((Float) this.f52751a.get(str));
        } catch (ClassCastException e10) {
            f52750b.b("Metadata key %s contains type other than float: %s", str, e10.getMessage());
            return e.a();
        }
    }

    public final e<Integer> d(String str) {
        if (!a(str)) {
            return e.a();
        }
        try {
            return e.b((Integer) this.f52751a.get(str));
        } catch (ClassCastException e10) {
            f52750b.b("Metadata key %s contains type other than int: %s", str, e10.getMessage());
            return e.a();
        }
    }

    public e<Long> e(String str) {
        e<Integer> d10 = d(str);
        if (d10.d()) {
            return e.e(Long.valueOf(d10.c().intValue()));
        }
        return e.a();
    }

    public d(Bundle bundle) {
        this.f52751a = (Bundle) bundle.clone();
    }
}
