package t5;

import android.database.Cursor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import k5.s;
import t5.p;
import v4.q0;
import v4.t0;
import v4.w0;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f53218a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.s<p> f53219b;

    /* renamed from: c  reason: collision with root package name */
    public final w0 f53220c;

    /* renamed from: d  reason: collision with root package name */
    public final w0 f53221d;

    /* renamed from: e  reason: collision with root package name */
    public final w0 f53222e;

    /* renamed from: f  reason: collision with root package name */
    public final w0 f53223f;

    /* renamed from: g  reason: collision with root package name */
    public final w0 f53224g;

    /* renamed from: h  reason: collision with root package name */
    public final w0 f53225h;

    /* renamed from: i  reason: collision with root package name */
    public final w0 f53226i;

    /* renamed from: j  reason: collision with root package name */
    public final w0 f53227j;

    /* loaded from: classes.dex */
    public class a extends v4.s<p> {
        public a(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // v4.s
        /* renamed from: i */
        public void g(z4.k kVar, p pVar) {
            String str = pVar.f53192a;
            if (str == null) {
                kVar.y1(1);
            } else {
                kVar.S0(1, str);
            }
            kVar.g1(2, v.j(pVar.f53193b));
            String str2 = pVar.f53194c;
            if (str2 == null) {
                kVar.y1(3);
            } else {
                kVar.S0(3, str2);
            }
            String str3 = pVar.f53195d;
            if (str3 == null) {
                kVar.y1(4);
            } else {
                kVar.S0(4, str3);
            }
            byte[] k10 = androidx.work.b.k(pVar.f53196e);
            if (k10 == null) {
                kVar.y1(5);
            } else {
                kVar.l1(5, k10);
            }
            byte[] k11 = androidx.work.b.k(pVar.f53197f);
            if (k11 == null) {
                kVar.y1(6);
            } else {
                kVar.l1(6, k11);
            }
            kVar.g1(7, pVar.f53198g);
            kVar.g1(8, pVar.f53199h);
            kVar.g1(9, pVar.f53200i);
            kVar.g1(10, pVar.f53202k);
            kVar.g1(11, v.a(pVar.f53203l));
            kVar.g1(12, pVar.f53204m);
            kVar.g1(13, pVar.f53205n);
            kVar.g1(14, pVar.f53206o);
            kVar.g1(15, pVar.f53207p);
            kVar.g1(16, pVar.f53208q ? 1L : 0L);
            kVar.g1(17, v.i(pVar.f53209r));
            k5.b bVar = pVar.f53201j;
            if (bVar != null) {
                kVar.g1(18, v.h(bVar.b()));
                kVar.g1(19, bVar.g() ? 1L : 0L);
                kVar.g1(20, bVar.h() ? 1L : 0L);
                kVar.g1(21, bVar.f() ? 1L : 0L);
                kVar.g1(22, bVar.i() ? 1L : 0L);
                kVar.g1(23, bVar.c());
                kVar.g1(24, bVar.d());
                byte[] c10 = v.c(bVar.a());
                if (c10 == null) {
                    kVar.y1(25);
                    return;
                } else {
                    kVar.l1(25, c10);
                    return;
                }
            }
            kVar.y1(18);
            kVar.y1(19);
            kVar.y1(20);
            kVar.y1(21);
            kVar.y1(22);
            kVar.y1(23);
            kVar.y1(24);
            kVar.y1(25);
        }
    }

    /* loaded from: classes.dex */
    public class b extends w0 {
        public b(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class c extends w0 {
        public c(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class d extends w0 {
        public d(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class e extends w0 {
        public e(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class f extends w0 {
        public f(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class g extends w0 {
        public g(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    public class h extends w0 {
        public h(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* loaded from: classes.dex */
    public class i extends w0 {
        public i(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(q0 q0Var) {
        this.f53218a = q0Var;
        this.f53219b = new a(q0Var);
        this.f53220c = new b(q0Var);
        this.f53221d = new c(q0Var);
        this.f53222e = new d(q0Var);
        this.f53223f = new e(q0Var);
        this.f53224g = new f(q0Var);
        this.f53225h = new g(q0Var);
        this.f53226i = new h(q0Var);
        this.f53227j = new i(q0Var);
    }

    @Override // t5.q
    public List<p> a(long j10) {
        t0 t0Var;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        t0 d10 = t0.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        d10.g1(1, j10);
        this.f53218a.d();
        Cursor b10 = x4.c.b(this.f53218a, d10, false, null);
        try {
            e10 = x4.b.e(b10, "required_network_type");
            e11 = x4.b.e(b10, "requires_charging");
            e12 = x4.b.e(b10, "requires_device_idle");
            e13 = x4.b.e(b10, "requires_battery_not_low");
            e14 = x4.b.e(b10, "requires_storage_not_low");
            e15 = x4.b.e(b10, "trigger_content_update_delay");
            e16 = x4.b.e(b10, "trigger_max_content_delay");
            e17 = x4.b.e(b10, "content_uri_triggers");
            e18 = x4.b.e(b10, TtmlNode.ATTR_ID);
            e19 = x4.b.e(b10, "state");
            e20 = x4.b.e(b10, "worker_class_name");
            e21 = x4.b.e(b10, "input_merger_class_name");
            e22 = x4.b.e(b10, "input");
            e23 = x4.b.e(b10, "output");
            t0Var = d10;
        } catch (Throwable th2) {
            th = th2;
            t0Var = d10;
        }
        try {
            int e24 = x4.b.e(b10, "initial_delay");
            int e25 = x4.b.e(b10, "interval_duration");
            int e26 = x4.b.e(b10, "flex_duration");
            int e27 = x4.b.e(b10, "run_attempt_count");
            int e28 = x4.b.e(b10, "backoff_policy");
            int e29 = x4.b.e(b10, "backoff_delay_duration");
            int e30 = x4.b.e(b10, "period_start_time");
            int e31 = x4.b.e(b10, "minimum_retention_duration");
            int e32 = x4.b.e(b10, "schedule_requested_at");
            int e33 = x4.b.e(b10, "run_in_foreground");
            int e34 = x4.b.e(b10, "out_of_quota_policy");
            int i10 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.getString(e18);
                int i11 = e18;
                String string2 = b10.getString(e20);
                int i12 = e20;
                k5.b bVar = new k5.b();
                int i13 = e10;
                bVar.k(v.e(b10.getInt(e10)));
                bVar.m(b10.getInt(e11) != 0);
                bVar.n(b10.getInt(e12) != 0);
                bVar.l(b10.getInt(e13) != 0);
                bVar.o(b10.getInt(e14) != 0);
                int i14 = e11;
                int i15 = e12;
                bVar.p(b10.getLong(e15));
                bVar.q(b10.getLong(e16));
                bVar.j(v.b(b10.getBlob(e17)));
                p pVar = new p(string, string2);
                pVar.f53193b = v.g(b10.getInt(e19));
                pVar.f53195d = b10.getString(e21);
                pVar.f53196e = androidx.work.b.g(b10.getBlob(e22));
                int i16 = i10;
                pVar.f53197f = androidx.work.b.g(b10.getBlob(i16));
                int i17 = e24;
                i10 = i16;
                pVar.f53198g = b10.getLong(i17);
                int i18 = e21;
                int i19 = e25;
                pVar.f53199h = b10.getLong(i19);
                int i20 = e13;
                int i21 = e26;
                pVar.f53200i = b10.getLong(i21);
                int i22 = e27;
                pVar.f53202k = b10.getInt(i22);
                int i23 = e28;
                pVar.f53203l = v.d(b10.getInt(i23));
                e26 = i21;
                int i24 = e29;
                pVar.f53204m = b10.getLong(i24);
                int i25 = e30;
                pVar.f53205n = b10.getLong(i25);
                e30 = i25;
                int i26 = e31;
                pVar.f53206o = b10.getLong(i26);
                int i27 = e32;
                pVar.f53207p = b10.getLong(i27);
                int i28 = e33;
                pVar.f53208q = b10.getInt(i28) != 0;
                int i29 = e34;
                pVar.f53209r = v.f(b10.getInt(i29));
                pVar.f53201j = bVar;
                arrayList.add(pVar);
                e11 = i14;
                e34 = i29;
                e21 = i18;
                e24 = i17;
                e25 = i19;
                e27 = i22;
                e32 = i27;
                e18 = i11;
                e20 = i12;
                e10 = i13;
                e33 = i28;
                e31 = i26;
                e12 = i15;
                e29 = i24;
                e13 = i20;
                e28 = i23;
            }
            b10.close();
            t0Var.i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            b10.close();
            t0Var.i();
            throw th;
        }
    }

    @Override // t5.q
    public void b(String str) {
        this.f53218a.d();
        z4.k a10 = this.f53220c.a();
        if (str == null) {
            a10.y1(1);
        } else {
            a10.S0(1, str);
        }
        this.f53218a.e();
        try {
            a10.D();
            this.f53218a.A();
        } finally {
            this.f53218a.i();
            this.f53220c.f(a10);
        }
    }

    @Override // t5.q
    public int c(s.a aVar, String... strArr) {
        this.f53218a.d();
        StringBuilder b10 = x4.f.b();
        b10.append("UPDATE workspec SET state=");
        b10.append("?");
        b10.append(" WHERE id IN (");
        x4.f.a(b10, strArr.length);
        b10.append(")");
        z4.k f10 = this.f53218a.f(b10.toString());
        f10.g1(1, v.j(aVar));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                f10.y1(i10);
            } else {
                f10.S0(i10, str);
            }
            i10++;
        }
        this.f53218a.e();
        try {
            int D = f10.D();
            this.f53218a.A();
            return D;
        } finally {
            this.f53218a.i();
        }
    }

    @Override // t5.q
    public List<p> d() {
        t0 t0Var;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        t0 d10 = t0.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f53218a.d();
        Cursor b10 = x4.c.b(this.f53218a, d10, false, null);
        try {
            e10 = x4.b.e(b10, "required_network_type");
            e11 = x4.b.e(b10, "requires_charging");
            e12 = x4.b.e(b10, "requires_device_idle");
            e13 = x4.b.e(b10, "requires_battery_not_low");
            e14 = x4.b.e(b10, "requires_storage_not_low");
            e15 = x4.b.e(b10, "trigger_content_update_delay");
            e16 = x4.b.e(b10, "trigger_max_content_delay");
            e17 = x4.b.e(b10, "content_uri_triggers");
            e18 = x4.b.e(b10, TtmlNode.ATTR_ID);
            e19 = x4.b.e(b10, "state");
            e20 = x4.b.e(b10, "worker_class_name");
            e21 = x4.b.e(b10, "input_merger_class_name");
            e22 = x4.b.e(b10, "input");
            e23 = x4.b.e(b10, "output");
            t0Var = d10;
        } catch (Throwable th2) {
            th = th2;
            t0Var = d10;
        }
        try {
            int e24 = x4.b.e(b10, "initial_delay");
            int e25 = x4.b.e(b10, "interval_duration");
            int e26 = x4.b.e(b10, "flex_duration");
            int e27 = x4.b.e(b10, "run_attempt_count");
            int e28 = x4.b.e(b10, "backoff_policy");
            int e29 = x4.b.e(b10, "backoff_delay_duration");
            int e30 = x4.b.e(b10, "period_start_time");
            int e31 = x4.b.e(b10, "minimum_retention_duration");
            int e32 = x4.b.e(b10, "schedule_requested_at");
            int e33 = x4.b.e(b10, "run_in_foreground");
            int e34 = x4.b.e(b10, "out_of_quota_policy");
            int i10 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.getString(e18);
                int i11 = e18;
                String string2 = b10.getString(e20);
                int i12 = e20;
                k5.b bVar = new k5.b();
                int i13 = e10;
                bVar.k(v.e(b10.getInt(e10)));
                bVar.m(b10.getInt(e11) != 0);
                bVar.n(b10.getInt(e12) != 0);
                bVar.l(b10.getInt(e13) != 0);
                bVar.o(b10.getInt(e14) != 0);
                int i14 = e11;
                int i15 = e12;
                bVar.p(b10.getLong(e15));
                bVar.q(b10.getLong(e16));
                bVar.j(v.b(b10.getBlob(e17)));
                p pVar = new p(string, string2);
                pVar.f53193b = v.g(b10.getInt(e19));
                pVar.f53195d = b10.getString(e21);
                pVar.f53196e = androidx.work.b.g(b10.getBlob(e22));
                int i16 = i10;
                pVar.f53197f = androidx.work.b.g(b10.getBlob(i16));
                i10 = i16;
                int i17 = e24;
                pVar.f53198g = b10.getLong(i17);
                int i18 = e22;
                int i19 = e25;
                pVar.f53199h = b10.getLong(i19);
                int i20 = e13;
                int i21 = e26;
                pVar.f53200i = b10.getLong(i21);
                int i22 = e27;
                pVar.f53202k = b10.getInt(i22);
                int i23 = e28;
                pVar.f53203l = v.d(b10.getInt(i23));
                e26 = i21;
                int i24 = e29;
                pVar.f53204m = b10.getLong(i24);
                int i25 = e30;
                pVar.f53205n = b10.getLong(i25);
                e30 = i25;
                int i26 = e31;
                pVar.f53206o = b10.getLong(i26);
                int i27 = e32;
                pVar.f53207p = b10.getLong(i27);
                int i28 = e33;
                pVar.f53208q = b10.getInt(i28) != 0;
                int i29 = e34;
                pVar.f53209r = v.f(b10.getInt(i29));
                pVar.f53201j = bVar;
                arrayList.add(pVar);
                e34 = i29;
                e11 = i14;
                e22 = i18;
                e24 = i17;
                e25 = i19;
                e27 = i22;
                e32 = i27;
                e18 = i11;
                e20 = i12;
                e10 = i13;
                e33 = i28;
                e31 = i26;
                e12 = i15;
                e29 = i24;
                e13 = i20;
                e28 = i23;
            }
            b10.close();
            t0Var.i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            b10.close();
            t0Var.i();
            throw th;
        }
    }

    @Override // t5.q
    public List<String> e(String str) {
        t0 d10 = t0.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            d10.y1(1);
        } else {
            d10.S0(1, str);
        }
        this.f53218a.d();
        Cursor b10 = x4.c.b(this.f53218a, d10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            d10.i();
        }
    }

    @Override // t5.q
    public s.a f(String str) {
        t0 d10 = t0.d("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            d10.y1(1);
        } else {
            d10.S0(1, str);
        }
        this.f53218a.d();
        Cursor b10 = x4.c.b(this.f53218a, d10, false, null);
        try {
            return b10.moveToFirst() ? v.g(b10.getInt(0)) : null;
        } finally {
            b10.close();
            d10.i();
        }
    }

    @Override // t5.q
    public p g(String str) {
        t0 t0Var;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        p pVar;
        t0 d10 = t0.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            d10.y1(1);
        } else {
            d10.S0(1, str);
        }
        this.f53218a.d();
        Cursor b10 = x4.c.b(this.f53218a, d10, false, null);
        try {
            e10 = x4.b.e(b10, "required_network_type");
            e11 = x4.b.e(b10, "requires_charging");
            e12 = x4.b.e(b10, "requires_device_idle");
            e13 = x4.b.e(b10, "requires_battery_not_low");
            e14 = x4.b.e(b10, "requires_storage_not_low");
            e15 = x4.b.e(b10, "trigger_content_update_delay");
            e16 = x4.b.e(b10, "trigger_max_content_delay");
            e17 = x4.b.e(b10, "content_uri_triggers");
            e18 = x4.b.e(b10, TtmlNode.ATTR_ID);
            e19 = x4.b.e(b10, "state");
            e20 = x4.b.e(b10, "worker_class_name");
            e21 = x4.b.e(b10, "input_merger_class_name");
            e22 = x4.b.e(b10, "input");
            e23 = x4.b.e(b10, "output");
            t0Var = d10;
        } catch (Throwable th2) {
            th = th2;
            t0Var = d10;
        }
        try {
            int e24 = x4.b.e(b10, "initial_delay");
            int e25 = x4.b.e(b10, "interval_duration");
            int e26 = x4.b.e(b10, "flex_duration");
            int e27 = x4.b.e(b10, "run_attempt_count");
            int e28 = x4.b.e(b10, "backoff_policy");
            int e29 = x4.b.e(b10, "backoff_delay_duration");
            int e30 = x4.b.e(b10, "period_start_time");
            int e31 = x4.b.e(b10, "minimum_retention_duration");
            int e32 = x4.b.e(b10, "schedule_requested_at");
            int e33 = x4.b.e(b10, "run_in_foreground");
            int e34 = x4.b.e(b10, "out_of_quota_policy");
            if (b10.moveToFirst()) {
                String string = b10.getString(e18);
                String string2 = b10.getString(e20);
                k5.b bVar = new k5.b();
                bVar.k(v.e(b10.getInt(e10)));
                bVar.m(b10.getInt(e11) != 0);
                bVar.n(b10.getInt(e12) != 0);
                bVar.l(b10.getInt(e13) != 0);
                bVar.o(b10.getInt(e14) != 0);
                bVar.p(b10.getLong(e15));
                bVar.q(b10.getLong(e16));
                bVar.j(v.b(b10.getBlob(e17)));
                p pVar2 = new p(string, string2);
                pVar2.f53193b = v.g(b10.getInt(e19));
                pVar2.f53195d = b10.getString(e21);
                pVar2.f53196e = androidx.work.b.g(b10.getBlob(e22));
                pVar2.f53197f = androidx.work.b.g(b10.getBlob(e23));
                pVar2.f53198g = b10.getLong(e24);
                pVar2.f53199h = b10.getLong(e25);
                pVar2.f53200i = b10.getLong(e26);
                pVar2.f53202k = b10.getInt(e27);
                pVar2.f53203l = v.d(b10.getInt(e28));
                pVar2.f53204m = b10.getLong(e29);
                pVar2.f53205n = b10.getLong(e30);
                pVar2.f53206o = b10.getLong(e31);
                pVar2.f53207p = b10.getLong(e32);
                pVar2.f53208q = b10.getInt(e33) != 0;
                pVar2.f53209r = v.f(b10.getInt(e34));
                pVar2.f53201j = bVar;
                pVar = pVar2;
            } else {
                pVar = null;
            }
            b10.close();
            t0Var.i();
            return pVar;
        } catch (Throwable th3) {
            th = th3;
            b10.close();
            t0Var.i();
            throw th;
        }
    }

    @Override // t5.q
    public List<String> h(String str) {
        t0 d10 = t0.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            d10.y1(1);
        } else {
            d10.S0(1, str);
        }
        this.f53218a.d();
        Cursor b10 = x4.c.b(this.f53218a, d10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            d10.i();
        }
    }

    @Override // t5.q
    public List<androidx.work.b> i(String str) {
        t0 d10 = t0.d("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            d10.y1(1);
        } else {
            d10.S0(1, str);
        }
        this.f53218a.d();
        Cursor b10 = x4.c.b(this.f53218a, d10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(androidx.work.b.g(b10.getBlob(0)));
            }
            return arrayList;
        } finally {
            b10.close();
            d10.i();
        }
    }

    @Override // t5.q
    public List<p> j(int i10) {
        t0 t0Var;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        t0 d10 = t0.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        d10.g1(1, i10);
        this.f53218a.d();
        Cursor b10 = x4.c.b(this.f53218a, d10, false, null);
        try {
            e10 = x4.b.e(b10, "required_network_type");
            e11 = x4.b.e(b10, "requires_charging");
            e12 = x4.b.e(b10, "requires_device_idle");
            e13 = x4.b.e(b10, "requires_battery_not_low");
            e14 = x4.b.e(b10, "requires_storage_not_low");
            e15 = x4.b.e(b10, "trigger_content_update_delay");
            e16 = x4.b.e(b10, "trigger_max_content_delay");
            e17 = x4.b.e(b10, "content_uri_triggers");
            e18 = x4.b.e(b10, TtmlNode.ATTR_ID);
            e19 = x4.b.e(b10, "state");
            e20 = x4.b.e(b10, "worker_class_name");
            e21 = x4.b.e(b10, "input_merger_class_name");
            e22 = x4.b.e(b10, "input");
            e23 = x4.b.e(b10, "output");
            t0Var = d10;
        } catch (Throwable th2) {
            th = th2;
            t0Var = d10;
        }
        try {
            int e24 = x4.b.e(b10, "initial_delay");
            int e25 = x4.b.e(b10, "interval_duration");
            int e26 = x4.b.e(b10, "flex_duration");
            int e27 = x4.b.e(b10, "run_attempt_count");
            int e28 = x4.b.e(b10, "backoff_policy");
            int e29 = x4.b.e(b10, "backoff_delay_duration");
            int e30 = x4.b.e(b10, "period_start_time");
            int e31 = x4.b.e(b10, "minimum_retention_duration");
            int e32 = x4.b.e(b10, "schedule_requested_at");
            int e33 = x4.b.e(b10, "run_in_foreground");
            int e34 = x4.b.e(b10, "out_of_quota_policy");
            int i11 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.getString(e18);
                int i12 = e18;
                String string2 = b10.getString(e20);
                int i13 = e20;
                k5.b bVar = new k5.b();
                int i14 = e10;
                bVar.k(v.e(b10.getInt(e10)));
                bVar.m(b10.getInt(e11) != 0);
                bVar.n(b10.getInt(e12) != 0);
                bVar.l(b10.getInt(e13) != 0);
                bVar.o(b10.getInt(e14) != 0);
                int i15 = e11;
                int i16 = e12;
                bVar.p(b10.getLong(e15));
                bVar.q(b10.getLong(e16));
                bVar.j(v.b(b10.getBlob(e17)));
                p pVar = new p(string, string2);
                pVar.f53193b = v.g(b10.getInt(e19));
                pVar.f53195d = b10.getString(e21);
                pVar.f53196e = androidx.work.b.g(b10.getBlob(e22));
                int i17 = i11;
                pVar.f53197f = androidx.work.b.g(b10.getBlob(i17));
                i11 = i17;
                int i18 = e24;
                pVar.f53198g = b10.getLong(i18);
                int i19 = e21;
                int i20 = e25;
                pVar.f53199h = b10.getLong(i20);
                int i21 = e13;
                int i22 = e26;
                pVar.f53200i = b10.getLong(i22);
                int i23 = e27;
                pVar.f53202k = b10.getInt(i23);
                int i24 = e28;
                pVar.f53203l = v.d(b10.getInt(i24));
                e26 = i22;
                int i25 = e29;
                pVar.f53204m = b10.getLong(i25);
                int i26 = e30;
                pVar.f53205n = b10.getLong(i26);
                e30 = i26;
                int i27 = e31;
                pVar.f53206o = b10.getLong(i27);
                int i28 = e32;
                pVar.f53207p = b10.getLong(i28);
                int i29 = e33;
                pVar.f53208q = b10.getInt(i29) != 0;
                int i30 = e34;
                pVar.f53209r = v.f(b10.getInt(i30));
                pVar.f53201j = bVar;
                arrayList.add(pVar);
                e34 = i30;
                e11 = i15;
                e21 = i19;
                e24 = i18;
                e25 = i20;
                e27 = i23;
                e32 = i28;
                e18 = i12;
                e20 = i13;
                e10 = i14;
                e33 = i29;
                e31 = i27;
                e12 = i16;
                e29 = i25;
                e13 = i21;
                e28 = i24;
            }
            b10.close();
            t0Var.i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            b10.close();
            t0Var.i();
            throw th;
        }
    }

    @Override // t5.q
    public int k() {
        this.f53218a.d();
        z4.k a10 = this.f53226i.a();
        this.f53218a.e();
        try {
            int D = a10.D();
            this.f53218a.A();
            return D;
        } finally {
            this.f53218a.i();
            this.f53226i.f(a10);
        }
    }

    @Override // t5.q
    public void l(p pVar) {
        this.f53218a.d();
        this.f53218a.e();
        try {
            this.f53219b.h(pVar);
            this.f53218a.A();
        } finally {
            this.f53218a.i();
        }
    }

    @Override // t5.q
    public int m(String str, long j10) {
        this.f53218a.d();
        z4.k a10 = this.f53225h.a();
        a10.g1(1, j10);
        if (str == null) {
            a10.y1(2);
        } else {
            a10.S0(2, str);
        }
        this.f53218a.e();
        try {
            int D = a10.D();
            this.f53218a.A();
            return D;
        } finally {
            this.f53218a.i();
            this.f53225h.f(a10);
        }
    }

    @Override // t5.q
    public List<p.b> n(String str) {
        t0 d10 = t0.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            d10.y1(1);
        } else {
            d10.S0(1, str);
        }
        this.f53218a.d();
        Cursor b10 = x4.c.b(this.f53218a, d10, false, null);
        try {
            int e10 = x4.b.e(b10, TtmlNode.ATTR_ID);
            int e11 = x4.b.e(b10, "state");
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f53210a = b10.getString(e10);
                bVar.f53211b = v.g(b10.getInt(e11));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b10.close();
            d10.i();
        }
    }

    @Override // t5.q
    public List<p> o(int i10) {
        t0 t0Var;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        t0 d10 = t0.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        d10.g1(1, i10);
        this.f53218a.d();
        Cursor b10 = x4.c.b(this.f53218a, d10, false, null);
        try {
            e10 = x4.b.e(b10, "required_network_type");
            e11 = x4.b.e(b10, "requires_charging");
            e12 = x4.b.e(b10, "requires_device_idle");
            e13 = x4.b.e(b10, "requires_battery_not_low");
            e14 = x4.b.e(b10, "requires_storage_not_low");
            e15 = x4.b.e(b10, "trigger_content_update_delay");
            e16 = x4.b.e(b10, "trigger_max_content_delay");
            e17 = x4.b.e(b10, "content_uri_triggers");
            e18 = x4.b.e(b10, TtmlNode.ATTR_ID);
            e19 = x4.b.e(b10, "state");
            e20 = x4.b.e(b10, "worker_class_name");
            e21 = x4.b.e(b10, "input_merger_class_name");
            e22 = x4.b.e(b10, "input");
            e23 = x4.b.e(b10, "output");
            t0Var = d10;
        } catch (Throwable th2) {
            th = th2;
            t0Var = d10;
        }
        try {
            int e24 = x4.b.e(b10, "initial_delay");
            int e25 = x4.b.e(b10, "interval_duration");
            int e26 = x4.b.e(b10, "flex_duration");
            int e27 = x4.b.e(b10, "run_attempt_count");
            int e28 = x4.b.e(b10, "backoff_policy");
            int e29 = x4.b.e(b10, "backoff_delay_duration");
            int e30 = x4.b.e(b10, "period_start_time");
            int e31 = x4.b.e(b10, "minimum_retention_duration");
            int e32 = x4.b.e(b10, "schedule_requested_at");
            int e33 = x4.b.e(b10, "run_in_foreground");
            int e34 = x4.b.e(b10, "out_of_quota_policy");
            int i11 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.getString(e18);
                int i12 = e18;
                String string2 = b10.getString(e20);
                int i13 = e20;
                k5.b bVar = new k5.b();
                int i14 = e10;
                bVar.k(v.e(b10.getInt(e10)));
                bVar.m(b10.getInt(e11) != 0);
                bVar.n(b10.getInt(e12) != 0);
                bVar.l(b10.getInt(e13) != 0);
                bVar.o(b10.getInt(e14) != 0);
                int i15 = e11;
                int i16 = e12;
                bVar.p(b10.getLong(e15));
                bVar.q(b10.getLong(e16));
                bVar.j(v.b(b10.getBlob(e17)));
                p pVar = new p(string, string2);
                pVar.f53193b = v.g(b10.getInt(e19));
                pVar.f53195d = b10.getString(e21);
                pVar.f53196e = androidx.work.b.g(b10.getBlob(e22));
                int i17 = i11;
                pVar.f53197f = androidx.work.b.g(b10.getBlob(i17));
                i11 = i17;
                int i18 = e24;
                pVar.f53198g = b10.getLong(i18);
                int i19 = e21;
                int i20 = e25;
                pVar.f53199h = b10.getLong(i20);
                int i21 = e13;
                int i22 = e26;
                pVar.f53200i = b10.getLong(i22);
                int i23 = e27;
                pVar.f53202k = b10.getInt(i23);
                int i24 = e28;
                pVar.f53203l = v.d(b10.getInt(i24));
                e26 = i22;
                int i25 = e29;
                pVar.f53204m = b10.getLong(i25);
                int i26 = e30;
                pVar.f53205n = b10.getLong(i26);
                e30 = i26;
                int i27 = e31;
                pVar.f53206o = b10.getLong(i27);
                int i28 = e32;
                pVar.f53207p = b10.getLong(i28);
                int i29 = e33;
                pVar.f53208q = b10.getInt(i29) != 0;
                int i30 = e34;
                pVar.f53209r = v.f(b10.getInt(i30));
                pVar.f53201j = bVar;
                arrayList.add(pVar);
                e34 = i30;
                e11 = i15;
                e21 = i19;
                e24 = i18;
                e25 = i20;
                e27 = i23;
                e32 = i28;
                e18 = i12;
                e20 = i13;
                e10 = i14;
                e33 = i29;
                e31 = i27;
                e12 = i16;
                e29 = i25;
                e13 = i21;
                e28 = i24;
            }
            b10.close();
            t0Var.i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            b10.close();
            t0Var.i();
            throw th;
        }
    }

    @Override // t5.q
    public void p(String str, androidx.work.b bVar) {
        this.f53218a.d();
        z4.k a10 = this.f53221d.a();
        byte[] k10 = androidx.work.b.k(bVar);
        if (k10 == null) {
            a10.y1(1);
        } else {
            a10.l1(1, k10);
        }
        if (str == null) {
            a10.y1(2);
        } else {
            a10.S0(2, str);
        }
        this.f53218a.e();
        try {
            a10.D();
            this.f53218a.A();
        } finally {
            this.f53218a.i();
            this.f53221d.f(a10);
        }
    }

    @Override // t5.q
    public List<p> q() {
        t0 t0Var;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        t0 d10 = t0.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f53218a.d();
        Cursor b10 = x4.c.b(this.f53218a, d10, false, null);
        try {
            e10 = x4.b.e(b10, "required_network_type");
            e11 = x4.b.e(b10, "requires_charging");
            e12 = x4.b.e(b10, "requires_device_idle");
            e13 = x4.b.e(b10, "requires_battery_not_low");
            e14 = x4.b.e(b10, "requires_storage_not_low");
            e15 = x4.b.e(b10, "trigger_content_update_delay");
            e16 = x4.b.e(b10, "trigger_max_content_delay");
            e17 = x4.b.e(b10, "content_uri_triggers");
            e18 = x4.b.e(b10, TtmlNode.ATTR_ID);
            e19 = x4.b.e(b10, "state");
            e20 = x4.b.e(b10, "worker_class_name");
            e21 = x4.b.e(b10, "input_merger_class_name");
            e22 = x4.b.e(b10, "input");
            e23 = x4.b.e(b10, "output");
            t0Var = d10;
        } catch (Throwable th2) {
            th = th2;
            t0Var = d10;
        }
        try {
            int e24 = x4.b.e(b10, "initial_delay");
            int e25 = x4.b.e(b10, "interval_duration");
            int e26 = x4.b.e(b10, "flex_duration");
            int e27 = x4.b.e(b10, "run_attempt_count");
            int e28 = x4.b.e(b10, "backoff_policy");
            int e29 = x4.b.e(b10, "backoff_delay_duration");
            int e30 = x4.b.e(b10, "period_start_time");
            int e31 = x4.b.e(b10, "minimum_retention_duration");
            int e32 = x4.b.e(b10, "schedule_requested_at");
            int e33 = x4.b.e(b10, "run_in_foreground");
            int e34 = x4.b.e(b10, "out_of_quota_policy");
            int i10 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.getString(e18);
                int i11 = e18;
                String string2 = b10.getString(e20);
                int i12 = e20;
                k5.b bVar = new k5.b();
                int i13 = e10;
                bVar.k(v.e(b10.getInt(e10)));
                bVar.m(b10.getInt(e11) != 0);
                bVar.n(b10.getInt(e12) != 0);
                bVar.l(b10.getInt(e13) != 0);
                bVar.o(b10.getInt(e14) != 0);
                int i14 = e11;
                int i15 = e12;
                bVar.p(b10.getLong(e15));
                bVar.q(b10.getLong(e16));
                bVar.j(v.b(b10.getBlob(e17)));
                p pVar = new p(string, string2);
                pVar.f53193b = v.g(b10.getInt(e19));
                pVar.f53195d = b10.getString(e21);
                pVar.f53196e = androidx.work.b.g(b10.getBlob(e22));
                int i16 = i10;
                pVar.f53197f = androidx.work.b.g(b10.getBlob(i16));
                i10 = i16;
                int i17 = e24;
                pVar.f53198g = b10.getLong(i17);
                int i18 = e22;
                int i19 = e25;
                pVar.f53199h = b10.getLong(i19);
                int i20 = e13;
                int i21 = e26;
                pVar.f53200i = b10.getLong(i21);
                int i22 = e27;
                pVar.f53202k = b10.getInt(i22);
                int i23 = e28;
                pVar.f53203l = v.d(b10.getInt(i23));
                e26 = i21;
                int i24 = e29;
                pVar.f53204m = b10.getLong(i24);
                int i25 = e30;
                pVar.f53205n = b10.getLong(i25);
                e30 = i25;
                int i26 = e31;
                pVar.f53206o = b10.getLong(i26);
                int i27 = e32;
                pVar.f53207p = b10.getLong(i27);
                int i28 = e33;
                pVar.f53208q = b10.getInt(i28) != 0;
                int i29 = e34;
                pVar.f53209r = v.f(b10.getInt(i29));
                pVar.f53201j = bVar;
                arrayList.add(pVar);
                e34 = i29;
                e11 = i14;
                e22 = i18;
                e24 = i17;
                e25 = i19;
                e27 = i22;
                e32 = i27;
                e18 = i11;
                e20 = i12;
                e10 = i13;
                e33 = i28;
                e31 = i26;
                e12 = i15;
                e29 = i24;
                e13 = i20;
                e28 = i23;
            }
            b10.close();
            t0Var.i();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            b10.close();
            t0Var.i();
            throw th;
        }
    }

    @Override // t5.q
    public boolean r() {
        boolean z10 = false;
        t0 d10 = t0.d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f53218a.d();
        Cursor b10 = x4.c.b(this.f53218a, d10, false, null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            b10.close();
            d10.i();
        }
    }

    @Override // t5.q
    public int s(String str) {
        this.f53218a.d();
        z4.k a10 = this.f53224g.a();
        if (str == null) {
            a10.y1(1);
        } else {
            a10.S0(1, str);
        }
        this.f53218a.e();
        try {
            int D = a10.D();
            this.f53218a.A();
            return D;
        } finally {
            this.f53218a.i();
            this.f53224g.f(a10);
        }
    }

    @Override // t5.q
    public int t(String str) {
        this.f53218a.d();
        z4.k a10 = this.f53223f.a();
        if (str == null) {
            a10.y1(1);
        } else {
            a10.S0(1, str);
        }
        this.f53218a.e();
        try {
            int D = a10.D();
            this.f53218a.A();
            return D;
        } finally {
            this.f53218a.i();
            this.f53223f.f(a10);
        }
    }

    @Override // t5.q
    public void u(String str, long j10) {
        this.f53218a.d();
        z4.k a10 = this.f53222e.a();
        a10.g1(1, j10);
        if (str == null) {
            a10.y1(2);
        } else {
            a10.S0(2, str);
        }
        this.f53218a.e();
        try {
            a10.D();
            this.f53218a.A();
        } finally {
            this.f53218a.i();
            this.f53222e.f(a10);
        }
    }
}
