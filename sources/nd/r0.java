package nd;

import android.content.Context;
import ep.z;
import ff.a;
import ff.b;
import ff.c;
import nd.q0;

/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final e f42205a = new e(null);

    /* renamed from: b  reason: collision with root package name */
    public static q0 f42206b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static ff.c f42207c = new d();

    /* renamed from: d  reason: collision with root package name */
    public static ff.a f42208d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static ff.b f42209e = new c();

    /* loaded from: classes2.dex */
    public static final class a implements ff.a {
        @Override // ff.a
        public void a(String str, String str2) {
            a.C0352a.a(this, str, str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements q0 {
        @Override // nd.q0
        public void a(String str) {
            q0.a.b(this, str);
        }

        @Override // nd.q0
        public void b(Context context) {
            q0.a.c(this, context);
        }

        @Override // nd.q0
        public z.a c(z.a aVar, Context context) {
            return q0.a.a(this, aVar, context);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements ff.b {
        @Override // ff.b
        public void a(String str, String str2) {
            b.a.a(this, str, str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements ff.c {
        @Override // ff.c
        public void a(String str, String str2, String str3) {
            c.a.b(this, str, str2, str3);
        }

        @Override // ff.c
        public void b(String str) {
            c.a.a(this, str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public e() {
        }

        public /* synthetic */ e(jo.h hVar) {
            this();
        }

        public final ff.a a() {
            return r0.f42208d;
        }

        public final q0 b() {
            return r0.f42206b;
        }

        public final ff.b c() {
            return r0.f42209e;
        }

        public final ff.c d() {
            return r0.f42207c;
        }
    }
}
