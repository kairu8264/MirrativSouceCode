package ai;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ey1 extends SQLiteOpenHelper {

    /* renamed from: w  reason: collision with root package name */
    public final Context f3819w;

    /* renamed from: x  reason: collision with root package name */
    public final t43 f3820x;

    public ey1(Context context, t43 t43Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) ft.c().c(ox.Z5)).intValue());
        this.f3819w = context;
        this.f3820x = t43Var;
    }

    public static final /* synthetic */ void j(SQLiteDatabase sQLiteDatabase, String str, yj0 yj0Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        p(sQLiteDatabase, yj0Var);
    }

    public static final void o(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    public static void p(SQLiteDatabase sQLiteDatabase, yj0 yj0Var) {
        sQLiteDatabase.beginTransaction();
        try {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("event_state = ");
            sb2.append(1);
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, sb2.toString(), null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i10 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i10] = query.getString(columnIndex);
                }
                i10++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i11 = 0; i11 < count; i11++) {
                yj0Var.v(strArr[i11]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final void a(fp2<SQLiteDatabase, Void> fp2Var) {
        j43.p(this.f3820x.h(new Callable(this) { // from class: ai.xx1

            /* renamed from: a  reason: collision with root package name */
            public final ey1 f12352a;

            {
                this.f12352a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12352a.getWritableDatabase();
            }
        }), new dy1(this, fp2Var), this.f3820x);
    }

    public final void c(final SQLiteDatabase sQLiteDatabase, final yj0 yj0Var, final String str) {
        this.f3820x.execute(new Runnable(sQLiteDatabase, str, yj0Var) { // from class: ai.zx1

            /* renamed from: w  reason: collision with root package name */
            public final SQLiteDatabase f13242w;

            /* renamed from: x  reason: collision with root package name */
            public final String f13243x;

            /* renamed from: y  reason: collision with root package name */
            public final yj0 f13244y;

            {
                this.f13242w = sQLiteDatabase;
                this.f13243x = str;
                this.f13244y = yj0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ey1.j(this.f13242w, this.f13243x, this.f13244y);
            }
        });
    }

    public final void d(final yj0 yj0Var, final String str) {
        a(new fp2(this, yj0Var, str) { // from class: ai.ay1

            /* renamed from: a  reason: collision with root package name */
            public final ey1 f2148a;

            /* renamed from: b  reason: collision with root package name */
            public final yj0 f2149b;

            /* renamed from: c  reason: collision with root package name */
            public final String f2150c;

            {
                this.f2148a = this;
                this.f2149b = yj0Var;
                this.f2150c = str;
            }

            @Override // ai.fp2
            public final Object a(Object obj) {
                this.f2148a.c((SQLiteDatabase) obj, this.f2149b, this.f2150c);
                return null;
            }
        });
    }

    public final void e(final String str) {
        a(new fp2(this, str) { // from class: ai.by1

            /* renamed from: a  reason: collision with root package name */
            public final ey1 f2591a;

            /* renamed from: b  reason: collision with root package name */
            public final String f2592b;

            {
                this.f2591a = this;
                this.f2592b = str;
            }

            @Override // ai.fp2
            public final Object a(Object obj) {
                ey1.o((SQLiteDatabase) obj, this.f2592b);
                return null;
            }
        });
    }

    public final void h(final gy1 gy1Var) {
        a(new fp2(this, gy1Var) { // from class: ai.cy1

            /* renamed from: a  reason: collision with root package name */
            public final ey1 f3072a;

            /* renamed from: b  reason: collision with root package name */
            public final gy1 f3073b;

            {
                this.f3072a = this;
                this.f3073b = gy1Var;
            }

            @Override // ai.fp2
            public final Object a(Object obj) {
                this.f3072a.i(this.f3073b, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final /* synthetic */ Void i(gy1 gy1Var, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(gy1Var.f4643a));
        contentValues.put("gws_query_id", gy1Var.f4644b);
        contentValues.put("url", gy1Var.f4645c);
        contentValues.put("event_state", Integer.valueOf(gy1Var.f4646d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        wg.t.d();
        yg.v0 d10 = yg.d2.d(this.f3819w);
        if (d10 != null) {
            try {
                d10.zzf(yh.b.h1(this.f3819w));
            } catch (RemoteException e10) {
                yg.p1.l("Failed to schedule offline ping sender.", e10);
            }
        }
        return null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
