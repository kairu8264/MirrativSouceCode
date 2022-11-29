package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import v4.q0;
import v4.u;
import z4.g;
import z4.k;

/* loaded from: classes.dex */
public class c {

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f16367o = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b  reason: collision with root package name */
    public final String[] f16369b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Set<String>> f16370c;

    /* renamed from: e  reason: collision with root package name */
    public final q0 f16372e;

    /* renamed from: h  reason: collision with root package name */
    public volatile k f16375h;

    /* renamed from: i  reason: collision with root package name */
    public final b f16376i;

    /* renamed from: j  reason: collision with root package name */
    public final u f16377j;

    /* renamed from: l  reason: collision with root package name */
    public androidx.room.d f16379l;

    /* renamed from: d  reason: collision with root package name */
    public v4.a f16371d = null;

    /* renamed from: f  reason: collision with root package name */
    public AtomicBoolean f16373f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f16374g = false;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: k  reason: collision with root package name */
    public final m.b<AbstractC0080c, d> f16378k = new m.b<>();

    /* renamed from: m  reason: collision with root package name */
    public final Object f16380m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public Runnable f16381n = new a();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Integer> f16368a = new HashMap<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        public final Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor y10 = c.this.f16372e.y(new z4.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (y10.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(y10.getInt(0)));
                } catch (Throwable th2) {
                    y10.close();
                    throw th2;
                }
            }
            y10.close();
            if (!hashSet.isEmpty()) {
                c.this.f16375h.D();
            }
            return hashSet;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
            if (r0 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
            r0.b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
            if (r0 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
            if (r1 == null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
            if (r1.isEmpty() != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
            r0 = r5.f16382w.f16378k;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
            r2 = r5.f16382w.f16378k.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
            if (r2.hasNext() == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
            r2.next().getValue().a(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                androidx.room.c r0 = androidx.room.c.this
                v4.q0 r0 = r0.f16372e
                java.util.concurrent.locks.Lock r0 = r0.k()
                r0.lock()
                r1 = 0
                androidx.room.c r2 = androidx.room.c.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                boolean r2 = r2.d()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 != 0) goto L21
                r0.unlock()
                androidx.room.c r0 = androidx.room.c.this
                v4.a r0 = r0.f16371d
                if (r0 == 0) goto L20
                r0.b()
            L20:
                return
            L21:
                androidx.room.c r2 = androidx.room.c.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f16373f     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r3 = 1
                r4 = 0
                boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 != 0) goto L3a
                r0.unlock()
                androidx.room.c r0 = androidx.room.c.this
                v4.a r0 = r0.f16371d
                if (r0 == 0) goto L39
                r0.b()
            L39:
                return
            L3a:
                androidx.room.c r2 = androidx.room.c.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                v4.q0 r2 = r2.f16372e     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                boolean r2 = r2.p()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                if (r2 == 0) goto L51
                r0.unlock()
                androidx.room.c r0 = androidx.room.c.this
                v4.a r0 = r0.f16371d
                if (r0 == 0) goto L50
                r0.b()
            L50:
                return
            L51:
                androidx.room.c r2 = androidx.room.c.this     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                v4.q0 r2 = r2.f16372e     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                z4.h r2 = r2.l()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                z4.g r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r2.W()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                java.util.Set r1 = r5.a()     // Catch: java.lang.Throwable -> L77
                r2.T()     // Catch: java.lang.Throwable -> L77
                r2.e0()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                r0.unlock()
                androidx.room.c r0 = androidx.room.c.this
                v4.a r0 = r0.f16371d
                if (r0 == 0) goto L92
            L73:
                r0.b()
                goto L92
            L77:
                r3 = move-exception
                r2.e0()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
                throw r3     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e java.lang.IllegalStateException -> L80
            L7c:
                r1 = move-exception
                goto Lc3
            L7e:
                r2 = move-exception
                goto L81
            L80:
                r2 = move-exception
            L81:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L7c
                r0.unlock()
                androidx.room.c r0 = androidx.room.c.this
                v4.a r0 = r0.f16371d
                if (r0 == 0) goto L92
                goto L73
            L92:
                if (r1 == 0) goto Lc2
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto Lc2
                androidx.room.c r0 = androidx.room.c.this
                m.b<androidx.room.c$c, androidx.room.c$d> r0 = r0.f16378k
                monitor-enter(r0)
                androidx.room.c r2 = androidx.room.c.this     // Catch: java.lang.Throwable -> Lbf
                m.b<androidx.room.c$c, androidx.room.c$d> r2 = r2.f16378k     // Catch: java.lang.Throwable -> Lbf
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lbf
            La7:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lbf
                if (r3 == 0) goto Lbd
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lbf
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Lbf
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Lbf
                androidx.room.c$d r3 = (androidx.room.c.d) r3     // Catch: java.lang.Throwable -> Lbf
                r3.a(r1)     // Catch: java.lang.Throwable -> Lbf
                goto La7
            Lbd:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
                goto Lc2
            Lbf:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
                throw r1
            Lc2:
                return
            Lc3:
                r0.unlock()
                androidx.room.c r0 = androidx.room.c.this
                v4.a r0 = r0.f16371d
                if (r0 == 0) goto Lcf
                r0.b()
            Lcf:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.c.a.run():void");
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f16383a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f16384b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f16385c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f16386d;

        public b(int i10) {
            long[] jArr = new long[i10];
            this.f16383a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f16384b = zArr;
            this.f16385c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public int[] a() {
            synchronized (this) {
                if (this.f16386d) {
                    int length = this.f16383a.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        int i11 = 1;
                        boolean z10 = this.f16383a[i10] > 0;
                        boolean[] zArr = this.f16384b;
                        if (z10 != zArr[i10]) {
                            int[] iArr = this.f16385c;
                            if (!z10) {
                                i11 = 2;
                            }
                            iArr[i10] = i11;
                        } else {
                            this.f16385c[i10] = 0;
                        }
                        zArr[i10] = z10;
                    }
                    this.f16386d = false;
                    return (int[]) this.f16385c.clone();
                }
                return null;
            }
        }

        public boolean b(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f16383a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        this.f16386d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        public boolean c(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f16383a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        this.f16386d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        public void d() {
            synchronized (this) {
                Arrays.fill(this.f16384b, false);
                this.f16386d = true;
            }
        }
    }

    /* renamed from: androidx.room.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0080c {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f16387a;

        public AbstractC0080c(String[] strArr) {
            this.f16387a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f16388a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f16389b;

        /* renamed from: c  reason: collision with root package name */
        public final AbstractC0080c f16390c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f16391d;

        public d(AbstractC0080c abstractC0080c, int[] iArr, String[] strArr) {
            this.f16390c = abstractC0080c;
            this.f16388a = iArr;
            this.f16389b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.f16391d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f16391d = null;
        }

        public void a(Set<Integer> set) {
            int length = this.f16388a.length;
            Set<String> set2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (set.contains(Integer.valueOf(this.f16388a[i10]))) {
                    if (length == 1) {
                        set2 = this.f16391d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.f16389b[i10]);
                    }
                }
            }
            if (set2 != null) {
                this.f16390c.b(set2);
            }
        }

        public void b(String[] strArr) {
            Set<String> set = null;
            if (this.f16389b.length == 1) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    } else if (strArr[i10].equalsIgnoreCase(this.f16389b[0])) {
                        set = this.f16391d;
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f16389b;
                    int length2 = strArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            String str2 = strArr2[i11];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i11++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f16390c.b(set);
            }
        }
    }

    public c(q0 q0Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f16372e = q0Var;
        this.f16376i = new b(strArr.length);
        this.f16370c = map2;
        this.f16377j = new u(q0Var);
        int length = strArr.length;
        this.f16369b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f16368a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f16369b[i10] = str2.toLowerCase(locale);
            } else {
                this.f16369b[i10] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.f16368a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f16368a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    public static void b(StringBuilder sb2, String str, String str2) {
        sb2.append("`");
        sb2.append("room_table_modification_trigger_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("`");
    }

    public static void c(g gVar) {
        if (Build.VERSION.SDK_INT >= 16 && gVar.J1()) {
            gVar.W();
        } else {
            gVar.s();
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(AbstractC0080c abstractC0080c) {
        d l10;
        String[] j10 = j(abstractC0080c.f16387a);
        int[] iArr = new int[j10.length];
        int length = j10.length;
        for (int i10 = 0; i10 < length; i10++) {
            Integer num = this.f16368a.get(j10[i10].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i10] = num.intValue();
            } else {
                throw new IllegalArgumentException("There is no table with name " + j10[i10]);
            }
        }
        d dVar = new d(abstractC0080c, iArr, j10);
        synchronized (this.f16378k) {
            l10 = this.f16378k.l(abstractC0080c, dVar);
        }
        if (l10 == null && this.f16376i.b(iArr)) {
            o();
        }
    }

    public boolean d() {
        if (this.f16372e.v()) {
            if (!this.f16374g) {
                this.f16372e.l().getWritableDatabase();
            }
            if (this.f16374g) {
                return true;
            }
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return false;
    }

    public void e(g gVar) {
        synchronized (this) {
            if (this.f16374g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            gVar.B("PRAGMA temp_store = MEMORY;");
            gVar.B("PRAGMA recursive_triggers='ON';");
            gVar.B("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            p(gVar);
            this.f16375h = gVar.X0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f16374g = true;
        }
    }

    public void f(String... strArr) {
        synchronized (this.f16378k) {
            Iterator<Map.Entry<AbstractC0080c, d>> it = this.f16378k.iterator();
            while (it.hasNext()) {
                Map.Entry<AbstractC0080c, d> next = it.next();
                if (!next.getKey().a()) {
                    next.getValue().b(strArr);
                }
            }
        }
    }

    public void g() {
        synchronized (this) {
            this.f16374g = false;
            this.f16376i.d();
        }
    }

    public void h() {
        if (this.f16373f.compareAndSet(false, true)) {
            v4.a aVar = this.f16371d;
            if (aVar != null) {
                aVar.e();
            }
            this.f16372e.m().execute(this.f16381n);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void i(AbstractC0080c abstractC0080c) {
        d m10;
        synchronized (this.f16378k) {
            m10 = this.f16378k.m(abstractC0080c);
        }
        if (m10 == null || !this.f16376i.c(m10.f16388a)) {
            return;
        }
        o();
    }

    public final String[] j(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f16370c.containsKey(lowerCase)) {
                hashSet.addAll(this.f16370c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public void k(v4.a aVar) {
        this.f16371d = aVar;
        aVar.h(new Runnable() { // from class: v4.v
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.c.this.g();
            }
        });
    }

    public void l(Context context, String str, Intent intent) {
        this.f16379l = new androidx.room.d(context, str, intent, this, this.f16372e.m());
    }

    public final void m(g gVar, int i10) {
        String[] strArr;
        gVar.B("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f16369b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f16367o) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            gVar.B(sb2.toString());
        }
    }

    public final void n(g gVar, int i10) {
        String[] strArr;
        String str = this.f16369b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f16367o) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            b(sb2, str, str2);
            gVar.B(sb2.toString());
        }
    }

    public void o() {
        if (this.f16372e.v()) {
            p(this.f16372e.l().getWritableDatabase());
        }
    }

    public void p(g gVar) {
        if (gVar.C1()) {
            return;
        }
        try {
            Lock k10 = this.f16372e.k();
            k10.lock();
            try {
                synchronized (this.f16380m) {
                    int[] a10 = this.f16376i.a();
                    if (a10 == null) {
                        return;
                    }
                    int length = a10.length;
                    c(gVar);
                    for (int i10 = 0; i10 < length; i10++) {
                        int i11 = a10[i10];
                        if (i11 == 1) {
                            m(gVar, i10);
                        } else if (i11 == 2) {
                            n(gVar, i10);
                        }
                    }
                    gVar.T();
                    gVar.e0();
                }
            } finally {
                k10.unlock();
            }
        } catch (SQLiteException | IllegalStateException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        }
    }
}
