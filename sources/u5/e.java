package u5;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final WorkDatabase f54400a;

    public e(WorkDatabase workDatabase) {
        this.f54400a = workDatabase;
    }

    public static void b(Context context, z4.g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            gVar.s();
            try {
                gVar.V("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                gVar.V("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                gVar.T();
            } finally {
                gVar.e0();
            }
        }
    }

    public boolean a() {
        Long b10 = this.f54400a.H().b("reschedule_needed");
        return b10 != null && b10.longValue() == 1;
    }

    public void c(boolean z10) {
        this.f54400a.H().a(new t5.d("reschedule_needed", z10));
    }
}
