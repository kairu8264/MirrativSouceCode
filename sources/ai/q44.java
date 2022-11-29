package ai;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class q44 {
    public static h34 a(s34 s34Var) {
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = s34Var.f9706c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long b10 = str != null ? b(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i11 = 0;
            j10 = 0;
            j11 = 0;
            while (i10 < split.length) {
                String trim = split[i10].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j10 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
            z10 = true;
        } else {
            z10 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = map.get("Expires");
        long b11 = str3 != null ? b(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long b12 = str4 != null ? b(str4) : 0L;
        String str5 = map.get("ETag");
        if (z10) {
            j13 = currentTimeMillis + (j10 * 1000);
            j12 = i10 != 0 ? j13 : (j11 * 1000) + j13;
        } else {
            j12 = 0;
            if (b10 <= 0 || b11 < b10) {
                j13 = 0;
            } else {
                j13 = currentTimeMillis + (b11 - b10);
                j12 = j13;
            }
        }
        h34 h34Var = new h34();
        h34Var.f4730a = s34Var.f9705b;
        h34Var.f4731b = str5;
        h34Var.f4735f = j13;
        h34Var.f4734e = j12;
        h34Var.f4732c = b10;
        h34Var.f4733d = b12;
        h34Var.f4736g = map;
        h34Var.f4737h = s34Var.f9707d;
        return h34Var;
    }

    public static long b(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                f44.d(e10, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            f44.a("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static String c(long j10) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    public static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
