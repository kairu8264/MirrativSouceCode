package o8;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import z4.g;
import z4.h;

/* loaded from: classes.dex */
public class b extends o8.a {

    /* renamed from: a  reason: collision with root package name */
    public final h f44271a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f44272b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f44273c;

    /* loaded from: classes.dex */
    public class a extends h.a {
        public a(int i10) {
            super(i10);
        }

        @Override // z4.h.a
        public void d(g gVar) {
            b.this.i(gVar);
        }

        @Override // z4.h.a
        public void g(g gVar, int i10, int i11) {
            b.this.j(gVar, i10, i11);
        }
    }

    public b(Context context) {
        this(context, false);
    }

    public static String g(Context context) {
        String d10 = m8.c.d(context);
        if (TextUtils.isEmpty(d10)) {
            return "puree.db";
        }
        return d10 + TopicConstant.SEPARATOR + "puree.db";
    }

    @Override // o8.c
    public void a(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", str);
        contentValues.put("log", str2);
        contentValues.put(LogBase.CREATED_AT, Long.valueOf(System.currentTimeMillis()));
        this.f44271a.getWritableDatabase().r1("logs", 0, contentValues);
    }

    @Override // o8.c
    public e b(String str, int i10) {
        Cursor Q0 = this.f44271a.getReadableDatabase().Q0("SELECT * FROM logs WHERE type = ? ORDER BY id " + h() + " LIMIT " + i10, new String[]{str});
        try {
            return k(Q0);
        } finally {
            Q0.close();
        }
    }

    @Override // o8.c
    public void c(e eVar) {
        this.f44271a.getWritableDatabase().r("logs", "id IN (" + eVar.f() + ")", null);
    }

    @Override // o8.a
    public void d(String str, long j10) {
        this.f44271a.getWritableDatabase().r("logs", "type = ? AND created_at <= ?", new Object[]{str, Long.valueOf(System.currentTimeMillis() - j10)});
    }

    public final d f(Cursor cursor) {
        return new d(cursor.getInt(0), cursor.getString(1), cursor.getString(2));
    }

    public void finalize() throws Throwable {
        this.f44271a.close();
        super.finalize();
    }

    public final String h() {
        return this.f44272b ? "DESC" : "ASC";
    }

    public final void i(g gVar) {
        gVar.B("CREATE TABLE IF NOT EXISTS logs (id INTEGER PRIMARY KEY AUTOINCREMENT,type TEXT,log TEXT,created_at INTEGER)");
    }

    public void j(g gVar, int i10, int i11) {
        if (i10 < 2) {
            gVar.B("ALTER TABLE logs ADD COLUMN created_at INTEGER;");
            ContentValues contentValues = new ContentValues();
            contentValues.put(LogBase.CREATED_AT, Long.valueOf(System.currentTimeMillis()));
            gVar.h1("logs", 0, contentValues, "created_at IS NULL", null);
        }
    }

    public final e k(Cursor cursor) {
        e eVar = new e();
        while (cursor.moveToNext()) {
            eVar.add(f(cursor));
        }
        return eVar;
    }

    @Override // o8.c
    public boolean lock() {
        return this.f44273c.compareAndSet(false, true);
    }

    @Override // o8.c
    public void unlock() {
        this.f44273c.set(false);
    }

    public b(Context context, boolean z10) {
        this.f44273c = new AtomicBoolean(false);
        this.f44272b = z10;
        this.f44271a = new a5.c().a(h.b.a(context).c(g(context)).b(new a(2)).a());
    }
}
