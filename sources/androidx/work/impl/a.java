package androidx.work.impl;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static w4.b f16571a = new C0085a(1, 2);

    /* renamed from: b  reason: collision with root package name */
    public static w4.b f16572b = new b(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static w4.b f16573c = new c(4, 5);

    /* renamed from: d  reason: collision with root package name */
    public static w4.b f16574d = new d(6, 7);

    /* renamed from: e  reason: collision with root package name */
    public static w4.b f16575e = new e(7, 8);

    /* renamed from: f  reason: collision with root package name */
    public static w4.b f16576f = new f(8, 9);

    /* renamed from: g  reason: collision with root package name */
    public static w4.b f16577g = new g(11, 12);

    /* renamed from: androidx.work.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0085a extends w4.b {
        public C0085a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // w4.b
        public void a(z4.g gVar) {
            gVar.B("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.B("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            gVar.B("DROP TABLE IF EXISTS alarmInfo");
            gVar.B("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* loaded from: classes.dex */
    public class b extends w4.b {
        public b(int i10, int i11) {
            super(i10, i11);
        }

        @Override // w4.b
        public void a(z4.g gVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                gVar.B("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends w4.b {
        public c(int i10, int i11) {
            super(i10, i11);
        }

        @Override // w4.b
        public void a(z4.g gVar) {
            gVar.B("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            gVar.B("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* loaded from: classes.dex */
    public class d extends w4.b {
        public d(int i10, int i11) {
            super(i10, i11);
        }

        @Override // w4.b
        public void a(z4.g gVar) {
            gVar.B("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* loaded from: classes.dex */
    public class e extends w4.b {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        @Override // w4.b
        public void a(z4.g gVar) {
            gVar.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* loaded from: classes.dex */
    public class f extends w4.b {
        public f(int i10, int i11) {
            super(i10, i11);
        }

        @Override // w4.b
        public void a(z4.g gVar) {
            gVar.B("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public class g extends w4.b {
        public g(int i10, int i11) {
            super(i10, i11);
        }

        @Override // w4.b
        public void a(z4.g gVar) {
            gVar.B("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public static class h extends w4.b {

        /* renamed from: c  reason: collision with root package name */
        public final Context f16578c;

        public h(Context context, int i10, int i11) {
            super(i10, i11);
            this.f16578c = context;
        }

        @Override // w4.b
        public void a(z4.g gVar) {
            if (this.f58126b >= 10) {
                gVar.V("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f16578c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i extends w4.b {

        /* renamed from: c  reason: collision with root package name */
        public final Context f16579c;

        public i(Context context) {
            super(9, 10);
            this.f16579c = context;
        }

        @Override // w4.b
        public void a(z4.g gVar) {
            gVar.B("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            u5.e.b(this.f16579c, gVar);
            u5.c.a(this.f16579c, gVar);
        }
    }
}
