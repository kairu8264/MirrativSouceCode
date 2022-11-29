package ag;

import cg.g;
import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class a implements g {

    /* renamed from: c  reason: collision with root package name */
    public static final String f1595c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f1596d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f1597e;

    /* renamed from: f  reason: collision with root package name */
    public static final Set<zf.b> f1598f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f1599g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f1600h;

    /* renamed from: a  reason: collision with root package name */
    public final String f1601a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1602b;

    static {
        String a10 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f1595c = a10;
        String a11 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f1596d = a11;
        String a12 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f1597e = a12;
        f1598f = Collections.unmodifiableSet(new HashSet(Arrays.asList(zf.b.b("proto"), zf.b.b("json"))));
        f1599g = new a(a10, null);
        f1600h = new a(a11, a12);
    }

    public a(String str, String str2) {
        this.f1601a = str;
        this.f1602b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName(C.UTF8_NAME));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // cg.g
    public Set<zf.b> a() {
        return f1598f;
    }

    public byte[] b() {
        String str = this.f1602b;
        if (str == null && this.f1601a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f1601a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName(C.UTF8_NAME));
    }

    public String d() {
        return this.f1602b;
    }

    public String e() {
        return this.f1601a;
    }

    @Override // cg.f
    public byte[] getExtras() {
        return b();
    }

    @Override // cg.f
    public String getName() {
        return "cct";
    }
}
