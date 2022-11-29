package kh;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import rh.p;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final Lock f38813c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public static a f38814d;

    /* renamed from: a  reason: collision with root package name */
    public final Lock f38815a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f38816b;

    public a(Context context) {
        this.f38816b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        p.i(context);
        Lock lock = f38813c;
        lock.lock();
        try {
            if (f38814d == null) {
                f38814d = new a(context.getApplicationContext());
            }
            a aVar = f38814d;
            lock.unlock();
            return aVar;
        } catch (Throwable th2) {
            f38813c.unlock();
            throw th2;
        }
    }

    public static final String d(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    public GoogleSignInAccount b() {
        String c10;
        String c11 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c11) || (c10 = c(d("googleSignInAccount", c11))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.V0(c10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String c(String str) {
        this.f38815a.lock();
        try {
            return this.f38816b.getString(str, null);
        } finally {
            this.f38815a.unlock();
        }
    }
}
