package hf;

import android.app.AppOpsManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import java.util.List;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f35610b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f35611c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final Context f35612a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public u0(Context context) {
        jo.p.h(context, "context");
        this.f35612a = context;
    }

    public final boolean a() {
        Object systemService = this.f35612a.getSystemService("appops");
        jo.p.f(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
        int checkOpNoThrow = ((AppOpsManager) systemService).checkOpNoThrow("android:get_usage_stats", Process.myUid(), this.f35612a.getPackageName());
        if (checkOpNoThrow == 3) {
            if (this.f35612a.checkPermission("android.permission.PACKAGE_USAGE_STATS", Process.myPid(), Process.myUid()) == 0) {
                return true;
            }
        } else if (checkOpNoThrow == 0) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.f35612a.startActivity(new Intent("android.settings.USAGE_ACCESS_SETTINGS").setFlags(268435456));
    }

    public final List<UsageStats> c() {
        long currentTimeMillis = System.currentTimeMillis();
        Object systemService = this.f35612a.getSystemService("usagestats");
        jo.p.f(systemService, "null cannot be cast to non-null type android.app.usage.UsageStatsManager");
        List<UsageStats> queryUsageStats = ((UsageStatsManager) systemService).queryUsageStats(0, currentTimeMillis - 60000, currentTimeMillis);
        jo.p.g(queryUsageStats, "usageStatsManager.queryU…rrentTimeMillis\n        )");
        return queryUsageStats;
    }
}
