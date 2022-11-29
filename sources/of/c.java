package of;

import android.content.Context;
import android.content.res.Resources;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import jo.i0;
import wn.l;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f45387a = new c();

    public final String a(String str, String str2, String str3, Resources resources) {
        Object a10;
        String format;
        jo.p.h(str, "dateTimeValue");
        jo.p.h(str2, "formatFrom");
        jo.p.h(str3, "formatTo");
        jo.p.h(resources, "resources");
        try {
            l.a aVar = wn.l.f59224w;
            Locale locale = resources.getConfiguration().getLocales().get(0);
            Date parse = new SimpleDateFormat(str2, locale).parse(str);
            if (parse == null) {
                format = null;
            } else {
                jo.p.g(parse, "SimpleDateFormat(formatF…: return@runCatching null");
                format = new SimpleDateFormat(str3, locale).format(parse);
            }
            a10 = wn.l.a(format);
        } catch (Throwable th2) {
            l.a aVar2 = wn.l.f59224w;
            a10 = wn.l.a(wn.m.a(th2));
        }
        String str4 = wn.l.c(a10) ? null : a10;
        return str4 == null ? "" : str4;
    }

    public final String b(long j10) {
        i0 i0Var = i0.f38149a;
        long j11 = 3600;
        String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j10 / j11)}, 1));
        jo.p.g(format, "format(format, *args)");
        String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf((j10 % j11) / 60)}, 1));
        jo.p.g(format2, "format(format, *args)");
        return format + ':' + format2;
    }

    public final String c(long j10) {
        i0 i0Var = i0.f38149a;
        long j11 = 3600;
        String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j10 / j11)}, 1));
        jo.p.g(format, "format(format, *args)");
        long j12 = 60;
        String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf((j10 % j11) / j12)}, 1));
        jo.p.g(format2, "format(format, *args)");
        String format3 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j10 % j12)}, 1));
        jo.p.g(format3, "format(format, *args)");
        return format + ':' + format2 + ':' + format3;
    }

    public final String d(long j10) {
        i0 i0Var = i0.f38149a;
        long j11 = 60;
        String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf((j10 % 3600) / j11)}, 1));
        jo.p.g(format, "format(format, *args)");
        String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j10 % j11)}, 1));
        jo.p.g(format2, "format(format, *args)");
        return format + ':' + format2;
    }

    public final String e(Context context, long j10, long j11) {
        jo.p.h(context, "context");
        long j12 = j10 - j11;
        long j13 = 60;
        if (new BigDecimal(((j12 / 1000) / j13) / j13).setScale(0, 4).intValue() < 24) {
            return n.f45411a.j(context, j12);
        }
        String format = new SimpleDateFormat("MM/dd", k3.d.a(context.getResources().getConfiguration()).c(0)).format(new Date(j11));
        jo.p.g(format, "{\n            val date =…df.format(date)\n        }");
        return format;
    }

    public final String f(Context context, long j10, long j11) {
        jo.p.h(context, "context");
        long j12 = j10 - j11;
        long j13 = 60;
        if (new BigDecimal(((j12 / 1000) / j13) / j13).setScale(0, 4).intValue() < 24) {
            return n.f45411a.j(context, j12);
        }
        String format = new SimpleDateFormat("yyyy/M/d", k3.d.a(context.getResources().getConfiguration()).c(0)).format(new Date(j11));
        jo.p.g(format, "{\n            val date =…df.format(date)\n        }");
        return format;
    }
}
