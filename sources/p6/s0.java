package p6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s0 {
    public static String a(Context context, String str, z zVar) {
        if (c1.X(context, "com.adjust.preinstall")) {
            return l(context, c1.k("content://%s/%s", "com.adjust.preinstall", "trackers"), str, zVar);
        }
        return null;
    }

    public static String b(String str, String str2, z zVar) {
        String n10 = n("/data/local/tmp/adjust.preinstall", zVar);
        if (n10 == null || n10.isEmpty()) {
            if (str2 != null && !str2.isEmpty()) {
                n10 = n(str2, zVar);
            }
            if (n10 == null || n10.isEmpty()) {
                return null;
            }
        }
        return o(n10, str, zVar);
    }

    public static String c(String str, z zVar) {
        return p("adjust.preinstall." + str, zVar);
    }

    public static String d(String str, z zVar) {
        String n10;
        String p10 = p("adjust.preinstall.path", zVar);
        if (p10 == null || p10.isEmpty() || (n10 = n(p10, zVar)) == null || n10.isEmpty()) {
            return null;
        }
        return o(n10, str, zVar);
    }

    public static String e(String str, z zVar) {
        String n10;
        String q10 = q("adjust.preinstall.path", zVar);
        if (q10 == null || q10.isEmpty() || (n10 = n(q10, zVar)) == null || n10.isEmpty()) {
            return null;
        }
        return o(n10, str, zVar);
    }

    public static String f(String str, z zVar) {
        return q("adjust.preinstall." + str, zVar);
    }

    public static List<String> g(Context context, String str, z zVar) {
        return m(context, str, "android.permission.INSTALL_PACKAGES", zVar);
    }

    public static List<String> h(Context context, String str, z zVar) {
        return m(context, str, null, zVar);
    }

    public static boolean i(long j10) {
        return (j10 & 255) == 255;
    }

    public static boolean j(String str, long j10) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1771852303:
                if (str.equals("content_provider_intent_action")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1590804087:
                if (str.equals("system_properties_path_reflection")) {
                    c10 = 1;
                    break;
                }
                break;
            case -782042377:
                if (str.equals("content_provider")) {
                    c10 = 2;
                    break;
                }
                break;
            case -480091743:
                if (str.equals("system_properties_path")) {
                    c10 = 3;
                    break;
                }
                break;
            case -468656985:
                if (str.equals("system_properties_reflection")) {
                    c10 = 4;
                    break;
                }
                break;
            case -95318717:
                if (str.equals("system_properties")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2055247442:
                if (str.equals("file_system")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2080271301:
                if (str.equals("content_provider_no_permission")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return (j10 & 32) != 32;
            case 1:
                return (j10 & 8) != 8;
            case 2:
                return (j10 & 16) != 16;
            case 3:
                return (j10 & 4) != 4;
            case 4:
                return (j10 & 2) != 2;
            case 5:
                return (j10 & 1) != 1;
            case 6:
                return (j10 & 64) != 64;
            case 7:
                return (j10 & 128) != 128;
            default:
                return false;
        }
    }

    public static long k(String str, long j10) {
        long j11;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1771852303:
                if (str.equals("content_provider_intent_action")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1590804087:
                if (str.equals("system_properties_path_reflection")) {
                    c10 = 1;
                    break;
                }
                break;
            case -782042377:
                if (str.equals("content_provider")) {
                    c10 = 2;
                    break;
                }
                break;
            case -480091743:
                if (str.equals("system_properties_path")) {
                    c10 = 3;
                    break;
                }
                break;
            case -468656985:
                if (str.equals("system_properties_reflection")) {
                    c10 = 4;
                    break;
                }
                break;
            case -95318717:
                if (str.equals("system_properties")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2055247442:
                if (str.equals("file_system")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2080271301:
                if (str.equals("content_provider_no_permission")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                j11 = 32;
                break;
            case 1:
                j11 = 8;
                break;
            case 2:
                j11 = 16;
                break;
            case 3:
                j11 = 4;
                break;
            case 4:
                j11 = 2;
                break;
            case 5:
                j11 = 1;
                break;
            case 6:
                j11 = 64;
                break;
            case 7:
                j11 = 128;
                break;
            default:
                return j10;
        }
        return j10 | j11;
    }

    public static String l(Context context, String str, String str2, z zVar) {
        try {
            Cursor query = context.getContentResolver().query(Uri.parse(str), new String[]{"encrypted_data"}, "package_name=?", new String[]{str2}, null);
            if (query == null) {
                zVar.d("Read content provider cursor null content uri [%s]", str);
                return null;
            } else if (!query.moveToFirst()) {
                zVar.d("Read content provider cursor empty content uri [%s]", str);
                query.close();
                return null;
            } else {
                String string = query.getString(0);
                query.close();
                return string;
            }
        } catch (Exception e10) {
            zVar.c("Exception read content provider uri [%s] error [%s]", str, e10.getMessage());
            return null;
        }
    }

    public static List<String> m(Context context, String str, String str2, z zVar) {
        String str3;
        String l10;
        if (Build.VERSION.SDK_INT >= 19) {
            List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.attribution.REFERRAL_PROVIDER"), 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentContentProviders) {
                if ((str2 == null || context.getPackageManager().checkPermission(str2, resolveInfo.providerInfo.packageName) == 0) && (str3 = resolveInfo.providerInfo.authority) != null && !str3.isEmpty() && (l10 = l(context, c1.k("content://%s/%s", str3, "trackers"), str, zVar)) != null && !l10.isEmpty()) {
                    arrayList.add(l10);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
        return null;
    }

    public static String n(String str, z zVar) {
        File file = new File(str);
        if (file.exists() && file.isFile() && file.canRead()) {
            try {
                int length = (int) file.length();
                if (length <= 0) {
                    zVar.d("Read file content empty file", new Object[0]);
                    return null;
                }
                byte[] bArr = new byte[length];
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                    return new String(bArr);
                } catch (Exception e10) {
                    zVar.c("Exception read file input stream error [%s]", e10.getMessage());
                    fileInputStream.close();
                    return null;
                }
            } catch (Exception e11) {
                zVar.c("Exception read file content error [%s]", e11.getMessage());
            }
        }
        return null;
    }

    public static String o(String str, String str2, z zVar) {
        try {
            return new JSONObject(str.trim()).optString(str2);
        } catch (Exception e10) {
            zVar.c("Exception read payload from json string error [%s]", e10.getMessage());
            return null;
        }
    }

    public static String p(String str, z zVar) {
        try {
            return System.getProperty(str);
        } catch (Exception e10) {
            zVar.c("Exception read system property key [%s] error [%s]", str, e10.getMessage());
            return null;
        }
    }

    @SuppressLint({"PrivateApi"})
    public static String q(String str, z zVar) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            zVar.c("Exception read system property using reflection key [%s] error [%s]", str, e10.getMessage());
            return null;
        }
    }
}
