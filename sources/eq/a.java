package eq;

import android.util.Log;
import dq.f;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public class a implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f31094b;

    /* renamed from: a  reason: collision with root package name */
    public final String f31095a;

    static {
        boolean z10;
        try {
            Class.forName("android.util.Log");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f31094b = z10;
    }

    public a(String str) {
        this.f31095a = str;
    }

    public static boolean c() {
        return f31094b;
    }

    @Override // dq.f
    public void a(Level level, String str, Throwable th2) {
        if (level != Level.OFF) {
            int d10 = d(level);
            String str2 = this.f31095a;
            Log.println(d10, str2, str + "\n" + Log.getStackTraceString(th2));
        }
    }

    @Override // dq.f
    public void b(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(d(level), this.f31095a, str);
        }
    }

    public final int d(Level level) {
        int intValue = level.intValue();
        if (intValue < 800) {
            return intValue < 500 ? 2 : 3;
        } else if (intValue < 900) {
            return 4;
        } else {
            return intValue < 1000 ? 5 : 6;
        }
    }
}
