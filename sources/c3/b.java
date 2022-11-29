package c3;

import android.content.Context;
import android.os.Process;
import b3.d;
import n3.c;

/* loaded from: classes.dex */
public final class b {
    public static int a(Context context, String str, int i10, int i11, String str2) {
        int b10;
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String c10 = d.c(str);
        if (c10 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (Process.myUid() == i11 && c.a(context.getPackageName(), str2)) {
            b10 = d.a(context, i11, c10, str2);
        } else {
            b10 = d.b(context, c10, str2);
        }
        return b10 == 0 ? 0 : -2;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
