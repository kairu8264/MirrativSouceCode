package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f28000a;

    public c(Bundle bundle) {
        Objects.requireNonNull(bundle, "data");
        this.f28000a = new Bundle(bundle);
    }

    public static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    public static boolean s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    public static boolean t(Bundle bundle) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString("gcm.n.e")) || IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString(v("gcm.n.e")));
    }

    public static boolean u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    public static String v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    public static String z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String p10 = p(str);
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(p10) || Boolean.parseBoolean(p10);
    }

    public Integer b(String str) {
        String p10 = p(str);
        if (TextUtils.isEmpty(p10)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p10));
        } catch (NumberFormatException unused) {
            String z10 = z(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(z10).length() + 38 + String.valueOf(p10).length());
            sb2.append("Couldn't parse value of ");
            sb2.append(z10);
            sb2.append("(");
            sb2.append(p10);
            sb2.append(") into an int");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public JSONArray c(String str) {
        String p10 = p(str);
        if (TextUtils.isEmpty(p10)) {
            return null;
        }
        try {
            return new JSONArray(p10);
        } catch (JSONException unused) {
            String z10 = z(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(z10).length() + 50 + String.valueOf(p10).length());
            sb2.append("Malformed JSON for key ");
            sb2.append(z10);
            sb2.append(": ");
            sb2.append(p10);
            sb2.append(", falling back to default");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public int[] e() {
        JSONArray c10 = c("gcm.n.light_settings");
        if (c10 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c10.length() == 3) {
                iArr[0] = d(c10.optString(0));
                iArr[1] = c10.optInt(1);
                iArr[2] = c10.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e10) {
            String obj = c10.toString();
            String message = e10.getMessage();
            StringBuilder sb2 = new StringBuilder(obj.length() + 60 + String.valueOf(message).length());
            sb2.append("LightSettings is invalid: ");
            sb2.append(obj);
            sb2.append(". ");
            sb2.append(message);
            sb2.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb2.toString());
            return null;
        } catch (JSONException unused) {
            String obj2 = c10.toString();
            StringBuilder sb3 = new StringBuilder(obj2.length() + 58);
            sb3.append("LightSettings is invalid: ");
            sb3.append(obj2);
            sb3.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb3.toString());
            return null;
        }
    }

    public Uri f() {
        String p10 = p("gcm.n.link_android");
        if (TextUtils.isEmpty(p10)) {
            p10 = p("gcm.n.link");
        }
        if (TextUtils.isEmpty(p10)) {
            return null;
        }
        return Uri.parse(p10);
    }

    public Object[] g(String str) {
        JSONArray c10 = c(String.valueOf(str).concat("_loc_args"));
        if (c10 == null) {
            return null;
        }
        int length = c10.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = c10.optString(i10);
        }
        return strArr;
    }

    public String h(String str) {
        return p(String.valueOf(str).concat("_loc_key"));
    }

    public String i(Resources resources, String str, String str2) {
        String h10 = h(str2);
        if (TextUtils.isEmpty(h10)) {
            return null;
        }
        int identifier = resources.getIdentifier(h10, "string", str);
        if (identifier == 0) {
            String z10 = z(String.valueOf(str2).concat("_loc_key"));
            StringBuilder sb2 = new StringBuilder(String.valueOf(z10).length() + 49 + String.valueOf(str2).length());
            sb2.append(z10);
            sb2.append(" resource not found: ");
            sb2.append(str2);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
        Object[] g10 = g(str2);
        if (g10 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g10);
        } catch (MissingFormatArgumentException e10) {
            String z11 = z(str2);
            String arrays = Arrays.toString(g10);
            StringBuilder sb3 = new StringBuilder(String.valueOf(z11).length() + 58 + String.valueOf(arrays).length());
            sb3.append("Missing format argument for ");
            sb3.append(z11);
            sb3.append(": ");
            sb3.append(arrays);
            sb3.append(" Default value will be used.");
            Log.w("NotificationParams", sb3.toString(), e10);
            return null;
        }
    }

    public Long j(String str) {
        String p10 = p(str);
        if (TextUtils.isEmpty(p10)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p10));
        } catch (NumberFormatException unused) {
            String z10 = z(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(z10).length() + 38 + String.valueOf(p10).length());
            sb2.append("Couldn't parse value of ");
            sb2.append(z10);
            sb2.append("(");
            sb2.append(p10);
            sb2.append(") into a long");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public String k() {
        return p("gcm.n.android_channel_id");
    }

    public Integer l() {
        Integer b10 = b("gcm.n.notification_count");
        if (b10 == null) {
            return null;
        }
        if (b10.intValue() < 0) {
            String obj = b10.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 67);
            sb2.append("notificationCount is invalid: ");
            sb2.append(obj);
            sb2.append(". Skipping setting notificationCount.");
            Log.w("FirebaseMessaging", sb2.toString());
            return null;
        }
        return b10;
    }

    public Integer m() {
        Integer b10 = b("gcm.n.notification_priority");
        if (b10 == null) {
            return null;
        }
        if (b10.intValue() < -2 || b10.intValue() > 2) {
            String obj = b10.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 72);
            sb2.append("notificationPriority is invalid ");
            sb2.append(obj);
            sb2.append(". Skipping setting notificationPriority.");
            Log.w("FirebaseMessaging", sb2.toString());
            return null;
        }
        return b10;
    }

    public String n(Resources resources, String str, String str2) {
        String p10 = p(str2);
        return !TextUtils.isEmpty(p10) ? p10 : i(resources, str, str2);
    }

    public String o() {
        String p10 = p("gcm.n.sound2");
        return TextUtils.isEmpty(p10) ? p("gcm.n.sound") : p10;
    }

    public String p(String str) {
        return this.f28000a.getString(w(str));
    }

    public long[] q() {
        JSONArray c10 = c("gcm.n.vibrate_timings");
        if (c10 == null) {
            return null;
        }
        try {
            if (c10.length() > 1) {
                int length = c10.length();
                long[] jArr = new long[length];
                for (int i10 = 0; i10 < length; i10++) {
                    jArr[i10] = c10.optLong(i10);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String obj = c10.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 74);
            sb2.append("User defined vibrateTimings is invalid: ");
            sb2.append(obj);
            sb2.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public Integer r() {
        Integer b10 = b("gcm.n.visibility");
        if (b10 == null) {
            return null;
        }
        if (b10.intValue() < -1 || b10.intValue() > 1) {
            String obj = b10.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 53);
            sb2.append("visibility is invalid: ");
            sb2.append(obj);
            sb2.append(". Skipping setting visibility.");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
        return b10;
    }

    public final String w(String str) {
        if (!this.f28000a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v10 = v(str);
            if (this.f28000a.containsKey(v10)) {
                return v10;
            }
        }
        return str;
    }

    public Bundle x() {
        Bundle bundle = new Bundle(this.f28000a);
        for (String str : this.f28000a.keySet()) {
            if (!s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle y() {
        Bundle bundle = new Bundle(this.f28000a);
        for (String str : this.f28000a.keySet()) {
            if (u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
