package em;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f30707a;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f30711e;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<String> f30710d = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f30712f = false;

    /* renamed from: b  reason: collision with root package name */
    public final String f30708b = "topic_operation_queue";

    /* renamed from: c  reason: collision with root package name */
    public final String f30709c = ",";

    public n0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f30707a = sharedPreferences;
        this.f30711e = executor;
    }

    public static n0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        n0 n0Var = new n0(sharedPreferences, "topic_operation_queue", ",", executor);
        n0Var.d();
        return n0Var;
    }

    public final boolean b(boolean z10) {
        if (!z10 || this.f30712f) {
            return z10;
        }
        i();
        return true;
    }

    public final void d() {
        synchronized (this.f30710d) {
            this.f30710d.clear();
            String string = this.f30707a.getString(this.f30708b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f30709c)) {
                String[] split = string.split(this.f30709c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f30710d.add(str);
                    }
                }
            }
        }
    }

    public String e() {
        String peek;
        synchronized (this.f30710d) {
            peek = this.f30710d.peek();
        }
        return peek;
    }

    public boolean f(Object obj) {
        boolean remove;
        synchronized (this.f30710d) {
            remove = this.f30710d.remove(obj);
            b(remove);
        }
        return remove;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f30710d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f30709c);
        }
        return sb2.toString();
    }

    public final void h() {
        synchronized (this.f30710d) {
            this.f30707a.edit().putString(this.f30708b, g()).commit();
        }
    }

    public final void i() {
        this.f30711e.execute(new Runnable() { // from class: em.m0
            @Override // java.lang.Runnable
            public final void run() {
                n0.this.h();
            }
        });
    }
}
