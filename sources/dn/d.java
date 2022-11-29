package dn;

import an.d;
import java.sql.Timestamp;
import java.util.Date;
import xm.u;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f29735a;

    /* renamed from: b  reason: collision with root package name */
    public static final d.b<? extends Date> f29736b;

    /* renamed from: c  reason: collision with root package name */
    public static final d.b<? extends Date> f29737c;

    /* renamed from: d  reason: collision with root package name */
    public static final u f29738d;

    /* renamed from: e  reason: collision with root package name */
    public static final u f29739e;

    /* renamed from: f  reason: collision with root package name */
    public static final u f29740f;

    /* loaded from: classes4.dex */
    public class a extends d.b<java.sql.Date> {
        public a(Class cls) {
            super(cls);
        }

        @Override // an.d.b
        /* renamed from: e */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* loaded from: classes4.dex */
    public class b extends d.b<Timestamp> {
        public b(Class cls) {
            super(cls);
        }

        @Override // an.d.b
        /* renamed from: e */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f29735a = z10;
        if (z10) {
            f29736b = new a(java.sql.Date.class);
            f29737c = new b(Timestamp.class);
            f29738d = dn.a.f29729b;
            f29739e = dn.b.f29731b;
            f29740f = c.f29733b;
            return;
        }
        f29736b = null;
        f29737c = null;
        f29738d = null;
        f29739e = null;
        f29740f = null;
    }
}
