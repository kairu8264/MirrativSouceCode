package pi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class j3 extends f4 {

    /* renamed from: c  reason: collision with root package name */
    public final i3 f47966c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f47967d;

    public j3(b5 b5Var) {
        super(b5Var);
        Context F = this.f48285a.F();
        this.f48285a.y();
        this.f47966c = new i3(this, F, "google_app_measurement_local.db");
    }

    @Override // pi.f4
    public final boolean l() {
        return false;
    }

    public final SQLiteDatabase m() throws SQLiteException {
        if (this.f47967d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f47966c.getWritableDatabase();
        if (writableDatabase == null) {
            this.f47967d = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0248 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<sh.a> n(int r23) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.j3.n(int):java.util.List");
    }

    public final void o() {
        int delete;
        f();
        try {
            SQLiteDatabase m10 = m();
            if (m10 == null || (delete = m10.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f48285a.r().u().b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e10) {
            this.f48285a.r().p().b("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean p() {
        return w(3, new byte[0]);
    }

    public final boolean q() {
        Context F = this.f48285a.F();
        this.f48285a.y();
        return F.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean s() {
        int i10;
        f();
        if (!this.f47967d && q()) {
            int i11 = 5;
            for (i10 = 0; i10 < 5; i10 = i10 + 1) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase m10 = m();
                    if (m10 == null) {
                        this.f47967d = true;
                        return false;
                    }
                    m10.beginTransaction();
                    m10.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    m10.setTransactionSuccessful();
                    m10.endTransaction();
                    m10.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i11);
                    i11 += 20;
                    i10 = 0 == 0 ? i10 + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e10) {
                    this.f48285a.r().p().b("Error deleting app launch break from local database", e10);
                    this.f47967d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e11) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th2) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                    this.f48285a.r().p().b("Error deleting app launch break from local database", e11);
                    this.f47967d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.f48285a.r().v().a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean t(c cVar) {
        byte[] c02 = this.f48285a.N().c0(cVar);
        if (c02.length > 131072) {
            this.f48285a.r().s().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return w(2, c02);
    }

    public final boolean u(u uVar) {
        Parcel obtain = Parcel.obtain();
        v.a(uVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f48285a.r().s().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return w(0, marshall);
    }

    public final boolean v(ea eaVar) {
        Parcel obtain = Parcel.obtain();
        fa.a(eaVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f48285a.r().s().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return w(1, marshall);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.j3.w(int, byte[]):boolean");
    }
}
