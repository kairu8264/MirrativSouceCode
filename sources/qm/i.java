package qm;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.appcompat.widget.ActivityChooserModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: f  reason: collision with root package name */
    public static final lm.a f49594f = lm.a.e();

    /* renamed from: a  reason: collision with root package name */
    public final Runtime f49595a;

    /* renamed from: b  reason: collision with root package name */
    public final ActivityManager f49596b;

    /* renamed from: c  reason: collision with root package name */
    public final ActivityManager.MemoryInfo f49597c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49598d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f49599e;

    public i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public final String a() {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.f49596b.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return this.f49599e.getPackageName();
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 16) {
            return sm.k.c(sm.g.BYTES.a(this.f49597c.totalMem));
        }
        return f("/proc/meminfo");
    }

    public int c() {
        return sm.k.c(sm.g.BYTES.a(this.f49595a.maxMemory()));
    }

    public int d() {
        return sm.k.c(sm.g.MEGABYTES.a(this.f49596b.getMemoryClass()));
    }

    public String e() {
        return this.f49598d;
    }

    public int f(String str) {
        BufferedReader bufferedReader;
        String readLine;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (IOException e10) {
            lm.a aVar = f49594f;
            aVar.j("Unable to read '" + str + "' file: " + e10.getMessage());
        } catch (NumberFormatException e11) {
            lm.a aVar2 = f49594f;
            aVar2.j("Unable to parse '" + str + "' file: " + e11.getMessage());
        }
        do {
            try {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return 0;
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } while (!readLine.startsWith("MemTotal"));
        Matcher matcher = Pattern.compile("\\d+").matcher(readLine);
        int parseInt = matcher.find() ? Integer.parseInt(matcher.group()) : 0;
        bufferedReader.close();
        return parseInt;
    }

    public i(Runtime runtime, Context context) {
        this.f49595a = runtime;
        this.f49599e = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f49596b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f49597c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
        this.f49598d = a();
    }
}
