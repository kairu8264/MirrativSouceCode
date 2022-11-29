package of;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.EditText;
import com.dena.mirrativ.mirrativapi.BuildConfig;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import nd.f1;
import wn.v;
import yd.t1;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f45411a = new n();

    /* renamed from: b  reason: collision with root package name */
    public static String f45412b = "";

    /* renamed from: c  reason: collision with root package name */
    public static final Object f45413c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final int f45414d = 8;

    /* loaded from: classes3.dex */
    public static final class a extends en.a<List<? extends T>> {
    }

    public static final void A(Context context, int i10, boolean z10) {
        if (context != null) {
            String string = context.getResources().getString(i10);
            jo.p.g(string, "context.resources.getString(strId)");
            t1.f61795x.a(context, string);
        }
    }

    public static final String c(Context context) {
        jo.p.h(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        jo.p.g(string, "getString(context.conten…ttings.Secure.ANDROID_ID)");
        return string;
    }

    public static final String f(long j10) {
        String valueOf;
        String valueOf2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j10);
        if (hours < 10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(hours);
            valueOf = sb2.toString();
        } else {
            valueOf = String.valueOf(hours);
        }
        long j11 = 60;
        long minutes = timeUnit.toMinutes(j10 - ((hours * j11) * j11));
        if (minutes < 10) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('0');
            sb3.append(minutes);
            valueOf2 = sb3.toString();
        } else {
            valueOf2 = String.valueOf(minutes);
        }
        return valueOf + ':' + valueOf2;
    }

    public static final String k() {
        String str;
        synchronized (f45413c) {
            str = f45412b;
        }
        return str;
    }

    public static final boolean n() {
        return false;
    }

    public static final boolean p() {
        return jo.p.c(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }

    public static final <T> en.a<List<T>> q() {
        return new a();
    }

    public static final boolean r(Context context, String str) {
        if (context == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        if (f45411a.d(context, intent)) {
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e10) {
                g9.a.c(e10);
                return false;
            }
        }
        return false;
    }

    public static final void x(Context context) {
        jo.p.h(context, "$context");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            jo.p.g(advertisingIdInfo, "getAdvertisingIdInfo(context)");
            String str = "";
            if (!advertisingIdInfo.isLimitAdTrackingEnabled()) {
                n nVar = f45411a;
                String id2 = advertisingIdInfo.getId();
                if (id2 != null) {
                    str = id2;
                }
                nVar.y(str);
            } else {
                f45411a.y("");
            }
        } catch (Exception e10) {
            g9.a.c(e10);
        }
    }

    public static final void z(Context context) {
        if (context != null) {
            f45411a.B(context, context.getResources().getString(f1.f41966c), false);
        }
    }

    public final void B(Context context, String str, boolean z10) {
        t1.a aVar = t1.f61795x;
        jo.p.e(context);
        jo.p.e(str);
        aVar.a(context, str);
    }

    public final String b(ServerConfig serverConfig, String str) {
        jo.p.h(serverConfig, "serverConfig");
        if (str == null || !so.n.C(str, serverConfig.getServerURL(), false, 2, null)) {
            return str;
        }
        String basicAuthUser = serverConfig.getBasicAuthUser();
        String basicAuthPassword = serverConfig.getBasicAuthPassword();
        if (TextUtils.isEmpty(basicAuthUser) || TextUtils.isEmpty(basicAuthPassword)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String str2 = parse.getScheme() + "://";
        String c10 = new so.e(str2).c(str, "");
        if (so.n.C(c10, basicAuthUser, false, 2, null)) {
            return str;
        }
        return str2 + basicAuthUser + ':' + basicAuthPassword + '@' + c10;
    }

    public final boolean d(Context context, Intent intent) {
        jo.p.h(context, "context");
        jo.p.h(intent, "intent");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        jo.p.g(queryIntentActivities, "mgr.queryIntentActivities(intent, 0)");
        return queryIntentActivities.size() > 0;
    }

    public final String e(Context context, long j10) {
        if (context == null) {
            return "";
        }
        long j11 = 1000;
        long max = Math.max((System.currentTimeMillis() / j11) - j10, 0L);
        if (max < 3600) {
            String string = context.getString(f1.text_minutes_ago, String.valueOf(max / 60));
            jo.p.g(string, "{\n            val minute…tes.toString())\n        }");
            return string;
        } else if (max < 86400) {
            long j12 = 60;
            String string2 = context.getString(f1.text_hours_ago, String.valueOf((max / j12) / j12));
            jo.p.g(string2, "{\n            val hours …urs.toString())\n        }");
            return string2;
        } else if (max < 172800) {
            String string3 = context.getString(f1.text_yesterday);
            jo.p.g(string3, "{\n            context.ge…text_yesterday)\n        }");
            return string3;
        } else if (max < 604800) {
            String format = new SimpleDateFormat("EEEE").format(new Date(j10 * j11));
            jo.p.g(format, "{\n            SimpleDate…te(sec * 1000))\n        }");
            return format;
        } else {
            String format2 = new SimpleDateFormat(context.getString(f1.text_chat_tab_dateformat_android)).format(new Date(j10 * j11));
            jo.p.g(format2, "{\n            SimpleDate…te(sec * 1000))\n        }");
            return format2;
        }
    }

    public final void g(Context context, EditText editText) {
        String substring;
        jo.p.h(context, "context");
        jo.p.h(editText, "view_to_copy");
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        Object systemService = context.getSystemService("clipboard");
        jo.p.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (selectionStart == selectionEnd) {
            substring = editText.getText().toString();
        } else {
            substring = editText.getText().toString().substring(editText.getSelectionStart(), editText.getSelectionEnd());
            jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        clipboardManager.setPrimaryClip(new ClipData(new ClipDescription("text_data", new String[]{"text/plain"}), new ClipData.Item(substring)));
    }

    public final Intent h(Context context, String str) {
        jo.p.h(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        if (d(context, intent)) {
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setFlags(268435456);
            return intent;
        }
        return null;
    }

    public final String i(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            if (decode == null) {
                return null;
            }
            if (decode.length == 0) {
                return null;
            }
            byte[] bArr = new byte[decode.length];
            int length = decode.length;
            for (int i10 = 0; i10 < length; i10++) {
                bArr[i10] = (byte) ((decode[i10] ^ 85) & 255);
            }
            Charset forName = Charset.forName(C.UTF8_NAME);
            jo.p.g(forName, "forName(\"UTF-8\")");
            return new String(bArr, forName);
        } catch (Exception e10) {
            g9.a.c(e10);
            return null;
        }
    }

    @SuppressLint({"StringFormatMatches"})
    public final String j(Context context, long j10) {
        jo.p.h(context, "context");
        if (j10 >= 86400000) {
            String string = context.getString(f1.text_days_ago, Long.valueOf(j10 / 86400000));
            jo.p.g(string, "{\n            context.ge….DAY_IN_MILLIS)\n        }");
            return string;
        } else if (j10 >= 3600000) {
            String string2 = context.getString(f1.text_hours_ago, Long.valueOf(j10 / 3600000));
            jo.p.g(string2, "{\n            context.ge…HOUR_IN_MILLIS)\n        }");
            return string2;
        } else if (j10 >= DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS) {
            String string3 = context.getString(f1.text_minutes_ago, Long.valueOf(j10 / DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS));
            jo.p.g(string3, "{\n            context.ge…NUTE_IN_MILLIS)\n        }");
            return string3;
        } else if (j10 >= 1000) {
            String string4 = context.getString(f1.text_seconds_ago, Long.valueOf(j10 / 1000));
            jo.p.g(string4, "{\n            context.ge…COND_IN_MILLIS)\n        }");
            return string4;
        } else {
            return "-";
        }
    }

    public final void l(Context context, MRError mRError) {
    }

    public final boolean m(Context context) {
        jo.p.h(context, "context");
        Object systemService = context.getSystemService("power");
        jo.p.f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode();
    }

    public final boolean o(Context context) {
        jo.p.h(context, "context");
        return so.n.q(context.getResources().getConfiguration().locale.getLanguage(), "ja", true);
    }

    public final int[] s(List<Integer> list) {
        jo.p.h(list, "colors");
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('#');
            Integer num = list.get(i10);
            jo.p.e(num);
            sb2.append(Integer.toHexString(num.intValue()));
            iArr[i10] = Color.parseColor(sb2.toString());
        }
        return iArr;
    }

    public final void t(Context context, EditText editText) {
        jo.p.h(context, "context");
        jo.p.h(editText, "view_to_paste");
        u(context, v(context), editText);
    }

    public final void u(Context context, String str, EditText editText) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String obj = editText.getText().toString();
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        int length = obj.length();
        StringBuilder sb2 = new StringBuilder();
        String substring = obj.substring(0, selectionStart);
        jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring);
        sb2.append(v(context));
        String substring2 = obj.substring(selectionEnd, length);
        jo.p.g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring2);
        editText.setText(sb2.toString());
        jo.p.e(str);
        int length2 = selectionStart + str.length();
        if (length2 > editText.getText().length()) {
            length2 = editText.getText().length();
        }
        editText.setSelection(length2);
    }

    public final String v(Context context) {
        Object systemService = context.getSystemService("clipboard");
        jo.p.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (clipboardManager.hasPrimaryClip()) {
            ClipDescription primaryClipDescription = clipboardManager.getPrimaryClipDescription();
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null || primaryClipDescription == null) {
                return null;
            }
            if (primaryClipDescription.hasMimeType("text/html") || primaryClipDescription.hasMimeType("text/plain")) {
                return primaryClip.getItemAt(0).getText().toString();
            }
            return null;
        }
        return null;
    }

    public final void w(final Context context) {
        jo.p.h(context, "context");
        new Thread(new Runnable() { // from class: of.m
            @Override // java.lang.Runnable
            public final void run() {
                n.x(context);
            }
        }).start();
    }

    public final void y(String str) {
        synchronized (f45413c) {
            f45412b = str;
            v vVar = v.f59242a;
        }
    }
}
