package zd;

import android.database.Cursor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Collections;
import java.util.List;
import v4.q0;
import v4.s;
import v4.t0;
import v4.w0;
import z4.k;

/* loaded from: classes2.dex */
public final class c implements zd.b {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f63081a;

    /* renamed from: b  reason: collision with root package name */
    public final s<zd.a> f63082b;

    /* renamed from: c  reason: collision with root package name */
    public final w0 f63083c;

    /* loaded from: classes2.dex */
    public class a extends s<zd.a> {
        public a(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "INSERT OR ABORT INTO `AnnouncementUrlHistory` (`url`,`id`) VALUES (?,?)";
        }

        @Override // v4.s
        /* renamed from: i */
        public void g(k kVar, zd.a aVar) {
            if (aVar.b() == null) {
                kVar.y1(1);
            } else {
                kVar.S0(1, aVar.b());
            }
            if (aVar.a() == null) {
                kVar.y1(2);
            } else {
                kVar.g1(2, aVar.a().intValue());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends w0 {
        public b(q0 q0Var) {
            super(q0Var);
        }

        @Override // v4.w0
        public String d() {
            return "DELETE FROM AnnouncementUrlHistory";
        }
    }

    public c(q0 q0Var) {
        this.f63081a = q0Var;
        this.f63082b = new a(q0Var);
        this.f63083c = new b(q0Var);
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }

    @Override // zd.b
    public void a() {
        this.f63081a.d();
        k a10 = this.f63083c.a();
        this.f63081a.e();
        try {
            a10.D();
            this.f63081a.A();
        } finally {
            this.f63081a.i();
            this.f63083c.f(a10);
        }
    }

    @Override // zd.b
    public void b(zd.a aVar) {
        this.f63081a.d();
        this.f63081a.e();
        try {
            this.f63082b.h(aVar);
            this.f63081a.A();
        } finally {
            this.f63081a.i();
        }
    }

    @Override // zd.b
    public zd.a c(String str) {
        t0 d10 = t0.d("SELECT * FROM AnnouncementUrlHistory WHERE url = ? LIMIT 1", 1);
        if (str == null) {
            d10.y1(1);
        } else {
            d10.S0(1, str);
        }
        this.f63081a.d();
        zd.a aVar = null;
        Integer valueOf = null;
        Cursor b10 = x4.c.b(this.f63081a, d10, false, null);
        try {
            int e10 = x4.b.e(b10, "url");
            int e11 = x4.b.e(b10, TtmlNode.ATTR_ID);
            if (b10.moveToFirst()) {
                String string = b10.isNull(e10) ? null : b10.getString(e10);
                if (!b10.isNull(e11)) {
                    valueOf = Integer.valueOf(b10.getInt(e11));
                }
                aVar = new zd.a(string, valueOf);
            }
            return aVar;
        } finally {
            b10.close();
            d10.i();
        }
    }
}
