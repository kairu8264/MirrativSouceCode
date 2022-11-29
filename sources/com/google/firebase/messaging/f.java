package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f28005a;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final long f28006d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        public final String f28007a;

        /* renamed from: b  reason: collision with root package name */
        public final String f28008b;

        /* renamed from: c  reason: collision with root package name */
        public final long f28009c;

        public a(String str, String str2, long j10) {
            this.f28007a = str;
            this.f28008b = str2;
            this.f28009c = j10;
        }

        public static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e10.toString()));
                return null;
            }
        }

        public static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e10) {
                    Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e10.toString()));
                    return null;
                }
            }
            return new a(str, null, 0L);
        }

        public boolean b(String str) {
            return System.currentTimeMillis() > this.f28009c + f28006d || !str.equals(this.f28008b);
        }
    }

    public f(Context context) {
        this.f28005a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    public final void a(Context context, String str) {
        File file = new File(c3.a.i(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || e()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            c();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public final String b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("|T|");
        sb2.append(str2);
        sb2.append("|*");
        return sb2.toString();
    }

    public synchronized void c() {
        this.f28005a.edit().clear().commit();
    }

    public synchronized a d(String str, String str2) {
        return a.c(this.f28005a.getString(b(str, str2), null));
    }

    public synchronized boolean e() {
        return this.f28005a.getAll().isEmpty();
    }

    public synchronized void f(String str, String str2, String str3, String str4) {
        String a10 = a.a(str3, str4, System.currentTimeMillis());
        if (a10 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f28005a.edit();
        edit.putString(b(str, str2), a10);
        edit.commit();
    }
}
