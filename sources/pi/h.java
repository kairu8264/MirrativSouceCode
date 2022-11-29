package pi;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final h f47884c = new h(null, null);

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f47885a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f47886b;

    public h(Boolean bool, Boolean bool2) {
        this.f47885a = bool;
        this.f47886b = bool2;
    }

    public static h a(Bundle bundle) {
        if (bundle == null) {
            return f47884c;
        }
        return new h(o(bundle.getString("ad_storage")), o(bundle.getString("analytics_storage")));
    }

    public static h b(String str) {
        Boolean bool;
        if (str != null) {
            Boolean p10 = str.length() >= 3 ? p(str.charAt(2)) : null;
            bool = str.length() >= 4 ? p(str.charAt(3)) : null;
            r0 = p10;
        } else {
            bool = null;
        }
        return new h(r0, bool);
    }

    public static Boolean g(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z10 = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public static String h(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string == null || o(string) != null) {
            String string2 = bundle.getString("analytics_storage");
            if (string2 == null || o(string2) != null) {
                return null;
            }
            return string2;
        }
        return string;
    }

    public static boolean l(int i10, int i11) {
        return i10 <= i11;
    }

    public static final int n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static Boolean o(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Boolean p(char c10) {
        if (c10 != '0') {
            if (c10 != '1') {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static final char q(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public final h c(h hVar) {
        return new h(g(this.f47885a, hVar.f47885a), g(this.f47886b, hVar.f47886b));
    }

    public final h d(h hVar) {
        Boolean bool = this.f47885a;
        if (bool == null) {
            bool = hVar.f47885a;
        }
        Boolean bool2 = this.f47886b;
        if (bool2 == null) {
            bool2 = hVar.f47886b;
        }
        return new h(bool, bool2);
    }

    public final Boolean e() {
        return this.f47885a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            return n(this.f47885a) == n(hVar.f47885a) && n(this.f47886b) == n(hVar.f47886b);
        }
        return false;
    }

    public final Boolean f() {
        return this.f47886b;
    }

    public final int hashCode() {
        return ((n(this.f47885a) + 527) * 31) + n(this.f47886b);
    }

    public final String i() {
        return "G1" + q(this.f47885a) + q(this.f47886b);
    }

    public final boolean j() {
        Boolean bool = this.f47885a;
        return bool == null || bool.booleanValue();
    }

    public final boolean k() {
        Boolean bool = this.f47886b;
        return bool == null || bool.booleanValue();
    }

    public final boolean m(h hVar) {
        Boolean bool = this.f47885a;
        Boolean bool2 = Boolean.FALSE;
        if (bool != bool2 || hVar.f47885a == bool2) {
            return this.f47886b == bool2 && hVar.f47886b != bool2;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConsentSettings: ");
        sb2.append("adStorage=");
        Boolean bool = this.f47885a;
        if (bool == null) {
            sb2.append("uninitialized");
        } else {
            sb2.append(true != bool.booleanValue() ? "denied" : "granted");
        }
        sb2.append(", analyticsStorage=");
        Boolean bool2 = this.f47886b;
        if (bool2 == null) {
            sb2.append("uninitialized");
        } else {
            sb2.append(true == bool2.booleanValue() ? "granted" : "denied");
        }
        return sb2.toString();
    }
}
