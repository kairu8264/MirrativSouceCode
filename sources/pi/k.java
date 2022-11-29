package pi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import hi.id;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class k extends r9 {

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f47983f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f47984g = {TtmlNode.ATTR_TTS_ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f47985h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f47986i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f47987j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f47988k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f47989l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f47990m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d  reason: collision with root package name */
    public final j f47991d;

    /* renamed from: e  reason: collision with root package name */
    public final n9 f47992e;

    public k(ba baVar) {
        super(baVar);
        this.f47992e = new n9(this.f48285a.c());
        this.f48285a.y();
        this.f47991d = new j(this, this.f48285a.F(), "google_app_measurement.db");
    }

    public static final void J(ContentValues contentValues, String str, Object obj) {
        rh.p.e("value");
        rh.p.i(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0233: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:98:0x0233 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    public final void I(String str, long j10, long j11, aa aaVar) {
        ?? r42;
        Cursor cursor;
        String str2;
        Cursor rawQuery;
        String string;
        int i10;
        String str3;
        String[] strArr;
        rh.p.i(aaVar);
        f();
        g();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str4 = null;
        try {
            try {
                SQLiteDatabase R = R();
                r42 = TextUtils.isEmpty(null);
                try {
                    if (r42 != 0) {
                        int i11 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
                        String[] strArr2 = i11 != 0 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)};
                        str2 = i11 != 0 ? "rowid <= ? and " : "";
                        StringBuilder sb2 = new StringBuilder(str2.length() + 148);
                        sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb2.append(str2);
                        sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        rawQuery = R.rawQuery(sb2.toString(), strArr2);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        }
                        str4 = rawQuery.getString(0);
                        string = rawQuery.getString(1);
                        rawQuery.close();
                    } else {
                        int i12 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
                        String[] strArr3 = i12 != 0 ? new String[]{null, String.valueOf(j11)} : new String[]{null};
                        str2 = i12 != 0 ? " and rowid <= ?" : "";
                        StringBuilder sb3 = new StringBuilder(str2.length() + 84);
                        sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb3.append(str2);
                        sb3.append(" order by rowid limit 1;");
                        rawQuery = R.rawQuery(sb3.toString(), strArr3);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str5 = string;
                    try {
                        Cursor query = R.query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, str5}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.f48285a.r().p().b("Raw event metadata record is missing. appId", q3.y(str4));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    hi.s4 h10 = ((hi.r4) da.C(hi.s4.J1(), query.getBlob(0))).h();
                                    if (query.moveToNext()) {
                                        this.f48285a.r().v().b("Get multiple raw event metadata records, expected one. appId", q3.y(str4));
                                    }
                                    query.close();
                                    rh.p.i(h10);
                                    aaVar.f47596a = h10;
                                    if (j11 != -1) {
                                        i10 = 1;
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{str4, str5, String.valueOf(j11)};
                                    } else {
                                        i10 = 1;
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{str4, str5};
                                    }
                                    Cursor query2 = R.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr, null, null, "rowid", null);
                                    if (query2.moveToFirst()) {
                                        do {
                                            long j12 = query2.getLong(0);
                                            try {
                                                hi.h4 h4Var = (hi.h4) da.C(hi.i4.v(), query2.getBlob(3));
                                                h4Var.x(query2.getString(i10));
                                                h4Var.B(query2.getLong(2));
                                                if (!aaVar.a(j12, h4Var.h())) {
                                                    query2.close();
                                                    return;
                                                }
                                            } catch (IOException e10) {
                                                this.f48285a.r().p().c("Data loss. Failed to merge raw event. appId", q3.y(str4), e10);
                                            }
                                        } while (query2.moveToNext());
                                        query2.close();
                                        return;
                                    }
                                    this.f48285a.r().v().b("Raw event data disappeared while in transaction. appId", q3.y(str4));
                                    query2.close();
                                } catch (IOException e11) {
                                    this.f48285a.r().p().c("Data loss. Failed to merge raw event metadata. appId", q3.y(str4), e11);
                                    query.close();
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                r42 = str5;
                                this.f48285a.r().p().c("Data loss. Error selecting raw event. appId", q3.y(str4), e);
                                if (r42 != 0) {
                                    r42.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = str5;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            str5 = query;
                        } catch (Throwable th3) {
                            th = th3;
                            str5 = query;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        r42 = cursor3;
                    } catch (Throwable th4) {
                        th = th4;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                }
            } catch (SQLiteException e16) {
                e = e16;
                r42 = 0;
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            cursor2 = cursor;
        }
    }

    public final int K(String str, String str2) {
        rh.p.e(str);
        rh.p.e(str2);
        f();
        g();
        try {
            return R().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f48285a.r().p().d("Error deleting conditional property", q3.y(str), this.f48285a.C().f(str2), e10);
            return 0;
        }
    }

    public final long L(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = R().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j10 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j10;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e10) {
                this.f48285a.r().p().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long M(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = R().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j10;
                }
                long j11 = cursor.getLong(0);
                cursor.close();
                return j11;
            } catch (SQLiteException e10) {
                this.f48285a.r().p().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long N(String str, String str2) {
        long j10;
        SQLiteException e10;
        ContentValues contentValues;
        rh.p.e(str);
        rh.p.e("first_open_count");
        f();
        g();
        SQLiteDatabase R = R();
        R.beginTransaction();
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select ");
                sb2.append("first_open_count");
                sb2.append(" from app2 where app_id=?");
                j10 = M(sb2.toString(), new String[]{str}, -1L);
                if (j10 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(MRLog.PAYLOAD_KEY_APP_ID, str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (R.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.f48285a.r().p().c("Failed to insert column (got -1). appId", q3.y(str), "first_open_count");
                        return -1L;
                    }
                    j10 = 0;
                }
                try {
                    contentValues = new ContentValues();
                    contentValues.put(MRLog.PAYLOAD_KEY_APP_ID, str);
                    contentValues.put("first_open_count", Long.valueOf(1 + j10));
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.f48285a.r().p().d("Error inserting column. appId", q3.y(str), "first_open_count", e10);
                    return j10;
                }
            } finally {
                R.endTransaction();
            }
        } catch (SQLiteException e12) {
            j10 = 0;
            e10 = e12;
        }
        if (R.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
            this.f48285a.r().p().c("Failed to update column (got 0). appId", q3.y(str), "first_open_count");
            return -1L;
        }
        R.setTransactionSuccessful();
        return j10;
    }

    public final long O() {
        return M("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long P() {
        return M("select max(timestamp) from raw_events", null, 0L);
    }

    public final long Q(String str) {
        rh.p.e(str);
        return M("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final SQLiteDatabase R() {
        f();
        try {
            return this.f47991d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f48285a.r().v().b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle S(java.lang.String r8) {
        /*
            r7 = this;
            r7.f()
            r7.g()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.R()     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r3 = 0
            r2[r3] = r8     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r2 != 0) goto L30
            pi.b5 r8 = r7.f48285a     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            pi.q3 r8 = r8.r()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            pi.o3 r8 = r8.u()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        L30:
            byte[] r2 = r1.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            hi.h4 r3 = hi.i4.v()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            hi.v9 r2 = pi.da.C(r3, r2)     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            hi.h4 r2 = (hi.h4) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            hi.t8 r2 = r2.h()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            hi.i4 r2 = (hi.i4) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            pi.ba r8 = r7.f48179b     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r8.f0()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.List r8 = r2.z()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
        L56:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            hi.m4 r3 = (hi.m4) r3     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = r3.x()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            boolean r5 = r3.K()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L74
            double r5 = r3.r()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L74:
            boolean r5 = r3.L()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L82
            float r3 = r3.s()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L82:
            boolean r5 = r3.O()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L90
            java.lang.String r3 = r3.y()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L90:
            boolean r5 = r3.M()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L56
            long r5 = r3.u()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L9e:
            r1.close()
            return r2
        La2:
            r2 = move-exception
            pi.b5 r3 = r7.f48285a     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            pi.q3 r3 = r3.r()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            pi.o3 r3 = r3.p()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = pi.q3.y(r8)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r3.c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        Lba:
            r8 = move-exception
            goto Lc0
        Lbc:
            r8 = move-exception
            goto Ld7
        Lbe:
            r8 = move-exception
            r1 = r0
        Lc0:
            pi.b5 r2 = r7.f48285a     // Catch: java.lang.Throwable -> Ld5
            pi.q3 r2 = r2.r()     // Catch: java.lang.Throwable -> Ld5
            pi.o3 r2 = r2.p()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Ld4
            r1.close()
        Ld4:
            return r0
        Ld5:
            r8 = move-exception
            r0 = r1
        Ld7:
            if (r0 == 0) goto Ldc
            r0.close()
        Ldc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.k.S(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011b A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01bf, B:42:0x01c8, B:44:0x01d1, B:35:0x018d, B:18:0x011b), top: B:62:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0157 A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01bf, B:42:0x01c8, B:44:0x01d1, B:35:0x018d, B:18:0x011b), top: B:62:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018d A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01bf, B:42:0x01c8, B:44:0x01d1, B:35:0x018d, B:18:0x011b), top: B:62:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019c A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01bf, B:42:0x01c8, B:44:0x01d1, B:35:0x018d, B:18:0x011b), top: B:62:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bf A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01bf, B:42:0x01c8, B:44:0x01d1, B:35:0x018d, B:18:0x011b), top: B:62:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d1 A[Catch: SQLiteException -> 0x01e8, all -> 0x0207, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x01e8, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01bf, B:42:0x01c8, B:44:0x01d1, B:35:0x018d, B:18:0x011b), top: B:62:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pi.g5 T(java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.k.T(java.lang.String):pi.g5");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0123: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:31:0x0123 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pi.c U(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.k.U(java.lang.String, java.lang.String):pi.c");
    }

    public final i V(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return W(j10, str, 1L, false, false, z12, false, z14);
    }

    public final i W(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        rh.p.e(str);
        f();
        g();
        String[] strArr = {str};
        i iVar = new i();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase R = R();
                Cursor query = R.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.f48285a.r().v().b("Not updating daily counts, app is not known. appId", q3.y(str));
                    query.close();
                    return iVar;
                }
                if (query.getLong(0) == j10) {
                    iVar.f47922b = query.getLong(1);
                    iVar.f47921a = query.getLong(2);
                    iVar.f47923c = query.getLong(3);
                    iVar.f47924d = query.getLong(4);
                    iVar.f47925e = query.getLong(5);
                }
                if (z10) {
                    iVar.f47922b += j11;
                }
                if (z11) {
                    iVar.f47921a += j11;
                }
                if (z12) {
                    iVar.f47923c += j11;
                }
                if (z13) {
                    iVar.f47924d += j11;
                }
                if (z14) {
                    iVar.f47925e += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(iVar.f47921a));
                contentValues.put("daily_events_count", Long.valueOf(iVar.f47922b));
                contentValues.put("daily_conversions_count", Long.valueOf(iVar.f47923c));
                contentValues.put("daily_error_events_count", Long.valueOf(iVar.f47924d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(iVar.f47925e));
                R.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return iVar;
            } catch (SQLiteException e10) {
                this.f48285a.r().p().c("Error updating daily counts. appId", q3.y(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return iVar;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pi.q X(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.k.X(java.lang.String, java.lang.String):pi.q");
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a3: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:28:0x00a3 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pi.ga Z(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            rh.p.e(r20)
            rh.p.e(r21)
            r19.f()
            r19.g()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.R()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r4 != 0) goto L40
            r11.close()
            return r10
        L40:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.Object r8 = r1.a0(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r8 != 0) goto L4e
            r11.close()
            return r10
        L4e:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            pi.ga r0 = new pi.ga     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r2 == 0) goto L75
            pi.b5 r2 = r1.f48285a     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            pi.q3 r2 = r2.r()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            pi.o3 r2 = r2.p()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = pi.q3.y(r20)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2.b(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
        L75:
            r11.close()
            return r0
        L79:
            r0 = move-exception
            goto L7f
        L7b:
            r0 = move-exception
            goto La4
        L7d:
            r0 = move-exception
            r11 = r10
        L7f:
            pi.b5 r2 = r1.f48285a     // Catch: java.lang.Throwable -> La2
            pi.q3 r2 = r2.r()     // Catch: java.lang.Throwable -> La2
            pi.o3 r2 = r2.p()     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = pi.q3.y(r20)     // Catch: java.lang.Throwable -> La2
            pi.b5 r5 = r1.f48285a     // Catch: java.lang.Throwable -> La2
            pi.l3 r5 = r5.C()     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = r5.f(r9)     // Catch: java.lang.Throwable -> La2
            r2.d(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> La2
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r10
        La2:
            r0 = move-exception
            r10 = r11
        La4:
            if (r10 == 0) goto La9
            r10.close()
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.k.Z(java.lang.String, java.lang.String):pi.ga");
    }

    public final Object a0(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f48285a.r().p().a("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        this.f48285a.r().p().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                        return null;
                    }
                    this.f48285a.r().p().a("Loaded invalid blob type value, ignoring it");
                    return null;
                }
                return cursor.getString(i10);
            }
            return Double.valueOf(cursor.getDouble(i10));
        } else {
            return Long.valueOf(cursor.getLong(i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b0() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.R()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3e
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            pi.b5 r3 = r6.f48285a     // Catch: java.lang.Throwable -> L3a
            pi.q3 r3 = r3.r()     // Catch: java.lang.Throwable -> L3a
            pi.o3 r3 = r3.p()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.k.b0():java.lang.String");
    }

    public final List<c> c0(String str, String str2, String str3) {
        rh.p.e(str);
        f();
        g();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(TopicConstant.MATCH_SINGLE));
            sb2.append(" and name glob ?");
        }
        return d0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
        r2 = r27.f48285a.r().p();
        r27.f48285a.y();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<pi.c> d0(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.k.d0(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List<ga> e0(String str) {
        rh.p.e(str);
        f();
        g();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.f48285a.y();
                cursor = R().query("user_attributes", new String[]{"name", TtmlNode.ATTR_TTS_ORIGIN, "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursor.getLong(2);
                    Object a02 = a0(cursor, 3);
                    if (a02 == null) {
                        this.f48285a.r().p().b("Read invalid user property value, ignoring it. appId", q3.y(str));
                    } else {
                        arrayList.add(new ga(str, str2, string, j10, a02));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                this.f48285a.r().p().c("Error querying user properties. appId", q3.y(str), e10);
                List<ga> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
        r2 = r16.f48285a.r().p();
        r16.f48285a.y();
        r2.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<pi.ga> f0(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.k.f0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void g0() {
        g();
        R().beginTransaction();
    }

    public final void h0(List<Long> list) {
        rh.p.i(list);
        f();
        g();
        StringBuilder sb2 = new StringBuilder("rowid in (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(list.get(i10).longValue());
        }
        sb2.append(")");
        int delete = R().delete("raw_events", sb2.toString(), null);
        if (delete != list.size()) {
            this.f48285a.r().p().c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    public final void i0() {
        g();
        R().endTransaction();
    }

    @Override // pi.r9
    public final boolean j() {
        return false;
    }

    public final void j0(List<Long> list) {
        f();
        g();
        rh.p.i(list);
        rh.p.k(list.size());
        if (v()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
            sb2.append("(");
            sb2.append(join);
            sb2.append(")");
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder(sb3.length() + 80);
            sb4.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb4.append(sb3);
            sb4.append(" AND retry_count =  2147483647 LIMIT 1");
            if (L(sb4.toString(), null) > 0) {
                this.f48285a.r().v().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase R = R();
                StringBuilder sb5 = new StringBuilder(sb3.length() + 127);
                sb5.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb5.append(sb3);
                sb5.append(" AND (retry_count IS NULL OR retry_count < ");
                sb5.append(Integer.MAX_VALUE);
                sb5.append(")");
                R.execSQL(sb5.toString());
            } catch (SQLiteException e10) {
                this.f48285a.r().p().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final void k() {
        f();
        g();
        if (v()) {
            long a10 = this.f48179b.d0().f48351g.a();
            long elapsedRealtime = this.f48285a.c().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - a10);
            this.f48285a.y();
            if (abs > c3.f47738z.a(null).longValue()) {
                this.f48179b.d0().f48351g.b(elapsedRealtime);
                f();
                g();
                if (v()) {
                    SQLiteDatabase R = R();
                    this.f48285a.y();
                    int delete = R.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f48285a.c().currentTimeMillis()), String.valueOf(g.g())});
                    if (delete > 0) {
                        this.f48285a.r().u().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    public final void l(String str, String str2) {
        rh.p.e(str);
        rh.p.e(str2);
        f();
        g();
        try {
            R().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f48285a.r().p().d("Error deleting user property. appId", q3.y(str), this.f48285a.C().f(str2), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0343, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0344, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0358, code lost:
        if (R().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x035a, code lost:
        r23.f48285a.r().p().b("Failed to insert property filter (got -1). appId", pi.q3.y(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x036e, code lost:
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0372, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0373, code lost:
        r23.f48285a.r().p().c("Error storing property filter. appId", pi.q3.y(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0386, code lost:
        g();
        f();
        rh.p.e(r24);
        r0 = R();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03bd, code lost:
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018b, code lost:
        r11 = r0.y().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0197, code lost:
        if (r11.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a3, code lost:
        if (r11.next().A() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a5, code lost:
        r23.f48285a.r().v().c("Property filter with no ID. Audience definition ignored. appId, audienceId", pi.q3.y(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01be, code lost:
        r11 = r0.x().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d4, code lost:
        if (r11.hasNext() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d6, code lost:
        r12 = r11.next();
        g();
        f();
        rh.p.e(r24);
        rh.p.i(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f0, code lost:
        if (android.text.TextUtils.isEmpty(r12.x()) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f2, code lost:
        r0 = r23.f48285a.r().v();
        r8 = pi.q3.y(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x020a, code lost:
        if (r12.F() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x020c, code lost:
        r20 = java.lang.Integer.valueOf(r12.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0217, code lost:
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0219, code lost:
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0224, code lost:
        r3 = r12.e();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put(com.dena.mirrorman.clientlog.logs.MRLog.PAYLOAD_KEY_APP_ID, r24);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x023d, code lost:
        if (r12.F() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x023f, code lost:
        r8 = java.lang.Integer.valueOf(r12.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0248, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0249, code lost:
        r4.put("filter_id", r8);
        r4.put("event_name", r12.x());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0259, code lost:
        if (r12.G() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x025b, code lost:
        r8 = java.lang.Boolean.valueOf(r12.D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0264, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0265, code lost:
        r4.put("session_scoped", r8);
        r4.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0279, code lost:
        if (R().insertWithOnConflict("event_filters", null, r4, 5) != (-1)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x027b, code lost:
        r23.f48285a.r().p().b("Failed to insert event filter (got -1). appId", pi.q3.y(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x028e, code lost:
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0294, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0295, code lost:
        r23.f48285a.r().p().c("Error storing event filter. appId", pi.q3.y(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02aa, code lost:
        r21 = r4;
        r0 = r0.y().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02b8, code lost:
        if (r0.hasNext() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02ba, code lost:
        r3 = r0.next();
        g();
        f();
        rh.p.e(r24);
        rh.p.i(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02d4, code lost:
        if (android.text.TextUtils.isEmpty(r3.v()) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d6, code lost:
        r0 = r23.f48285a.r().v();
        r7 = pi.q3.y(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02ee, code lost:
        if (r3.A() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02f0, code lost:
        r3 = java.lang.Integer.valueOf(r3.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02f9, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02fa, code lost:
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0303, code lost:
        r4 = r3.e();
        r11 = new android.content.ContentValues();
        r11.put(com.dena.mirrorman.clientlog.logs.MRLog.PAYLOAD_KEY_APP_ID, r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x031a, code lost:
        if (r3.A() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x031c, code lost:
        r12 = java.lang.Integer.valueOf(r3.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0325, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0326, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0338, code lost:
        if (r3.B() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x033a, code lost:
        r0 = java.lang.Boolean.valueOf(r3.z());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.String r24, java.util.List<hi.a3> r25) {
        /*
            Method dump skipped, instructions count: 1217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.k.m(java.lang.String, java.util.List):void");
    }

    public final void n() {
        g();
        R().setTransactionSuccessful();
    }

    public final void o(g5 g5Var) {
        rh.p.i(g5Var);
        f();
        g();
        String e02 = g5Var.e0();
        rh.p.i(e02);
        ContentValues contentValues = new ContentValues();
        contentValues.put(MRLog.PAYLOAD_KEY_APP_ID, e02);
        contentValues.put("app_instance_id", g5Var.f0());
        contentValues.put("gmp_app_id", g5Var.k0());
        contentValues.put("resettable_device_id_hash", g5Var.b());
        contentValues.put("last_bundle_index", Long.valueOf(g5Var.Z()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(g5Var.a0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(g5Var.Y()));
        contentValues.put("app_version", g5Var.h0());
        contentValues.put("app_store", g5Var.g0());
        contentValues.put("gmp_version", Long.valueOf(g5Var.X()));
        contentValues.put("dev_cert_hash", Long.valueOf(g5Var.U()));
        contentValues.put("measurement_enabled", Boolean.valueOf(g5Var.K()));
        contentValues.put("day", Long.valueOf(g5Var.T()));
        contentValues.put("daily_public_events_count", Long.valueOf(g5Var.R()));
        contentValues.put("daily_events_count", Long.valueOf(g5Var.Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(g5Var.O()));
        contentValues.put("config_fetched_time", Long.valueOf(g5Var.N()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(g5Var.W()));
        contentValues.put("app_version_int", Long.valueOf(g5Var.M()));
        contentValues.put("firebase_instance_id", g5Var.i0());
        contentValues.put("daily_error_events_count", Long.valueOf(g5Var.P()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(g5Var.S()));
        contentValues.put("health_monitor_sample", g5Var.a());
        contentValues.put("android_id", Long.valueOf(g5Var.A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(g5Var.J()));
        contentValues.put("admob_app_id", g5Var.c0());
        contentValues.put("dynamite_version", Long.valueOf(g5Var.V()));
        List<String> c10 = g5Var.c();
        if (c10 != null) {
            if (c10.size() == 0) {
                this.f48285a.r().v().b("Safelisted events should not be an empty list. appId", e02);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c10));
            }
        }
        id.b();
        if (this.f48285a.y().A(e02, c3.f47697e0)) {
            contentValues.put("ga_app_id", g5Var.j0());
        }
        try {
            SQLiteDatabase R = R();
            if (R.update("apps", contentValues, "app_id = ?", new String[]{e02}) == 0 && R.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f48285a.r().p().b("Failed to insert/update app (got -1). appId", q3.y(e02));
            }
        } catch (SQLiteException e10) {
            this.f48285a.r().p().c("Error storing app. appId", q3.y(e02), e10);
        }
    }

    public final void p(q qVar) {
        rh.p.i(qVar);
        f();
        g();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MRLog.PAYLOAD_KEY_APP_ID, qVar.f48141a);
        contentValues.put("name", qVar.f48142b);
        contentValues.put("lifetime_count", Long.valueOf(qVar.f48143c));
        contentValues.put("current_bundle_count", Long.valueOf(qVar.f48144d));
        contentValues.put("last_fire_timestamp", Long.valueOf(qVar.f48146f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(qVar.f48147g));
        contentValues.put("last_bundled_day", qVar.f48148h);
        contentValues.put("last_sampled_complex_event_id", qVar.f48149i);
        contentValues.put("last_sampling_rate", qVar.f48150j);
        contentValues.put("current_session_count", Long.valueOf(qVar.f48145e));
        Boolean bool = qVar.f48151k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (R().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f48285a.r().p().b("Failed to insert/update event aggregates (got -1). appId", q3.y(qVar.f48141a));
            }
        } catch (SQLiteException e10) {
            this.f48285a.r().p().c("Error storing event aggregates. appId", q3.y(qVar.f48141a), e10);
        }
    }

    public final void q(String str, byte[] bArr, String str2) {
        rh.p.e(str);
        f();
        g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (R().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.f48285a.r().p().b("Failed to update remote config (got 0). appId", q3.y(str));
            }
        } catch (SQLiteException e10) {
            this.f48285a.r().p().c("Error storing remote config. appId", q3.y(str), e10);
        }
    }

    public final boolean s() {
        return L("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean t() {
        return L("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean u() {
        return L("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final boolean v() {
        Context F = this.f48285a.F();
        this.f48285a.y();
        return F.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean w(String str, Long l10, long j10, hi.i4 i4Var) {
        f();
        g();
        rh.p.i(i4Var);
        rh.p.e(str);
        rh.p.i(l10);
        byte[] e10 = i4Var.e();
        this.f48285a.r().u().c("Saving complex main event, appId, data size", this.f48285a.C().d(str), Integer.valueOf(e10.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(MRLog.PAYLOAD_KEY_APP_ID, str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", e10);
        try {
            if (R().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.f48285a.r().p().b("Failed to insert complex main event (got -1). appId", q3.y(str));
                return false;
            }
            return true;
        } catch (SQLiteException e11) {
            this.f48285a.r().p().c("Error storing complex main event. appId", q3.y(str), e11);
            return false;
        }
    }

    public final boolean x(c cVar) {
        rh.p.i(cVar);
        f();
        g();
        String str = cVar.f47680w;
        rh.p.i(str);
        if (Z(str, cVar.f47682y.f47793x) == null) {
            long L = L("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f48285a.y();
            if (L >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MRLog.PAYLOAD_KEY_APP_ID, str);
        contentValues.put(TtmlNode.ATTR_TTS_ORIGIN, cVar.f47681x);
        contentValues.put("name", cVar.f47682y.f47793x);
        J(contentValues, "value", rh.p.i(cVar.f47682y.p()));
        contentValues.put("active", Boolean.valueOf(cVar.A));
        contentValues.put("trigger_event_name", cVar.B);
        contentValues.put("trigger_timeout", Long.valueOf(cVar.D));
        contentValues.put("timed_out_event", this.f48285a.N().c0(cVar.C));
        contentValues.put("creation_timestamp", Long.valueOf(cVar.f47683z));
        contentValues.put("triggered_event", this.f48285a.N().c0(cVar.E));
        contentValues.put("triggered_timestamp", Long.valueOf(cVar.f47682y.f47794y));
        contentValues.put("time_to_live", Long.valueOf(cVar.F));
        contentValues.put("expired_event", this.f48285a.N().c0(cVar.G));
        try {
            if (R().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.f48285a.r().p().b("Failed to insert/update conditional user property (got -1)", q3.y(str));
            }
        } catch (SQLiteException e10) {
            this.f48285a.r().p().c("Error storing conditional user property", q3.y(str), e10);
        }
        return true;
    }

    public final boolean y(ga gaVar) {
        rh.p.i(gaVar);
        f();
        g();
        if (Z(gaVar.f47879a, gaVar.f47881c) == null) {
            if (ia.W(gaVar.f47881c)) {
                if (L("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{gaVar.f47879a}) >= this.f48285a.y().n(gaVar.f47879a, c3.H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(gaVar.f47881c)) {
                long L = L("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{gaVar.f47879a, gaVar.f47880b});
                this.f48285a.y();
                if (L >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MRLog.PAYLOAD_KEY_APP_ID, gaVar.f47879a);
        contentValues.put(TtmlNode.ATTR_TTS_ORIGIN, gaVar.f47880b);
        contentValues.put("name", gaVar.f47881c);
        contentValues.put("set_timestamp", Long.valueOf(gaVar.f47882d));
        J(contentValues, "value", gaVar.f47883e);
        try {
            if (R().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f48285a.r().p().b("Failed to insert/update user property (got -1). appId", q3.y(gaVar.f47879a));
            }
        } catch (SQLiteException e10) {
            this.f48285a.r().p().c("Error storing user property. appId", q3.y(gaVar.f47879a), e10);
        }
        return true;
    }
}
