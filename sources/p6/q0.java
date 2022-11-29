package p6;

import android.net.UrlQuerySanitizer;
import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class q0 {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
        r1 = r7.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p6.c a(android.net.Uri r7, long r8, p6.d r10, p6.g r11, p6.u r12, p6.y0 r13) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r7.toString()
            if (r1 == 0) goto L8c
            int r2 = r1.length()
            if (r2 != 0) goto L12
            goto L8c
        L12:
            r2 = 0
            r3 = 1
            java.lang.String r4 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r4)     // Catch: java.lang.Exception -> L1b java.lang.IllegalArgumentException -> L2e java.io.UnsupportedEncodingException -> L41
            goto L53
        L1b:
            r4 = move-exception
            p6.z r5 = p6.k.h()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r4 = r4.getMessage()
            r6[r2] = r4
            java.lang.String r4 = "Deeplink url decoding failed. Message: (%s)"
            r5.c(r4, r6)
            goto L53
        L2e:
            r4 = move-exception
            p6.z r5 = p6.k.h()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r4 = r4.getMessage()
            r6[r2] = r4
            java.lang.String r4 = "Deeplink url decoding failed due to IllegalArgumentException. Message: (%s)"
            r5.c(r4, r6)
            goto L53
        L41:
            r4 = move-exception
            p6.z r5 = p6.k.h()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r4 = r4.getMessage()
            r6[r2] = r4
            java.lang.String r4 = "Deeplink url decoding failed due to UnsupportedEncodingException. Message: (%s)"
            r5.c(r4, r6)
        L53:
            p6.z r4 = p6.k.h()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r1
            java.lang.String r2 = "Url to parse (%s)"
            r4.g(r2, r5)
            android.net.UrlQuerySanitizer r2 = new android.net.UrlQuerySanitizer
            r2.<init>()
            android.net.UrlQuerySanitizer$ValueSanitizer r4 = android.net.UrlQuerySanitizer.getAllButNulLegal()
            r2.setUnregisteredParameterValueSanitizer(r4)
            r2.setAllowUnregisteredParamaters(r3)
            r2.parseUrl(r1)
            java.util.List r1 = r2.getParameterList()
            p6.p0 r10 = e(r1, r10, r11, r12, r13)
            if (r10 != 0) goto L7d
            return r0
        L7d:
            java.lang.String r7 = r7.toString()
            r10.f46033l = r7
            r10.f46028g = r8
            java.lang.String r7 = "deeplink"
            p6.c r7 = r10.k(r7)
            return r7
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.q0.a(android.net.Uri, long, p6.d, p6.g, p6.u, p6.y0):p6.c");
    }

    public static c b(t0 t0Var, String str, d dVar, g gVar, u uVar, y0 y0Var) {
        p0 p0Var = new p0(gVar, uVar, dVar, y0Var, System.currentTimeMillis());
        p0Var.f46034m = t0Var.f46088a;
        p0Var.f46027f = t0Var.f46089b;
        p0Var.f46029h = t0Var.f46090c;
        p0Var.f46030i = t0Var.f46091d;
        p0Var.f46031j = t0Var.f46092e;
        p0Var.f46035n = t0Var.f46093f;
        p0Var.f46040s = t0Var.f46094g;
        p0Var.f46037p = str;
        return p0Var.k("install_referrer");
    }

    public static c c(String str, String str2, d dVar, g gVar, u uVar, y0 y0Var) {
        if (str == null || str.length() == 0) {
            return null;
        }
        p0 p0Var = new p0(gVar, uVar, dVar, y0Var, System.currentTimeMillis());
        p0Var.f46038q = str;
        p0Var.f46039r = str2;
        return p0Var.k("preinstall");
    }

    public static c d(String str, long j10, d dVar, g gVar, u uVar, y0 y0Var) {
        String str2 = "malformed";
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            str2 = URLDecoder.decode(str, C.UTF8_NAME);
        } catch (UnsupportedEncodingException e10) {
            k.h().c("Referrer decoding failed due to UnsupportedEncodingException. Message: (%s)", e10.getMessage());
        } catch (IllegalArgumentException e11) {
            k.h().c("Referrer decoding failed due to IllegalArgumentException. Message: (%s)", e11.getMessage());
        } catch (Exception e12) {
            k.h().c("Referrer decoding failed. Message: (%s)", e12.getMessage());
        }
        k.h().g("Referrer to parse (%s)", str2);
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseQuery(str2);
        p0 e13 = e(urlQuerySanitizer.getParameterList(), dVar, gVar, uVar, y0Var);
        if (e13 == null) {
            return null;
        }
        e13.f46034m = str2;
        e13.f46028g = j10;
        e13.f46036o = str;
        return e13.k("reftag");
    }

    public static p0 e(List<UrlQuerySanitizer.ParameterValuePair> list, d dVar, g gVar, u uVar, y0 y0Var) {
        if (list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f fVar = new f();
        for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : list) {
            f(parameterValuePair.mParameter, parameterValuePair.mValue, linkedHashMap, fVar);
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str = (String) linkedHashMap.remove("reftag");
        if (dVar != null) {
            dVar.I = currentTimeMillis - dVar.H;
        }
        p0 p0Var = new p0(gVar, uVar, dVar, y0Var, currentTimeMillis);
        p0Var.f46042u = linkedHashMap;
        p0Var.f46041t = fVar;
        p0Var.f46032k = str;
        return p0Var;
    }

    public static boolean f(String str, String str2, Map<String, String> map, f fVar) {
        if (str == null || str2 == null || !str.startsWith("adjust_")) {
            return false;
        }
        String substring = str.substring(7);
        if (substring.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (g(fVar, substring, str2)) {
            return true;
        }
        map.put(substring, str2);
        return true;
    }

    public static boolean g(f fVar, String str, String str2) {
        if (str.equals("tracker")) {
            fVar.f45923x = str2;
            return true;
        } else if (str.equals("campaign")) {
            fVar.f45925z = str2;
            return true;
        } else if (str.equals("adgroup")) {
            fVar.A = str2;
            return true;
        } else if (str.equals("creative")) {
            fVar.B = str2;
            return true;
        } else {
            return false;
        }
    }
}
