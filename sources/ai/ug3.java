package ai;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public final class ug3 {

    /* renamed from: a  reason: collision with root package name */
    public static final ng3 f10699a;

    static {
        ng3 sg3Var;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e10) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e10.printStackTrace(System.err);
            }
            if (num == null || num.intValue() < 19) {
                sg3Var = !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new rg3() : new sg3();
            } else {
                sg3Var = new tg3();
            }
        } catch (Throwable th2) {
            PrintStream printStream = System.err;
            String name = sg3.class.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 133);
            sb2.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb2.append(name);
            sb2.append("will be used. The error is: ");
            printStream.println(sb2.toString());
            th2.printStackTrace(System.err);
            sg3Var = new sg3();
        }
        f10699a = sg3Var;
        if (num == null) {
            return;
        }
        num.intValue();
    }

    public static void a(Throwable th2, Throwable th3) {
        f10699a.a(th2, th3);
    }

    public static void b(Throwable th2) {
        f10699a.b(th2);
    }

    public static void c(Throwable th2, PrintWriter printWriter) {
        f10699a.c(th2, printWriter);
    }
}
