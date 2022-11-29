package u5;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import java.util.UUID;
import k5.m;
import k5.s;
import t5.q;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final l5.c f54387w = new l5.c();

    /* renamed from: u5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0854a extends a {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l5.i f54388x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ UUID f54389y;

        public C0854a(l5.i iVar, UUID uuid) {
            this.f54388x = iVar;
            this.f54389y = uuid;
        }

        @Override // u5.a
        public void h() {
            WorkDatabase o10 = this.f54388x.o();
            o10.e();
            try {
                a(this.f54388x, this.f54389y.toString());
                o10.A();
                o10.i();
                g(this.f54388x);
            } catch (Throwable th2) {
                o10.i();
                throw th2;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends a {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l5.i f54390x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f54391y;

        public b(l5.i iVar, String str) {
            this.f54390x = iVar;
            this.f54391y = str;
        }

        @Override // u5.a
        public void h() {
            WorkDatabase o10 = this.f54390x.o();
            o10.e();
            try {
                for (String str : o10.L().h(this.f54391y)) {
                    a(this.f54390x, str);
                }
                o10.A();
                o10.i();
                g(this.f54390x);
            } catch (Throwable th2) {
                o10.i();
                throw th2;
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends a {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l5.i f54392x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f54393y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f54394z;

        public c(l5.i iVar, String str, boolean z10) {
            this.f54392x = iVar;
            this.f54393y = str;
            this.f54394z = z10;
        }

        @Override // u5.a
        public void h() {
            WorkDatabase o10 = this.f54392x.o();
            o10.e();
            try {
                for (String str : o10.L().e(this.f54393y)) {
                    a(this.f54392x, str);
                }
                o10.A();
                o10.i();
                if (this.f54394z) {
                    g(this.f54392x);
                }
            } catch (Throwable th2) {
                o10.i();
                throw th2;
            }
        }
    }

    public static a b(UUID uuid, l5.i iVar) {
        return new C0854a(iVar, uuid);
    }

    public static a c(String str, l5.i iVar, boolean z10) {
        return new c(iVar, str, z10);
    }

    public static a d(String str, l5.i iVar) {
        return new b(iVar, str);
    }

    public void a(l5.i iVar, String str) {
        f(iVar.o(), str);
        iVar.m().l(str);
        for (l5.e eVar : iVar.n()) {
            eVar.a(str);
        }
    }

    public k5.m e() {
        return this.f54387w;
    }

    public final void f(WorkDatabase workDatabase, String str) {
        q L = workDatabase.L();
        t5.b D = workDatabase.D();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            s.a f10 = L.f(str2);
            if (f10 != s.a.SUCCEEDED && f10 != s.a.FAILED) {
                L.c(s.a.CANCELLED, str2);
            }
            linkedList.addAll(D.a(str2));
        }
    }

    public void g(l5.i iVar) {
        l5.f.b(iVar.i(), iVar.o(), iVar.n());
    }

    public abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f54387w.a(k5.m.f38418a);
        } catch (Throwable th2) {
            this.f54387w.a(new m.b.a(th2));
        }
    }
}
