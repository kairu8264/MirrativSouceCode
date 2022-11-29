package m8;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.exoplayer2.C;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public class c {
    public static String a(String str) {
        int lastIndexOf = str.lastIndexOf(58);
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : "";
    }

    public static String b(Context context) {
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public static String c() {
        BufferedReader bufferedReader;
        Throwable th2;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), C.UTF8_NAME));
        } catch (IOException unused) {
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th2 = th3;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int read = bufferedReader.read();
                if (read <= 0) {
                    break;
                }
                sb2.append((char) read);
            }
            String sb3 = sb2.toString();
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            return sb3;
        } catch (IOException unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused5) {
                }
            }
            throw th2;
        }
    }

    public static String d(Context context) {
        String c10 = c();
        if (c10 == null) {
            c10 = b(context);
        }
        return c10 != null ? a(c10) : "";
    }
}
