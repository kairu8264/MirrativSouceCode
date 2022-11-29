package pi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes3.dex */
public abstract class va {

    /* renamed from: a  reason: collision with root package name */
    public final String f48292a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48293b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f48294c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f48295d;

    /* renamed from: e  reason: collision with root package name */
    public Long f48296e;

    /* renamed from: f  reason: collision with root package name */
    public Long f48297f;

    public va(String str, int i10) {
        this.f48292a = str;
        this.f48293b = i10;
    }

    public static Boolean d(String str, int i10, boolean z10, String str2, List<String> list, String str3, q3 q3Var) {
        if (i10 == 7) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && i10 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i10 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z10 ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (q3Var != null) {
                        q3Var.v().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    public static Boolean e(BigDecimal bigDecimal, hi.j3 j3Var, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        rh.p.i(j3Var);
        if (j3Var.x()) {
            if (j3Var.C() != 1) {
                if (j3Var.C() == 5) {
                    if (!j3Var.B() || !j3Var.A()) {
                        return null;
                    }
                } else if (!j3Var.y()) {
                    return null;
                }
                int C = j3Var.C();
                if (j3Var.C() == 5) {
                    if (da.P(j3Var.v()) && da.P(j3Var.u())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(j3Var.v());
                            bigDecimal4 = new BigDecimal(j3Var.u());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!da.P(j3Var.t())) {
                    return null;
                } else {
                    try {
                        bigDecimal2 = new BigDecimal(j3Var.t());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (C == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = C - 1;
                if (i10 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                } else if (i10 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                } else if (i10 != 3) {
                    if (i10 == 4 && bigDecimal3 != null) {
                        if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                            r2 = false;
                        }
                        return Boolean.valueOf(r2);
                    }
                    return null;
                } else if (bigDecimal2 == null) {
                    return null;
                } else {
                    if (d10 == 0.0d) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                    }
                    if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) >= 0) {
                        r2 = false;
                    }
                    return Boolean.valueOf(r2);
                }
            }
        }
        return null;
    }

    public static Boolean f(String str, hi.q3 q3Var, q3 q3Var2) {
        String u10;
        List<String> list;
        rh.p.i(q3Var);
        if (str == null || !q3Var.z() || q3Var.A() == 1) {
            return null;
        }
        if (q3Var.A() == 7) {
            if (q3Var.r() == 0) {
                return null;
            }
        } else if (!q3Var.y()) {
            return null;
        }
        int A = q3Var.A();
        boolean w10 = q3Var.w();
        if (!w10 && A != 2 && A != 7) {
            u10 = q3Var.u().toUpperCase(Locale.ENGLISH);
        } else {
            u10 = q3Var.u();
        }
        String str2 = u10;
        if (q3Var.r() == 0) {
            list = null;
        } else {
            List<String> v10 = q3Var.v();
            if (!w10) {
                ArrayList arrayList = new ArrayList(v10.size());
                for (String str3 : v10) {
                    arrayList.add(str3.toUpperCase(Locale.ENGLISH));
                }
                v10 = Collections.unmodifiableList(arrayList);
            }
            list = v10;
        }
        return d(str, A, w10, str2, list, A == 2 ? str2 : null, q3Var2);
    }

    public static Boolean g(double d10, hi.j3 j3Var) {
        try {
            return e(new BigDecimal(d10), j3Var, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean h(long j10, hi.j3 j3Var) {
        try {
            return e(new BigDecimal(j10), j3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean i(String str, hi.j3 j3Var) {
        if (da.P(str)) {
            try {
                return e(new BigDecimal(str), j3Var, 0.0d);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static Boolean j(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
