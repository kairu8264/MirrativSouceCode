package dq;

import android.os.Looper;
import java.io.PrintStream;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public interface f {

    /* loaded from: classes4.dex */
    public static class a {
        public static f a() {
            if (eq.a.c() && b() != null) {
                return new eq.a("EventBus");
            }
            return new b();
        }

        public static Object b() {
            try {
                return Looper.getMainLooper();
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b implements f {
        @Override // dq.f
        public void a(Level level, String str, Throwable th2) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th2.printStackTrace(System.out);
        }

        @Override // dq.f
        public void b(Level level, String str) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
        }
    }

    void a(Level level, String str, Throwable th2);

    void b(Level level, String str);
}
