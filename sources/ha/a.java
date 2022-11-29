package ha;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.h;
import jo.p;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f34693a = 0;

    /* renamed from: ha.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0439a extends a {

        /* renamed from: b  reason: collision with root package name */
        public final MRError f34694b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0439a(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f34694b = mRError;
        }

        public final MRError b() {
            return this.f34694b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public static final b f34695b = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {

        /* renamed from: b  reason: collision with root package name */
        public static final c f34696b = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends a {

        /* renamed from: b  reason: collision with root package name */
        public static final d f34697b = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends a {

        /* renamed from: b  reason: collision with root package name */
        public static final e f34698b = new e();

        public e() {
            super(null);
        }
    }

    public a() {
    }

    public /* synthetic */ a(h hVar) {
        this();
    }

    public final boolean a() {
        return (this instanceof b) || (this instanceof c);
    }
}
