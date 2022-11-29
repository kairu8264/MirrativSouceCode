package o6;

import android.os.SystemClock;
import java.io.File;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f44103a = new n();

    /* renamed from: b  reason: collision with root package name */
    public static final File f44104b = new File("/proc/self/fd");

    /* renamed from: c  reason: collision with root package name */
    public static int f44105c = 30;

    /* renamed from: d  reason: collision with root package name */
    public static long f44106d = SystemClock.uptimeMillis();

    /* renamed from: e  reason: collision with root package name */
    public static boolean f44107e = true;

    public final boolean a() {
        int i10 = f44105c;
        f44105c = i10 + 1;
        return i10 >= 30 || SystemClock.uptimeMillis() > f44106d + ((long) 30000);
    }

    public final synchronized boolean b(s sVar) {
        if (a()) {
            f44105c = 0;
            f44106d = SystemClock.uptimeMillis();
            String[] list = f44104b.list();
            if (list == null) {
                list = new String[0];
            }
            int length = list.length;
            boolean z10 = length < 800;
            f44107e = z10;
            if (!z10 && sVar != null && sVar.b() <= 5) {
                sVar.a("FileDescriptorCounter", 5, jo.p.o("Unable to allocate more hardware bitmaps. Number of used file descriptors: ", Integer.valueOf(length)), null);
            }
        }
        return f44107e;
    }
}
