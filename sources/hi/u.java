package hi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class u implements Iterable<q>, q {

    /* renamed from: w  reason: collision with root package name */
    public final String f36007w;

    public u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f36007w = str;
    }

    @Override // hi.q
    public final q d() {
        return new u(this.f36007w);
    }

    @Override // hi.q
    public final Double e() {
        if (this.f36007w.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f36007w);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f36007w.equals(((u) obj).f36007w);
        }
        return false;
    }

    @Override // hi.q
    public final Boolean f() {
        return Boolean.valueOf(!this.f36007w.isEmpty());
    }

    @Override // hi.q
    public final String h() {
        return this.f36007w;
    }

    public final int hashCode() {
        return this.f36007w.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<q> iterator() {
        return new t(this);
    }

    @Override // hi.q
    public final Iterator<q> j() {
        return new s(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // hi.q
    public final q l(String str, u4 u4Var, List<q> list) {
        String str2;
        Object obj;
        String str3;
        String str4;
        char c10;
        u uVar;
        int i10;
        q iVar;
        double doubleValue;
        String str5;
        Matcher matcher;
        double min;
        double min2;
        u uVar2;
        int i11;
        int i12;
        u4 u4Var2;
        int i13;
        int length;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
        } else {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str) && !"trim".equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                obj = "charAt";
                str3 = "hasOwnProperty";
                if (str.equals(str3)) {
                    str4 = "toString";
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                str4 = "toString";
                break;
            case -1776922004:
                obj = "charAt";
                if (str.equals("toString")) {
                    c10 = 14;
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case -1464939364:
                obj = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c10 = '\f';
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case -1361633751:
                obj = "charAt";
                if (str.equals(obj)) {
                    str3 = "hasOwnProperty";
                    c10 = 0;
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case -1354795244:
                if (str.equals("concat")) {
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    c10 = 1;
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c10 = '\r';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case -906336856:
                if (str.equals("search")) {
                    c10 = 7;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case -726908483:
                if (str.equals(str2)) {
                    c10 = 11;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c10 = 4;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c10 = 15;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case 3568674:
                if (str.equals("trim")) {
                    c10 = 16;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case 103668165:
                if (str.equals("match")) {
                    c10 = 5;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case 109526418:
                if (str.equals("slice")) {
                    c10 = '\b';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case 109648666:
                if (str.equals("split")) {
                    c10 = '\t';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case 530542161:
                if (str.equals("substring")) {
                    c10 = '\n';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case 1094496948:
                if (str.equals("replace")) {
                    c10 = 6;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            case 1943291465:
                if (str.equals("indexOf")) {
                    c10 = 3;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
            default:
                obj = "charAt";
                str3 = "hasOwnProperty";
                c10 = 65535;
                str4 = "toString";
                break;
        }
        String str6 = obj;
        switch (c10) {
            case 0:
                v5.j(str6, 1, list);
                int a10 = list.size() > 0 ? (int) v5.a(u4Var.b(list.get(0)).e().doubleValue()) : 0;
                String str7 = this.f36007w;
                if (a10 >= 0 && a10 < str7.length()) {
                    return new u(String.valueOf(str7.charAt(a10)));
                }
                return q.f35928m;
            case 1:
                uVar = this;
                if (list.size() != 0) {
                    StringBuilder sb2 = new StringBuilder(uVar.f36007w);
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        sb2.append(u4Var.b(list.get(i14)).h());
                    }
                    return new u(sb2.toString());
                }
                return uVar;
            case 2:
                v5.h(str3, 1, list);
                String str8 = this.f36007w;
                q b10 = u4Var.b(list.get(0));
                if ("length".equals(b10.h())) {
                    return q.f35926k;
                }
                double doubleValue2 = b10.e().doubleValue();
                return (doubleValue2 != Math.floor(doubleValue2) || (i10 = (int) doubleValue2) < 0 || i10 >= str8.length()) ? q.f35927l : q.f35926k;
            case 3:
                v5.j("indexOf", 2, list);
                iVar = new i(Double.valueOf(this.f36007w.indexOf(list.size() > 0 ? u4Var.b(list.get(0)).h() : "undefined", (int) v5.a(list.size() < 2 ? 0.0d : u4Var.b(list.get(1)).e().doubleValue()))));
                return iVar;
            case 4:
                v5.j("lastIndexOf", 2, list);
                String str9 = this.f36007w;
                String h10 = list.size() > 0 ? u4Var.b(list.get(0)).h() : "undefined";
                return new i(Double.valueOf(str9.lastIndexOf(h10, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : u4Var.b(list.get(1)).e().doubleValue()) ? Double.POSITIVE_INFINITY : v5.a(doubleValue)))));
            case 5:
                v5.j("match", 1, list);
                Matcher matcher2 = Pattern.compile(list.size() > 0 ? u4Var.b(list.get(0)).h() : "").matcher(this.f36007w);
                return matcher2.find() ? new f(Arrays.asList(new u(matcher2.group()))) : q.f35922g;
            case 6:
                uVar = this;
                v5.j("replace", 2, list);
                q qVar = q.f35921f;
                if (list.size() > 0) {
                    str5 = u4Var.b(list.get(0)).h();
                    if (list.size() > 1) {
                        qVar = u4Var.b(list.get(1));
                    }
                }
                String str10 = str5;
                String str11 = uVar.f36007w;
                int indexOf = str11.indexOf(str10);
                if (indexOf >= 0) {
                    if (qVar instanceof j) {
                        qVar = ((j) qVar).a(u4Var, Arrays.asList(new u(str10), new i(Double.valueOf(indexOf)), uVar));
                    }
                    String substring = str11.substring(0, indexOf);
                    String h11 = qVar.h();
                    String substring2 = str11.substring(indexOf + str10.length());
                    StringBuilder sb3 = new StringBuilder(String.valueOf(substring).length() + String.valueOf(h11).length() + String.valueOf(substring2).length());
                    sb3.append(substring);
                    sb3.append(h11);
                    sb3.append(substring2);
                    iVar = new u(sb3.toString());
                    return iVar;
                }
                return uVar;
            case 7:
                v5.j("search", 1, list);
                if (Pattern.compile(list.size() > 0 ? u4Var.b(list.get(0)).h() : "undefined").matcher(this.f36007w).find()) {
                    return new i(Double.valueOf(matcher.start()));
                }
                return new i(Double.valueOf(-1.0d));
            case '\b':
                v5.j("slice", 2, list);
                String str12 = this.f36007w;
                double a11 = v5.a(list.size() > 0 ? u4Var.b(list.get(0)).e().doubleValue() : 0.0d);
                if (a11 < 0.0d) {
                    min = Math.max(str12.length() + a11, 0.0d);
                } else {
                    min = Math.min(a11, str12.length());
                }
                int i15 = (int) min;
                double a12 = v5.a(list.size() > 1 ? u4Var.b(list.get(1)).e().doubleValue() : str12.length());
                if (a12 < 0.0d) {
                    min2 = Math.max(str12.length() + a12, 0.0d);
                } else {
                    min2 = Math.min(a12, str12.length());
                }
                uVar2 = new u(str12.substring(i15, Math.max(0, ((int) min2) - i15) + i15));
                return uVar2;
            case '\t':
                v5.j("split", 2, list);
                String str13 = this.f36007w;
                if (str13.length() == 0) {
                    return new f(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.size() == 0) {
                    arrayList.add(this);
                } else {
                    String h12 = u4Var.b(list.get(0)).h();
                    long d10 = list.size() > 1 ? v5.d(u4Var.b(list.get(1)).e().doubleValue()) : 2147483647L;
                    if (d10 == 0) {
                        return new f();
                    }
                    String[] split = str13.split(Pattern.quote(h12), ((int) d10) + 1);
                    int length2 = split.length;
                    if (!h12.equals("") || length2 <= 0) {
                        i11 = length2;
                        i12 = 0;
                    } else {
                        boolean equals = split[0].equals("");
                        i11 = length2 - 1;
                        if (!split[i11].equals("")) {
                            i11 = length2;
                        }
                        i12 = equals;
                    }
                    if (length2 > d10) {
                        i11--;
                    }
                    for (int i16 = i12; i16 < i11; i16++) {
                        arrayList.add(new u(split[i16]));
                    }
                }
                return new f(arrayList);
            case '\n':
                v5.j("substring", 2, list);
                String str14 = this.f36007w;
                if (list.size() > 0) {
                    u4Var2 = u4Var;
                    i13 = (int) v5.a(u4Var2.b(list.get(0)).e().doubleValue());
                } else {
                    u4Var2 = u4Var;
                    i13 = 0;
                }
                if (list.size() > 1) {
                    length = (int) v5.a(u4Var2.b(list.get(1)).e().doubleValue());
                } else {
                    length = str14.length();
                }
                int min3 = Math.min(Math.max(i13, 0), str14.length());
                int min4 = Math.min(Math.max(length, 0), str14.length());
                uVar2 = new u(str14.substring(Math.min(min3, min4), Math.max(min3, min4)));
                return uVar2;
            case 11:
                v5.h(str2, 0, list);
                return new u(this.f36007w.toUpperCase());
            case '\f':
                v5.h("toLocaleLowerCase", 0, list);
                return new u(this.f36007w.toLowerCase());
            case '\r':
                v5.h("toLowerCase", 0, list);
                return new u(this.f36007w.toLowerCase(Locale.ENGLISH));
            case 14:
                uVar = this;
                v5.h(str4, 0, list);
                return uVar;
            case 15:
                v5.h("toUpperCase", 0, list);
                return new u(this.f36007w.toUpperCase(Locale.ENGLISH));
            case 16:
                v5.h("toUpperCase", 0, list);
                return new u(this.f36007w.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final String toString() {
        String str = this.f36007w;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('\"');
        sb2.append(str);
        sb2.append('\"');
        return sb2.toString();
    }
}
