package vh;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public static String f57337a;

    /* renamed from: b  reason: collision with root package name */
    public static int f57338b;

    public static String a() {
        BufferedReader bufferedReader;
        String sb2;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        if (f57337a == null) {
            int i10 = f57338b;
            if (i10 == 0) {
                i10 = Process.myPid();
                f57338b = i10;
            }
            String str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            if (i10 > 0) {
                try {
                    StringBuilder sb3 = new StringBuilder(25);
                    sb3.append("/proc/");
                    sb3.append(i10);
                    sb3.append("/cmdline");
                    sb2 = sb3.toString();
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                } catch (IOException unused) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    bufferedReader = new BufferedReader(new FileReader(sb2));
                    try {
                        String readLine = bufferedReader.readLine();
                        rh.p.i(readLine);
                        str = readLine.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader2 = bufferedReader;
                        l.a(bufferedReader2);
                        throw th;
                    }
                    l.a(bufferedReader);
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
            f57337a = str;
        }
        return f57337a;
    }
}
